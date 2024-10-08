package com.Delivery.DeliveryApp.FoodDelivery.Order;

import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class PdfGeneratorService {
	
	
	@Autowired
	OrderRepository orderRepository;
	public void generateBill(int orderId,HttpServletResponse response) {
		try {
		Orders order=orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
	
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=bill.pdf");
		
		Document document=new Document();
		OutputStream out= response.getOutputStream();
	    PdfWriter.getInstance(document, out);
	    
	    document.open();
	    
	    Font titleFont=new Font(Font.FontFamily.TIMES_ROMAN,18,Font.BOLD);
	    Paragraph title=new Paragraph("Restaurant Bill",titleFont);
	    title.setAlignment(Element.ALIGN_CENTER);
	    document.add(title);
	    
	    document.add(new Paragraph("Restaurant: "+order.getRestaurants().getRestuarant_name()));
	    document.add(new Paragraph("Adress: "+order.getRestaurants().getRestuarant_location()));
	    
	    document.add(new Paragraph("Customer: "+order.getUser().getUser_name()));
	    document.add(new Paragraph("Order Placed Time: "+order.getOrderPlacedTime().toString()));
	    document.add(new Paragraph("---------------------------------------------------------------------------------------"));
	    
	    PdfPTable table=new PdfPTable(3);
	    addTableHeader(table);
	    addItemRows(table,order.getOrderItem());
	    
	    document.add(table);
	    
	    document.add(new Paragraph("Total: $"+calculateTotal(order.getOrderdItem())));
	    document.close();
	    
			
		}catch (Exception e) {
			e.printStackTrace();
		}				
	}
	private void addTableHeader(PdfPTable table) {
		PdfPCell header1=new PdfPCell(new Phrase("Item Name"));
		PdfPCell header2=new PdfPCell(new Phrase("Price"));
		PdfPCell header3=new PdfPCell(new Phrase("Quantity"));
		
		table.addCell(header1);
		table.addCell(header2);
		table.addCell(header3);
			
	}
	private void addItemRows(PdfPTable table,List<OrderedItem> items) {
		 if (items == null || items.isEmpty()) {
		        System.out.println("No items found to add to the PDF.");
		        return;
		    }
		for(OrderedItem item : items) {
			table.addCell(item.getItem().getItem_name());
			table.addCell(String.valueOf(item.getItem().getItem_price()));
			table.addCell(String.valueOf(item.getQuantity()));
		}
	}
	private Double calculateTotal(List<OrderedItem> items) {
		double total=0.0;
		for(OrderedItem item:items) {
			total+=item.getItem().getItem_price()*item.getQuantity();
		}
		return total;
	}
	
}

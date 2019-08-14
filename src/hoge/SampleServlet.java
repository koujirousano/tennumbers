package hoge;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int[] nums=new int[10];
        for(int i=0;i<10;i++) {
            nums[i]=(int)(Math.random()*101);
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8' />");
        out.println("<title>Ten Numbers</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>0~100の乱数を10個生成したよ！</p>");
        out.println("<p>"+Arrays.toString(nums)+"</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
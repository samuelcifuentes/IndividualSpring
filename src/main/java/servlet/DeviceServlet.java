package java.servlet;

import java.*;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;

@WebServlet("/Devices")
public class DeviceServlet extends HttpServlet {

    private DeviceService deviceService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        DeviceService = (DeviceService) AppContext.getContext().getBean("deviceService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        InputStream is = getClass().getClassLoader().getResourceAsStream("devices.html");
        String content = new String(is.readAllBytes());
        resp.getWriter().println(content);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Device device = new Device();
        device.setId(Integer.parseInt(req.getParameter("id")));
        device.setName(req.getParameter("name"));
        device.setSerialNumber(req.getParameter("SerialNumber"));
        device.setType(req.getParameter("Type"));
        device.setMaxValue(Double.parseDouble(req.getParameter("MaxValue")));
        device.setMinValue(Double.parseDouble(req.getParameter("MinValue")));
        device.setSamplingPeriod(Long.parseLong(req.getParameter("SamplingPeriod")));
        device.setTimeTolerance(Long.parseLong(req.getParameter("TimeTolerance")));

        deviceService.saveDevice(device);
        resp.sendRedirect("./devices");
    }
}

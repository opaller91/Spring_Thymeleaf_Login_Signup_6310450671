package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Spring จะสร้าง object นี้ให้เป็นแบบ controller
public class HomeController {

    @RequestMapping("/") //เรียก endpoint "/" ก็จะมาที่เมทอดนี้
    public String getHomePage(Model model) { //ต้องคืนค่าเป็น String เท่านั้น Model ส่งค่าไปที่ template
        model.addAttribute("greeting", "Sawaddee");
        model.addAttribute("bye", "Bye bye");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";//เมื่อ / แล้วจะมาที่ไหน return เป็นหน้า html-> home.html
    }
    //ถ้าไม่ได้กำหนดsucurityจะให้login ก่อนอัตโนมัติ
}


package org.bulatnig.plonko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    @ResponseBody
    public Book index() throws Exception {
        Book book = new Book("1", "War and peace");
        return book;
    }

}

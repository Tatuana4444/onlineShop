package com.epam.shop.command.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.ProductService;

/**
 * Class that implements show products list command
 */
public class ShowProductsListCommand implements Command {
    /**
     * Implements command show products list
     * @return back page
     */
    @Override
    public Page execute() {
        ProductService service = new ProductService();
        System.out.println("enter product name");
        String name = Reader.nextString();
        String result = service.getProduct(name);
        System.out.println(result);
        return new BackPage();
    }
}

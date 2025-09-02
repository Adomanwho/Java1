/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 *
 * @author dnlbe
 */
public class AuthorTransferable implements Transferable {

    public static final DataFlavor AUTHOR_FLAVOR = new DataFlavor(Author.class, "Author");
    private static final DataFlavor[] SUPPORTED_FLAVORS = {AUTHOR_FLAVOR};

    private final Author author;

    public AuthorTransferable(Author author) {
        this.author = author;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return SUPPORTED_FLAVORS;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return AUTHOR_FLAVOR.equals(flavor);
    }

    @Override
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
       if (isDataFlavorSupported(flavor)) {
            return author;
        }
        throw new UnsupportedFlavorException(flavor);        
    }

}

package com.abid.crescent.filters;

import java.beans.PropertyEditorSupport;


public class FirstNamePropertyEditor extends PropertyEditorSupport {

    /*
        Every single request is of type text,
        it can be manipulated in this method.
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.trim().toLowerCase());
    }

}

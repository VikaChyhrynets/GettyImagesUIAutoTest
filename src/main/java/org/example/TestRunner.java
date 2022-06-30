package org.example;

public class TestRunner
{
    public static void main( String[] args )
    {
        GettyImagesSiteTests gettyImagesSite = new GettyImagesSiteTests();
        System.out.println(gettyImagesSite.authorizationTest());
        System.out.println(gettyImagesSite.addPhotosToCart());
        System.out.println(gettyImagesSite.removePhotos());
        gettyImagesSite.closeChromeTab();
    }
}

package com.mycompany;

import java.io.File;
import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Main {

    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        String webapp = new File("src/main/webapp/").getAbsolutePath();
        String classes = new File("target/classes").getAbsolutePath();

        String contextPath = "";
        Context context = tomcat.addWebapp(contextPath, webapp);

        WebResourceRoot root = new StandardRoot(context);
        DirResourceSet resourceSet = new DirResourceSet(root, "/WEB-INF/classes", classes, "/");
        root.addPreResources(resourceSet);

        context.setResources(root);

        tomcat.getConnector();

        tomcat.start();
        tomcat.getServer().await();
    }
}

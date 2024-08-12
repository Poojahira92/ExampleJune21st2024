package iodemo;

import java.io.File;

public class AssignmentOne
{
    public static void main(String[] args)
    {
        createFolder();
        createNestedFolder();
    }
    private static void createFolder()
    {
        File f1=new File("D:\\Assign\\HelloWorld");
        boolean v1=f1.mkdir();
       System.out.println("Whether it creates a Folder :"+v1);
    }

    private static void createNestedFolder()
    {
        File f1=new File("D:\\Assign\\Assign1\\Assign2\\Assign3\\Assign4\\Assign5\\Assign6\\Assign7\\Assign8\\Assign9\\Assign10");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Nested Folder :"+v1);
    }

}

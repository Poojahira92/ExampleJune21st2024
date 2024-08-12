package iodemo;

import java.io.File;

public class AssignmentTwo
{
    public static void main(String[] args)
    {
        createFolder();
        createSubFolder();
        createSubFolder1();
        createSubFolder2();
        createSubFolder3();
        createSubFolder4();
        createSubFolder5();
        createSubFolder6();
    }
    private static void createFolder()
    {
        File f1=new File("D:\\WeekDayNames");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
    }

    private static void createSubFolder()
    {
        File f1=new File("D:\\WeekDayNames\\Sunday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Sunday's Folder :"+v1);
    }
    private static void createSubFolder1()
    {
        File f1=new File("D:\\WeekDayNames\\Monday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Monday's Folder :"+v1);
    }
    private static void createSubFolder2()
    {
        File f1=new File("D:\\WeekDayNames\\Tuesday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Tuesday's Folder :"+v1);
    }
    private static void createSubFolder3()
    {
        File f1=new File("D:\\WeekDayNames\\Wednesday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Wednesday's Folder :"+v1);
    }
    private static void createSubFolder4()
    {
        File f1=new File("D:\\WeekDayNames\\Thursday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Thursday's Folder :"+v1);
    }
    private static void createSubFolder5()
    {
        File f1=new File("D:\\WeekDayNames\\Friday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Friday's Folder :"+v1);
    }
    private static void createSubFolder6()
    {
        File f1=new File("D:\\WeekDayNames\\Saturday");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Saturday's Folder :"+v1);
    }

}

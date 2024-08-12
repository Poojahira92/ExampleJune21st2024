package iodemo;

import java.io.File;

public class AssignmentThree
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
        File f1=new File("D:\\WeekDay");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
    }

    private static void createSubFolder()
    {
        File f1=new File("D:\\WeekDay\\Sun");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
       File f2=new File("D:\\WeekDay\\Sunday");
       boolean v2=f1.renameTo(f2);
       System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder1()
    {
        File f1=new File("D:\\WeekDay\\Tues");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Tuesday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder2()
    {
        File f1=new File("D:\\WeekDay\\Wed");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Wednesday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder3()
    {
        File f1=new File("D:\\WeekDay\\Thur");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Thursday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder4()
    {
        File f1=new File("D:\\WeekDay\\Fri");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Friday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder5()
    {
        File f1=new File("D:\\WeekDay\\Sat");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Saturday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
    private static void createSubFolder6()
    {
        File f1=new File("D:\\WeekDay\\Mon");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        File f2=new File("D:\\WeekDay\\Monday");
        boolean v2=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v2);
    }
}

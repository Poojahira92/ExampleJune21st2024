package iodemo;

import java.io.File;
import java.io.FileFilter;

public class  AssignmentFive {
    public static void main(String[] args) {
//        renameFolder();
//       deleteFolder();
        folderCollections();
    }

    private static void renameFolder()
    {
        File f1=new File("D:\\Assign5\\smc1.png");
        File f2=new File("D:\\Assign5\\smc1.jpg");
        boolean v1=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v1);
        File f3=new File("D:\\Assign5\\smc2.png");
        File f4=new File("D:\\Assign5\\smc2.jpg");
        boolean v2=f3.renameTo(f4);
        System.out.println("Whether Folder has renamed ?:"+v2);
        File f5=new File("D:\\Assign5\\smc3.png");
        File f6=new File("D:\\Assign5\\smc3.jpg");
        boolean v3=f5.renameTo(f6);
        System.out.println("Whether Folder has renamed ?:"+v3);
        File f7=new File("D:\\Assign5\\smc4.png");
        File f8=new File("D:\\Assign5\\smc4.jpg");
        boolean v4=f7.renameTo(f8);
        System.out.println("Whether Folder has renamed ?:"+v4);
        File f9=new File("D:\\Assign5\\smc5.png");
        File f10=new File("D:\\Assign5\\smc5.jpg");
        boolean v5=f9.renameTo(f10);
        System.out.println("Whether Folder has renamed ?:"+v5);
    }

    private static void deleteFolder()
    {
        File f1=new File("D:\\Assign5\\New Text Document - Copy (1).txt/");
        boolean v1=f1.delete();
        System.out.println("whether Folder has deleted ?:"+v1);
        File f2=new File("D:\\Assign5\\New Text Document - Copy (2).txt/");
        boolean v2=f2.delete();
        System.out.println("whether Folder has deleted ?:"+v2);
        File f3=new File("D:\\Assign5\\New Text Document - Copy (3).txt/");
        boolean v3=f3.delete();
        System.out.println("whether Folder has deleted ?:"+v3);
        File f4=new File("D:\\Assign5\\New Text Document - Copy (4).txt/");
        boolean v4=f4.delete();
        System.out.println("whether Folder has deleted ?:"+v4);
        File f5=new File("D:\\Assign5\\New Text Document - Copy (5).txt/");
        boolean v5=f5.delete();
        System.out.println("whether Folder has deleted ?:"+v5);
    }

    private static void folderCollections()
    {
        try
        {
            File f=new File("D:\\Assign5");
            // Create a FileFilter
            FileFilter filter = new FileFilter()
            {
                public boolean accept(File f)
                {
                    return f.getName().endsWith("xlsx");
                }
            };
            // Get all the names of the files present
            // in the given directory
            // which are text files
            File[] files = f.listFiles(filter);
            System.out.println("Files are:");
            // Display the names of the files
            for (int i = 0; i < files.length; i++)
            {
                System.out.println(files[i].getName());
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}


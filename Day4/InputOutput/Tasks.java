package Day4.InputOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.sql.SQLOutput;

public class Tasks {
    public static void main (String[] args) throws IOException{

        //Task1
        File file1 = new File("/Users/ania/Documents");
        String[] fileList = file1.list();
        for (String name: fileList){
            System.out.println(name);
        }

        //Task2
        String[] fileListWithFilter = file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".pdf")) {
                    return true;
                }
                    else{
                        return false;
                    }
                }
        });
        for (String name: fileListWithFilter){
            System.out.println(name);
        }

        //Task3
        File file2 = new File ("/Users/ania/Gallery");
        System.out.println("Path \"" + file2.getAbsolutePath() + "\" exists? - " + file2.exists());

        //Task4
        System.out.println("Path \"" + file1.getAbsolutePath() + "\" has READ permission? - " + file1.canRead());
        System.out.println("Path \"" + file1.getAbsolutePath() + "\" has WRITE permission? - " + file1.canWrite());

        //Task5
        File file3 = new File ("/Users/ania/Documents/test.rtf");
        System.out.println("Path \"" + file1.getAbsolutePath() + "\" is a directory? - " + file1.isDirectory());
        System.out.println("Path \"" + file1.getAbsolutePath() + "\" is a file? - " + file1.isFile());
        System.out.println("Path \"" + file3.getAbsolutePath() + "\" is a directory? - " + file3.isDirectory());
        System.out.println("Path \"" + file3.getAbsolutePath() + "\" is a file? - " + file3.isFile());

        //Task6
        String stringPath1 = "/Users/ania/Documents/test.txt";
        String stringPath2 = "/Users/ania/Documents/test2.txt";
        Path path1 = Paths.get(stringPath1);
        Path path2 = Paths.get(stringPath2);

        try {
            long answerAfterComparingFiles = FilesCompareByByte(path1,path2);
            System.out.println(answerAfterComparingFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Task7
        FileTime fileTime;
        try{
            fileTime = Files.getLastModifiedTime(path1);
            System.out.println(fileTime);
        } catch (IOException e){
            System.out.println(e);
        }

        //Task8
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        /*
        System.out.println("Enter your name: ");
        String name = R.readLine();
        System.out.println("Your name is: " + name);
        */

        //Task9
        long sizeInBytes = Files.size(path1);
        double sizeInKB = (double)sizeInBytes/1024;
        double sizeInMB = sizeInKB/1024;
        System.out.println("The file size in bytes: " + sizeInBytes);
        System.out.println("The file size in kB: " + sizeInKB);
        System.out.println("The file size in MB: " + sizeInMB);

        //Task10
        FileInputStream input = new FileInputStream(stringPath1);
        byte[] arrayFromFile = new byte[(int)sizeInBytes];
        input.read(arrayFromFile);
        System.out.println(arrayFromFile);

        //Task11
        BufferedReader br = null;
        String strLine = "";
        try{
            br = new BufferedReader(new FileReader(stringPath1));
            while ((strLine = br.readLine())!= null){
                System.out.println(strLine);
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.err.println("File not found");
        }
        catch(IOException e){
            System.err.println("Unable to read the file");
        }

        //Task15
        StringBuilder sb = new StringBuilder();
        try{
            String fileName = "/Users/ania/Documents/task15.txt";
            FileWriter fw = new FileWriter(fileName);
            fw.write("Very interesting task\n");
            fw.write("I want to the bed\n");
            fw.write("Sleeping\n");
            fw.close();

            BufferedReader bReader = new BufferedReader(new FileReader(fileName));
            String line = bReader.readLine();
            while (line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = bReader.readLine();
            }
            bReader.close();
            System.out.println(sb);
        }
        catch (IOException e){
            System.err.println("Ups :)");
        }


    }
    //Task6
    public static long FilesCompareByByte(Path path1, Path path2) throws IOException {
        try (
                BufferedInputStream stream1 = new BufferedInputStream(new FileInputStream(path1.toFile()));
                BufferedInputStream stream2 = new BufferedInputStream(new FileInputStream(path2.toFile()))
        ) {
            int ch = 0;
            long pos = 1;
            while ((ch = stream1.read()) != -1) {
                if (ch != stream2.read()) {
                    return pos;
                }
                pos++;
            }
            if (stream2.read() == -1) {
                return -1;
            } else {
                return pos;
            }
        }
    }
}

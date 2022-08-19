package Day4.InputOutput;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tasks {
    public static void main (String[] args){

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

package Day4.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Tasks_ArrayList {
    public static void main (String[] args){
        //Task1
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println(colors);

        //Task2
        Iterator<String> iterate = colors.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }

        //Task3
        colors.add(0,"Red");
        System.out.println(colors);

        //Task4
        System.out.println("The color at position 1: " + colors.get(1));

        //Task5
        colors.set(3,"Black");
        System.out.println(colors);

        //Task6
        String removedColor = colors.remove(2);
        System.out.println("Removed color:" + removedColor);
        System.out.println(colors);

        //Task7
        /*if (colors.contains("Blue")) {
            System.out.println("Blue is present");
        }
        else{
            System.out.println("Blue not found");
        }*/

        //Task8
        colors.sort(Comparator.naturalOrder());
        System.out.println(colors);

        //Task9
        ArrayList<String> colors2 = new ArrayList<String >();
        colors2.add("Brown");
        colors2.add("Green");
        Collections.copy(colors,colors2);
        System.out.println(colors);
        System.out.println(colors2);

        //Task10
        Collections.shuffle(colors);
        System.out.println(colors);

        //Task11
        Collections.reverse(colors);
        System.out.println(colors);

        //Task12
        System.out.println("Part of color list: " + colors.subList(1,4));

        //Task13
        ArrayList<Boolean> comparingList = new ArrayList<Boolean>();
        for (String color: colors){
            comparingList.add(colors2.contains(color));
        }
        System.out.println(comparingList);

        //Task14
        System.out.println(colors);
        Collections.swap(colors,1,3);
        System.out.println(colors);

        //Task15
        colors.addAll(colors2);
        System.out.println(colors);

        //Task16
        ArrayList<String> colors3 = (ArrayList<String>)colors.clone();
        System.out.println(colors3);

        //Task17
        colors3.removeAll(colors3);
        System.out.println(colors3);

        //Task18
        Boolean answerIfEmpty;
        answerIfEmpty = colors3.isEmpty();
        System.out.println(answerIfEmpty);

        //Task19
        colors.trimToSize();
        System.out.println(colors);

        //Task20
        colors.ensureCapacity(100);

        //Task21
        String newColor = "Grey";
        colors.set(1, newColor);
        System.out.println(colors);

        //Task22
        int sizeOfArray = colors.size();
        for (int i = 0; i < sizeOfArray;i++){
            System.out.println(colors.get(i));
        }
    }
}

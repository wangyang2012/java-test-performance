package fr.ina;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    testWithVector();
        testWithHashMap();
        testWithVectorII();
    }

    private static void testWithVector() {
        final long time1 = System.currentTimeMillis();
        Mountain[][] map = new Mountain[5555][5555];
        for (int i=86; i<5555; i++) {
            for (int j=0; j<5555; j++) {
                if (i%10 == 0 || j%10 == 0) {
                    Mountain mountain = new Mountain(i, j);
                    map[i][j] = mountain;
                }
            }
        }
        final long time2 = System.currentTimeMillis();

        // construction end
        Mountain mountain1 = map[555][888];
        final long time3 = System.currentTimeMillis();

        Mountain mountain2 = map[555][990];
        final long time4 = System.currentTimeMillis();

        System.out.println("======== test with victor ==============");
        System.out.println("Construction time: " + (time2 - time1) + " ms");
        System.out.println("First find: " + (time3 - time2) + " ms");
        System.out.println("Second: " + (time4 - time3) + " ms");
    }

    private static void testWithHashMap() {
        final long time1 = System.currentTimeMillis();
        Map<Position, Mountain> map = new HashMap<>();
        for (int i=86; i<5555; i++) {
            for (int j=0; j<5555; j++) {
                if (i%10 == 0 || j%10 == 0) {
                    Position position = new Position(i, j);
                    Mountain mountain = new Mountain(position);
                    map.put(position, mountain);
                }
            }
        }
        final long time2 = System.currentTimeMillis();

        // construction end
        Mountain mountain1 = map.get(new Position(555, 888));
        final long time3 = System.currentTimeMillis();

        Mountain mountain2 = map.get(new Position(555, 990));
        final long time4 = System.currentTimeMillis();

        System.out.println("======== test with HashMap ==============");
        System.out.println("Construction time: " + (time2 - time1) + " ms");
        System.out.println("First find: " + (time3 - time2) + " ms");
        System.out.println("Second: " + (time4 - time3) + " ms");
    }


    private static void testWithVectorII() {
        final long time1 = System.currentTimeMillis();
        MountainWithPosition[][] map = new MountainWithPosition[5555][5555];
        for (int i=86; i<5555; i++) {
            for (int j=0; j<5555; j++) {
                if (i%10 == 0 || j%10 == 0) {
                    MountainWithPosition mountain = new MountainWithPosition(i, j);
                    map[i][j] = mountain;
                }
            }
        }
        final long time2 = System.currentTimeMillis();

        // construction end
        MountainWithPosition mountain1 = map[555][888];
        final long time3 = System.currentTimeMillis();

        MountainWithPosition mountain2 = map[555][990];
        final long time4 = System.currentTimeMillis();

        System.out.println("======== test with victor II ==============");
        System.out.println("Construction time: " + (time2 - time1) + " ms");
        System.out.println("First find: " + (time3 - time2) + " ms");
        System.out.println("Second: " + (time4 - time3) + " ms");
    }

}

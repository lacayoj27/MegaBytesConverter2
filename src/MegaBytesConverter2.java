public class MegaBytesConverter2 {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);


    }



    public static void printMegaBytesAndKiloBytes(int kiloBytes) {


        if (kiloBytes >= 0) {

            int XX = kiloBytes / 1024;  //original value kiloBytes
            int ZZ = kiloBytes % 1024;  //remaining kilobytes

            System.out.println(kiloBytes + "KB = " + XX + "MB and " + ZZ + "KB");

        } else {

            System.out.println("Invalid Value");

        }

    }

}

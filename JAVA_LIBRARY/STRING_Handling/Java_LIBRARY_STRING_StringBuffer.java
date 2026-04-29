package JAVA_LIBRARY.STRING_Handling;

public class Java_LIBRARY_STRING_StringBuffer {

    public static String str_00 = "String";
    public static String str_01 = "Buffer";
    public static String str_02 = "Example";

    public static StringBuffer str_Buf = new StringBuffer();

    public static void str_Buf_append(String str_B, String str_0) {
        str_Buf = new StringBuffer(str_B);
        str_Buf.append(str_0);
        System.out.println(str_Buf);
    }

    public static void main (String [] args) {

        str_Buf_append(str_00, str_01);
        str_Buf_append(String.valueOf(str_Buf), str_02);

        System.out.println(str_Buf.length());
        byte strB = (byte) str_Buf.codePointAt(0);
        byte[] str_Byte = {strB};
        String str_byte_0 = new String(str_Byte);
        str_Buf_append(String.valueOf(str_Buf), str_byte_0);


        char ch_Find = 'B';
        char [] str_Char = new char[str_Buf.length()];
        for (int i = 0; i < str_Buf.length(); i++) {

            str_Char[i] = (char) str_Buf.codePointAt(i);

            if (str_Char[i] == ch_Find) {
                System.out.println(str_Char[i]);
            }
        }

        str_Buf.delete(19,20);
        System.out.println(str_Buf);


        String str_ToFind = "F";
        String str_ToFind_LC = str_ToFind.toLowerCase();

        String str_ToLowCase = String.valueOf(str_Buf);
        String str_LC = str_ToLowCase.toLowerCase();

        System.out.println(str_LC);

        int index = str_LC.indexOf(str_ToFind_LC);;

        if (index == -1) {
            System.out.println("Фраза не найдена.");
        } else {
            System.out.println("Результаты поиска:");
            while (index >= 0) {
                System.out.println(str_ToFind + " - найдено на позиции: " + index);
                // Продолжаем поиск со следующего символа
                index = str_LC.indexOf(str_ToFind_LC, index + 1);
            }
        }


//insert(int, str)
        int ins = str_Buf.indexOf("Buf");
        str_Buf.insert(ins, "---Hell-ow---");
        System.out.println(str_Buf);

//      replace(int start, int end, String str): Заменяет подстроку на другую.
        int rep = str_Buf.indexOf("---Hell-ow---");
        str_Buf.replace(9, 10, "Buf");
        System.out.println(str_Buf);

//        reverse(): Переворачивает последовательность символов.
        System.out.println(str_Buf.reverse());


//                Методы для получения информации
//        length(): Возвращает текущую длину строки (количество символов).
//        capacity(): Возвращает размер выделенного буфера.
//        charAt(int index): Возвращает символ по индексу.
//        Дополнительные полезные методы
//        ensureCapacity(int minimumCapacity): Гарантирует, что буфер вместит определенное количество символов.
//                setLength(int newLength): Устанавливает новую длину строки, обрезая или дополняя ее.
//                getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): Копирует часть строки в массив символов.

    }
}

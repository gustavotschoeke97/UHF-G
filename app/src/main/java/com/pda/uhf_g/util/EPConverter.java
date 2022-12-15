package com.pda.uhf_g.util;

import android.os.Build;


/*
    String getCode(String EPCstr)
    parametro: String codigo EPC lido
    retorno: String EPC decodificado separado por ponto

Exemplo
    String epc = "307400000Cad190000001A85";
    String code = getCode(epc);
    System.out.print(code);

Saida:
    3.0000003.177252.6789
*/
public class EPConverter {


    public EPConverter() {

    }

    public static String getSerial(String EPCstr) {
        int size = EPCstr.length() - 10;
        String EPC = EPCstr.substring(size);
        long limit = Long.parseLong("274877906943");
        long result = 0;
        long aux, aux2;
        String re = "";
        for (int i = 0; i < EPC.length(); i++) {
            switch (EPC.charAt(i)) {
                case '0':
                    aux = 0;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '1':
                    aux = 1;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '2':
                    aux = 2;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '3':
                    aux = 3;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '4':
                    aux = 4;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '5':
                    aux = 5;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '6':
                    aux = 6;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '7':
                    aux = 7;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '8':
                    aux = 8;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '9':
                    aux = 9;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'A':
                    aux = 10;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'a':
                    aux = 10;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'B':
                    aux = 11;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'b':
                    aux = 11;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'C':
                    aux = 12;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'c':
                    aux = 12;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'D':
                    aux = 13;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'd':
                    aux = 13;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'E':
                    aux = 14;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'e':
                    aux = 14;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'F':
                    aux = 15;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'f':
                    aux = 15;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
            }
        }
        result = result & limit;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            re = Long.toUnsignedString(result);
        }
        return re;
    }

    public static String getGS(String cod, int digit) {
        String codigo = "";
        int len = cod.length();
        for (int i = len; i < digit; i++) {
            codigo += "0";
        }
        if (len < digit) {
            codigo += cod;
        } else {
            codigo = cod;
        }
        return codigo;
    }

    public static String getCode(String EPCstr) {
        int size2 = EPCstr.length() - 9;
        int size1 = EPCstr.length() - 22;
        String EPC = EPCstr.substring(size1, size2);
        long limit = Long.parseLong("281474976710655");
        long limit2 = Long.parseLong("17592186044415");
        long limit_indicator = 0;
        long indicator = 0;
        long result = 0;
        long ge = 0;
        long desloc = 0;
        long aux, aux2;
        long filter = 0;
        String re = "";
        String serial = "";
        String ge_str = "";
        String indicator_str = "";
        serial = getSerial(EPCstr);
        for (int i = 0; i < EPC.length(); i++) {
            switch (EPC.charAt(i)) {
                case '0':
                    aux = 0;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '1':
                    aux = 1;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '2':
                    aux = 2;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '3':
                    aux = 3;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '4':
                    aux = 4;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '5':
                    aux = 5;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '6':
                    aux = 6;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '7':
                    aux = 7;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '8':
                    aux = 8;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case '9':
                    aux = 9;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'A':
                    aux = 10;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'a':
                    aux = 10;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'B':
                    aux = 11;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'b':
                    aux = 11;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'C':
                    aux = 12;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'c':
                    aux = 12;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'D':
                    aux = 13;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'd':
                    aux = 13;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'E':
                    aux = 14;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'e':
                    aux = 14;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'F':
                    aux = 15;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
                case 'f':
                    aux = 15;
                    aux2 = result << 4;
                    result = aux | aux2;
                    break;
            }
        }
        filter = result >> 49;
        filter = filter & 7;
        desloc = result >> 46;
        desloc = desloc & 7;
        result = result >> 2;
        result = result & limit;
        ge = result & limit2;
        if (desloc == 0) {
            limit_indicator = 15;
            indicator = result & limit_indicator;
            ge = ge >> 4;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 12);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 1);
            }
        } else if (desloc == 1) {
            limit_indicator = 127;
            indicator = result & limit_indicator;
            ge = ge >> 7;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 11);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 2);
            }
        } else if (desloc == 2) {
            limit_indicator = 1023;
            indicator = result & limit_indicator;
            ge = ge >> 10;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 10);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 3);
            }
        } else if (desloc == 3) {
            limit_indicator = 16383;
            indicator = result & limit_indicator;
            ge = ge >> 14;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 9);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 4);
            }
        } else if (desloc == 4) {
            limit_indicator = 131071;
            indicator = result & limit_indicator;
            ge = ge >> 17;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 8);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 5);
            }
        } else if (desloc == 5) {
            limit_indicator = 1048575;
            indicator = result & limit_indicator;
            ge = ge >> 20;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 7);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 6);
            }
        } else if (desloc == 6) {
            limit_indicator = 16777215;
            indicator = result & limit_indicator;
            ge = ge >> 24;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ge_str = getGS(Long.toUnsignedString(ge), 6);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                indicator_str = getGS(Long.toUnsignedString(indicator), 7);
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            re = Long.toUnsignedString(filter);
        }
        re += ".";
        re += ge_str;
        re += ".";
        re += indicator_str;
        re += ".";
        re += serial;
        return re;
    }

    public static String getEPC(String params) {
        String text, in;
        //while (true) {
        in = params;
            //if (in.equals("0")) {
            //    break;
            //}
        text = getCode(in);
        return text;
        //}
    }
}

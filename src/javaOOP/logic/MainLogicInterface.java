package javaOOP.logic;

import javaOOP.logic.logicInterface.LogicInterface;
import javaOOP.logic.logicInterface.logic01Impl.*;
import javaOOP.logic.logicInterface.logic02Impl.*;

public class MainLogicInterface {
    public static void main(String[] args) {
        System.out.println("\n\nLogic 01 Soal 01");
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01Soal01.CetakArray();

        System.out.println("\n\nLogic 01 Soal 02");
        LogicInterface logic01Soal02 = new Logic01Soal02Impl(new BasicLogic(9));
        logic01Soal02.CetakArray();

        System.out.println("\n\nLogic 01 Soal 03");
        LogicInterface logic01Soal03 = new Logic01Soal03Impl(new BasicLogic(9));
        logic01Soal03.CetakArray();

        System.out.println("\n\nLogic 01 Soal 04");
        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(9));
        logic01Soal04.CetakArray();

        System.out.println("\n\nLogic 01 Soal 05");
        LogicInterface logic01Soal05 = new Logic01Soal05Impl(new BasicLogic(9));
        logic01Soal05.CetakArray();

        System.out.println("\n\nLogic 01 Soal 06");
        LogicInterface logic01Soal06 = new Logic01Soal06Impl(new BasicLogic(9));
        logic01Soal06.CetakArray();

        System.out.println("\n\nLogic 01 Soal 07");
        LogicInterface logic01Soal07 = new Logic01Soal07Impl(new BasicLogic(9));
        logic01Soal07.CetakArray();

        System.out.println("\n\nLogic 01 Soal 08");
        LogicInterface logic01Soal08 = new Logic01Soal08Impl(new BasicLogic(9));
        logic01Soal08.CetakArray();

        System.out.println("\n\nLogic 01 Soal 09");
        LogicInterface logic01Soal09 = new Logic01Soal09Impl(new BasicLogic(9));
        logic01Soal09.CetakArray();

        System.out.println("\n\nLogic 01 Soal 10");
        LogicInterface logic01Soal10 = new Logic01Soal10Impl(new BasicLogic(9));
        logic01Soal10.CetakArray();

        System.out.println("\n\nLogic 02 Soal 01");
        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(9));
        logic02Soal01.CetakArray();

        System.out.println("\n\nLogic 02 Soal 02");
        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(9));
        logic02Soal02.CetakArray();

        System.out.println("\n\nLogic 02 Soal 03");
        LogicInterface logic02Soal03 = new Logic02Soal03Impl(new BasicLogic(9));
        logic02Soal03.CetakArray();

        System.out.println("\n\nLogic 02 Soal 04");
        LogicInterface logic02Soal04 = new Logic02Soal04Impl(new BasicLogic(9));
        logic02Soal04.CetakArray();

        System.out.println("\n\nLogic 02 Soal 05");
        LogicInterface logic02Soal05 = new Logic02Soal05Impl(new BasicLogic(9));
        logic02Soal05.CetakArray();

        System.out.println("\n\nLogic 02 Soal 06");
        LogicInterface logic02Soal06 = new Logic02Soal06Impl(new BasicLogic(9));
        logic02Soal06.CetakArray();

        System.out.println("\n\nLogic 02 Soal 07");
        LogicInterface logic02Soal07 = new Logic02Soal07Impl(new BasicLogic(9));
        logic02Soal07.CetakArray();

        System.out.println("\n\nLogic 02 Soal 08");
        LogicInterface logic02Soal08 = new Logic02Soal08Impl(new BasicLogic(9));
        logic02Soal08.CetakArray();

        System.out.println("\n\nLogic 02 Soal 09");
        LogicInterface logic02Soal09 = new Logic02Soal09Impl(new BasicLogic(9));
        logic02Soal09.CetakArray();

        //System.out.println("\n\nLogic 02 Soal 10");
        //LogicInterface logic02Soal10 = new Logic02Soal10Impl(new BasicLogic(9));
        //logic02Soal10.CetakArray();
    }
}

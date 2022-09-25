package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.or */
/* compiled from: PG */
public enum C50211or implements C62957cd {
    UNKNOWN(0),
    AUNT(17),
    BOYFRIEND(1),
    BROTHER(2),
    COUSIN(18),
    DAUGHTER(3),
    FATHER(4),
    FIANCE(19),
    FRIEND(5),
    GIRLFRIEND(6),
    GRANDDAUGHTER(7),
    GRANDFATHER(8),
    GRANDMOTHER(9),
    GRANDSON(10),
    HUSBAND(11),
    MOTHER(12),
    NEPHEW(20),
    NIECE(21),
    PARTNER(13),
    SISTER(14),
    SON(15),
    SPOUSE(22),
    UNCLE(23),
    WIFE(16),
    OTHER(24),
    ASSISTANT(25),
    BABE(26),
    BABY(27),
    BABY_GIRL(28),
    BABY_LOVE(29),
    BEST_FRIEND(30),
    BROTHER_IN_LAW(31),
    DAUGHTER_IN_LAW(32),
    FATHER_IN_LAW(33),
    HONEY(34),
    LOVE(35),
    LOVER(36),
    MANAGER(37),
    MOTHER_IN_LAW(38),
    SISTER_IN_LAW(39),
    SON_IN_LAW(40),
    SWEETHEART(41);
    

    /* renamed from: Q */
    public final int f130561Q;

    private C50211or(int i) {
        this.f130561Q = i;
    }

    /* renamed from: a */
    public static C50211or m85791a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BOYFRIEND;
            case 2:
                return BROTHER;
            case 3:
                return DAUGHTER;
            case 4:
                return FATHER;
            case 5:
                return FRIEND;
            case 6:
                return GIRLFRIEND;
            case 7:
                return GRANDDAUGHTER;
            case 8:
                return GRANDFATHER;
            case 9:
                return GRANDMOTHER;
            case 10:
                return GRANDSON;
            case 11:
                return HUSBAND;
            case 12:
                return MOTHER;
            case 13:
                return PARTNER;
            case 14:
                return SISTER;
            case 15:
                return SON;
            case 16:
                return WIFE;
            case 17:
                return AUNT;
            case 18:
                return COUSIN;
            case 19:
                return FIANCE;
            case 20:
                return NEPHEW;
            case 21:
                return NIECE;
            case 22:
                return SPOUSE;
            case 23:
                return UNCLE;
            case 24:
                return OTHER;
            case 25:
                return ASSISTANT;
            case 26:
                return BABE;
            case 27:
                return BABY;
            case 28:
                return BABY_GIRL;
            case 29:
                return BABY_LOVE;
            case 30:
                return BEST_FRIEND;
            case 31:
                return BROTHER_IN_LAW;
            case 32:
                return DAUGHTER_IN_LAW;
            case 33:
                return FATHER_IN_LAW;
            case 34:
                return HONEY;
            case 35:
                return LOVE;
            case 36:
                return LOVER;
            case 37:
                return MANAGER;
            case 38:
                return MOTHER_IN_LAW;
            case 39:
                return SISTER_IN_LAW;
            case 40:
                return SON_IN_LAW;
            case 41:
                return SWEETHEART;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85792b() {
        return C50210oq.f130517a;
    }

    public final int getNumber() {
        return this.f130561Q;
    }

    public final String toString() {
        return Integer.toString(this.f130561Q);
    }
}

package com.google.protos.p4985f.p5001d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.d.b */
/* compiled from: PG */
public enum C64820b implements C62957cd {
    UNSPECIFIED(0),
    GIVEN_NAME(1),
    FAMILY_NAME(2),
    FULL_NAME(3),
    NICKNAME(4),
    OTHER(5),
    INITIAL_WITH_FAMILY_NAME(6),
    EMAIL_USERNAME(7),
    VANITY_NICKNAME(8),
    GIVEN_NAME_ALIAS(9),
    FULL_NAME_ALIAS(10),
    HOMOPHONE_GIVEN_NAME(11),
    HOMOPHONE_FAMILY_NAME(12),
    HOMOPHONE_FULL_NAME(13),
    HOMOPHONE_NICKNAME(14),
    GIVEN_MIDDLE_NAME(15),
    GIVEN_NAME_WITH_FAMILY_NAME_INITIAL(16),
    EMAIL_OF_FAMILY_MEMBER(17),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private final int f175664t;

    private C64820b(int i) {
        this.f175664t = i;
    }

    /* renamed from: a */
    public static C64820b m96466a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return GIVEN_NAME;
            case 2:
                return FAMILY_NAME;
            case 3:
                return FULL_NAME;
            case 4:
                return NICKNAME;
            case 5:
                return OTHER;
            case 6:
                return INITIAL_WITH_FAMILY_NAME;
            case 7:
                return EMAIL_USERNAME;
            case 8:
                return VANITY_NICKNAME;
            case 9:
                return GIVEN_NAME_ALIAS;
            case 10:
                return FULL_NAME_ALIAS;
            case 11:
                return HOMOPHONE_GIVEN_NAME;
            case 12:
                return HOMOPHONE_FAMILY_NAME;
            case 13:
                return HOMOPHONE_FULL_NAME;
            case 14:
                return HOMOPHONE_NICKNAME;
            case 15:
                return GIVEN_MIDDLE_NAME;
            case 16:
                return GIVEN_NAME_WITH_FAMILY_NAME_INITIAL;
            case 17:
                return EMAIL_OF_FAMILY_MEMBER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96467b() {
        return C64819a.f175643a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175664t;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

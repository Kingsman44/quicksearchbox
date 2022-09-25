package com.google.protos.p5133r.p5134a.p5135a.p5136a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.r.a.a.a.b */
/* compiled from: PG */
public enum C65878b implements C62957cd {
    ENVIRONMENT_UNKNOWN(0),
    ENVIRONMENT_PROD(1),
    ENVIRONMENT_STAGING(2),
    ENVIRONMENT_TEST_STAGING(3),
    ENVIRONMENT_AUTOPUSH(4),
    ENVIRONMENT_TEST_AUTOPUSH(5),
    ENVIRONMENT_TEST(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f179107i;

    private C65878b(int i) {
        this.f179107i = i;
    }

    /* renamed from: a */
    public static C65878b m96819a(int i) {
        switch (i) {
            case 0:
                return ENVIRONMENT_UNKNOWN;
            case 1:
                return ENVIRONMENT_PROD;
            case 2:
                return ENVIRONMENT_STAGING;
            case 3:
                return ENVIRONMENT_TEST_STAGING;
            case 4:
                return ENVIRONMENT_AUTOPUSH;
            case 5:
                return ENVIRONMENT_TEST_AUTOPUSH;
            case 6:
                return ENVIRONMENT_TEST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96820b() {
        return C65877a.f179097a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f179107i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bf */
/* compiled from: PG */
public enum C34043bf implements C62957cd {
    ENTRYPOINT_UNKNOWN(0),
    ENTRYPOINT_SELF_INVOCATION(1),
    ENTRYPOINT_LEGACY_HOTWORD(2),
    ENTRYPOINT_HDM_HOTWORD(3),
    ENTRYPOINT_SESSION(4),
    ENTRYPOINT_LEGACY_PROGRAMMATIC(5),
    ENTRYPOINT_QUICK_PHRASE(6),
    ENTRYPOINT_TEST(100),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f90744j;

    private C34043bf(int i) {
        this.f90744j = i;
    }

    /* renamed from: a */
    public static C34043bf m62692a(int i) {
        if (i == 100) {
            return ENTRYPOINT_TEST;
        }
        switch (i) {
            case 0:
                return ENTRYPOINT_UNKNOWN;
            case 1:
                return ENTRYPOINT_SELF_INVOCATION;
            case 2:
                return ENTRYPOINT_LEGACY_HOTWORD;
            case 3:
                return ENTRYPOINT_HDM_HOTWORD;
            case 4:
                return ENTRYPOINT_SESSION;
            case 5:
                return ENTRYPOINT_LEGACY_PROGRAMMATIC;
            case 6:
                return ENTRYPOINT_QUICK_PHRASE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m62693b() {
        return C34042be.f90733a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90744j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

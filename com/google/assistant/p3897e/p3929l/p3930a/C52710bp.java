package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.l.a.bp */
/* compiled from: PG */
public enum C52710bp implements C62957cd {
    VOICE_ENROLLMENT_UNKNOWN_STATUS(0),
    VOICE_ENROLLMENT_SUCCESS(1),
    VOICE_ENROLLMENT_FAILURE(2),
    VOICE_ENROLLMENT_PENDING(3);
    

    /* renamed from: e */
    private final int f138370e;

    private C52710bp(int i) {
        this.f138370e = i;
    }

    /* renamed from: a */
    public static C52710bp m86700a(int i) {
        if (i == 0) {
            return VOICE_ENROLLMENT_UNKNOWN_STATUS;
        }
        if (i == 1) {
            return VOICE_ENROLLMENT_SUCCESS;
        }
        if (i == 2) {
            return VOICE_ENROLLMENT_FAILURE;
        }
        if (i != 3) {
            return null;
        }
        return VOICE_ENROLLMENT_PENDING;
    }

    /* renamed from: b */
    public static C62959cf m86701b() {
        return C52709bo.f138364a;
    }

    public final int getNumber() {
        return this.f138370e;
    }

    public final String toString() {
        return Integer.toString(this.f138370e);
    }
}

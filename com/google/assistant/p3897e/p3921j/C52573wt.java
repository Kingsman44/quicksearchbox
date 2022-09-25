package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.wt */
/* compiled from: PG */
public enum C52573wt implements C62957cd {
    UNSPECIFIED(0),
    HEADLINES(1),
    PERSONALIZED(2),
    LOCAL(3),
    SUMMARY(4);
    

    /* renamed from: f */
    private final int f138025f;

    private C52573wt(int i) {
        this.f138025f = i;
    }

    /* renamed from: a */
    public static C52573wt m86652a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return HEADLINES;
        }
        if (i == 2) {
            return PERSONALIZED;
        }
        if (i == 3) {
            return LOCAL;
        }
        if (i != 4) {
            return null;
        }
        return SUMMARY;
    }

    /* renamed from: b */
    public static C62959cf m86653b() {
        return C52572ws.f138018a;
    }

    public final int getNumber() {
        return this.f138025f;
    }

    public final String toString() {
        return Integer.toString(this.f138025f);
    }
}

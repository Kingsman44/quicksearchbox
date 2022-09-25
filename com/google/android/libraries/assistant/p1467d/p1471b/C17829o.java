package com.google.android.libraries.assistant.p1467d.p1471b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.b.o */
/* compiled from: PG */
public enum C17829o implements C62957cd {
    UI_SUPPRESSION_LEVEL_UNKNOWN(0),
    UI_SUPPRESSION_LEVEL_NONE(10),
    UI_SUPPRESSION_LEVEL_MEDIA(20),
    UI_SUPPRESSION_LEVEL_MESSAGE(30),
    UI_SUPPRESSION_LEVEL_PHONE_CALL(40),
    UI_SUPPRESSION_LEVEL_ALL(100);
    

    /* renamed from: g */
    private final int f51164g;

    private C17829o(int i) {
        this.f51164g = i;
    }

    /* renamed from: a */
    public static C17829o m35073a(int i) {
        if (i == 0) {
            return UI_SUPPRESSION_LEVEL_UNKNOWN;
        }
        if (i == 10) {
            return UI_SUPPRESSION_LEVEL_NONE;
        }
        if (i == 20) {
            return UI_SUPPRESSION_LEVEL_MEDIA;
        }
        if (i == 30) {
            return UI_SUPPRESSION_LEVEL_MESSAGE;
        }
        if (i == 40) {
            return UI_SUPPRESSION_LEVEL_PHONE_CALL;
        }
        if (i != 100) {
            return null;
        }
        return UI_SUPPRESSION_LEVEL_ALL;
    }

    /* renamed from: b */
    public static C62959cf m35074b() {
        return C17828n.f51156a;
    }

    public final int getNumber() {
        return this.f51164g;
    }

    public final String toString() {
        return Integer.toString(this.f51164g);
    }
}

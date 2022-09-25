package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.b.ai */
/* compiled from: PG */
public enum C48674ai implements C62957cd {
    UNKNOWN(0),
    ASSISTANT(1),
    BLUE_CHIP(2),
    INTENT_LAUNCHER(3),
    GEMINI(4);
    

    /* renamed from: f */
    public final int f125923f;

    private C48674ai(int i) {
        this.f125923f = i;
    }

    /* renamed from: a */
    public static C48674ai m85261a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ASSISTANT;
        }
        if (i == 2) {
            return BLUE_CHIP;
        }
        if (i == 3) {
            return INTENT_LAUNCHER;
        }
        if (i != 4) {
            return null;
        }
        return GEMINI;
    }

    /* renamed from: b */
    public static C62959cf m85262b() {
        return C48673ah.f125916a;
    }

    public final int getNumber() {
        return this.f125923f;
    }

    public final String toString() {
        return Integer.toString(this.f125923f);
    }
}

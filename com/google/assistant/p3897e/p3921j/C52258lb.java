package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.lb */
/* compiled from: PG */
public enum C52258lb implements C62957cd {
    LAUNCH_KEYBOARD_UNSUPPORTED(0),
    OPA_ANDROID_LAUNCH_KEYBOARD_URI(1);
    

    /* renamed from: c */
    public final int f137142c;

    private C52258lb(int i) {
        this.f137142c = i;
    }

    /* renamed from: a */
    public static C52258lb m86555a(int i) {
        if (i == 0) {
            return LAUNCH_KEYBOARD_UNSUPPORTED;
        }
        if (i != 1) {
            return null;
        }
        return OPA_ANDROID_LAUNCH_KEYBOARD_URI;
    }

    /* renamed from: b */
    public static C62959cf m86556b() {
        return C52257la.f137138a;
    }

    public final int getNumber() {
        return this.f137142c;
    }

    public final String toString() {
        return Integer.toString(this.f137142c);
    }
}

package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.me */
/* compiled from: PG */
public enum C51559me implements C62957cd {
    UNDEFINED(0),
    RUNNING(1),
    PAUSED(2);
    

    /* renamed from: d */
    public final int f134381d;

    private C51559me(int i) {
        this.f134381d = i;
    }

    /* renamed from: a */
    public static C51559me m86216a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return RUNNING;
        }
        if (i != 2) {
            return null;
        }
        return PAUSED;
    }

    /* renamed from: b */
    public static C62959cf m86217b() {
        return C51558md.f134376a;
    }

    public final int getNumber() {
        return this.f134381d;
    }

    public final String toString() {
        return Integer.toString(this.f134381d);
    }
}

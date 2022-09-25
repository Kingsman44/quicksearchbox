package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.fm */
/* compiled from: PG */
public enum C51378fm implements C62957cd {
    UNKNOWN_DISPLAY_STATE(0),
    LOCKSCREEN(1),
    HOMESCREEN(2),
    IN_APP(3);
    

    /* renamed from: e */
    public final int f133813e;

    private C51378fm(int i) {
        this.f133813e = i;
    }

    /* renamed from: a */
    public static C51378fm m86170a(int i) {
        if (i == 0) {
            return UNKNOWN_DISPLAY_STATE;
        }
        if (i == 1) {
            return LOCKSCREEN;
        }
        if (i == 2) {
            return HOMESCREEN;
        }
        if (i != 3) {
            return null;
        }
        return IN_APP;
    }

    /* renamed from: b */
    public static C62959cf m86171b() {
        return C51377fl.f133807a;
    }

    public final int getNumber() {
        return this.f133813e;
    }

    public final String toString() {
        return Integer.toString(this.f133813e);
    }
}

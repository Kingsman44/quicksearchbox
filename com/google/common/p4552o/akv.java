package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.akv */
/* compiled from: PG */
public enum akv implements C62957cd {
    UNKNOWN_SURFACE(0),
    SYSTEM_UI(1),
    AMBIENT(2),
    OEM_SYSTEM_UI(3),
    WIDGET(4),
    OEM_PREINSTALLED_WIDGET(5);
    

    /* renamed from: g */
    public final int f158995g;

    private akv(int i) {
        this.f158995g = i;
    }

    /* renamed from: a */
    public static akv m92425a(int i) {
        if (i == 0) {
            return UNKNOWN_SURFACE;
        }
        if (i == 1) {
            return SYSTEM_UI;
        }
        if (i == 2) {
            return AMBIENT;
        }
        if (i == 3) {
            return OEM_SYSTEM_UI;
        }
        if (i == 4) {
            return WIDGET;
        }
        if (i != 5) {
            return null;
        }
        return OEM_PREINSTALLED_WIDGET;
    }

    /* renamed from: b */
    public static C62959cf m92426b() {
        return aku.f158987a;
    }

    public final int getNumber() {
        return this.f158995g;
    }

    public final String toString() {
        return Integer.toString(this.f158995g);
    }
}

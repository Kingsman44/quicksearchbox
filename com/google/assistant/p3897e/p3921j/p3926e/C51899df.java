package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.df */
/* compiled from: PG */
public enum C51899df implements C62957cd {
    UNKNOWN_DIALOG_WINDOW_MODE(0),
    DOWNLOAD(1),
    HOMESCREEN_SHORTCUT(2);
    

    /* renamed from: d */
    public final int f136137d;

    private C51899df(int i) {
        this.f136137d = i;
    }

    /* renamed from: a */
    public static C51899df m86409a(int i) {
        if (i == 0) {
            return UNKNOWN_DIALOG_WINDOW_MODE;
        }
        if (i == 1) {
            return DOWNLOAD;
        }
        if (i != 2) {
            return null;
        }
        return HOMESCREEN_SHORTCUT;
    }

    /* renamed from: b */
    public static C62959cf m86410b() {
        return C51898de.f136132a;
    }

    public final int getNumber() {
        return this.f136137d;
    }

    public final String toString() {
        return Integer.toString(this.f136137d);
    }
}

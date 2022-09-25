package com.google.protos.p4880aq;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aq.k */
/* compiled from: PG */
public enum C63754k implements C62957cd {
    DRAWABLE_UNKNOWN(0),
    DRAWABLE_SEARCH_WIDGET(1),
    DRAWABLE_DEFAULT_DIALOG(2),
    DRAWABLE_DEFAULT_TAKEOVER(3),
    DRAWABLE_DEFAULT_TOUT(4);
    

    /* renamed from: f */
    private final int f172473f;

    private C63754k(int i) {
        this.f172473f = i;
    }

    /* renamed from: a */
    public static C63754k m96303a(int i) {
        if (i == 0) {
            return DRAWABLE_UNKNOWN;
        }
        if (i == 1) {
            return DRAWABLE_SEARCH_WIDGET;
        }
        if (i == 2) {
            return DRAWABLE_DEFAULT_DIALOG;
        }
        if (i == 3) {
            return DRAWABLE_DEFAULT_TAKEOVER;
        }
        if (i != 4) {
            return null;
        }
        return DRAWABLE_DEFAULT_TOUT;
    }

    /* renamed from: b */
    public static C62959cf m96304b() {
        return C63753j.f172466a;
    }

    public final int getNumber() {
        return this.f172473f;
    }

    public final String toString() {
        return Integer.toString(this.f172473f);
    }
}

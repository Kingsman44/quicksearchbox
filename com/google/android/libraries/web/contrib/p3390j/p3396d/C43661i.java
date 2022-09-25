package com.google.android.libraries.web.contrib.p3390j.p3396d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.contrib.j.d.i */
/* compiled from: PG */
public enum C43661i implements C62957cd {
    DEFAULT_CLICK(0),
    SHOW_PAGE_INFO(1),
    EMIT_TEXT_CLICK_EVENT(2);
    

    /* renamed from: d */
    public final int f113934d;

    private C43661i(int i) {
        this.f113934d = i;
    }

    /* renamed from: a */
    public static C43661i m77039a(int i) {
        if (i == 0) {
            return DEFAULT_CLICK;
        }
        if (i == 1) {
            return SHOW_PAGE_INFO;
        }
        if (i != 2) {
            return null;
        }
        return EMIT_TEXT_CLICK_EVENT;
    }

    /* renamed from: b */
    public static C62959cf m77040b() {
        return C43660h.f113929a;
    }

    public final int getNumber() {
        return this.f113934d;
    }

    public final String toString() {
        return Integer.toString(this.f113934d);
    }
}

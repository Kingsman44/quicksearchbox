package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.at */
/* compiled from: PG */
public enum C59596at implements C62957cd {
    DISCOVER_REQUEST_TYPE_UNSPECIFIED(0),
    FIRST_PAGE_INTERACTIVE(1),
    FIRST_PAGE_BACKGROUND(2),
    PINNED_CONTENT(3);
    

    /* renamed from: e */
    public final int f159810e;

    private C59596at(int i) {
        this.f159810e = i;
    }

    /* renamed from: a */
    public static C59596at m92463a(int i) {
        if (i == 0) {
            return DISCOVER_REQUEST_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return FIRST_PAGE_INTERACTIVE;
        }
        if (i == 2) {
            return FIRST_PAGE_BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return PINNED_CONTENT;
    }

    /* renamed from: b */
    public static C62959cf m92464b() {
        return C59595as.f159804a;
    }

    public final int getNumber() {
        return this.f159810e;
    }

    public final String toString() {
        return Integer.toString(this.f159810e);
    }
}

package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.j */
/* compiled from: PG */
public enum C124867j implements C62957cd {
    WEBX_UNSPECIFIED(0),
    WEBX_REQUEST_ERROR(1),
    WEBX_LOADING(2);
    

    /* renamed from: d */
    public static final C62958ce f344507d = null;

    /* renamed from: e */
    private final int f344509e;

    static {
        f344507d = new C124866i();
    }

    private C124867j(int i) {
        this.f344509e = i;
    }

    /* renamed from: a */
    public static C124867j m204686a(int i) {
        if (i == 0) {
            return WEBX_UNSPECIFIED;
        }
        if (i == 1) {
            return WEBX_REQUEST_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return WEBX_LOADING;
    }

    public final int getNumber() {
        return this.f344509e;
    }

    public final String toString() {
        return Integer.toString(this.f344509e);
    }
}

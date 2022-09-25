package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.z */
/* compiled from: PG */
public enum C87343z implements C62957cd {
    UNKNOWN_TYPE(0),
    SNACKBAR(1),
    NEW_CONTENT_BUTTON(2),
    BOTTOM_BAR_TOOLTIP(3),
    BOTTOM_DIALOG(4),
    SMILE_SCALE_SURVEY(5);
    

    /* renamed from: g */
    public final int f235913g;

    private C87343z(int i) {
        this.f235913g = i;
    }

    /* renamed from: a */
    public static C87343z m141303a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return SNACKBAR;
        }
        if (i == 2) {
            return NEW_CONTENT_BUTTON;
        }
        if (i == 3) {
            return BOTTOM_BAR_TOOLTIP;
        }
        if (i == 4) {
            return BOTTOM_DIALOG;
        }
        if (i != 5) {
            return null;
        }
        return SMILE_SCALE_SURVEY;
    }

    /* renamed from: b */
    public static C62959cf m141304b() {
        return C87342y.f235905a;
    }

    public final int getNumber() {
        return this.f235913g;
    }

    public final String toString() {
        return Integer.toString(this.f235913g);
    }
}

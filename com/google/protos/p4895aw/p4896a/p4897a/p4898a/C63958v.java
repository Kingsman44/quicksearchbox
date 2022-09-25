package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.a.a.a.v */
/* compiled from: PG */
public enum C63958v implements C62957cd {
    TYPE_UNSPECIFIED(0),
    TOUT(1),
    DIALOG(2),
    FULLSCREEN(3),
    TOOLTIP(4),
    DISCOVER_TOOLTIP(5),
    ACCOUNT_MENU_EDUCATION(6);
    

    /* renamed from: h */
    public final int f172980h;

    private C63958v(int i) {
        this.f172980h = i;
    }

    /* renamed from: a */
    public static C63958v m96327a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 1:
                return TOUT;
            case 2:
                return DIALOG;
            case 3:
                return FULLSCREEN;
            case 4:
                return TOOLTIP;
            case 5:
                return DISCOVER_TOOLTIP;
            case 6:
                return ACCOUNT_MENU_EDUCATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96328b() {
        return C63957u.f172971a;
    }

    public final int getNumber() {
        return this.f172980h;
    }

    public final String toString() {
        return Integer.toString(this.f172980h);
    }
}

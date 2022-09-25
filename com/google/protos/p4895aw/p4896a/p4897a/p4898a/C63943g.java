package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.a.a.a.g */
/* compiled from: PG */
public enum C63943g implements C62957cd {
    TYPE_UNSPECIFIED(0),
    OPEN_URL(1),
    ADD_WEATHER_SHORTCUT(2),
    COMMIT_QUERY(3),
    MANAGE_PERMISSION_SETTING(4),
    NOTIFICATION_OPTIN(5),
    OPEN_STAMP_VIEWER(6),
    PIN_SEARCH_WIDGET(7),
    SIGN_IN(8);
    

    /* renamed from: j */
    private final int f172932j;

    private C63943g(int i) {
        this.f172932j = i;
    }

    /* renamed from: a */
    public static C63943g m96323a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 1:
                return OPEN_URL;
            case 2:
                return ADD_WEATHER_SHORTCUT;
            case 3:
                return COMMIT_QUERY;
            case 4:
                return MANAGE_PERMISSION_SETTING;
            case 5:
                return NOTIFICATION_OPTIN;
            case 6:
                return OPEN_STAMP_VIEWER;
            case 7:
                return PIN_SEARCH_WIDGET;
            case 8:
                return SIGN_IN;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96324b() {
        return C63942f.f172921a;
    }

    public final int getNumber() {
        return this.f172932j;
    }

    public final String toString() {
        return Integer.toString(this.f172932j);
    }
}

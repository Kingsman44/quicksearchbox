package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.a.a.a.r */
/* compiled from: PG */
public enum C63954r implements C62957cd {
    TYPE_UNSPECIFIED(0),
    ACCOUNT_STATE(1),
    SEARCH_REQUEST_STATE(2),
    SEARCH_WIDGET_ENABLED(3),
    AGA_PERMISSION_SETTING_ENABLED(4),
    ENTRY_POINT(5),
    PIN_APP_WIDGET_SUPPORTED(6),
    SEARCH_CONSOLE_INSIGHTS_ELIGIBLE(7),
    NOTIFICATION_ENABLED(8),
    XGA_USER_ENGAGED(9),
    WEATHER_HSI_INSTALLED(10);
    

    /* renamed from: l */
    private final int f172965l;

    private C63954r(int i) {
        this.f172965l = i;
    }

    /* renamed from: a */
    public static C63954r m96325a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 1:
                return ACCOUNT_STATE;
            case 2:
                return SEARCH_REQUEST_STATE;
            case 3:
                return SEARCH_WIDGET_ENABLED;
            case 4:
                return AGA_PERMISSION_SETTING_ENABLED;
            case 5:
                return ENTRY_POINT;
            case 6:
                return PIN_APP_WIDGET_SUPPORTED;
            case 7:
                return SEARCH_CONSOLE_INSIGHTS_ELIGIBLE;
            case 8:
                return NOTIFICATION_ENABLED;
            case 9:
                return XGA_USER_ENGAGED;
            case 10:
                return WEATHER_HSI_INSTALLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96326b() {
        return C63953q.f172952a;
    }

    public final int getNumber() {
        return this.f172965l;
    }

    public final String toString() {
        return Integer.toString(this.f172965l);
    }
}

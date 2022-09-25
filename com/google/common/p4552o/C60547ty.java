package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.ty */
/* compiled from: PG */
public enum C60547ty implements C62957cd {
    VELVET_ACTIVITY(0),
    QUERY_ENTRY_ACTIVITY(2),
    LOCKSCREEN_ENTRY_ACTIVITY(4),
    SEARCH_NOW_ACTIVITY(8),
    MONET_ACTIVITY(12),
    NOW_OPTIN_ACTIVITY(14),
    SEARCH_RESULTS_DYNAMIC_ACTIVITY(15),
    PAYMENT_AUTH_ACTIVITY(21),
    APP_COMPAT_ACTIVITY(22),
    WIDGET_CUSTOMIZATION_MENU_ACTIVITY(23),
    TRANSPARENT_MONET_ACTIVITY(24),
    WIDGET_CUSTOMIZATION_ACTIVITY(26),
    SEARCH_APP_COMPAT_MONET_ACTIVITY(27),
    DIALOG_MONET_ACTIVITY(28),
    NOW_STREAM_MONET_ACTIVITY(30),
    OPA_ACTIVITY(31),
    SEARCH_WIDGET_OVERLAY_ACTIVITY(32),
    ACETONE_ACTIVITY(33),
    SCREENSHOT_ACTIVITY(35),
    GOOGLE_APP_ACTIVITY(36),
    NIU_ACTIVITY(37),
    ZERO_STATE_ACTIVITY(38),
    OPA_HQ_ACTIVITY(39);
    

    /* renamed from: x */
    public final int f164058x;

    private C60547ty(int i) {
        this.f164058x = i;
    }

    /* renamed from: a */
    public static C60547ty m92613a(int i) {
        if (i == 0) {
            return VELVET_ACTIVITY;
        }
        if (i == 2) {
            return QUERY_ENTRY_ACTIVITY;
        }
        if (i == 4) {
            return LOCKSCREEN_ENTRY_ACTIVITY;
        }
        if (i == 8) {
            return SEARCH_NOW_ACTIVITY;
        }
        if (i == 12) {
            return MONET_ACTIVITY;
        }
        if (i == 14) {
            return NOW_OPTIN_ACTIVITY;
        }
        if (i == 15) {
            return SEARCH_RESULTS_DYNAMIC_ACTIVITY;
        }
        switch (i) {
            case 21:
                return PAYMENT_AUTH_ACTIVITY;
            case 22:
                return APP_COMPAT_ACTIVITY;
            case 23:
                return WIDGET_CUSTOMIZATION_MENU_ACTIVITY;
            case 24:
                return TRANSPARENT_MONET_ACTIVITY;
            default:
                switch (i) {
                    case 26:
                        return WIDGET_CUSTOMIZATION_ACTIVITY;
                    case 27:
                        return SEARCH_APP_COMPAT_MONET_ACTIVITY;
                    case 28:
                        return DIALOG_MONET_ACTIVITY;
                    default:
                        switch (i) {
                            case 30:
                                return NOW_STREAM_MONET_ACTIVITY;
                            case 31:
                                return OPA_ACTIVITY;
                            case 32:
                                return SEARCH_WIDGET_OVERLAY_ACTIVITY;
                            case 33:
                                return ACETONE_ACTIVITY;
                            default:
                                switch (i) {
                                    case 35:
                                        return SCREENSHOT_ACTIVITY;
                                    case 36:
                                        return GOOGLE_APP_ACTIVITY;
                                    case 37:
                                        return NIU_ACTIVITY;
                                    case 38:
                                        return ZERO_STATE_ACTIVITY;
                                    case 39:
                                        return OPA_HQ_ACTIVITY;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m92614b() {
        return C60546tx.f164033a;
    }

    public final int getNumber() {
        return this.f164058x;
    }

    public final String toString() {
        return Integer.toString(this.f164058x);
    }
}

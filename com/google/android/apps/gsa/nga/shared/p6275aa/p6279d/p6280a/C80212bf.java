package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bf */
/* compiled from: PG */
public enum C80212bf {
    APP_USAGE,
    MAPS_USAGE,
    NEW_APP_INSTALLED,
    DEVICE_NAVIGATION_MODE,
    ASSISTANT_UI_DARK_MODE,
    TEST_SIGNAL,
    SIGNALTYPE_NOT_SET;

    /* renamed from: a */
    public static C80212bf m128095a(int i) {
        if (i == 0) {
            return SIGNALTYPE_NOT_SET;
        }
        switch (i) {
            case 2:
                return APP_USAGE;
            case 3:
                return NEW_APP_INSTALLED;
            case 4:
                return TEST_SIGNAL;
            case 5:
                return MAPS_USAGE;
            case 6:
                return DEVICE_NAVIGATION_MODE;
            case 7:
                return ASSISTANT_UI_DARK_MODE;
            default:
                return null;
        }
    }
}

package com.google.android.libraries.search.p2904c;

/* renamed from: com.google.android.libraries.search.c.cn */
/* compiled from: PG */
public enum C37465cn {
    BLUETOOTH_AUDIO_ROUTE,
    BUILTIN_AUDIO_ROUTE,
    DSP_AUDIO_ROUTE,
    BISTO_AUDIO_ROUTE,
    HANDOVER_ROUTE,
    SODA_ROUTE,
    AUDIOROUTE_NOT_SET;

    /* renamed from: a */
    public static C37465cn m66491a(int i) {
        switch (i) {
            case 0:
                return AUDIOROUTE_NOT_SET;
            case 1:
                return BLUETOOTH_AUDIO_ROUTE;
            case 2:
                return BUILTIN_AUDIO_ROUTE;
            case 3:
                return DSP_AUDIO_ROUTE;
            case 4:
                return BISTO_AUDIO_ROUTE;
            case 5:
                return HANDOVER_ROUTE;
            case 6:
                return SODA_ROUTE;
            default:
                return null;
        }
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b */
/* compiled from: PG */
public enum C127470b implements C62957cd {
    UNKNOWN(0),
    SELF_INVOCATION(1),
    HOTWORD(2),
    CORNER_SWIPE(3),
    EDGE_SQUEEZE(4),
    QUICK_SEARCH_BAR(5),
    HOME_BUTTON_LONG_PRESS(6),
    POWER_BUTTON_LONG_PRESS(7),
    UNKNOWN_VIS_FROM_SYSTEM(8),
    LEGACY_PROGRAMMATIC_INVOCATION(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f350976l;

    private C127470b(int i) {
        this.f350976l = i;
    }

    /* renamed from: a */
    public static C127470b m208430a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SELF_INVOCATION;
            case 2:
                return HOTWORD;
            case 3:
                return CORNER_SWIPE;
            case 4:
                return EDGE_SQUEEZE;
            case 5:
                return QUICK_SEARCH_BAR;
            case 6:
                return HOME_BUTTON_LONG_PRESS;
            case 7:
                return POWER_BUTTON_LONG_PRESS;
            case 8:
                return UNKNOWN_VIS_FROM_SYSTEM;
            case 9:
                return LEGACY_PROGRAMMATIC_INVOCATION;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f350976l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

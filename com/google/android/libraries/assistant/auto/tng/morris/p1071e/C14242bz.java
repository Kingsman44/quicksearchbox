package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bz */
/* compiled from: PG */
public enum C14242bz implements C62957cd {
    UNKNOWN_ICON(0),
    ASSISTANT_ICON(1),
    PHONE_ICON(2),
    MEDIA_ICON(3),
    EXPERIENCE_LAUNCHER_ICON(5),
    HOST_ICON(6),
    DISABLED_MIC_ICON(7),
    HOME_ICON(8),
    HOST_ICON_FOR_MICRO(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f43114k;

    private C14242bz(int i) {
        this.f43114k = i;
    }

    /* renamed from: a */
    public static C14242bz m30584a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ICON;
            case 1:
                return ASSISTANT_ICON;
            case 2:
                return PHONE_ICON;
            case 3:
                return MEDIA_ICON;
            case 5:
                return EXPERIENCE_LAUNCHER_ICON;
            case 6:
                return HOST_ICON;
            case 7:
                return DISABLED_MIC_ICON;
            case 8:
                return HOME_ICON;
            case 9:
                return HOST_ICON_FOR_MICRO;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43114k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

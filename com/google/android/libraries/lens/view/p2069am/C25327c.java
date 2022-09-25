package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.lens.view.am.c */
/* compiled from: PG */
public enum C25327c implements C62957cd {
    UNKNOWN(0),
    DOWNLOADABLE(1),
    QUEUED(2),
    BACKGROUND_QUEUED(9),
    DOWNLOADING(3),
    DOWNLOADED(4),
    PERMANENT(5),
    FAILED(6),
    NON_DOWNLOADABLE(7),
    DELETED(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f68927l;

    private C25327c(int i) {
        this.f68927l = i;
    }

    /* renamed from: a */
    public static C25327c m46663a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DOWNLOADABLE;
            case 2:
                return QUEUED;
            case 3:
                return DOWNLOADING;
            case 4:
                return DOWNLOADED;
            case 5:
                return PERMANENT;
            case 6:
                return FAILED;
            case 7:
                return NON_DOWNLOADABLE;
            case 8:
                return DELETED;
            case 9:
                return BACKGROUND_QUEUED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f68927l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

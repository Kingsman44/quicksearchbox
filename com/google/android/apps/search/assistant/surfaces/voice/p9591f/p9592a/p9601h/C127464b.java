package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.h.b */
/* compiled from: PG */
public enum C127464b implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    ERROR_INVALID_REQUEST(201),
    ERROR_ORIGINAL_REQUEST_MISSING(202),
    ERROR_INVALID_ENTRY_POINT_TYPE(203),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f350958g;

    private C127464b(int i) {
        this.f350958g = i;
    }

    /* renamed from: a */
    public static C127464b m208424a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        switch (i) {
            case 201:
                return ERROR_INVALID_REQUEST;
            case 202:
                return ERROR_ORIGINAL_REQUEST_MISSING;
            case 203:
                return ERROR_INVALID_ENTRY_POINT_TYPE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f350958g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

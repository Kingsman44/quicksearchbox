package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.b */
/* compiled from: PG */
public enum C125072b implements C62957cd {
    AIAI_AVAILABILITY_UNKNOWN(0),
    AIAI_AVAILABLE(1),
    AIAI_UNAVAILABLE_LANGUAGE_PACK_NOT_INSTALLED(2),
    AIAI_UNAVAILABLE_LANGUAGE_NOT_SUPPORTED(3),
    AIAI_UNAVAILABLE_RECOGNITION_SERVICE_MISSING(4),
    AIAI_UNAVAILABLE_TIMEOUT(5),
    AIAI_UNAVAILABLE_RECOGNIZER_BUSY(6),
    AIAI_UNAVAILABLE_REASON_UNKNOWN(7),
    AIAI_UNAVAILABLE_LANGUAGE_PENDING(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f345061k;

    private C125072b(int i) {
        this.f345061k = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f345061k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.el */
/* compiled from: PG */
public enum C14309el implements C62957cd {
    MEDIA_BROWSE_TREE_STATUS_UNKNOWN(0),
    MEDIA_BROWSE_SUBSCRIPTION_SUCCESS(1),
    CONNECTED_MEDIA_BROWSE_NOT_AVAILABLE(2),
    MEDIA_BROWSE_NOT_CONNECTED(3),
    MEDIA_BROWSE_HAS_NULL_ROOT(4),
    MEDIA_BROWSE_SUBSCRIPTION_ON_ERROR(5),
    MEDIA_BROWSE_SUBSCRIPTION_TIME_OUT(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f43295i;

    private C14309el(int i) {
        this.f43295i = i;
    }

    /* renamed from: a */
    public static C14309el m30601a(int i) {
        switch (i) {
            case 0:
                return MEDIA_BROWSE_TREE_STATUS_UNKNOWN;
            case 1:
                return MEDIA_BROWSE_SUBSCRIPTION_SUCCESS;
            case 2:
                return CONNECTED_MEDIA_BROWSE_NOT_AVAILABLE;
            case 3:
                return MEDIA_BROWSE_NOT_CONNECTED;
            case 4:
                return MEDIA_BROWSE_HAS_NULL_ROOT;
            case 5:
                return MEDIA_BROWSE_SUBSCRIPTION_ON_ERROR;
            case 6:
                return MEDIA_BROWSE_SUBSCRIPTION_TIME_OUT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m30602b() {
        return C14308ek.f43285a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43295i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

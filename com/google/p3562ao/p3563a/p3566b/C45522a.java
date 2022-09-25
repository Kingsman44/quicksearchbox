package com.google.p3562ao.p3563a.p3566b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ao.a.b.a */
/* compiled from: PG */
public enum C45522a implements C62957cd {
    DATA_USAGE_NOTICE_TYPE_UNSPECIFIED(0),
    DATA_USAGE_NOTICE_TYPE_LINKING_INFO(1),
    DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT(2),
    DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f118988f;

    private C45522a(int i) {
        this.f118988f = i;
    }

    /* renamed from: a */
    public static C45522a m81275a(int i) {
        if (i == 0) {
            return DATA_USAGE_NOTICE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DATA_USAGE_NOTICE_TYPE_LINKING_INFO;
        }
        if (i == 2) {
            return DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT;
        }
        if (i != 3) {
            return null;
        }
        return DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f118988f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

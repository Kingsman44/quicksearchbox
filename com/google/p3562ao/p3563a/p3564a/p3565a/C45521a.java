package com.google.p3562ao.p3563a.p3564a.p3565a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ao.a.a.a.a */
/* compiled from: PG */
public enum C45521a implements C62957cd {
    ACCOUNT_LINKING_FLOW_UNSPECIFIED(0),
    OAUTH2_FLOW(1),
    GSI_OAUTH_LINKING_FLOW(2),
    GSI_OAUTH_CREATION_FLOW(3),
    GSI_ONLY_FLOW(4),
    THIRD_PARTY_INITIATED_FLOW(5),
    MOBILE_APP_REDIRECT_FLOW(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f118981i;

    private C45521a(int i) {
        this.f118981i = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f118981i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

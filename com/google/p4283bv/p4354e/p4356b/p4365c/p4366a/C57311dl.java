package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.dl */
/* compiled from: PG */
public enum C57311dl implements C62957cd {
    UNKNOWN_STATUS_CODE(0),
    STATUS_OK(1),
    STATUS_INELIGIBLE_FOR_FEED(2),
    STATUS_NO_CONTENT_RETURNED(3),
    STATUS_NO_CONTENT_RETURNED_VERIFICATION_FAILED(4);
    

    /* renamed from: f */
    private final int f152980f;

    private C57311dl(int i) {
        this.f152980f = i;
    }

    /* renamed from: a */
    public static C57311dl m88308a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS_CODE;
        }
        if (i == 1) {
            return STATUS_OK;
        }
        if (i == 2) {
            return STATUS_INELIGIBLE_FOR_FEED;
        }
        if (i == 3) {
            return STATUS_NO_CONTENT_RETURNED;
        }
        if (i != 4) {
            return null;
        }
        return STATUS_NO_CONTENT_RETURNED_VERIFICATION_FAILED;
    }

    /* renamed from: b */
    public static C62959cf m88309b() {
        return C57310dk.f152973a;
    }

    public final int getNumber() {
        return this.f152980f;
    }

    public final String toString() {
        return Integer.toString(this.f152980f);
    }
}

package com.google.android.libraries.web.p3353c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.c.n */
/* compiled from: PG */
public enum C43369n implements C62957cd {
    UNSPECIFIED(0),
    WAITING_FOR_RESPONSE(1),
    RECEIVING_BYTES(2),
    RENDERING_AND_RECEIVING_BYTES(3),
    SUCCESS(4),
    FAILED(5),
    CANCELLED(6);
    

    /* renamed from: h */
    public final int f113312h;

    private C43369n(int i) {
        this.f113312h = i;
    }

    /* renamed from: a */
    public static C43369n m76519a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return WAITING_FOR_RESPONSE;
            case 2:
                return RECEIVING_BYTES;
            case 3:
                return RENDERING_AND_RECEIVING_BYTES;
            case 4:
                return SUCCESS;
            case 5:
                return FAILED;
            case 6:
                return CANCELLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m76520b() {
        return C43368m.f113303a;
    }

    public final int getNumber() {
        return this.f113312h;
    }

    public final String toString() {
        return Integer.toString(this.f113312h);
    }
}

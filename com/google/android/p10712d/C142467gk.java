package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.gk */
/* compiled from: PG */
public enum C142467gk implements C62957cd {
    OTA_UNKNOWN(0),
    OTA_IDLE(1),
    OTA_INTERRUPTED(2),
    OTA_RECEIVING_BISTO(3),
    OTA_RECEIVING_OTHER(4),
    OTA_RECEIVED(5),
    OTA_ERROR(6),
    OTA_TEMPORARILY_BUSY(7),
    OTA_UNSUPPORTED(8),
    OTA_DEVICE_NOT_CONNECTED(9);
    

    /* renamed from: k */
    public final int f386619k;

    private C142467gk(int i) {
        this.f386619k = i;
    }

    /* renamed from: a */
    public static C142467gk m231089a(int i) {
        switch (i) {
            case 0:
                return OTA_UNKNOWN;
            case 1:
                return OTA_IDLE;
            case 2:
                return OTA_INTERRUPTED;
            case 3:
                return OTA_RECEIVING_BISTO;
            case 4:
                return OTA_RECEIVING_OTHER;
            case 5:
                return OTA_RECEIVED;
            case 6:
                return OTA_ERROR;
            case 7:
                return OTA_TEMPORARILY_BUSY;
            case 8:
                return OTA_UNSUPPORTED;
            case 9:
                return OTA_DEVICE_NOT_CONNECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231090b() {
        return C142466gj.f386607a;
    }

    public final int getNumber() {
        return this.f386619k;
    }

    public final String toString() {
        return Integer.toString(this.f386619k);
    }
}

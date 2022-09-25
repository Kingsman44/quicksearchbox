package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cr */
/* compiled from: PG */
public enum C51302cr implements C62957cd {
    UNKNOWN_AUDIO_ROUTING_STATUS(0),
    PHONE(1),
    BLUETOOTH(2),
    BLUETOOTH_CALL_ONLY(3),
    WIRED_HEADSET(4);
    

    /* renamed from: f */
    public final int f133557f;

    private C51302cr(int i) {
        this.f133557f = i;
    }

    /* renamed from: a */
    public static C51302cr m86114a(int i) {
        if (i == 0) {
            return UNKNOWN_AUDIO_ROUTING_STATUS;
        }
        if (i == 1) {
            return PHONE;
        }
        if (i == 2) {
            return BLUETOOTH;
        }
        if (i == 3) {
            return BLUETOOTH_CALL_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return WIRED_HEADSET;
    }

    /* renamed from: b */
    public static C62959cf m86115b() {
        return C51301cq.f133550a;
    }

    public final int getNumber() {
        return this.f133557f;
    }

    public final String toString() {
        return Integer.toString(this.f133557f);
    }
}

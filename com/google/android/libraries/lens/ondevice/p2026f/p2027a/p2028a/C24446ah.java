package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.ah */
/* compiled from: PG */
public enum C24446ah implements C62957cd {
    STATUS_UNKNOWN(0),
    STATUS_DOWNLOADED(1),
    STATUS_SCHEDULED(2),
    STATUS_MODEL_UNKNOWN(3),
    STATUS_MODEL_CONFIG_INCORRECT(4),
    STATUS_MODEL_IO_ERROR(5);
    

    /* renamed from: g */
    public final int f66939g;

    private C24446ah(int i) {
        this.f66939g = i;
    }

    /* renamed from: a */
    public static C24446ah m45519a(int i) {
        if (i == 0) {
            return STATUS_UNKNOWN;
        }
        if (i == 1) {
            return STATUS_DOWNLOADED;
        }
        if (i == 2) {
            return STATUS_SCHEDULED;
        }
        if (i == 3) {
            return STATUS_MODEL_UNKNOWN;
        }
        if (i == 4) {
            return STATUS_MODEL_CONFIG_INCORRECT;
        }
        if (i != 5) {
            return null;
        }
        return STATUS_MODEL_IO_ERROR;
    }

    /* renamed from: b */
    public static C62959cf m45520b() {
        return C24445ag.f66931a;
    }

    public final int getNumber() {
        return this.f66939g;
    }

    public final String toString() {
        return Integer.toString(this.f66939g);
    }
}

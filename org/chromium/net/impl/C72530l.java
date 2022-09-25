package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.l */
/* compiled from: PG */
enum C72530l {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);
    

    /* renamed from: e */
    public final int f192987e;

    /* renamed from: f */
    public final boolean f192988f;

    private C72530l(int i, boolean z) {
        this.f192988f = z;
        this.f192987e = i;
    }

    /* renamed from: a */
    static C72530l m107225a(int i) {
        if (i == 0) {
            return DISABLED;
        }
        if (i == 1) {
            return MEMORY;
        }
        if (i == 2) {
            return DISK_NO_HTTP;
        }
        if (i == 3) {
            return DISK;
        }
        throw new IllegalArgumentException("Unknown public builder cache mode");
    }
}

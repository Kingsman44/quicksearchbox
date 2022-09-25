package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.t */
/* compiled from: PG */
public final class C72538t {

    /* renamed from: a */
    public final int f193029a;

    /* renamed from: b */
    public final int f193030b;

    /* renamed from: c */
    public final int f193031c;

    /* renamed from: d */
    public final int f193032d;

    public C72538t(String str) {
        String[] split = str.split("\\.");
        this.f193029a = Integer.parseInt(split[0]);
        this.f193030b = Integer.parseInt(split[1]);
        this.f193031c = Integer.parseInt(split[2]);
        this.f193032d = Integer.parseInt(split[3]);
    }

    public final String toString() {
        int i = this.f193029a;
        int i2 = this.f193030b;
        int i3 = this.f193031c;
        int i4 = this.f193032d;
        return i + "." + i2 + "." + i3 + "." + i4;
    }
}

package com.google.android.gms.feedback.p10795a.p10796a;

import com.google.android.gms.common.internal.C143919bh;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.feedback.a.a.b */
/* compiled from: PG */
public final class C144192b {

    /* renamed from: a */
    long f390595a;

    /* renamed from: b */
    public long f390596b;

    public C144192b() {
        this((byte[]) null);
    }

    public C144192b(byte[] bArr) {
        this.f390595a = -1;
        this.f390596b = -1;
    }

    /* renamed from: a */
    public final long mo119733a() {
        C143919bh.m233959b(this.f390596b != -1);
        return TimeUnit.NANOSECONDS.toMillis(mo119734b() - this.f390596b);
    }

    /* renamed from: b */
    public final long mo119734b() {
        if (this.f390595a == -1) {
            return System.nanoTime();
        }
        this.f390595a = -1;
        return 0;
    }
}

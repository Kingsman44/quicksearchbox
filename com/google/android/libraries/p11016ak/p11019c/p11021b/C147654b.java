package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.google.common.base.C58838bb;
import com.google.protobuf.C63088z;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.ak.c.b.b */
/* compiled from: PG */
final class C147654b {

    /* renamed from: a */
    private byte[] f398504a = new byte[1024];

    /* renamed from: b */
    private int f398505b = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo124403a() {
        return this.f398505b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C63088z mo124404b(int i) {
        int a = mo124403a();
        C58838bb.m90871f(i >= 0, "Index %s is negative", i);
        if (i >= a) {
            return C63088z.f170246b;
        }
        return C63088z.m96142D(this.f398504a, i, a - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo124405c(byte[] bArr) {
        byte[] bArr2 = this.f398504a;
        int length = bArr2.length;
        int i = this.f398505b;
        int length2 = bArr.length;
        if (length - i < length2) {
            this.f398504a = Arrays.copyOf(bArr2, Math.max(length + length2, length + length));
        }
        System.arraycopy(bArr, 0, this.f398504a, this.f398505b, length2);
        this.f398505b += length2;
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wa */
/* compiled from: PG */
public abstract class C7380wa extends C7372vt {

    /* renamed from: a */
    private byte[] f24139a;

    /* renamed from: b */
    private volatile boolean f24140b;

    public C7380wa(abx abx, acb acb, C6864cy cyVar, int i, Object obj, byte[] bArr) {
        super(abx, acb, 3, cyVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        C7380wa waVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = aeu.f20471f;
            waVar = this;
        } else {
            waVar = this;
            bArr2 = bArr;
        }
        waVar.f24139a = bArr2;
    }

    /* renamed from: a */
    public final byte[] mo16709a() {
        return this.f24139a;
    }

    /* renamed from: b */
    public final void mo14464b() {
        this.f24140b = true;
    }

    /* renamed from: c */
    public final void mo14465c() {
        try {
            this.f24096k.mo14389c(this.f24089d);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f24140b) {
                byte[] bArr = this.f24139a;
                int length = bArr.length;
                if (length < i2 + 16384) {
                    this.f24139a = Arrays.copyOf(bArr, length + 16384);
                }
                i = this.f24096k.mo14388a(this.f24139a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f24140b) {
                mo16710d(this.f24139a, i2);
            }
        } finally {
            aeu.m18547q(this.f24096k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16710d(byte[] bArr, int i);
}

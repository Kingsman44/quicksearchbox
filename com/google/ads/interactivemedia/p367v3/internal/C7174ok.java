package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ok */
/* compiled from: PG */
final class C7174ok {

    /* renamed from: d */
    private static final byte[] f23266d = {0, 0, 1};

    /* renamed from: a */
    public int f23267a;

    /* renamed from: b */
    public int f23268b;

    /* renamed from: c */
    public byte[] f23269c = new byte[128];

    /* renamed from: e */
    private boolean f23270e;

    /* renamed from: f */
    private int f23271f;

    /* renamed from: a */
    public final void mo16228a() {
        this.f23270e = false;
        this.f23267a = 0;
        this.f23271f = 0;
    }

    /* renamed from: c */
    public final void mo16230c(byte[] bArr, int i, int i2) {
        if (this.f23270e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f23269c;
            int length = bArr2.length;
            int i4 = this.f23267a + i3;
            if (length < i4) {
                this.f23269c = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f23269c, this.f23267a, i3);
            this.f23267a += i3;
        }
    }

    /* renamed from: b */
    public final boolean mo16229b(int i, int i2) {
        int i3 = this.f23271f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f23267a -= i2;
                            this.f23270e = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        Log.w("H263Reader", "Unexpected start code value");
                        mo16228a();
                    } else {
                        this.f23268b = this.f23267a;
                        this.f23271f = 4;
                    }
                } else if (i > 31) {
                    Log.w("H263Reader", "Unexpected start code value");
                    mo16228a();
                } else {
                    this.f23271f = 3;
                }
            } else if (i != 181) {
                Log.w("H263Reader", "Unexpected start code value");
                mo16228a();
            } else {
                this.f23271f = 2;
            }
        } else if (i == 176) {
            this.f23271f = 1;
            this.f23270e = true;
        }
        mo16230c(f23266d, 0, 3);
        return false;
    }
}

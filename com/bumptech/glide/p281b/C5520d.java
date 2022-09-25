package com.bumptech.glide.p281b;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.b.d */
/* compiled from: PG */
public final class C5520d {

    /* renamed from: a */
    public final byte[] f16724a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f16725b;

    /* renamed from: c */
    public C5519c f16726c;

    /* renamed from: d */
    public int f16727d = 0;

    /* renamed from: a */
    public final int mo11897a() {
        try {
            return this.f16725b.get() & 255;
        } catch (Exception unused) {
            this.f16726c.f16712b = 1;
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo11898b() {
        int a = mo11897a();
        this.f16727d = a;
        if (a > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f16727d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f16725b.get(this.f16724a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        int i4 = this.f16727d;
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + i4, e);
                    }
                    this.f16726c.f16712b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo11899c() {
        int a;
        do {
            a = mo11897a();
            this.f16725b.position(Math.min(this.f16725b.position() + a, this.f16725b.limit()));
        } while (a > 0);
    }

    /* renamed from: d */
    public final boolean mo11900d() {
        return this.f16726c.f16712b != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo11901e(int r10) {
        /*
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r9.f16725b     // Catch:{ BufferUnderflowException -> 0x0035 }
            r1.get(r0)     // Catch:{ BufferUnderflowException -> 0x0035 }
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]     // Catch:{ BufferUnderflowException -> 0x0035 }
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r2 >= r10) goto L_0x004b
            int r4 = r3 + 1
            byte r3 = r0[r3]     // Catch:{ BufferUnderflowException -> 0x0033 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            byte r4 = r0[r4]     // Catch:{ BufferUnderflowException -> 0x0033 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 1
            byte r5 = r0[r5]     // Catch:{ BufferUnderflowException -> 0x0033 }
            int r7 = r2 + 1
            int r3 = r3 << 16
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r8
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r1[r2] = r3     // Catch:{ BufferUnderflowException -> 0x0033 }
            r3 = r6
            r2 = r7
            goto L_0x000f
        L_0x0033:
            r10 = move-exception
            goto L_0x0038
        L_0x0035:
            r10 = move-exception
            r0 = 0
            r1 = r0
        L_0x0038:
            java.lang.String r0 = "GifHeaderParser"
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = "Format Error Reading Color Table"
            android.util.Log.d(r0, r2, r10)
        L_0x0046:
            com.bumptech.glide.b.c r10 = r9.f16726c
            r0 = 1
            r10.f16712b = r0
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p281b.C5520d.mo11901e(int):int[]");
    }
}

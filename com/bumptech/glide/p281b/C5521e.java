package com.bumptech.glide.p281b;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p299c.p304e.C5898c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.b.e */
/* compiled from: PG */
public final class C5521e implements C5517a {

    /* renamed from: k */
    private static final String f16728k = "e";

    /* renamed from: a */
    public ByteBuffer f16729a;

    /* renamed from: b */
    public byte[] f16730b;

    /* renamed from: c */
    public byte[] f16731c;

    /* renamed from: d */
    public int[] f16732d;

    /* renamed from: e */
    public int f16733e;

    /* renamed from: f */
    public C5519c f16734f;

    /* renamed from: g */
    public Bitmap f16735g;

    /* renamed from: h */
    public Boolean f16736h;

    /* renamed from: i */
    public Bitmap.Config f16737i = Bitmap.Config.ARGB_8888;

    /* renamed from: j */
    public final C5898c f16738j;

    /* renamed from: l */
    private int[] f16739l;

    /* renamed from: m */
    private final int[] f16740m = new int[256];

    /* renamed from: n */
    private short[] f16741n;

    /* renamed from: o */
    private byte[] f16742o;

    /* renamed from: p */
    private byte[] f16743p;

    /* renamed from: q */
    private boolean f16744q;

    /* renamed from: r */
    private int f16745r;

    /* renamed from: s */
    private int f16746s;

    /* renamed from: t */
    private int f16747t;

    /* renamed from: u */
    private int f16748u;

    public C5521e(C5898c cVar, C5519c cVar2, ByteBuffer byteBuffer, int i) {
        this.f16738j = cVar;
        this.f16734f = new C5519c();
        mo11902c(cVar2, byteBuffer, i);
    }

    /* renamed from: d */
    private final int m14290d() {
        return this.f16729a.get() & 255;
    }

    /* renamed from: e */
    private final Bitmap m14291e() {
        Bitmap.Config config;
        Boolean bool = this.f16736h;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f16737i;
        }
        C5898c cVar = this.f16738j;
        Bitmap b = cVar.f17514a.mo12114b(this.f16748u, this.f16747t, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v12, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0507, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f6, code lost:
        if (r4.f16720j == r3.f16707h) goto L_0x00f8;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r2v64, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0111  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo11895a() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r0 = "No valid color table found for frame #"
            java.lang.String r2 = "Unable to decode frame, status="
            java.lang.String r3 = "Unable to decode frame, frameCount="
            monitor-enter(r35)
            com.bumptech.glide.b.c r4 = r1.f16734f     // Catch:{ all -> 0x0508 }
            int r4 = r4.f16713c     // Catch:{ all -> 0x0508 }
            r5 = 3
            r6 = 1
            if (r4 <= 0) goto L_0x0015
            int r4 = r1.f16733e     // Catch:{ all -> 0x0508 }
            if (r4 >= 0) goto L_0x003c
        L_0x0015:
            java.lang.String r4 = f16728k     // Catch:{ all -> 0x0508 }
            boolean r7 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0508 }
            if (r7 == 0) goto L_0x003a
            com.bumptech.glide.b.c r7 = r1.f16734f     // Catch:{ all -> 0x0508 }
            int r7 = r7.f16713c     // Catch:{ all -> 0x0508 }
            int r8 = r1.f16733e     // Catch:{ all -> 0x0508 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0508 }
            r9.<init>(r3)     // Catch:{ all -> 0x0508 }
            r9.append(r7)     // Catch:{ all -> 0x0508 }
            java.lang.String r3 = ", framePointer="
            r9.append(r3)     // Catch:{ all -> 0x0508 }
            r9.append(r8)     // Catch:{ all -> 0x0508 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0508 }
            android.util.Log.d(r4, r3)     // Catch:{ all -> 0x0508 }
        L_0x003a:
            r1.f16745r = r6     // Catch:{ all -> 0x0508 }
        L_0x003c:
            int r3 = r1.f16745r     // Catch:{ all -> 0x0508 }
            r4 = 0
            if (r3 == r6) goto L_0x04ec
            r7 = 2
            if (r3 != r7) goto L_0x0046
            goto L_0x04ec
        L_0x0046:
            r2 = 0
            r1.f16745r = r2     // Catch:{ all -> 0x0508 }
            byte[] r3 = r1.f16730b     // Catch:{ all -> 0x0508 }
            r8 = 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x0057
            com.bumptech.glide.load.c.e.c r3 = r1.f16738j     // Catch:{ all -> 0x0508 }
            byte[] r3 = r3.mo12346c(r8)     // Catch:{ all -> 0x0508 }
            r1.f16730b = r3     // Catch:{ all -> 0x0508 }
        L_0x0057:
            com.bumptech.glide.b.c r3 = r1.f16734f     // Catch:{ all -> 0x0508 }
            java.util.List r3 = r3.f16715e     // Catch:{ all -> 0x0508 }
            int r9 = r1.f16733e     // Catch:{ all -> 0x0508 }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ all -> 0x0508 }
            com.bumptech.glide.b.b r3 = (com.bumptech.glide.p281b.C5518b) r3     // Catch:{ all -> 0x0508 }
            int r9 = r1.f16733e     // Catch:{ all -> 0x0508 }
            r10 = -1
            int r9 = r9 + r10
            if (r9 < 0) goto L_0x0074
            com.bumptech.glide.b.c r11 = r1.f16734f     // Catch:{ all -> 0x0508 }
            java.util.List r11 = r11.f16715e     // Catch:{ all -> 0x0508 }
            java.lang.Object r9 = r11.get(r9)     // Catch:{ all -> 0x0508 }
            com.bumptech.glide.b.b r9 = (com.bumptech.glide.p281b.C5518b) r9     // Catch:{ all -> 0x0508 }
            goto L_0x0075
        L_0x0074:
            r9 = r4
        L_0x0075:
            int[] r11 = r3.f16710k     // Catch:{ all -> 0x0508 }
            if (r11 != 0) goto L_0x007d
            com.bumptech.glide.b.c r11 = r1.f16734f     // Catch:{ all -> 0x0508 }
            int[] r11 = r11.f16711a     // Catch:{ all -> 0x0508 }
        L_0x007d:
            r1.f16739l = r11     // Catch:{ all -> 0x0508 }
            if (r11 != 0) goto L_0x009e
            java.lang.String r2 = f16728k     // Catch:{ all -> 0x0508 }
            boolean r3 = android.util.Log.isLoggable(r2, r5)     // Catch:{ all -> 0x0508 }
            if (r3 == 0) goto L_0x009a
            int r3 = r1.f16733e     // Catch:{ all -> 0x0508 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0508 }
            r5.<init>(r0)     // Catch:{ all -> 0x0508 }
            r5.append(r3)     // Catch:{ all -> 0x0508 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0508 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0508 }
        L_0x009a:
            r1.f16745r = r6     // Catch:{ all -> 0x0508 }
            monitor-exit(r35)
            return r4
        L_0x009e:
            boolean r0 = r3.f16705f     // Catch:{ all -> 0x0508 }
            if (r0 == 0) goto L_0x00bf
            int[] r0 = r1.f16740m     // Catch:{ all -> 0x0508 }
            r12 = 256(0x100, float:3.59E-43)
            java.lang.System.arraycopy(r11, r2, r0, r2, r12)     // Catch:{ all -> 0x0508 }
            int[] r0 = r1.f16740m     // Catch:{ all -> 0x0508 }
            r1.f16739l = r0     // Catch:{ all -> 0x0508 }
            int r11 = r3.f16707h     // Catch:{ all -> 0x0508 }
            r0[r11] = r2     // Catch:{ all -> 0x0508 }
            int r0 = r3.f16706g     // Catch:{ all -> 0x0508 }
            if (r0 != r7) goto L_0x00bf
            int r0 = r1.f16733e     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x00bf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0508 }
            r1.f16736h = r0     // Catch:{ all -> 0x0508 }
        L_0x00bf:
            int[] r0 = r1.f16732d     // Catch:{ all -> 0x0508 }
            if (r9 != 0) goto L_0x00d1
            android.graphics.Bitmap r11 = r1.f16735g     // Catch:{ all -> 0x0508 }
            if (r11 == 0) goto L_0x00cc
            com.bumptech.glide.load.c.e.c r12 = r1.f16738j     // Catch:{ all -> 0x0508 }
            r12.mo12344a(r11)     // Catch:{ all -> 0x0508 }
        L_0x00cc:
            r1.f16735g = r4     // Catch:{ all -> 0x0508 }
            java.util.Arrays.fill(r0, r2)     // Catch:{ all -> 0x0508 }
        L_0x00d1:
            if (r9 == 0) goto L_0x00de
            int r4 = r9.f16706g     // Catch:{ all -> 0x0508 }
            if (r4 != r5) goto L_0x00de
            android.graphics.Bitmap r4 = r1.f16735g     // Catch:{ all -> 0x0508 }
            if (r4 != 0) goto L_0x00de
            java.util.Arrays.fill(r0, r2)     // Catch:{ all -> 0x0508 }
        L_0x00de:
            if (r9 == 0) goto L_0x0136
            int r4 = r9.f16706g     // Catch:{ all -> 0x0508 }
            if (r4 <= 0) goto L_0x0136
            if (r4 != r7) goto L_0x011f
            boolean r4 = r3.f16705f     // Catch:{ all -> 0x0508 }
            if (r4 != 0) goto L_0x00f8
            com.bumptech.glide.b.c r4 = r1.f16734f     // Catch:{ all -> 0x0508 }
            int r11 = r4.f16722l     // Catch:{ all -> 0x0508 }
            int[] r12 = r3.f16710k     // Catch:{ all -> 0x0508 }
            if (r12 == 0) goto L_0x00f9
            int r4 = r4.f16720j     // Catch:{ all -> 0x0508 }
            int r12 = r3.f16707h     // Catch:{ all -> 0x0508 }
            if (r4 != r12) goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            int r4 = r9.f16703d     // Catch:{ all -> 0x0508 }
            int r12 = r1.f16746s     // Catch:{ all -> 0x0508 }
            int r4 = r4 / r12
            int r13 = r9.f16701b     // Catch:{ all -> 0x0508 }
            int r13 = r13 / r12
            int r14 = r9.f16702c     // Catch:{ all -> 0x0508 }
            int r14 = r14 / r12
            int r9 = r9.f16700a     // Catch:{ all -> 0x0508 }
            int r9 = r9 / r12
            int r12 = r1.f16748u     // Catch:{ all -> 0x0508 }
            int r13 = r13 * r12
            int r13 = r13 + r9
            int r4 = r4 * r12
            int r4 = r4 + r13
        L_0x010f:
            if (r13 >= r4) goto L_0x0136
            int r9 = r13 + r14
            r12 = r13
        L_0x0114:
            if (r12 >= r9) goto L_0x011b
            r0[r12] = r11     // Catch:{ all -> 0x0508 }
            int r12 = r12 + 1
            goto L_0x0114
        L_0x011b:
            int r9 = r1.f16748u     // Catch:{ all -> 0x0508 }
            int r13 = r13 + r9
            goto L_0x010f
        L_0x011f:
            if (r4 != r5) goto L_0x0136
            android.graphics.Bitmap r11 = r1.f16735g     // Catch:{ all -> 0x0508 }
            if (r11 == 0) goto L_0x0136
            int r4 = r1.f16748u     // Catch:{ all -> 0x0508 }
            r13 = 0
            r15 = 0
            r16 = 0
            int r9 = r1.f16747t     // Catch:{ all -> 0x0508 }
            r12 = r0
            r14 = r4
            r17 = r4
            r18 = r9
            r11.getPixels(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0508 }
        L_0x0136:
            if (r3 == 0) goto L_0x013f
            java.nio.ByteBuffer r4 = r1.f16729a     // Catch:{ all -> 0x0508 }
            int r9 = r3.f16709j     // Catch:{ all -> 0x0508 }
            r4.position(r9)     // Catch:{ all -> 0x0508 }
        L_0x013f:
            if (r3 != 0) goto L_0x014a
            com.bumptech.glide.b.c r4 = r1.f16734f     // Catch:{ all -> 0x0508 }
            int r9 = r4.f16716f     // Catch:{ all -> 0x0508 }
            int r4 = r4.f16717g     // Catch:{ all -> 0x0508 }
            int r9 = r9 * r4
            goto L_0x0150
        L_0x014a:
            int r4 = r3.f16702c     // Catch:{ all -> 0x0508 }
            int r9 = r3.f16703d     // Catch:{ all -> 0x0508 }
            int r9 = r9 * r4
        L_0x0150:
            byte[] r4 = r1.f16731c     // Catch:{ all -> 0x0508 }
            if (r4 == 0) goto L_0x0157
            int r4 = r4.length     // Catch:{ all -> 0x0508 }
            if (r4 >= r9) goto L_0x015f
        L_0x0157:
            com.bumptech.glide.load.c.e.c r4 = r1.f16738j     // Catch:{ all -> 0x0508 }
            byte[] r4 = r4.mo12346c(r9)     // Catch:{ all -> 0x0508 }
            r1.f16731c = r4     // Catch:{ all -> 0x0508 }
        L_0x015f:
            byte[] r4 = r1.f16731c     // Catch:{ all -> 0x0508 }
            short[] r11 = r1.f16741n     // Catch:{ all -> 0x0508 }
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 != 0) goto L_0x016b
            short[] r11 = new short[r12]     // Catch:{ all -> 0x0508 }
            r1.f16741n = r11     // Catch:{ all -> 0x0508 }
        L_0x016b:
            short[] r11 = r1.f16741n     // Catch:{ all -> 0x0508 }
            byte[] r13 = r1.f16742o     // Catch:{ all -> 0x0508 }
            if (r13 != 0) goto L_0x0175
            byte[] r13 = new byte[r12]     // Catch:{ all -> 0x0508 }
            r1.f16742o = r13     // Catch:{ all -> 0x0508 }
        L_0x0175:
            byte[] r13 = r1.f16742o     // Catch:{ all -> 0x0508 }
            byte[] r14 = r1.f16743p     // Catch:{ all -> 0x0508 }
            if (r14 != 0) goto L_0x0181
            r14 = 4097(0x1001, float:5.741E-42)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0508 }
            r1.f16743p = r14     // Catch:{ all -> 0x0508 }
        L_0x0181:
            byte[] r14 = r1.f16743p     // Catch:{ all -> 0x0508 }
            int r15 = r35.m14290d()     // Catch:{ all -> 0x0508 }
            int r7 = r6 << r15
            int r12 = r7 + 1
            int r18 = r7 + 2
            int r15 = r15 + r6
            int r19 = r6 << r15
            int r19 = r19 + -1
            r6 = 0
        L_0x0193:
            if (r6 >= r7) goto L_0x019e
            r11[r6] = r2     // Catch:{ all -> 0x0508 }
            byte r10 = (byte) r6     // Catch:{ all -> 0x0508 }
            r13[r6] = r10     // Catch:{ all -> 0x0508 }
            int r6 = r6 + 1
            r10 = -1
            goto L_0x0193
        L_0x019e:
            byte[] r6 = r1.f16730b     // Catch:{ all -> 0x0508 }
            r24 = r15
            r30 = r18
            r23 = r19
            r8 = 0
            r10 = -1
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x01b6:
            r31 = 8
            if (r8 >= r9) goto L_0x0297
            if (r21 != 0) goto L_0x01e9
            int r5 = r35.m14290d()     // Catch:{ all -> 0x0508 }
            if (r5 > 0) goto L_0x01c9
            r32 = r8
            r33 = r10
            r21 = 0
            goto L_0x01df
        L_0x01c9:
            java.nio.ByteBuffer r2 = r1.f16729a     // Catch:{ all -> 0x0508 }
            r32 = r8
            byte[] r8 = r1.f16730b     // Catch:{ all -> 0x0508 }
            r33 = r10
            int r10 = r2.remaining()     // Catch:{ all -> 0x0508 }
            int r10 = java.lang.Math.min(r5, r10)     // Catch:{ all -> 0x0508 }
            r21 = r5
            r5 = 0
            r2.get(r8, r5, r10)     // Catch:{ all -> 0x0508 }
        L_0x01df:
            if (r21 > 0) goto L_0x01e6
            r2 = 3
            r1.f16745r = r2     // Catch:{ all -> 0x0508 }
            goto L_0x0297
        L_0x01e6:
            r22 = 0
            goto L_0x01ed
        L_0x01e9:
            r32 = r8
            r33 = r10
        L_0x01ed:
            byte r2 = r6[r22]     // Catch:{ all -> 0x0508 }
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            int r2 = r2 << r25
            int r26 = r26 + r2
            int r25 = r25 + 8
            int r22 = r22 + 1
            r2 = -1
            int r21 = r21 + -1
            r5 = r24
            r2 = r25
            r8 = r32
            r10 = r33
            r24 = r6
            r25 = r15
            r6 = r27
            r15 = r30
        L_0x020d:
            if (r2 < r5) goto L_0x0285
            r27 = r0
            r0 = r26 & r23
            int r26 = r26 >> r5
            int r2 = r2 - r5
            if (r0 != r7) goto L_0x0222
            r15 = r18
            r23 = r19
            r5 = r25
            r0 = r27
            r10 = -1
            goto L_0x020d
        L_0x0222:
            if (r0 != r12) goto L_0x022c
            r30 = r15
            r15 = r25
            r0 = r27
            goto L_0x028b
        L_0x022c:
            r30 = r2
            r2 = -1
            if (r10 != r2) goto L_0x0240
            byte r2 = r13[r0]     // Catch:{ all -> 0x0508 }
            r4[r29] = r2     // Catch:{ all -> 0x0508 }
            int r29 = r29 + 1
            int r8 = r8 + 1
            r6 = r0
            r10 = r6
        L_0x023b:
            r0 = r27
            r2 = r30
            goto L_0x020d
        L_0x0240:
            if (r0 < r15) goto L_0x0249
            byte r2 = (byte) r6     // Catch:{ all -> 0x0508 }
            r14[r28] = r2     // Catch:{ all -> 0x0508 }
            int r28 = r28 + 1
            r2 = r10
            goto L_0x024a
        L_0x0249:
            r2 = r0
        L_0x024a:
            if (r2 < r7) goto L_0x0255
            byte r6 = r13[r2]     // Catch:{ all -> 0x0508 }
            r14[r28] = r6     // Catch:{ all -> 0x0508 }
            int r28 = r28 + 1
            short r2 = r11[r2]     // Catch:{ all -> 0x0508 }
            goto L_0x024a
        L_0x0255:
            byte r2 = r13[r2]     // Catch:{ all -> 0x0508 }
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            byte r6 = (byte) r2     // Catch:{ all -> 0x0508 }
            r4[r29] = r6     // Catch:{ all -> 0x0508 }
        L_0x025d:
            int r29 = r29 + 1
            int r8 = r8 + 1
            if (r28 <= 0) goto L_0x026a
            int r28 = r28 + -1
            byte r31 = r14[r28]     // Catch:{ all -> 0x0508 }
            r4[r29] = r31     // Catch:{ all -> 0x0508 }
            goto L_0x025d
        L_0x026a:
            r17 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r0) goto L_0x0281
            short r10 = (short) r10     // Catch:{ all -> 0x0508 }
            r11[r15] = r10     // Catch:{ all -> 0x0508 }
            r13[r15] = r6     // Catch:{ all -> 0x0508 }
            int r15 = r15 + 1
            r6 = r15 & r23
            if (r6 != 0) goto L_0x0281
            if (r15 >= r0) goto L_0x0281
            int r5 = r5 + 1
            int r23 = r23 + r15
        L_0x0281:
            r6 = r2
            r10 = r17
            goto L_0x023b
        L_0x0285:
            r27 = r0
            r30 = r15
            r15 = r25
        L_0x028b:
            r25 = r2
            r27 = r6
            r6 = r24
            r2 = 0
            r24 = r5
            r5 = 3
            goto L_0x01b6
        L_0x0297:
            r27 = r0
            r2 = r29
            r5 = 0
            java.util.Arrays.fill(r4, r2, r9, r5)     // Catch:{ all -> 0x0508 }
            boolean r0 = r3.f16704e     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x0316
            int r0 = r1.f16746s     // Catch:{ all -> 0x0508 }
            r2 = 1
            if (r0 == r2) goto L_0x02aa
            goto L_0x0316
        L_0x02aa:
            int[] r0 = r1.f16732d     // Catch:{ all -> 0x0508 }
            int r2 = r3.f16703d     // Catch:{ all -> 0x0508 }
            int r4 = r3.f16701b     // Catch:{ all -> 0x0508 }
            int r6 = r3.f16702c     // Catch:{ all -> 0x0508 }
            int r7 = r3.f16700a     // Catch:{ all -> 0x0508 }
            int r8 = r1.f16733e     // Catch:{ all -> 0x0508 }
            int r9 = r1.f16748u     // Catch:{ all -> 0x0508 }
            byte[] r10 = r1.f16731c     // Catch:{ all -> 0x0508 }
            int[] r11 = r1.f16739l     // Catch:{ all -> 0x0508 }
            r12 = -1
            r13 = 0
        L_0x02be:
            if (r13 >= r2) goto L_0x02f6
            int r14 = r13 + r4
            int r14 = r14 * r9
            int r15 = r14 + r7
            int r5 = r15 + r6
            int r14 = r14 + r9
            if (r14 < r5) goto L_0x02cc
            goto L_0x02cd
        L_0x02cc:
            r5 = r14
        L_0x02cd:
            int r14 = r3.f16702c     // Catch:{ all -> 0x0508 }
            int r14 = r14 * r13
        L_0x02d1:
            if (r15 >= r5) goto L_0x02ee
            r16 = r2
            byte r2 = r10[r14]     // Catch:{ all -> 0x0508 }
            r17 = r4
            r4 = r2 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x02e5
            r4 = r11[r4]     // Catch:{ all -> 0x0508 }
            if (r4 == 0) goto L_0x02e4
            r0[r15] = r4     // Catch:{ all -> 0x0508 }
            goto L_0x02e5
        L_0x02e4:
            r12 = r2
        L_0x02e5:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r2 = r16
            r4 = r17
            goto L_0x02d1
        L_0x02ee:
            r16 = r2
            r17 = r4
            int r13 = r13 + 1
            r5 = 0
            goto L_0x02be
        L_0x02f6:
            java.lang.Boolean r0 = r1.f16736h     // Catch:{ all -> 0x0508 }
            if (r0 == 0) goto L_0x0303
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r2 = 1
            goto L_0x030e
        L_0x0303:
            java.lang.Boolean r0 = r1.f16736h     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x030d
            if (r8 != 0) goto L_0x030d
            r0 = -1
            if (r12 == r0) goto L_0x030d
            goto L_0x0301
        L_0x030d:
            r2 = 0
        L_0x030e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0508 }
            r1.f16736h = r0     // Catch:{ all -> 0x0508 }
            goto L_0x04aa
        L_0x0316:
            int[] r0 = r1.f16732d     // Catch:{ all -> 0x0508 }
            int r2 = r3.f16703d     // Catch:{ all -> 0x0508 }
            int r4 = r1.f16746s     // Catch:{ all -> 0x0508 }
            int r2 = r2 / r4
            int r5 = r3.f16701b     // Catch:{ all -> 0x0508 }
            int r5 = r5 / r4
            int r6 = r3.f16702c     // Catch:{ all -> 0x0508 }
            int r6 = r6 / r4
            int r7 = r3.f16700a     // Catch:{ all -> 0x0508 }
            int r7 = r7 / r4
            int r8 = r1.f16733e     // Catch:{ all -> 0x0508 }
            int r9 = r1.f16748u     // Catch:{ all -> 0x0508 }
            int r10 = r1.f16747t     // Catch:{ all -> 0x0508 }
            byte[] r11 = r1.f16731c     // Catch:{ all -> 0x0508 }
            int[] r12 = r1.f16739l     // Catch:{ all -> 0x0508 }
            java.lang.Boolean r13 = r1.f16736h     // Catch:{ all -> 0x0508 }
            r14 = r13
            r13 = 0
            r15 = 0
            r17 = 1
            r18 = 8
        L_0x0339:
            if (r13 >= r2) goto L_0x0496
            r19 = r14
            boolean r14 = r3.f16704e     // Catch:{ all -> 0x0508 }
            if (r14 == 0) goto L_0x036a
            if (r15 < r2) goto L_0x0365
            int r14 = r17 + 1
            r20 = r2
            r2 = 2
            if (r14 == r2) goto L_0x0360
            r2 = 3
            if (r14 == r2) goto L_0x0359
            r2 = 4
            if (r14 == r2) goto L_0x0353
            r17 = r14
            goto L_0x0367
        L_0x0353:
            r17 = r14
            r15 = 1
            r18 = 2
            goto L_0x0367
        L_0x0359:
            r2 = 4
            r17 = r14
            r15 = 2
            r18 = 4
            goto L_0x0367
        L_0x0360:
            r2 = 4
            r17 = r14
            r15 = 4
            goto L_0x0367
        L_0x0365:
            r20 = r2
        L_0x0367:
            int r2 = r15 + r18
            goto L_0x036e
        L_0x036a:
            r20 = r2
            r2 = r15
            r15 = r13
        L_0x036e:
            int r15 = r15 + r5
            if (r15 >= r10) goto L_0x0474
            int r15 = r15 * r9
            int r14 = r15 + r7
            r21 = r2
            int r2 = r14 + r6
            int r15 = r15 + r9
            if (r15 < r2) goto L_0x037d
            goto L_0x037e
        L_0x037d:
            r2 = r15
        L_0x037e:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r3.f16702c     // Catch:{ all -> 0x0508 }
            int r15 = r15 * r5
            r5 = 1
            if (r4 != r5) goto L_0x03b9
        L_0x0389:
            if (r14 >= r2) goto L_0x03ab
            byte r5 = r11[r15]     // Catch:{ all -> 0x0508 }
            r23 = r6
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            r5 = r12[r5]     // Catch:{ all -> 0x0508 }
            if (r5 == 0) goto L_0x0399
            r0[r14] = r5     // Catch:{ all -> 0x0508 }
            goto L_0x03a4
        L_0x0399:
            if (r8 != 0) goto L_0x03a4
            if (r19 != 0) goto L_0x03a4
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0508 }
            r19 = r6
        L_0x03a4:
            int r15 = r15 + 1
            int r14 = r14 + 1
            r6 = r23
            goto L_0x0389
        L_0x03ab:
            r23 = r6
            r32 = r7
            r33 = r9
            r34 = r10
            r14 = r19
            r10 = 255(0xff, float:3.57E-43)
            goto L_0x0484
        L_0x03b9:
            r23 = r6
            int r5 = r2 - r14
            int r5 = r5 * r4
            int r5 = r5 + r15
        L_0x03c0:
            if (r14 >= r2) goto L_0x047a
            int r6 = r3.f16702c     // Catch:{ all -> 0x0508 }
            r30 = r2
            r32 = r7
            r2 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
        L_0x03d3:
            int r7 = r1.f16746s     // Catch:{ all -> 0x0508 }
            int r7 = r7 + r15
            if (r2 >= r7) goto L_0x040a
            byte[] r7 = r1.f16731c     // Catch:{ all -> 0x0508 }
            r33 = r9
            int r9 = r7.length     // Catch:{ all -> 0x0508 }
            if (r2 >= r9) goto L_0x040c
            if (r2 >= r5) goto L_0x040c
            byte r7 = r7[r2]     // Catch:{ all -> 0x0508 }
            int[] r9 = r1.f16739l     // Catch:{ all -> 0x0508 }
            r34 = r10
            r10 = 255(0xff, float:3.57E-43)
            r7 = r7 & r10
            r7 = r9[r7]     // Catch:{ all -> 0x0508 }
            if (r7 == 0) goto L_0x0403
            int r9 = r7 >> 24
            r9 = r9 & r10
            int r29 = r29 + r9
            int r9 = r7 >> 16
            r9 = r9 & r10
            int r24 = r24 + r9
            int r9 = r7 >> 8
            r9 = r9 & r10
            int r25 = r25 + r9
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r7
            int r28 = r28 + 1
        L_0x0403:
            int r2 = r2 + 1
            r9 = r33
            r10 = r34
            goto L_0x03d3
        L_0x040a:
            r33 = r9
        L_0x040c:
            r34 = r10
            int r6 = r6 + r15
            r2 = r6
        L_0x0410:
            int r7 = r1.f16746s     // Catch:{ all -> 0x0508 }
            int r7 = r7 + r6
            if (r2 >= r7) goto L_0x043f
            byte[] r7 = r1.f16731c     // Catch:{ all -> 0x0508 }
            int r9 = r7.length     // Catch:{ all -> 0x0508 }
            if (r2 >= r9) goto L_0x043f
            if (r2 >= r5) goto L_0x043f
            byte r7 = r7[r2]     // Catch:{ all -> 0x0508 }
            int[] r9 = r1.f16739l     // Catch:{ all -> 0x0508 }
            r10 = 255(0xff, float:3.57E-43)
            r7 = r7 & r10
            r7 = r9[r7]     // Catch:{ all -> 0x0508 }
            if (r7 == 0) goto L_0x043c
            int r9 = r7 >> 24
            r9 = r9 & r10
            int r29 = r29 + r9
            int r9 = r7 >> 16
            r9 = r9 & r10
            int r24 = r24 + r9
            int r9 = r7 >> 8
            r9 = r9 & r10
            int r25 = r25 + r9
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r7
            int r28 = r28 + 1
        L_0x043c:
            int r2 = r2 + 1
            goto L_0x0410
        L_0x043f:
            r10 = 255(0xff, float:3.57E-43)
            if (r28 != 0) goto L_0x0445
            r2 = 0
            goto L_0x0457
        L_0x0445:
            int r29 = r29 / r28
            int r2 = r29 << 24
            int r24 = r24 / r28
            int r6 = r24 << 16
            r2 = r2 | r6
            int r25 = r25 / r28
            int r6 = r25 << 8
            r2 = r2 | r6
            int r26 = r26 / r28
            r2 = r2 | r26
        L_0x0457:
            if (r2 == 0) goto L_0x045c
            r0[r14] = r2     // Catch:{ all -> 0x0508 }
            goto L_0x0467
        L_0x045c:
            if (r8 != 0) goto L_0x0467
            if (r19 != 0) goto L_0x0467
            r2 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0508 }
            r19 = r6
        L_0x0467:
            int r15 = r15 + r4
            int r14 = r14 + 1
            r2 = r30
            r7 = r32
            r9 = r33
            r10 = r34
            goto L_0x03c0
        L_0x0474:
            r21 = r2
            r22 = r5
            r23 = r6
        L_0x047a:
            r32 = r7
            r33 = r9
            r34 = r10
            r10 = 255(0xff, float:3.57E-43)
            r14 = r19
        L_0x0484:
            int r13 = r13 + 1
            r2 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r32
            r9 = r33
            r10 = r34
            goto L_0x0339
        L_0x0496:
            r19 = r14
            java.lang.Boolean r0 = r1.f16736h     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x04aa
            if (r19 != 0) goto L_0x04a0
            r2 = 0
            goto L_0x04a4
        L_0x04a0:
            boolean r2 = r19.booleanValue()     // Catch:{ all -> 0x0508 }
        L_0x04a4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0508 }
            r1.f16736h = r0     // Catch:{ all -> 0x0508 }
        L_0x04aa:
            boolean r0 = r1.f16744q     // Catch:{ all -> 0x0508 }
            if (r0 == 0) goto L_0x04d3
            int r0 = r3.f16706g     // Catch:{ all -> 0x0508 }
            if (r0 == 0) goto L_0x04b5
            r2 = 1
            if (r0 != r2) goto L_0x04d3
        L_0x04b5:
            android.graphics.Bitmap r0 = r1.f16735g     // Catch:{ all -> 0x0508 }
            if (r0 != 0) goto L_0x04bf
            android.graphics.Bitmap r0 = r35.m14291e()     // Catch:{ all -> 0x0508 }
            r1.f16735g = r0     // Catch:{ all -> 0x0508 }
        L_0x04bf:
            android.graphics.Bitmap r11 = r1.f16735g     // Catch:{ all -> 0x0508 }
            int r0 = r1.f16748u     // Catch:{ all -> 0x0508 }
            r13 = 0
            r15 = 0
            r16 = 0
            int r2 = r1.f16747t     // Catch:{ all -> 0x0508 }
            r12 = r27
            r14 = r0
            r17 = r0
            r18 = r2
            r11.setPixels(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0508 }
        L_0x04d3:
            android.graphics.Bitmap r0 = r35.m14291e()     // Catch:{ all -> 0x0508 }
            int r2 = r1.f16748u     // Catch:{ all -> 0x0508 }
            r13 = 0
            r15 = 0
            r16 = 0
            int r3 = r1.f16747t     // Catch:{ all -> 0x0508 }
            r11 = r0
            r12 = r27
            r14 = r2
            r17 = r2
            r18 = r3
            r11.setPixels(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0508 }
            monitor-exit(r35)
            return r0
        L_0x04ec:
            java.lang.String r0 = f16728k     // Catch:{ all -> 0x0508 }
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch:{ all -> 0x0508 }
            if (r3 == 0) goto L_0x0506
            int r3 = r1.f16745r     // Catch:{ all -> 0x0508 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0508 }
            r5.<init>(r2)     // Catch:{ all -> 0x0508 }
            r5.append(r3)     // Catch:{ all -> 0x0508 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0508 }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x0508 }
        L_0x0506:
            monitor-exit(r35)
            return r4
        L_0x0508:
            r0 = move-exception
            monitor-exit(r35)
            goto L_0x050c
        L_0x050b:
            throw r0
        L_0x050c:
            goto L_0x050b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p281b.C5521e.mo11895a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo11896b() {
        this.f16733e = (this.f16733e + 1) % this.f16734f.f16713c;
    }

    /* renamed from: c */
    public final synchronized void mo11902c(C5519c cVar, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f16745r = 0;
            this.f16734f = cVar;
            this.f16733e = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f16729a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f16729a.order(ByteOrder.LITTLE_ENDIAN);
            this.f16744q = false;
            Iterator it = cVar.f16715e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C5518b) it.next()).f16706g == 3) {
                        this.f16744q = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f16746s = highestOneBit;
            int i2 = cVar.f16716f;
            this.f16748u = i2 / highestOneBit;
            int i3 = cVar.f16717g;
            this.f16747t = i3 / highestOneBit;
            this.f16731c = this.f16738j.mo12346c(i2 * i3);
            C5898c cVar2 = this.f16738j;
            int i4 = this.f16748u * this.f16747t;
            C5640b bVar = cVar2.f17515b;
            if (bVar == null) {
                iArr = new int[i4];
            } else {
                iArr = (int[]) bVar.mo12105a(i4, int[].class);
            }
            this.f16732d = iArr;
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }
}

package com.bumptech.glide.load.p299c.p304e;

import android.content.Context;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.e.b */
/* compiled from: PG */
public final class C5897b implements C5962u {

    /* renamed from: a */
    private static final C5896a f17509a = new C5896a();

    /* renamed from: b */
    private final Context f17510b;

    /* renamed from: c */
    private final List f17511c;

    /* renamed from: d */
    private final C5896a f17512d;

    /* renamed from: e */
    private final C5898c f17513e;

    public C5897b(Context context, List list, C5642d dVar, C5640b bVar) {
        C5896a aVar = f17509a;
        this.f17510b = context.getApplicationContext();
        this.f17511c = list;
        this.f17513e = new C5898c(dVar, bVar);
        this.f17512d = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return !((Boolean) sVar.mo12401b(C5909n.f17551b)).booleanValue() && C5954m.m15366c(this.f17511c, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x03b7 A[Catch:{ all -> 0x03ce }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.p299c.p304e.C5902g mo12293a(java.nio.ByteBuffer r19, int r20, int r21, com.bumptech.glide.load.C5960s r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r5 = r20
            r6 = r21
            java.lang.String r2 = "x"
            java.lang.String r9 = "Decoded GIF from stream in "
            java.lang.String r10 = "BufferGifDecoder"
            com.bumptech.glide.load.c.e.a r3 = r1.f17512d
            com.bumptech.glide.b.d r11 = r3.mo12341a(r0)
            long r12 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x03d0 }
            java.nio.ByteBuffer r3 = r11.f16725b     // Catch:{ all -> 0x03ae }
            if (r3 == 0) goto L_0x03a3
            boolean r3 = r11.mo11900d()     // Catch:{ all -> 0x03ae }
            r8 = 1
            if (r3 == 0) goto L_0x002a
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            r17 = r9
            r8 = 0
            goto L_0x0238
        L_0x002a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ae }
            r3.<init>()     // Catch:{ all -> 0x03ae }
            r15 = 0
        L_0x0030:
            r14 = 6
            if (r15 >= r14) goto L_0x003e
            int r14 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            char r14 = (char) r14     // Catch:{ all -> 0x03ae }
            r3.append(r14)     // Catch:{ all -> 0x03ae }
            int r15 = r15 + 1
            goto L_0x0030
        L_0x003e:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03ae }
            java.lang.String r14 = "GIF"
            boolean r3 = r3.startsWith(r14)     // Catch:{ all -> 0x03ae }
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r3 != 0) goto L_0x0051
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            r3.f16712b = r8     // Catch:{ all -> 0x03ae }
            goto L_0x00af
        L_0x0051:
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r7 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r7 = r7.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16716f = r7     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r7 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r7 = r7.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16717g = r7     // Catch:{ all -> 0x03ae }
            int r3 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r7 = r11.f16726c     // Catch:{ all -> 0x03ae }
            r4 = r3 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r7.f16718h = r4     // Catch:{ all -> 0x03ae }
            r3 = r3 & 7
            int r3 = r3 + r8
            double r3 = (double) r3     // Catch:{ all -> 0x03ae }
            double r3 = java.lang.Math.pow(r14, r3)     // Catch:{ all -> 0x03ae }
            int r3 = (int) r3     // Catch:{ all -> 0x03ae }
            r7.f16719i = r3     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            int r4 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            r3.f16720j = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            int r4 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            r3.f16721k = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            boolean r3 = r3.f16718h     // Catch:{ all -> 0x03ae }
            if (r3 == 0) goto L_0x00af
            boolean r3 = r11.mo11900d()     // Catch:{ all -> 0x03ae }
            if (r3 != 0) goto L_0x00af
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            int r4 = r3.f16719i     // Catch:{ all -> 0x03ae }
            int[] r4 = r11.mo11901e(r4)     // Catch:{ all -> 0x03ae }
            r3.f16711a = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            int[] r4 = r3.f16711a     // Catch:{ all -> 0x03ae }
            int r7 = r3.f16720j     // Catch:{ all -> 0x03ae }
            r4 = r4[r7]     // Catch:{ all -> 0x03ae }
            r3.f16722l = r4     // Catch:{ all -> 0x03ae }
        L_0x00af:
            boolean r3 = r11.mo11900d()     // Catch:{ all -> 0x03ae }
            if (r3 != 0) goto L_0x0233
        L_0x00b5:
            boolean r3 = r11.mo11900d()     // Catch:{ all -> 0x03ae }
            if (r3 != 0) goto L_0x0226
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            int r3 = r3.f16713c     // Catch:{ all -> 0x03ae }
            int r3 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            r4 = 33
            if (r3 == r4) goto L_0x0163
            r4 = 44
            if (r3 == r4) goto L_0x00d4
            r4 = 59
            if (r3 == r4) goto L_0x0226
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            r3.f16712b = r8     // Catch:{ all -> 0x03ae }
            goto L_0x00b5
        L_0x00d4:
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.b r4 = r3.f16714d     // Catch:{ all -> 0x03ae }
            if (r4 != 0) goto L_0x00e1
            com.bumptech.glide.b.b r4 = new com.bumptech.glide.b.b     // Catch:{ all -> 0x03ae }
            r4.<init>()     // Catch:{ all -> 0x03ae }
            r3.f16714d = r4     // Catch:{ all -> 0x03ae }
        L_0x00e1:
            com.bumptech.glide.b.b r3 = r3.f16714d     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r4 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r4 = r4.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16700a = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.b r3 = r3.f16714d     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r4 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r4 = r4.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16701b = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.b r3 = r3.f16714d     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r4 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r4 = r4.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16702c = r4     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.b.b r3 = r3.f16714d     // Catch:{ all -> 0x03ae }
            java.nio.ByteBuffer r4 = r11.f16725b     // Catch:{ all -> 0x03ae }
            short r4 = r4.getShort()     // Catch:{ all -> 0x03ae }
            r3.f16703d = r4     // Catch:{ all -> 0x03ae }
            int r3 = r11.mo11897a()     // Catch:{ all -> 0x03ae }
            r4 = r3 & 128(0x80, float:1.794E-43)
            r7 = r3 & 7
            int r7 = r7 + r8
            r17 = r9
            double r8 = (double) r7
            double r7 = java.lang.Math.pow(r14, r8)     // Catch:{ all -> 0x039e }
            int r7 = (int) r7     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.c r8 = r11.f16726c     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r8 = r8.f16714d     // Catch:{ all -> 0x039e }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x012a
            r3 = 1
            goto L_0x012b
        L_0x012a:
            r3 = 0
        L_0x012b:
            r8.f16704e = r3     // Catch:{ all -> 0x039e }
            if (r4 == 0) goto L_0x0137
            int[] r3 = r11.mo11901e(r7)     // Catch:{ all -> 0x039e }
            r8.f16710k = r3     // Catch:{ all -> 0x039e }
            r3 = 0
            goto L_0x013a
        L_0x0137:
            r3 = 0
            r8.f16710k = r3     // Catch:{ all -> 0x039e }
        L_0x013a:
            com.bumptech.glide.b.c r4 = r11.f16726c     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r4 = r4.f16714d     // Catch:{ all -> 0x039e }
            java.nio.ByteBuffer r7 = r11.f16725b     // Catch:{ all -> 0x039e }
            int r7 = r7.position()     // Catch:{ all -> 0x039e }
            r4.f16709j = r7     // Catch:{ all -> 0x039e }
            r11.mo11897a()     // Catch:{ all -> 0x039e }
            r11.mo11899c()     // Catch:{ all -> 0x039e }
            boolean r4 = r11.mo11900d()     // Catch:{ all -> 0x039e }
            if (r4 != 0) goto L_0x0221
            com.bumptech.glide.b.c r4 = r11.f16726c     // Catch:{ all -> 0x039e }
            int r7 = r4.f16713c     // Catch:{ all -> 0x039e }
            r8 = 1
            int r7 = r7 + r8
            r4.f16713c = r7     // Catch:{ all -> 0x039e }
            java.util.List r7 = r4.f16715e     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r4 = r4.f16714d     // Catch:{ all -> 0x039e }
            r7.add(r4)     // Catch:{ all -> 0x039e }
            goto L_0x0221
        L_0x0163:
            r17 = r9
            r3 = 0
            int r4 = r11.mo11897a()     // Catch:{ all -> 0x039e }
            r7 = 1
            if (r4 == r7) goto L_0x021d
            r7 = 249(0xf9, float:3.49E-43)
            if (r4 == r7) goto L_0x01d3
            r7 = 254(0xfe, float:3.56E-43)
            if (r4 == r7) goto L_0x01ce
            r7 = 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L_0x017e
            r11.mo11899c()     // Catch:{ all -> 0x039e }
            goto L_0x0221
        L_0x017e:
            r11.mo11898b()     // Catch:{ all -> 0x039e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x039e }
            r4.<init>()     // Catch:{ all -> 0x039e }
            r8 = 0
        L_0x0187:
            r9 = 11
            if (r8 >= r9) goto L_0x0196
            byte[] r9 = r11.f16724a     // Catch:{ all -> 0x039e }
            byte r9 = r9[r8]     // Catch:{ all -> 0x039e }
            char r9 = (char) r9     // Catch:{ all -> 0x039e }
            r4.append(r9)     // Catch:{ all -> 0x039e }
            int r8 = r8 + 1
            goto L_0x0187
        L_0x0196:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x039e }
            java.lang.String r8 = "NETSCAPE2.0"
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x039e }
            if (r4 == 0) goto L_0x01c9
        L_0x01a2:
            r11.mo11898b()     // Catch:{ all -> 0x039e }
            byte[] r4 = r11.f16724a     // Catch:{ all -> 0x039e }
            r8 = 0
            byte r9 = r4[r8]     // Catch:{ all -> 0x039e }
            r3 = 1
            if (r9 != r3) goto L_0x01bc
            byte r9 = r4[r3]     // Catch:{ all -> 0x039e }
            r3 = r9 & 255(0xff, float:3.57E-43)
            r9 = 2
            byte r4 = r4[r9]     // Catch:{ all -> 0x039e }
            r4 = r4 & r7
            com.bumptech.glide.b.c r9 = r11.f16726c     // Catch:{ all -> 0x039e }
            int r4 = r4 << 8
            r3 = r3 | r4
            r9.f16723m = r3     // Catch:{ all -> 0x039e }
        L_0x01bc:
            int r3 = r11.f16727d     // Catch:{ all -> 0x039e }
            if (r3 <= 0) goto L_0x0221
            boolean r3 = r11.mo11900d()     // Catch:{ all -> 0x039e }
            if (r3 == 0) goto L_0x01c7
            goto L_0x0221
        L_0x01c7:
            r3 = 0
            goto L_0x01a2
        L_0x01c9:
            r8 = 0
            r11.mo11899c()     // Catch:{ all -> 0x039e }
            goto L_0x0221
        L_0x01ce:
            r8 = 0
            r11.mo11899c()     // Catch:{ all -> 0x039e }
            goto L_0x0221
        L_0x01d3:
            r8 = 0
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r4 = new com.bumptech.glide.b.b     // Catch:{ all -> 0x039e }
            r4.<init>()     // Catch:{ all -> 0x039e }
            r3.f16714d = r4     // Catch:{ all -> 0x039e }
            r11.mo11897a()     // Catch:{ all -> 0x039e }
            int r3 = r11.mo11897a()     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.c r4 = r11.f16726c     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r4 = r4.f16714d     // Catch:{ all -> 0x039e }
            r7 = r3 & 28
            r9 = 2
            int r7 = r7 >> r9
            r4.f16706g = r7     // Catch:{ all -> 0x039e }
            if (r7 != 0) goto L_0x01f4
            r7 = 1
            r4.f16706g = r7     // Catch:{ all -> 0x039e }
            goto L_0x01f5
        L_0x01f4:
            r7 = 1
        L_0x01f5:
            r3 = r3 & 1
            if (r7 == r3) goto L_0x01fb
            r3 = 0
            goto L_0x01fc
        L_0x01fb:
            r3 = 1
        L_0x01fc:
            r4.f16705f = r3     // Catch:{ all -> 0x039e }
            java.nio.ByteBuffer r3 = r11.f16725b     // Catch:{ all -> 0x039e }
            short r3 = r3.getShort()     // Catch:{ all -> 0x039e }
            r4 = 10
            r7 = 2
            if (r3 >= r7) goto L_0x020b
            r3 = 10
        L_0x020b:
            com.bumptech.glide.b.c r7 = r11.f16726c     // Catch:{ all -> 0x039e }
            com.bumptech.glide.b.b r7 = r7.f16714d     // Catch:{ all -> 0x039e }
            int r3 = r3 * 10
            r7.f16708i = r3     // Catch:{ all -> 0x039e }
            int r3 = r11.mo11897a()     // Catch:{ all -> 0x039e }
            r7.f16707h = r3     // Catch:{ all -> 0x039e }
            r11.mo11897a()     // Catch:{ all -> 0x039e }
            goto L_0x0221
        L_0x021d:
            r8 = 0
            r11.mo11899c()     // Catch:{ all -> 0x039e }
        L_0x0221:
            r9 = r17
            r8 = 1
            goto L_0x00b5
        L_0x0226:
            r17 = r9
            r8 = 0
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x039e }
            int r4 = r3.f16713c     // Catch:{ all -> 0x039e }
            if (r4 >= 0) goto L_0x0236
            r4 = 1
            r3.f16712b = r4     // Catch:{ all -> 0x039e }
            goto L_0x0236
        L_0x0233:
            r17 = r9
            r8 = 0
        L_0x0236:
            com.bumptech.glide.b.c r3 = r11.f16726c     // Catch:{ all -> 0x039e }
        L_0x0238:
            int r4 = r3.f16713c     // Catch:{ all -> 0x039e }
            if (r4 <= 0) goto L_0x0370
            int r4 = r3.f16712b     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x0242
            goto L_0x0370
        L_0x0242:
            com.bumptech.glide.load.r r4 = com.bumptech.glide.load.p299c.p304e.C5909n.f17550a     // Catch:{ all -> 0x036c }
            r7 = r22
            java.lang.Object r4 = r7.mo12401b(r4)     // Catch:{ all -> 0x036c }
            com.bumptech.glide.load.b r7 = com.bumptech.glide.load.C5734b.PREFER_RGB_565     // Catch:{ all -> 0x036c }
            if (r4 != r7) goto L_0x0251
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x039e }
            goto L_0x0253
        L_0x0251:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x036c }
        L_0x0253:
            int r7 = r3.f16717g     // Catch:{ all -> 0x036c }
            int r7 = r7 / r6
            int r9 = r3.f16716f     // Catch:{ all -> 0x036c }
            int r9 = r9 / r5
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ all -> 0x036c }
            if (r7 != 0) goto L_0x0262
            r7 = 0
        L_0x0260:
            r8 = 1
            goto L_0x0267
        L_0x0262:
            int r7 = java.lang.Integer.highestOneBit(r7)     // Catch:{ all -> 0x036c }
            goto L_0x0260
        L_0x0267:
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x036c }
            r9 = 2
            boolean r14 = android.util.Log.isLoggable(r10, r9)     // Catch:{ all -> 0x036c }
            if (r14 == 0) goto L_0x02ad
            if (r7 <= r8) goto L_0x02ad
            int r8 = r3.f16716f     // Catch:{ all -> 0x039e }
            int r9 = r3.f16717g     // Catch:{ all -> 0x039e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x039e }
            r14.<init>()     // Catch:{ all -> 0x039e }
            java.lang.String r15 = "Downsampling GIF, sampleSize: "
            r14.append(r15)     // Catch:{ all -> 0x039e }
            r14.append(r7)     // Catch:{ all -> 0x039e }
            java.lang.String r15 = ", target dimens: ["
            r14.append(r15)     // Catch:{ all -> 0x039e }
            r14.append(r5)     // Catch:{ all -> 0x039e }
            r14.append(r2)     // Catch:{ all -> 0x039e }
            r14.append(r6)     // Catch:{ all -> 0x039e }
            java.lang.String r15 = "], actual dimens: ["
            r14.append(r15)     // Catch:{ all -> 0x039e }
            r14.append(r8)     // Catch:{ all -> 0x039e }
            r14.append(r2)     // Catch:{ all -> 0x039e }
            r14.append(r9)     // Catch:{ all -> 0x039e }
            java.lang.String r2 = "]"
            r14.append(r2)     // Catch:{ all -> 0x039e }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x039e }
            android.util.Log.v(r10, r2)     // Catch:{ all -> 0x039e }
        L_0x02ad:
            com.bumptech.glide.load.c.e.c r2 = r1.f17513e     // Catch:{ all -> 0x036c }
            com.bumptech.glide.b.e r8 = new com.bumptech.glide.b.e     // Catch:{ all -> 0x036c }
            r8.<init>(r2, r3, r0, r7)     // Catch:{ all -> 0x036c }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x036c }
            if (r4 == r0) goto L_0x02f4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x039e }
            if (r4 != r0) goto L_0x02bd
            goto L_0x02f4
        L_0x02bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x039e }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x039e }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x039e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x039e }
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x039e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x039e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x039e }
            r5.<init>()     // Catch:{ all -> 0x039e }
            java.lang.String r6 = "Unsupported format: "
            r5.append(r6)     // Catch:{ all -> 0x039e }
            r5.append(r2)     // Catch:{ all -> 0x039e }
            java.lang.String r2 = ", must be one of "
            r5.append(r2)     // Catch:{ all -> 0x039e }
            r5.append(r3)     // Catch:{ all -> 0x039e }
            java.lang.String r2 = " or "
            r5.append(r2)     // Catch:{ all -> 0x039e }
            r5.append(r4)     // Catch:{ all -> 0x039e }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x039e }
            r0.<init>(r2)     // Catch:{ all -> 0x039e }
            throw r0     // Catch:{ all -> 0x039e }
        L_0x02f4:
            r8.f16737i = r4     // Catch:{ all -> 0x036c }
            r8.mo11896b()     // Catch:{ all -> 0x036c }
            android.graphics.Bitmap r0 = r8.mo11895a()     // Catch:{ all -> 0x036c }
            if (r0 != 0) goto L_0x0322
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r10, r2)     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x031e
            double r2 = com.bumptech.glide.p291h.C5625l.m14592a(r12)     // Catch:{ all -> 0x03d0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d0 }
            r0.<init>()     // Catch:{ all -> 0x03d0 }
            r9 = r17
            r0.append(r9)     // Catch:{ all -> 0x03d0 }
            r0.append(r2)     // Catch:{ all -> 0x03d0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03d0 }
            android.util.Log.v(r10, r0)     // Catch:{ all -> 0x03d0 }
        L_0x031e:
            r16 = r11
            goto L_0x0391
        L_0x0322:
            r9 = r17
            com.bumptech.glide.load.w r7 = com.bumptech.glide.load.p299c.C5893d.f17507b     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.load.c.e.e r14 = new com.bumptech.glide.load.c.e.e     // Catch:{ all -> 0x03ae }
            android.content.Context r2 = r1.f17510b     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.load.c.e.d r15 = new com.bumptech.glide.load.c.e.d     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.load.c.e.l r4 = new com.bumptech.glide.load.c.e.l     // Catch:{ all -> 0x03ae }
            com.bumptech.glide.d r3 = com.bumptech.glide.C5543d.m14321a(r2)     // Catch:{ all -> 0x03ae }
            r2 = r4
            r16 = r11
            r11 = r4
            r4 = r8
            r5 = r20
            r6 = r21
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0368 }
            r15.<init>(r11)     // Catch:{ all -> 0x0368 }
            r14.<init>(r15)     // Catch:{ all -> 0x0368 }
            com.bumptech.glide.load.c.e.g r4 = new com.bumptech.glide.load.c.e.g     // Catch:{ all -> 0x0368 }
            r4.<init>(r14)     // Catch:{ all -> 0x0368 }
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r10, r2)     // Catch:{ all -> 0x039a }
            if (r0 == 0) goto L_0x0392
            double r2 = com.bumptech.glide.p291h.C5625l.m14592a(r12)     // Catch:{ all -> 0x039a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x039a }
            r0.<init>()     // Catch:{ all -> 0x039a }
            r0.append(r9)     // Catch:{ all -> 0x039a }
            r0.append(r2)     // Catch:{ all -> 0x039a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x039a }
            android.util.Log.v(r10, r0)     // Catch:{ all -> 0x039a }
            goto L_0x0392
        L_0x0368:
            r0 = move-exception
            r2 = r16
            goto L_0x03b0
        L_0x036c:
            r0 = move-exception
            r9 = r17
            goto L_0x03af
        L_0x0370:
            r16 = r11
            r9 = r17
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r10, r2)     // Catch:{ all -> 0x039a }
            if (r0 == 0) goto L_0x0391
            double r2 = com.bumptech.glide.p291h.C5625l.m14592a(r12)     // Catch:{ all -> 0x039a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x039a }
            r0.<init>()     // Catch:{ all -> 0x039a }
            r0.append(r9)     // Catch:{ all -> 0x039a }
            r0.append(r2)     // Catch:{ all -> 0x039a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x039a }
            android.util.Log.v(r10, r0)     // Catch:{ all -> 0x039a }
        L_0x0391:
            r4 = 0
        L_0x0392:
            com.bumptech.glide.load.c.e.a r0 = r1.f17512d
            r2 = r16
            r0.mo12342b(r2)
            return r4
        L_0x039a:
            r0 = move-exception
            r2 = r16
            goto L_0x03d2
        L_0x039e:
            r0 = move-exception
            r2 = r11
            r9 = r17
            goto L_0x03b0
        L_0x03a3:
            r2 = r11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03ac }
            java.lang.String r3 = "You must call setData() before parseHeader()"
            r0.<init>(r3)     // Catch:{ all -> 0x03ac }
            throw r0     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            goto L_0x03b0
        L_0x03ae:
            r0 = move-exception
        L_0x03af:
            r2 = r11
        L_0x03b0:
            r3 = 2
            boolean r3 = android.util.Log.isLoggable(r10, r3)     // Catch:{ all -> 0x03ce }
            if (r3 == 0) goto L_0x03cd
            double r3 = com.bumptech.glide.p291h.C5625l.m14592a(r12)     // Catch:{ all -> 0x03ce }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ce }
            r5.<init>()     // Catch:{ all -> 0x03ce }
            r5.append(r9)     // Catch:{ all -> 0x03ce }
            r5.append(r3)     // Catch:{ all -> 0x03ce }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x03ce }
            android.util.Log.v(r10, r3)     // Catch:{ all -> 0x03ce }
        L_0x03cd:
            throw r0     // Catch:{ all -> 0x03ce }
        L_0x03ce:
            r0 = move-exception
            goto L_0x03d2
        L_0x03d0:
            r0 = move-exception
            r2 = r11
        L_0x03d2:
            com.bumptech.glide.load.c.e.a r3 = r1.f17512d
            r3.mo12342b(r2)
            goto L_0x03d9
        L_0x03d8:
            throw r0
        L_0x03d9:
            goto L_0x03d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p304e.C5897b.mo12293a(java.nio.ByteBuffer, int, int, com.bumptech.glide.load.s):com.bumptech.glide.load.c.e.g");
    }
}

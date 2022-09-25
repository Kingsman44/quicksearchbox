package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.C5734b;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.c.a.y */
/* compiled from: PG */
public final class C5876y {

    /* renamed from: a */
    public static final C5959r f17477a = C5959r.m15375b("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C5734b.f17292c);

    /* renamed from: b */
    public static final C5959r f17478b = C5959r.m15374a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: c */
    public static final C5959r f17479c = C5959r.m15375b("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: d */
    public static final C5959r f17480d = C5959r.m15375b("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: e */
    public static final C5875x f17481e = new C5874w();

    /* renamed from: h */
    private static final Queue f17482h = C5632s.m14615h(0);

    /* renamed from: f */
    public final C5640b f17483f;

    /* renamed from: g */
    public final List f17484g;

    /* renamed from: i */
    private final C5642d f17485i;

    /* renamed from: j */
    private final DisplayMetrics f17486j;

    /* renamed from: k */
    private final C5826ae f17487k = C5826ae.m15058a();

    static {
        C5873v vVar = C5873v.f17470a;
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    }

    public C5876y(List list, DisplayMetrics displayMetrics, C5642d dVar, C5640b bVar) {
        this.f17484g = list;
        C5630q.m14607d(displayMetrics, "Argument must not be null");
        this.f17486j = displayMetrics;
        C5630q.m14607d(dVar, "Argument must not be null");
        this.f17485i = dVar;
        C5630q.m14607d(bVar, "Argument must not be null");
        this.f17483f = bVar;
    }

    /* renamed from: b */
    private static int m15186b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0074 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m15187c(com.bumptech.glide.load.p299c.p300a.C5830ai r9, android.graphics.BitmapFactory.Options r10, com.bumptech.glide.load.p299c.p300a.C5875x r11, com.bumptech.glide.load.p293a.p294a.C5642d r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto L_0x000e
            r11.mo12313b()
            r9.mo12301d()
        L_0x000e:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.p299c.p300a.C5841at.f17440a
            r5.lock()
            android.graphics.Bitmap r9 = r9.mo12299b(r10)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.p299c.p300a.C5841at.f17440a
        L_0x001f:
            r10.unlock()
            return r9
        L_0x0023:
            r9 = move-exception
            goto L_0x0076
        L_0x0025:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r7 = r10.inBitmap     // Catch:{ all -> 0x0023 }
            java.lang.String r7 = m15189e(r7)     // Catch:{ all -> 0x0023 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r8.<init>(r1)     // Catch:{ all -> 0x0023 }
            r8.append(r2)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch:{ all -> 0x0023 }
            r8.append(r3)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch:{ all -> 0x0023 }
            r8.append(r4)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch:{ all -> 0x0023 }
            r8.append(r7)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0023 }
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0023 }
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch:{ all -> 0x0023 }
        L_0x0061:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0075
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch:{ IOException -> 0x0074 }
            r12.mo12116d(r0)     // Catch:{ IOException -> 0x0074 }
            r0 = 0
            r10.inBitmap = r0     // Catch:{ IOException -> 0x0074 }
            android.graphics.Bitmap r9 = m15187c(r9, r10, r11, r12)     // Catch:{ IOException -> 0x0074 }
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.p299c.p300a.C5841at.f17440a
            goto L_0x001f
        L_0x0074:
            throw r6     // Catch:{ all -> 0x0023 }
        L_0x0075:
            throw r6     // Catch:{ all -> 0x0023 }
        L_0x0076:
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.p299c.p300a.C5841at.f17440a
            r10.unlock()
            goto L_0x007d
        L_0x007c:
            throw r9
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5876y.m15187c(com.bumptech.glide.load.c.a.ai, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.c.a.x, com.bumptech.glide.load.a.a.d):android.graphics.Bitmap");
    }

    /* renamed from: d */
    private static synchronized BitmapFactory.Options m15188d() {
        BitmapFactory.Options options;
        synchronized (C5876y.class) {
            Queue queue = f17482h;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            m15191g(options2);
            return options2;
        }
    }

    /* renamed from: e */
    private static String m15189e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    /* renamed from: f */
    private static void m15190f(BitmapFactory.Options options) {
        m15191g(options);
        Queue queue = f17482h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: g */
    private static void m15191g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: h */
    private static boolean m15192h(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: i */
    private static boolean m15193i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: j */
    private static int[] m15194j(C5830ai aiVar, BitmapFactory.Options options, C5875x xVar, C5642d dVar) {
        options.inJustDecodeBounds = true;
        m15187c(aiVar, options, xVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x033e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0344, code lost:
        if (android.util.Log.isLoggable(r6, 3) != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0346, code lost:
        android.util.Log.d(r6, "Cannot determine whether the image has alpha or not from header, format ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r9))), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0580, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0581, code lost:
        r34 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:104:0x0323, B:109:0x0331] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0361 A[Catch:{ IOException -> 0x033e, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb A[Catch:{ all -> 0x02d4, all -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ef A[Catch:{ all -> 0x02d4, all -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01fd A[Catch:{ all -> 0x02d4, all -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0273 A[Catch:{ all -> 0x02d4, all -> 0x0586 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.p293a.C5679av mo12334a(com.bumptech.glide.load.p299c.p300a.C5830ai r43, int r44, int r45, com.bumptech.glide.load.C5960s r46, com.bumptech.glide.load.p299c.p300a.C5875x r47) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r0 = r46
            r5 = r47
            java.lang.String r6 = "Calculate scaling, source: ["
            java.lang.String r7 = "Decoded "
            java.lang.String r8 = "Calculated target ["
            java.lang.String r9 = "Cannot scale with factor: "
            java.lang.String r10 = "Unable to determine dimensions for: "
            com.bumptech.glide.load.a.a.b r11 = r1.f17483f
            r12 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r13 = byte[].class
            java.lang.Object r11 = r11.mo12105a(r12, r13)
            byte[] r11 = (byte[]) r11
            android.graphics.BitmapFactory$Options r12 = m15188d()
            r12.inTempStorage = r11
            com.bumptech.glide.load.r r13 = f17477a
            java.lang.Object r13 = r0.mo12401b(r13)
            com.bumptech.glide.load.b r13 = (com.bumptech.glide.load.C5734b) r13
            com.bumptech.glide.load.r r14 = f17478b
            java.lang.Object r14 = r0.mo12401b(r14)
            com.bumptech.glide.load.t r14 = (com.bumptech.glide.load.C5961t) r14
            com.bumptech.glide.load.r r15 = com.bumptech.glide.load.p299c.p300a.C5873v.f17475f
            java.lang.Object r15 = r0.mo12401b(r15)
            com.bumptech.glide.load.c.a.v r15 = (com.bumptech.glide.load.p299c.p300a.C5873v) r15
            r16 = r11
            com.bumptech.glide.load.r r11 = f17479c
            java.lang.Object r11 = r0.mo12401b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r17 = r7
            com.bumptech.glide.load.r r7 = f17480d
            java.lang.Object r18 = r0.mo12401b(r7)
            r19 = r14
            r14 = 1
            if (r18 == 0) goto L_0x0069
            java.lang.Object r0 = r0.mo12401b(r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            long r20 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x058a }
            com.bumptech.glide.load.a.a.d r7 = r1.f17485i     // Catch:{ all -> 0x058a }
            int[] r7 = m15194j(r2, r12, r5, r7)     // Catch:{ all -> 0x058a }
            r22 = r8
            r18 = 0
            r8 = r7[r18]     // Catch:{ all -> 0x058a }
            r7 = r7[r14]     // Catch:{ all -> 0x058a }
            java.lang.String r14 = r12.outMimeType     // Catch:{ all -> 0x058a }
            r46 = r0
            r0 = -1
            if (r8 == r0) goto L_0x008b
            if (r7 != r0) goto L_0x0088
            r0 = 0
            r7 = -1
            goto L_0x008c
        L_0x0088:
            r0 = r46
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            int r23 = r43.mo12298a()     // Catch:{ all -> 0x058a }
            r46 = r14
            int r14 = com.bumptech.glide.load.p299c.p300a.C5841at.m15099a(r23)     // Catch:{ all -> 0x058a }
            r24 = r11
            boolean r11 = com.bumptech.glide.load.p299c.p300a.C5841at.m15108j(r23)     // Catch:{ all -> 0x058a }
            r25 = r13
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r13) goto L_0x00ab
            boolean r26 = m15192h(r14)     // Catch:{ all -> 0x058a }
            if (r26 == 0) goto L_0x00aa
            r3 = r7
            goto L_0x00ab
        L_0x00aa:
            r3 = r8
        L_0x00ab:
            if (r4 != r13) goto L_0x00b7
            boolean r13 = m15192h(r14)     // Catch:{ all -> 0x058a }
            if (r13 == 0) goto L_0x00b5
            r13 = r8
            goto L_0x00b8
        L_0x00b5:
            r13 = r7
            goto L_0x00b8
        L_0x00b7:
            r13 = r4
        L_0x00b8:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = r43.mo12300c()     // Catch:{ all -> 0x058a }
            r26 = r0
            com.bumptech.glide.load.a.a.d r0 = r1.f17485i     // Catch:{ all -> 0x058a }
            r27 = r11
            java.lang.String r11 = ", target density: "
            java.lang.String r1 = "]"
            r28 = r10
            java.lang.String r10 = ", density: "
            r29 = r1
            java.lang.String r1 = "x"
            r30 = r9
            java.lang.String r9 = "Downsampler"
            if (r8 <= 0) goto L_0x02d9
            if (r7 > 0) goto L_0x00d8
            goto L_0x02d9
        L_0x00d8:
            r31 = r10
            boolean r10 = m15192h(r14)     // Catch:{ all -> 0x02d4 }
            r32 = r11
            r11 = 1
            if (r11 == r10) goto L_0x00e7
            r33 = r14
            r14 = r7
            goto L_0x00ea
        L_0x00e7:
            r33 = r14
            r14 = r8
        L_0x00ea:
            if (r11 == r10) goto L_0x00ee
            r10 = r8
            goto L_0x00ef
        L_0x00ee:
            r10 = r7
        L_0x00ef:
            float r11 = r15.mo12332a(r10, r14, r3, r13)     // Catch:{ all -> 0x02d4 }
            r28 = 0
            int r34 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r34 <= 0) goto L_0x028d
            r34 = r7
            int r7 = r15.mo12333b(r10, r14, r3, r13)     // Catch:{ all -> 0x02d4 }
            if (r7 == 0) goto L_0x0283
            r35 = r1
            float r1 = (float) r10
            r36 = r8
            float r8 = r11 * r1
            r37 = r9
            double r8 = (double) r8
            r38 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r8)
            double r8 = r8 + r38
            int r8 = (int) r8
            float r9 = (float) r14
            r40 = r6
            float r6 = r11 * r9
            r41 = r3
            double r2 = (double) r6
            java.lang.Double.isNaN(r2)
            double r2 = r2 + r38
            int r2 = (int) r2
            int r3 = r10 / r8
            int r2 = r14 / r2
            r6 = 1
            if (r7 != r6) goto L_0x012d
            int r2 = java.lang.Math.max(r3, r2)     // Catch:{ all -> 0x02d4 }
            goto L_0x0131
        L_0x012d:
            int r2 = java.lang.Math.min(r3, r2)     // Catch:{ all -> 0x02d4 }
        L_0x0131:
            int r2 = java.lang.Integer.highestOneBit(r2)     // Catch:{ all -> 0x02d4 }
            int r2 = java.lang.Math.max(r6, r2)     // Catch:{ all -> 0x02d4 }
            if (r7 != r6) goto L_0x0145
            float r3 = (float) r2     // Catch:{ all -> 0x02d4 }
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r6 / r11
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0145
            int r2 = r2 + r2
        L_0x0145:
            r12.inSampleSize = r2     // Catch:{ all -> 0x02d4 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ all -> 0x02d4 }
            if (r4 != r3) goto L_0x0167
            r0 = 8
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x02d4 }
            float r0 = (float) r0     // Catch:{ all -> 0x02d4 }
            float r1 = r1 / r0
            double r3 = (double) r1     // Catch:{ all -> 0x02d4 }
            double r3 = java.lang.Math.ceil(r3)     // Catch:{ all -> 0x02d4 }
            int r1 = (int) r3     // Catch:{ all -> 0x02d4 }
            float r9 = r9 / r0
            double r3 = (double) r9     // Catch:{ all -> 0x02d4 }
            double r3 = java.lang.Math.ceil(r3)     // Catch:{ all -> 0x02d4 }
            int r0 = (int) r3     // Catch:{ all -> 0x02d4 }
            int r3 = r2 / 8
            if (r3 <= 0) goto L_0x0181
            int r1 = r1 / r3
            int r0 = r0 / r3
            goto L_0x0181
        L_0x0167:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ all -> 0x02d4 }
            if (r4 == r3) goto L_0x01a0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ all -> 0x02d4 }
            if (r4 != r3) goto L_0x0170
            goto L_0x01a0
        L_0x0170:
            boolean r3 = r4.isWebp()     // Catch:{ all -> 0x02d4 }
            if (r3 == 0) goto L_0x0184
            float r0 = (float) r2     // Catch:{ all -> 0x02d4 }
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x02d4 }
            float r9 = r9 / r0
            int r0 = java.lang.Math.round(r9)     // Catch:{ all -> 0x02d4 }
        L_0x0181:
            r3 = r43
            goto L_0x01b1
        L_0x0184:
            int r1 = r10 % r2
            if (r1 != 0) goto L_0x0192
            int r1 = r14 % r2
            if (r1 == 0) goto L_0x018d
            goto L_0x0192
        L_0x018d:
            int r1 = r10 / r2
            int r0 = r14 / r2
            goto L_0x0181
        L_0x0192:
            r3 = r43
            int[] r0 = m15194j(r3, r12, r5, r0)     // Catch:{ all -> 0x02d4 }
            r1 = 0
            r4 = r0[r1]     // Catch:{ all -> 0x02d4 }
            r1 = 1
            r0 = r0[r1]     // Catch:{ all -> 0x02d4 }
            r1 = r4
            goto L_0x01b1
        L_0x01a0:
            r3 = r43
            float r0 = (float) r2     // Catch:{ all -> 0x02d4 }
            float r1 = r1 / r0
            double r6 = (double) r1     // Catch:{ all -> 0x02d4 }
            double r6 = java.lang.Math.floor(r6)     // Catch:{ all -> 0x02d4 }
            int r1 = (int) r6     // Catch:{ all -> 0x02d4 }
            float r9 = r9 / r0
            double r6 = (double) r9     // Catch:{ all -> 0x02d4 }
            double r6 = java.lang.Math.floor(r6)     // Catch:{ all -> 0x02d4 }
            int r0 = (int) r6     // Catch:{ all -> 0x02d4 }
        L_0x01b1:
            r7 = r41
            float r4 = r15.mo12332a(r1, r0, r7, r13)     // Catch:{ all -> 0x02d4 }
            double r8 = (double) r4     // Catch:{ all -> 0x02d4 }
            int r4 = m15186b(r8)     // Catch:{ all -> 0x02d4 }
            double r14 = (double) r4
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r8)
            double r14 = r14 * r8
            double r14 = r14 + r38
            int r6 = (int) r14
            float r10 = (float) r6
            float r4 = (float) r4
            float r10 = r10 / r4
            double r14 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r14)
            double r14 = r8 / r14
            double r3 = (double) r6
            java.lang.Double.isNaN(r3)
            double r14 = r14 * r3
            double r14 = r14 + r38
            int r3 = (int) r14
            r12.inTargetDensity = r3     // Catch:{ all -> 0x02d4 }
            int r3 = m15186b(r8)     // Catch:{ all -> 0x02d4 }
            r12.inDensity = r3     // Catch:{ all -> 0x02d4 }
            boolean r3 = m15193i(r12)     // Catch:{ all -> 0x02d4 }
            if (r3 == 0) goto L_0x01ef
            r3 = 1
            r12.inScaled = r3     // Catch:{ all -> 0x02d4 }
            goto L_0x01f4
        L_0x01ef:
            r3 = 0
            r12.inTargetDensity = r3     // Catch:{ all -> 0x02d4 }
            r12.inDensity = r3     // Catch:{ all -> 0x02d4 }
        L_0x01f4:
            r6 = r37
            r3 = 2
            boolean r4 = android.util.Log.isLoggable(r6, r3)     // Catch:{ all -> 0x02d4 }
            if (r4 == 0) goto L_0x0273
            int r3 = r12.inTargetDensity     // Catch:{ all -> 0x02d4 }
            int r4 = r12.inDensity     // Catch:{ all -> 0x02d4 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d4 }
            r14 = r40
            r10.<init>(r14)     // Catch:{ all -> 0x02d4 }
            r14 = r36
            r10.append(r14)     // Catch:{ all -> 0x02d4 }
            r15 = r35
            r10.append(r15)     // Catch:{ all -> 0x02d4 }
            r5 = r34
            r10.append(r5)     // Catch:{ all -> 0x02d4 }
            r34 = r12
            java.lang.String r12 = "], degreesToRotate: "
            r10.append(r12)     // Catch:{ all -> 0x0586 }
            r12 = r33
            r10.append(r12)     // Catch:{ all -> 0x0586 }
            java.lang.String r12 = ", target: ["
            r10.append(r12)     // Catch:{ all -> 0x0586 }
            r10.append(r7)     // Catch:{ all -> 0x0586 }
            r10.append(r15)     // Catch:{ all -> 0x0586 }
            r10.append(r13)     // Catch:{ all -> 0x0586 }
            java.lang.String r12 = "], power of two scaled: ["
            r10.append(r12)     // Catch:{ all -> 0x0586 }
            r10.append(r1)     // Catch:{ all -> 0x0586 }
            r10.append(r15)     // Catch:{ all -> 0x0586 }
            r10.append(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "], exact scale factor: "
            r10.append(r0)     // Catch:{ all -> 0x0586 }
            r10.append(r11)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = ", power of 2 sample size: "
            r10.append(r0)     // Catch:{ all -> 0x0586 }
            r10.append(r2)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = ", adjusted scale factor: "
            r10.append(r0)     // Catch:{ all -> 0x0586 }
            r10.append(r8)     // Catch:{ all -> 0x0586 }
            r1 = r32
            r10.append(r1)     // Catch:{ all -> 0x0586 }
            r10.append(r3)     // Catch:{ all -> 0x0586 }
            r2 = r31
            r10.append(r2)     // Catch:{ all -> 0x0586 }
            r10.append(r4)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0586 }
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0586 }
            r4 = r42
            r3 = r15
            goto L_0x0313
        L_0x0273:
            r2 = r31
            r1 = r32
            r5 = r34
            r14 = r36
            r34 = r12
            r4 = r42
            r3 = r35
            goto L_0x0313
        L_0x0283:
            r34 = r12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)     // Catch:{ all -> 0x0586 }
            throw r0     // Catch:{ all -> 0x0586 }
        L_0x028d:
            r5 = r7
            r14 = r8
            r34 = r12
            r7 = r3
            r3 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0586 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0586 }
            r4 = r30
            r2.<init>(r4)     // Catch:{ all -> 0x0586 }
            r2.append(r11)     // Catch:{ all -> 0x0586 }
            java.lang.String r4 = " from: "
            r2.append(r4)     // Catch:{ all -> 0x0586 }
            r2.append(r1)     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = ", source: ["
            r2.append(r1)     // Catch:{ all -> 0x0586 }
            r2.append(r14)     // Catch:{ all -> 0x0586 }
            r2.append(r3)     // Catch:{ all -> 0x0586 }
            r2.append(r5)     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = "], target: ["
            r2.append(r1)     // Catch:{ all -> 0x0586 }
            r2.append(r7)     // Catch:{ all -> 0x0586 }
            r2.append(r3)     // Catch:{ all -> 0x0586 }
            r2.append(r13)     // Catch:{ all -> 0x0586 }
            r8 = r29
            r2.append(r8)     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0586 }
            r0.<init>(r1)     // Catch:{ all -> 0x0586 }
            throw r0     // Catch:{ all -> 0x0586 }
        L_0x02d4:
            r0 = move-exception
            r4 = r42
            goto L_0x058c
        L_0x02d9:
            r5 = r7
            r14 = r8
            r6 = r9
            r2 = r10
            r34 = r12
            r8 = r29
            r7 = r3
            r3 = r1
            r1 = r11
            r9 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r9)     // Catch:{ all -> 0x0586 }
            if (r0 == 0) goto L_0x0311
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0586 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0586 }
            r9 = r28
            r4.<init>(r9)     // Catch:{ all -> 0x0586 }
            r4.append(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = " with target ["
            r4.append(r0)     // Catch:{ all -> 0x0586 }
            r4.append(r7)     // Catch:{ all -> 0x0586 }
            r4.append(r3)     // Catch:{ all -> 0x0586 }
            r4.append(r13)     // Catch:{ all -> 0x0586 }
            r4.append(r8)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0586 }
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x0586 }
        L_0x0311:
            r4 = r42
        L_0x0313:
            com.bumptech.glide.load.c.a.ae r0 = r4.f17487k     // Catch:{ all -> 0x0584 }
            r9 = r26
            r8 = r27
            boolean r0 = r0.mo12297b(r7, r13, r9, r8)     // Catch:{ all -> 0x0584 }
            if (r0 == 0) goto L_0x0329
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x0584 }
            r8 = r34
            r8.inPreferredConfig = r0     // Catch:{ all -> 0x0580 }
            r0 = 0
            r8.inMutable = r0     // Catch:{ all -> 0x0580 }
            goto L_0x0369
        L_0x0329:
            r8 = r34
            com.bumptech.glide.load.b r0 = com.bumptech.glide.load.C5734b.PREFER_ARGB_8888     // Catch:{ all -> 0x0580 }
            r9 = r25
            if (r9 == r0) goto L_0x0365
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r43.mo12300c()     // Catch:{ IOException -> 0x033e }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x033e }
            if (r0 == 0) goto L_0x0357
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0580 }
            goto L_0x0359
        L_0x033e:
            r0 = move-exception
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r6, r10)     // Catch:{ all -> 0x0580 }
            if (r10 == 0) goto L_0x0357
            java.lang.String r10 = "Cannot determine whether the image has alpha or not from header, format "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0580 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0580 }
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x0580 }
            android.util.Log.d(r6, r9, r0)     // Catch:{ all -> 0x0580 }
        L_0x0357:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0580 }
        L_0x0359:
            r8.inPreferredConfig = r0     // Catch:{ all -> 0x0580 }
            android.graphics.Bitmap$Config r0 = r8.inPreferredConfig     // Catch:{ all -> 0x0580 }
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0580 }
            if (r0 != r9) goto L_0x0369
            r9 = 1
            r8.inDither = r9     // Catch:{ all -> 0x0580 }
            goto L_0x0369
        L_0x0365:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0580 }
            r8.inPreferredConfig = r0     // Catch:{ all -> 0x0580 }
        L_0x0369:
            int r0 = r8.inSampleSize     // Catch:{ all -> 0x0580 }
            if (r14 < 0) goto L_0x0373
            if (r5 < 0) goto L_0x0373
            if (r24 == 0) goto L_0x0373
            goto L_0x03f3
        L_0x0373:
            boolean r0 = m15193i(r8)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0381
            int r0 = r8.inTargetDensity     // Catch:{ all -> 0x0580 }
            float r0 = (float) r0     // Catch:{ all -> 0x0580 }
            int r7 = r8.inDensity     // Catch:{ all -> 0x0580 }
            float r7 = (float) r7     // Catch:{ all -> 0x0580 }
            float r0 = r0 / r7
            goto L_0x0383
        L_0x0381:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0383:
            int r7 = r8.inSampleSize     // Catch:{ all -> 0x0580 }
            float r9 = (float) r14     // Catch:{ all -> 0x0580 }
            float r10 = (float) r7     // Catch:{ all -> 0x0580 }
            float r9 = r9 / r10
            double r11 = (double) r9     // Catch:{ all -> 0x0580 }
            double r11 = java.lang.Math.ceil(r11)     // Catch:{ all -> 0x0580 }
            int r9 = (int) r11     // Catch:{ all -> 0x0580 }
            float r11 = (float) r5     // Catch:{ all -> 0x0580 }
            float r11 = r11 / r10
            double r10 = (double) r11     // Catch:{ all -> 0x0580 }
            double r10 = java.lang.Math.ceil(r10)     // Catch:{ all -> 0x0580 }
            int r10 = (int) r10     // Catch:{ all -> 0x0580 }
            float r9 = (float) r9     // Catch:{ all -> 0x0580 }
            float r9 = r9 * r0
            int r9 = java.lang.Math.round(r9)     // Catch:{ all -> 0x0580 }
            float r10 = (float) r10     // Catch:{ all -> 0x0580 }
            float r10 = r10 * r0
            int r13 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0580 }
            r10 = 2
            boolean r11 = android.util.Log.isLoggable(r6, r10)     // Catch:{ all -> 0x0580 }
            if (r11 == 0) goto L_0x03f2
            int r10 = r8.inTargetDensity     // Catch:{ all -> 0x0580 }
            int r11 = r8.inDensity     // Catch:{ all -> 0x0580 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0580 }
            r15 = r22
            r12.<init>(r15)     // Catch:{ all -> 0x0580 }
            r12.append(r9)     // Catch:{ all -> 0x0580 }
            r12.append(r3)     // Catch:{ all -> 0x0580 }
            r12.append(r13)     // Catch:{ all -> 0x0580 }
            java.lang.String r15 = "] for source ["
            r12.append(r15)     // Catch:{ all -> 0x0580 }
            r12.append(r14)     // Catch:{ all -> 0x0580 }
            r12.append(r3)     // Catch:{ all -> 0x0580 }
            r12.append(r5)     // Catch:{ all -> 0x0580 }
            java.lang.String r15 = "], sampleSize: "
            r12.append(r15)     // Catch:{ all -> 0x0580 }
            r12.append(r7)     // Catch:{ all -> 0x0580 }
            java.lang.String r7 = ", targetDensity: "
            r12.append(r7)     // Catch:{ all -> 0x0580 }
            r12.append(r10)     // Catch:{ all -> 0x0580 }
            r12.append(r2)     // Catch:{ all -> 0x0580 }
            r12.append(r11)     // Catch:{ all -> 0x0580 }
            java.lang.String r7 = ", density multiplier: "
            r12.append(r7)     // Catch:{ all -> 0x0580 }
            r12.append(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0580 }
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0580 }
        L_0x03f2:
            r7 = r9
        L_0x03f3:
            if (r7 <= 0) goto L_0x040c
            if (r13 <= 0) goto L_0x040c
            com.bumptech.glide.load.a.a.d r0 = r4.f17485i     // Catch:{ all -> 0x0580 }
            android.graphics.Bitmap$Config r9 = r8.inPreferredConfig     // Catch:{ all -> 0x0580 }
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x0580 }
            if (r9 != r10) goto L_0x0400
            goto L_0x040c
        L_0x0400:
            android.graphics.Bitmap$Config r9 = r8.outConfig     // Catch:{ all -> 0x0580 }
            if (r9 != 0) goto L_0x0406
            android.graphics.Bitmap$Config r9 = r8.inPreferredConfig     // Catch:{ all -> 0x0580 }
        L_0x0406:
            android.graphics.Bitmap r0 = r0.mo12114b(r7, r13, r9)     // Catch:{ all -> 0x0580 }
            r8.inBitmap = r0     // Catch:{ all -> 0x0580 }
        L_0x040c:
            if (r19 == 0) goto L_0x042b
            com.bumptech.glide.load.t r0 = com.bumptech.glide.load.C5961t.DISPLAY_P3     // Catch:{ all -> 0x0580 }
            r7 = r19
            if (r7 != r0) goto L_0x0423
            android.graphics.ColorSpace r0 = r8.outColorSpace     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0423
            android.graphics.ColorSpace r0 = r8.outColorSpace     // Catch:{ all -> 0x0580 }
            boolean r0 = r0.isWideGamut()     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0423
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3     // Catch:{ all -> 0x0580 }
            goto L_0x0425
        L_0x0423:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB     // Catch:{ all -> 0x0580 }
        L_0x0425:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ all -> 0x0580 }
            r8.inPreferredColorSpace = r0     // Catch:{ all -> 0x0580 }
        L_0x042b:
            com.bumptech.glide.load.a.a.d r0 = r4.f17485i     // Catch:{ all -> 0x0580 }
            r7 = r47
            r9 = r5
            r5 = r43
            android.graphics.Bitmap r0 = m15187c(r5, r8, r7, r0)     // Catch:{ all -> 0x0580 }
            com.bumptech.glide.load.a.a.d r5 = r4.f17485i     // Catch:{ all -> 0x0580 }
            r7.mo12312a(r5, r0)     // Catch:{ all -> 0x0580 }
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x04d1
            java.lang.String r5 = m15189e(r0)     // Catch:{ all -> 0x0580 }
            android.graphics.Bitmap r7 = r8.inBitmap     // Catch:{ all -> 0x0580 }
            java.lang.String r7 = m15189e(r7)     // Catch:{ all -> 0x0580 }
            int r10 = r8.inSampleSize     // Catch:{ all -> 0x0580 }
            int r11 = r8.inDensity     // Catch:{ all -> 0x0580 }
            int r12 = r8.inTargetDensity     // Catch:{ all -> 0x0580 }
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0580 }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x0580 }
            r15 = r12
            r43 = r13
            double r12 = com.bumptech.glide.p291h.C5625l.m14592a(r20)     // Catch:{ all -> 0x0580 }
            r47 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0580 }
            r34 = r8
            r8 = r17
            r15.<init>(r8)     // Catch:{ all -> 0x0584 }
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            java.lang.String r5 = " from ["
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            r15.append(r14)     // Catch:{ all -> 0x0584 }
            r15.append(r3)     // Catch:{ all -> 0x0584 }
            r15.append(r9)     // Catch:{ all -> 0x0584 }
            java.lang.String r5 = "] "
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            r5 = r46
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            java.lang.String r5 = " with inBitmap "
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            r15.append(r7)     // Catch:{ all -> 0x0584 }
            java.lang.String r5 = " for ["
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            r5 = r44
            r15.append(r5)     // Catch:{ all -> 0x0584 }
            r15.append(r3)     // Catch:{ all -> 0x0584 }
            r3 = r45
            r15.append(r3)     // Catch:{ all -> 0x0584 }
            java.lang.String r3 = "], sample size: "
            r15.append(r3)     // Catch:{ all -> 0x0584 }
            r15.append(r10)     // Catch:{ all -> 0x0584 }
            r15.append(r2)     // Catch:{ all -> 0x0584 }
            r15.append(r11)     // Catch:{ all -> 0x0584 }
            r15.append(r1)     // Catch:{ all -> 0x0584 }
            r1 = r47
            r15.append(r1)     // Catch:{ all -> 0x0584 }
            java.lang.String r1 = ", thread: "
            r15.append(r1)     // Catch:{ all -> 0x0584 }
            r1 = r43
            r15.append(r1)     // Catch:{ all -> 0x0584 }
            java.lang.String r1 = ", duration: "
            r15.append(r1)     // Catch:{ all -> 0x0584 }
            r15.append(r12)     // Catch:{ all -> 0x0584 }
            java.lang.String r1 = r15.toString()     // Catch:{ all -> 0x0584 }
            android.util.Log.v(r6, r1)     // Catch:{ all -> 0x0584 }
            goto L_0x04d3
        L_0x04d1:
            r34 = r8
        L_0x04d3:
            if (r0 == 0) goto L_0x056e
            android.util.DisplayMetrics r1 = r4.f17486j     // Catch:{ all -> 0x0584 }
            int r1 = r1.densityDpi     // Catch:{ all -> 0x0584 }
            r0.setDensity(r1)     // Catch:{ all -> 0x0584 }
            com.bumptech.glide.load.a.a.d r1 = r4.f17485i     // Catch:{ all -> 0x0584 }
            boolean r2 = com.bumptech.glide.load.p299c.p300a.C5841at.m15108j(r23)     // Catch:{ all -> 0x0584 }
            if (r2 != 0) goto L_0x04e7
            r1 = r0
            goto L_0x0562
        L_0x04e7:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ all -> 0x0584 }
            r2.<init>()     // Catch:{ all -> 0x0584 }
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r23) {
                case 2: goto L_0x051f;
                case 3: goto L_0x051b;
                case 4: goto L_0x0512;
                case 5: goto L_0x0509;
                case 6: goto L_0x0505;
                case 7: goto L_0x04fc;
                case 8: goto L_0x04f8;
                default: goto L_0x04f7;
            }     // Catch:{ all -> 0x0584 }
        L_0x04f7:
            goto L_0x0524
        L_0x04f8:
            r2.setRotate(r3)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x04fc:
            r2.setRotate(r3)     // Catch:{ all -> 0x0584 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x0505:
            r2.setRotate(r5)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x0509:
            r2.setRotate(r5)     // Catch:{ all -> 0x0584 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x0512:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r6)     // Catch:{ all -> 0x0584 }
            r2.postScale(r7, r3)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x051b:
            r2.setRotate(r6)     // Catch:{ all -> 0x0584 }
            goto L_0x0524
        L_0x051f:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)     // Catch:{ all -> 0x0584 }
        L_0x0524:
            android.graphics.RectF r3 = new android.graphics.RectF     // Catch:{ all -> 0x0584 }
            int r5 = r0.getWidth()     // Catch:{ all -> 0x0584 }
            float r5 = (float) r5     // Catch:{ all -> 0x0584 }
            int r6 = r0.getHeight()     // Catch:{ all -> 0x0584 }
            float r6 = (float) r6     // Catch:{ all -> 0x0584 }
            r7 = 0
            r3.<init>(r7, r7, r5, r6)     // Catch:{ all -> 0x0584 }
            r2.mapRect(r3)     // Catch:{ all -> 0x0584 }
            float r5 = r3.width()     // Catch:{ all -> 0x0584 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x0584 }
            float r6 = r3.height()     // Catch:{ all -> 0x0584 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0584 }
            android.graphics.Bitmap$Config r7 = com.bumptech.glide.load.p299c.p300a.C5841at.m15100b(r0)     // Catch:{ all -> 0x0584 }
            android.graphics.Bitmap r1 = r1.mo12113a(r5, r6, r7)     // Catch:{ all -> 0x0584 }
            float r5 = r3.left     // Catch:{ all -> 0x0584 }
            float r5 = -r5
            float r3 = r3.top     // Catch:{ all -> 0x0584 }
            float r3 = -r3
            r2.postTranslate(r5, r3)     // Catch:{ all -> 0x0584 }
            boolean r3 = r0.hasAlpha()     // Catch:{ all -> 0x0584 }
            r1.setHasAlpha(r3)     // Catch:{ all -> 0x0584 }
            com.bumptech.glide.load.p299c.p300a.C5841at.m15106h(r0, r1, r2)     // Catch:{ all -> 0x0584 }
        L_0x0562:
            boolean r2 = r0.equals(r1)     // Catch:{ all -> 0x0584 }
            if (r2 != 0) goto L_0x056f
            com.bumptech.glide.load.a.a.d r2 = r4.f17485i     // Catch:{ all -> 0x0584 }
            r2.mo12116d(r0)     // Catch:{ all -> 0x0584 }
            goto L_0x056f
        L_0x056e:
            r1 = 0
        L_0x056f:
            com.bumptech.glide.load.a.a.d r0 = r4.f17485i     // Catch:{ all -> 0x0584 }
            com.bumptech.glide.load.c.a.e r0 = com.bumptech.glide.load.p299c.p300a.C5856e.m15133f(r1, r0)     // Catch:{ all -> 0x0584 }
            m15190f(r34)
            com.bumptech.glide.load.a.a.b r1 = r4.f17483f
            r11 = r16
            r1.mo12107c(r11)
            return r0
        L_0x0580:
            r0 = move-exception
            r34 = r8
            goto L_0x058e
        L_0x0584:
            r0 = move-exception
            goto L_0x058e
        L_0x0586:
            r0 = move-exception
            r4 = r42
            goto L_0x058e
        L_0x058a:
            r0 = move-exception
            r4 = r1
        L_0x058c:
            r34 = r12
        L_0x058e:
            r11 = r16
            m15190f(r34)
            com.bumptech.glide.load.a.a.b r1 = r4.f17483f
            r1.mo12107c(r11)
            goto L_0x059a
        L_0x0599:
            throw r0
        L_0x059a:
            goto L_0x0599
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5876y.mo12334a(com.bumptech.glide.load.c.a.ai, int, int, com.bumptech.glide.load.s, com.bumptech.glide.load.c.a.x):com.bumptech.glide.load.a.av");
    }
}

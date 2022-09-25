package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5630q;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.c.a.q */
/* compiled from: PG */
public final class C5868q implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f17468a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f17469b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f6, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f8, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + 274);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0211, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + r5 + " tagType=" + 274);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0232, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0234, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Got invalid format code = " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0248, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r2 = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(r0).order(java.nio.ByteOrder.BIG_ENDIAN).limit(r2);
        r4 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        if (r4 == 18761) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011c, code lost:
        if (r4 == 19789) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0122, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Unknown endianness = " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0138, code lost:
        r4 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013b, code lost:
        r4 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013e, code lost:
        r4 = java.nio.ByteOrder.LITTLE_ENDIAN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0140, code lost:
        r2.order(r4);
        r4 = com.bumptech.glide.load.p299c.p300a.C5864m.m15155a(10, r2) + 6;
        r3 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r14 >= r3) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        r5 = (r4 + 2) + (r14 * 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        if (com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r5, r2) == 274) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015f, code lost:
        r6 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r5 + 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0165, code lost:
        if (r6 <= 0) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0169, code lost:
        if (r6 <= 12) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016d, code lost:
        r10 = com.bumptech.glide.load.p299c.p300a.C5864m.m15155a(r5 + 4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r10 >= 0) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0179, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017b, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Negative tiff component count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0188, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Got tagIndex=" + r14 + " tagType=" + 274 + " formatCode=" + r6 + " componentCount=" + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b4, code lost:
        r10 = r10 + f17469b[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        if (r10 <= 4) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c0, code lost:
        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        android.util.Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d8, code lost:
        r5 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
        if (r5 < 0) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e0, code lost:
        if (r5 <= r2.remaining()) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e3, code lost:
        if (r10 < 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ea, code lost:
        if ((r10 + r5) <= r2.remaining()) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ed, code lost:
        r14 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r5, r2);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m15166e(com.bumptech.glide.load.p299c.p300a.C5866o r14, com.bumptech.glide.load.p293a.p294a.C5640b r15) {
        /*
            java.lang.String r0 = "Parser doesn't handle magic number: "
            r1 = -1
            int r2 = r14.mo12328a()     // Catch:{ n -> 0x0262 }
            r3 = 65496(0xffd8, float:9.178E-41)
            r4 = r2 & r3
            r5 = 18761(0x4949, float:2.629E-41)
            r6 = 19789(0x4d4d, float:2.773E-41)
            r7 = 3
            java.lang.String r8 = "DfltImageHeaderParser"
            if (r4 == r3) goto L_0x0030
            if (r2 == r6) goto L_0x0030
            if (r2 != r5) goto L_0x001a
            goto L_0x0030
        L_0x001a:
            boolean r14 = android.util.Log.isLoggable(r8, r7)     // Catch:{ n -> 0x0262 }
            if (r14 == 0) goto L_0x002f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ n -> 0x0262 }
            r14.<init>(r0)     // Catch:{ n -> 0x0262 }
            r14.append(r2)     // Catch:{ n -> 0x0262 }
            java.lang.String r14 = r14.toString()     // Catch:{ n -> 0x0262 }
            android.util.Log.d(r8, r14)     // Catch:{ n -> 0x0262 }
        L_0x002f:
            return r1
        L_0x0030:
            short r0 = r14.mo12331d()     // Catch:{ n -> 0x0262 }
            r2 = 255(0xff, float:3.57E-43)
            if (r0 == r2) goto L_0x0053
            boolean r2 = android.util.Log.isLoggable(r8, r7)     // Catch:{ n -> 0x0262 }
            if (r2 == 0) goto L_0x005b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ n -> 0x0262 }
            r2.<init>()     // Catch:{ n -> 0x0262 }
            java.lang.String r3 = "Unknown segmentId="
            r2.append(r3)     // Catch:{ n -> 0x0262 }
            r2.append(r0)     // Catch:{ n -> 0x0262 }
            java.lang.String r0 = r2.toString()     // Catch:{ n -> 0x0262 }
            android.util.Log.d(r8, r0)     // Catch:{ n -> 0x0262 }
            goto L_0x005b
        L_0x0053:
            short r0 = r14.mo12331d()     // Catch:{ n -> 0x0262 }
            r2 = 218(0xda, float:3.05E-43)
            if (r0 != r2) goto L_0x005d
        L_0x005b:
            r2 = -1
            goto L_0x00ab
        L_0x005d:
            r2 = 217(0xd9, float:3.04E-43)
            if (r0 != r2) goto L_0x006d
            boolean r0 = android.util.Log.isLoggable(r8, r7)     // Catch:{ n -> 0x0262 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r8, r0)     // Catch:{ n -> 0x0262 }
            goto L_0x005b
        L_0x006d:
            int r2 = r14.mo12328a()     // Catch:{ n -> 0x0262 }
            int r2 = r2 + -2
            r3 = 225(0xe1, float:3.15E-43)
            if (r0 == r3) goto L_0x00ab
            long r3 = (long) r2     // Catch:{ n -> 0x0262 }
            long r9 = r14.mo12330c(r3)     // Catch:{ n -> 0x0262 }
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0030
            boolean r3 = android.util.Log.isLoggable(r8, r7)     // Catch:{ n -> 0x0262 }
            if (r3 == 0) goto L_0x005b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ n -> 0x0262 }
            r3.<init>()     // Catch:{ n -> 0x0262 }
            java.lang.String r4 = "Unable to skip enough data, type: "
            r3.append(r4)     // Catch:{ n -> 0x0262 }
            r3.append(r0)     // Catch:{ n -> 0x0262 }
            java.lang.String r0 = ", wanted to skip: "
            r3.append(r0)     // Catch:{ n -> 0x0262 }
            r3.append(r2)     // Catch:{ n -> 0x0262 }
            java.lang.String r0 = ", but actually skipped: "
            r3.append(r0)     // Catch:{ n -> 0x0262 }
            r3.append(r9)     // Catch:{ n -> 0x0262 }
            java.lang.String r0 = r3.toString()     // Catch:{ n -> 0x0262 }
            android.util.Log.d(r8, r0)     // Catch:{ n -> 0x0262 }
            goto L_0x005b
        L_0x00ab:
            if (r2 != r1) goto L_0x00b9
            boolean r14 = android.util.Log.isLoggable(r8, r7)     // Catch:{ n -> 0x0262 }
            if (r14 == 0) goto L_0x00b8
            java.lang.String r14 = "Failed to parse exif segment length, or exif segment not found"
            android.util.Log.d(r8, r14)     // Catch:{ n -> 0x0262 }
        L_0x00b8:
            return r1
        L_0x00b9:
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Object r0 = r15.mo12105a(r2, r0)     // Catch:{ n -> 0x0262 }
            byte[] r0 = (byte[]) r0     // Catch:{ n -> 0x0262 }
            int r14 = r14.mo12329b(r0, r2)     // Catch:{ all -> 0x025d }
            if (r14 == r2) goto L_0x00ec
            boolean r3 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r3 == 0) goto L_0x00e9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r3.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r4 = "Unable to read exif segment data, length: "
            r3.append(r4)     // Catch:{ all -> 0x025d }
            r3.append(r2)     // Catch:{ all -> 0x025d }
            java.lang.String r2 = ", actually read: "
            r3.append(r2)     // Catch:{ all -> 0x025d }
            r3.append(r14)     // Catch:{ all -> 0x025d }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r14)     // Catch:{ all -> 0x025d }
        L_0x00e9:
            r14 = -1
            goto L_0x0259
        L_0x00ec:
            if (r0 == 0) goto L_0x024c
            byte[] r14 = f17468a     // Catch:{ all -> 0x025d }
            int r14 = r14.length     // Catch:{ all -> 0x025d }
            if (r2 <= r14) goto L_0x024c
            r14 = 0
            r3 = 0
        L_0x00f5:
            byte[] r4 = f17468a     // Catch:{ all -> 0x025d }
            int r9 = r4.length     // Catch:{ all -> 0x025d }
            if (r3 >= r9) goto L_0x0105
            byte r9 = r0[r3]     // Catch:{ all -> 0x025d }
            byte r4 = r4[r3]     // Catch:{ all -> 0x025d }
            if (r9 == r4) goto L_0x0102
            goto L_0x024c
        L_0x0102:
            int r3 = r3 + 1
            goto L_0x00f5
        L_0x0105:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x025d }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x025d }
            java.nio.ByteBuffer r3 = r3.order(r4)     // Catch:{ all -> 0x025d }
            java.nio.Buffer r2 = r3.limit(r2)     // Catch:{ all -> 0x025d }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x025d }
            r3 = 6
            short r4 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r3, r2)     // Catch:{ all -> 0x025d }
            if (r4 == r5) goto L_0x013e
            if (r4 == r6) goto L_0x013b
            boolean r5 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r5 == 0) goto L_0x0138
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r5.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r6 = "Unknown endianness = "
            r5.append(r6)     // Catch:{ all -> 0x025d }
            r5.append(r4)     // Catch:{ all -> 0x025d }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r4)     // Catch:{ all -> 0x025d }
        L_0x0138:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x025d }
            goto L_0x0140
        L_0x013b:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x025d }
            goto L_0x0140
        L_0x013e:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x025d }
        L_0x0140:
            r2.order(r4)     // Catch:{ all -> 0x025d }
            r4 = 10
            int r4 = com.bumptech.glide.load.p299c.p300a.C5864m.m15155a(r4, r2)     // Catch:{ all -> 0x025d }
            int r4 = r4 + r3
            short r3 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r4, r2)     // Catch:{ all -> 0x025d }
        L_0x014e:
            if (r14 >= r3) goto L_0x00e9
            int r5 = r4 + 2
            int r6 = r14 * 12
            int r5 = r5 + r6
            short r6 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r5, r2)     // Catch:{ all -> 0x025d }
            r9 = 274(0x112, float:3.84E-43)
            if (r6 == r9) goto L_0x015f
            goto L_0x0248
        L_0x015f:
            int r6 = r5 + 2
            short r6 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r6, r2)     // Catch:{ all -> 0x025d }
            if (r6 <= 0) goto L_0x022e
            r10 = 12
            if (r6 <= r10) goto L_0x016d
            goto L_0x022e
        L_0x016d:
            int r10 = r5 + 4
            int r10 = com.bumptech.glide.load.p299c.p300a.C5864m.m15155a(r10, r2)     // Catch:{ all -> 0x025d }
            if (r10 >= 0) goto L_0x0182
            boolean r5 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r5 == 0) goto L_0x0248
            java.lang.String r5 = "Negative tiff component count"
            android.util.Log.d(r8, r5)     // Catch:{ all -> 0x025d }
            goto L_0x0248
        L_0x0182:
            boolean r11 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            java.lang.String r12 = " tagType="
            if (r11 == 0) goto L_0x01b4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r11.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r13 = "Got tagIndex="
            r11.append(r13)     // Catch:{ all -> 0x025d }
            r11.append(r14)     // Catch:{ all -> 0x025d }
            r11.append(r12)     // Catch:{ all -> 0x025d }
            r11.append(r9)     // Catch:{ all -> 0x025d }
            java.lang.String r13 = " formatCode="
            r11.append(r13)     // Catch:{ all -> 0x025d }
            r11.append(r6)     // Catch:{ all -> 0x025d }
            java.lang.String r13 = " componentCount="
            r11.append(r13)     // Catch:{ all -> 0x025d }
            r11.append(r10)     // Catch:{ all -> 0x025d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r11)     // Catch:{ all -> 0x025d }
        L_0x01b4:
            int[] r11 = f17469b     // Catch:{ all -> 0x025d }
            r11 = r11[r6]     // Catch:{ all -> 0x025d }
            int r10 = r10 + r11
            r11 = 4
            if (r10 <= r11) goto L_0x01d8
            boolean r5 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r5 == 0) goto L_0x0248
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r5.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r9 = "Got byte count > 4, not orientation, continuing, formatCode="
            r5.append(r9)     // Catch:{ all -> 0x025d }
            r5.append(r6)     // Catch:{ all -> 0x025d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r5)     // Catch:{ all -> 0x025d }
            goto L_0x0248
        L_0x01d8:
            int r5 = r5 + 8
            if (r5 < 0) goto L_0x020d
            int r6 = r2.remaining()     // Catch:{ all -> 0x025d }
            if (r5 <= r6) goto L_0x01e3
            goto L_0x020d
        L_0x01e3:
            if (r10 < 0) goto L_0x01f2
            int r10 = r10 + r5
            int r6 = r2.remaining()     // Catch:{ all -> 0x025d }
            if (r10 <= r6) goto L_0x01ed
            goto L_0x01f2
        L_0x01ed:
            short r14 = com.bumptech.glide.load.p299c.p300a.C5864m.m15156b(r5, r2)     // Catch:{ all -> 0x025d }
            goto L_0x0259
        L_0x01f2:
            boolean r5 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r5 == 0) goto L_0x0248
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r5.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r6 = "Illegal number of bytes for TI tag data tagType="
            r5.append(r6)     // Catch:{ all -> 0x025d }
            r5.append(r9)     // Catch:{ all -> 0x025d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r5)     // Catch:{ all -> 0x025d }
            goto L_0x0248
        L_0x020d:
            boolean r6 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r6 == 0) goto L_0x0248
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r6.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r10 = "Illegal tagValueOffset="
            r6.append(r10)     // Catch:{ all -> 0x025d }
            r6.append(r5)     // Catch:{ all -> 0x025d }
            r6.append(r12)     // Catch:{ all -> 0x025d }
            r6.append(r9)     // Catch:{ all -> 0x025d }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r5)     // Catch:{ all -> 0x025d }
            goto L_0x0248
        L_0x022e:
            boolean r5 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r5 == 0) goto L_0x0248
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025d }
            r5.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r9 = "Got invalid format code = "
            r5.append(r9)     // Catch:{ all -> 0x025d }
            r5.append(r6)     // Catch:{ all -> 0x025d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025d }
            android.util.Log.d(r8, r5)     // Catch:{ all -> 0x025d }
        L_0x0248:
            int r14 = r14 + 1
            goto L_0x014e
        L_0x024c:
            boolean r14 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x025d }
            if (r14 == 0) goto L_0x00e9
            java.lang.String r14 = "Missing jpeg exif preamble"
            android.util.Log.d(r8, r14)     // Catch:{ all -> 0x025d }
            goto L_0x00e9
        L_0x0259:
            r15.mo12107c(r0)     // Catch:{ n -> 0x0262 }
            return r14
        L_0x025d:
            r14 = move-exception
            r15.mo12107c(r0)     // Catch:{ n -> 0x0262 }
            throw r14     // Catch:{ n -> 0x0262 }
        L_0x0262:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5868q.m15166e(com.bumptech.glide.load.c.a.o, com.bumptech.glide.load.a.a.b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.bumptech.glide.load.ImageHeaderParser.ImageType m15167f(com.bumptech.glide.load.p299c.p300a.C5866o r6) {
        /*
            int r0 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo12331d()     // Catch:{ n -> 0x00f4 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo12331d()     // Catch:{ n -> 0x00f4 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.mo12330c(r0)     // Catch:{ n -> 0x00f4 }
            short r6 = r6.mo12331d()     // Catch:{ n -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ n -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ n -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0093
            int r1 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            int r1 = r1 << 16
            int r4 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r4) goto L_0x0054
            goto L_0x008d
        L_0x0054:
            int r1 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            int r1 = r1 << 16
            int r4 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r1 = r1 | r4
            r4 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r4) goto L_0x0090
            r5 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r5) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            r6.mo12330c(r2)     // Catch:{ n -> 0x00f4 }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 != 0) goto L_0x008d
            r1 = 0
        L_0x0074:
            r2 = 5
            if (r1 >= r2) goto L_0x008d
            if (r0 <= 0) goto L_0x008d
            int r2 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            int r2 = r2 << 16
            int r3 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r2 = r2 | r3
            if (r2 == r4) goto L_0x0090
            if (r2 == r5) goto L_0x0090
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0074
        L_0x008d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ n -> 0x00f4 }
            goto L_0x0092
        L_0x0090:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ n -> 0x00f4 }
        L_0x0092:
            return r6
        L_0x0093:
            r6.mo12330c(r2)     // Catch:{ n -> 0x00f4 }
            int r0 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            int r0 = r0 << 16
            int r1 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00a9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00a9:
            int r0 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            int r0 = r0 << 16
            int r1 = r6.mo12328a()     // Catch:{ n -> 0x00f4 }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00be
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00be:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00dc
            r6.mo12330c(r2)     // Catch:{ n -> 0x00f4 }
            short r6 = r6.mo12331d()     // Catch:{ n -> 0x00f4 }
            r0 = r6 & 2
            if (r0 == 0) goto L_0x00d2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00d2:
            r6 = r6 & 16
            if (r6 == 0) goto L_0x00d9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00d9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00dc:
            r1 = 76
            if (r0 != r1) goto L_0x00f1
            r6.mo12330c(r2)     // Catch:{ n -> 0x00f4 }
            short r6 = r6.mo12331d()     // Catch:{ n -> 0x00f4 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00ee
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ n -> 0x00f4 }
            goto L_0x00f0
        L_0x00ee:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ n -> 0x00f4 }
        L_0x00f0:
            return r6
        L_0x00f1:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ n -> 0x00f4 }
            return r6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p299c.p300a.C5868q.m15167f(com.bumptech.glide.load.c.a.o):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: a */
    public final int mo12094a(InputStream inputStream, C5640b bVar) {
        C5867p pVar = new C5867p(inputStream);
        C5630q.m14607d(bVar, "Argument must not be null");
        return m15166e(pVar, bVar);
    }

    /* renamed from: b */
    public final int mo12095b(ByteBuffer byteBuffer, C5640b bVar) {
        return m15166e(new C5863l(byteBuffer), bVar);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo12096c(InputStream inputStream) {
        return m15167f(new C5867p(inputStream));
    }

    /* renamed from: d */
    public final ImageHeaderParser.ImageType mo12097d(ByteBuffer byteBuffer) {
        return m15167f(new C5863l(byteBuffer));
    }
}

package androidx.media3.extractor.p163j.p171h;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: androidx.media3.extractor.j.h.j */
/* compiled from: PG */
final class C3520j {

    /* renamed from: a */
    public long f11002a = 0;

    /* renamed from: b */
    public long f11003b = 0;

    /* renamed from: c */
    public CharSequence f11004c;

    /* renamed from: d */
    public int f11005d = 2;

    /* renamed from: e */
    public float f11006e = -3.4028235E38f;

    /* renamed from: f */
    public int f11007f = 1;

    /* renamed from: g */
    public int f11008g = 0;

    /* renamed from: h */
    public float f11009h = -3.4028235E38f;

    /* renamed from: i */
    public int f11010i = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: j */
    public float f11011j = 1.0f;

    /* renamed from: k */
    public int f11012k = LinearLayoutManager.INVALID_OFFSET;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r4 == 0) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.p135a.C2566b mo7451a() {
        /*
            r13 = this;
            float r0 = r13.f11009h
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x001d
            int r0 = r13.f11005d
            if (r0 == r4) goto L_0x001c
            if (r0 == r3) goto L_0x0019
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x001d
        L_0x0019:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            int r7 = r13.f11010i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L_0x0027
            goto L_0x0036
        L_0x0027:
            int r7 = r13.f11005d
            if (r7 == r11) goto L_0x0035
            if (r7 == r9) goto L_0x0033
            if (r7 == r4) goto L_0x0035
            if (r7 == r3) goto L_0x0033
            r7 = 1
            goto L_0x0036
        L_0x0033:
            r7 = 2
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            androidx.media3.common.a.b r8 = new androidx.media3.common.a.b
            r8.<init>()
            int r12 = r13.f11005d
            if (r12 == r11) goto L_0x0062
            if (r12 == r10) goto L_0x005f
            if (r12 == r9) goto L_0x005c
            if (r12 == r4) goto L_0x0062
            if (r12 == r3) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown textAlignment: "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r4 = "WebvttCueParser"
            java.lang.String r3 = r3.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r4, r3)
            r3 = 0
            goto L_0x0064
        L_0x005c:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0064
        L_0x005f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0064
        L_0x0062:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0064:
            r8.f7067c = r3
            float r3 = r13.f11006e
            int r4 = r13.f11007f
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0079
            if (r4 != 0) goto L_0x0079
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x007f
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0082
            if (r4 != 0) goto L_0x0083
        L_0x007f:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0083
        L_0x0082:
            r6 = r3
        L_0x0083:
            r8.f7069e = r6
            r8.f7070f = r4
            int r2 = r13.f11008g
            r8.f7071g = r2
            r8.f7072h = r0
            r8.f7073i = r7
            float r2 = r13.f11011j
            if (r7 == 0) goto L_0x00ac
            if (r7 == r11) goto L_0x00a2
            if (r7 != r10) goto L_0x0098
            goto L_0x00ae
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L_0x00a2:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00a8
            float r0 = r0 + r0
            goto L_0x00ae
        L_0x00a8:
            float r5 = r5 - r0
            float r0 = r5 + r5
            goto L_0x00ae
        L_0x00ac:
            float r0 = r5 - r0
        L_0x00ae:
            float r0 = java.lang.Math.min(r2, r0)
            r8.f7076l = r0
            int r0 = r13.f11012k
            r8.f7079o = r0
            java.lang.CharSequence r0 = r13.f11004c
            if (r0 == 0) goto L_0x00be
            r8.f7065a = r0
        L_0x00be:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3520j.mo7451a():androidx.media3.common.a.b");
    }
}

package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qh */
/* compiled from: PG */
public final class C7225qh extends Exception {

    /* renamed from: a */
    public final String f23584a;

    /* renamed from: b */
    public final boolean f23585b;

    /* renamed from: c */
    public final C7224qg f23586c;

    /* renamed from: d */
    public final String f23587d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7225qh(com.google.ads.interactivemedia.p367v3.internal.C6864cy r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r11.f21812l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = 75
            r14.<init>(r0)
            java.lang.String r0 = "com.google.ads.interactivemedia.v3.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r14.append(r0)
            r14.append(r11)
            r8 = 0
            java.lang.String r9 = r14.toString()
            r3 = r10
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7225qh.<init>(com.google.ads.interactivemedia.v3.internal.cy, java.lang.Throwable, boolean, int):void");
    }

    /* renamed from: a */
    static /* synthetic */ C7225qh m21570a(C7225qh qhVar, C7225qh qhVar2) {
        return new C7225qh(qhVar.getMessage(), qhVar.getCause(), qhVar.f23584a, qhVar.f23585b, qhVar.f23586c, qhVar.f23587d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7225qh(com.google.ads.interactivemedia.p367v3.internal.C6864cy r8, java.lang.Throwable r9, boolean r10, com.google.ads.interactivemedia.p367v3.internal.C7224qg r11) {
        /*
            r7 = this;
            java.lang.String r0 = r11.f23577a
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r3 = r0.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r8.f21812l
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r4 = 21
            r6 = 0
            if (r0 < r4) goto L_0x0043
            boolean r0 = r9 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0043
            r0 = r9
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
        L_0x0043:
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7225qh.<init>(com.google.ads.interactivemedia.v3.internal.cy, java.lang.Throwable, boolean, com.google.ads.interactivemedia.v3.internal.qg):void");
    }

    private C7225qh(String str, Throwable th, String str2, boolean z, C7224qg qgVar, String str3) {
        super(str, th);
        this.f23584a = str2;
        this.f23585b = z;
        this.f23586c = qgVar;
        this.f23587d = str3;
    }
}

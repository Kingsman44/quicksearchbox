package com.google.android.libraries.lens.view.p2085ax;

/* renamed from: com.google.android.libraries.lens.view.ax.d */
/* compiled from: PG */
final class C25602d extends C25616r {

    /* renamed from: a */
    public final String f69652a;

    /* renamed from: b */
    public final int f69653b;

    /* renamed from: c */
    public final int f69654c;

    public C25602d(int i, int i2, String str) {
        this.f69653b = i;
        this.f69654c = i2;
        this.f69652a = str;
    }

    /* renamed from: a */
    public final C25615q mo30703a() {
        return new C25601c(this);
    }

    /* renamed from: b */
    public final String mo30704b() {
        return this.f69652a;
    }

    /* renamed from: c */
    public final int mo30705c() {
        return this.f69654c;
    }

    /* renamed from: d */
    public final int mo30706d() {
        return this.f69653b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f69652a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.p2085ax.C25616r
            r2 = 0
            if (r1 == 0) goto L_0x0032
            com.google.android.libraries.lens.view.ax.r r5 = (com.google.android.libraries.lens.view.p2085ax.C25616r) r5
            int r1 = r4.f69653b
            int r3 = r5.mo30706d()
            if (r1 != r3) goto L_0x0032
            int r1 = r4.f69654c
            int r3 = r5.mo30705c()
            if (r1 != r3) goto L_0x0032
            java.lang.String r1 = r4.f69652a
            if (r1 != 0) goto L_0x0026
            java.lang.String r5 = r5.mo30704b()
            if (r5 != 0) goto L_0x0032
            goto L_0x0031
        L_0x0026:
            java.lang.String r5 = r5.mo30704b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return r0
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2085ax.C25602d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (((this.f69653b ^ 1000003) * 1000003) ^ this.f69654c) * 1000003;
        String str = this.f69652a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f69653b;
        String str = i != 1 ? i != 2 ? "PAUSED" : "PLAYING" : "STOPPED";
        int i2 = this.f69654c;
        String str2 = i2 != 1 ? i2 != 2 ? "SPEAKR_REQUEST_FAILED" : "LANGUAGE_NOT_SUPPORTED" : "NONE";
        String str3 = this.f69652a;
        return "TextToSpeechState{playbackState=" + str + ", errorState=" + str2 + ", chipId=" + str3 + "}";
    }
}

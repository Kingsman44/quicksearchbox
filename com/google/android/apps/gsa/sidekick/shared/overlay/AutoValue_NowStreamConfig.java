package com.google.android.apps.gsa.sidekick.shared.overlay;

import com.google.p375ai.p378b.C8142xb;

/* compiled from: PG */
final class AutoValue_NowStreamConfig extends NowStreamConfig {

    /* renamed from: a */
    private final C8142xb f256213a;

    /* renamed from: b */
    private final boolean f256214b;

    /* renamed from: c */
    private final boolean f256215c;

    /* renamed from: d */
    private final boolean f256216d;

    /* renamed from: e */
    private final String f256217e;

    /* renamed from: f */
    private final boolean f256218f;

    public AutoValue_NowStreamConfig(C8142xb xbVar, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        this.f256213a = xbVar;
        this.f256214b = z;
        this.f256215c = z2;
        this.f256216d = z3;
        this.f256217e = str;
        this.f256218f = z4;
    }

    /* renamed from: a */
    public final C8142xb mo86455a() {
        return this.f256213a;
    }

    /* renamed from: b */
    public final String mo86456b() {
        return this.f256217e;
    }

    /* renamed from: c */
    public final boolean mo86457c() {
        return this.f256218f;
    }

    /* renamed from: d */
    public final boolean mo86458d() {
        return this.f256214b;
    }

    /* renamed from: e */
    public final boolean mo86459e() {
        return this.f256216d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1 = r4.f256217e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig
            r2 = 0
            if (r1 == 0) goto L_0x004e
            com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig r5 = (com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig) r5
            com.google.ai.b.xb r1 = r4.f256213a
            com.google.ai.b.xb r3 = r5.mo86455a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004e
            boolean r1 = r4.f256214b
            boolean r3 = r5.mo86458d()
            if (r1 != r3) goto L_0x004e
            boolean r1 = r4.f256215c
            boolean r3 = r5.mo86461f()
            if (r1 != r3) goto L_0x004e
            boolean r1 = r4.f256216d
            boolean r3 = r5.mo86459e()
            if (r1 != r3) goto L_0x004e
            java.lang.String r1 = r4.f256217e
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.mo86456b()
            if (r1 != 0) goto L_0x004e
            goto L_0x0045
        L_0x003a:
            java.lang.String r3 = r5.mo86456b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            boolean r1 = r4.f256218f
            boolean r5 = r5.mo86457c()
            if (r1 != r5) goto L_0x004e
            return r0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.overlay.AutoValue_NowStreamConfig.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo86461f() {
        return this.f256215c;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((this.f256213a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f256214b ? 1237 : 1231)) * 1000003) ^ (true != this.f256215c ? 1237 : 1231)) * 1000003) ^ (true != this.f256216d ? 1237 : 1231)) * 1000003;
        String str = this.f256217e;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.f256218f) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String num = Integer.toString(this.f256213a.f28649u);
        boolean z = this.f256214b;
        boolean z2 = this.f256215c;
        boolean z3 = this.f256216d;
        String str = this.f256217e;
        boolean z4 = this.f256218f;
        return "NowStreamConfig{surfaceType=" + num + ", supportMultiWindowMode=" + z + ", useMomoUi=" + z2 + ", useAssistHqUi=" + z3 + ", helpAndFeedbackProductDataFlag=" + str + ", horizontalScrollLocking=" + z4 + "}";
    }
}

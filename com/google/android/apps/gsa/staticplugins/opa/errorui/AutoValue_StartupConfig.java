package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;

/* compiled from: PG */
final class AutoValue_StartupConfig extends StartupConfig {

    /* renamed from: a */
    public final int f302565a;

    /* renamed from: b */
    public final boolean f302566b;

    /* renamed from: c */
    public final Bundle f302567c;

    /* renamed from: d */
    public final boolean f302568d;

    /* renamed from: e */
    public final boolean f302569e;

    /* renamed from: f */
    public final int f302570f;

    /* renamed from: g */
    public final boolean f302571g;

    /* renamed from: h */
    public final boolean f302572h;

    public AutoValue_StartupConfig(int i, boolean z, Bundle bundle, boolean z2, boolean z3, int i2, boolean z4, boolean z5) {
        this.f302565a = i;
        this.f302566b = z;
        this.f302567c = bundle;
        this.f302568d = z2;
        this.f302569e = z3;
        this.f302570f = i2;
        this.f302571g = z4;
        this.f302572h = z5;
    }

    /* renamed from: a */
    public final int mo97182a() {
        return this.f302565a;
    }

    /* renamed from: b */
    public final int mo97183b() {
        return this.f302570f;
    }

    /* renamed from: c */
    public final Bundle mo97184c() {
        return this.f302567c;
    }

    /* renamed from: e */
    public final C108940ep mo97185e() {
        return new C108995p(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f302567c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig
            r2 = 0
            if (r1 == 0) goto L_0x005a
            com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig r5 = (com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig) r5
            int r1 = r4.f302565a
            int r3 = r5.mo97182a()
            if (r1 != r3) goto L_0x005a
            boolean r1 = r4.f302566b
            boolean r3 = r5.mo97189h()
            if (r1 != r3) goto L_0x005a
            android.os.Bundle r1 = r4.f302567c
            if (r1 != 0) goto L_0x0026
            android.os.Bundle r1 = r5.mo97184c()
            if (r1 != 0) goto L_0x005a
            goto L_0x0031
        L_0x0026:
            android.os.Bundle r3 = r5.mo97184c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0031
            goto L_0x005a
        L_0x0031:
            boolean r1 = r4.f302568d
            boolean r3 = r5.mo97191i()
            if (r1 != r3) goto L_0x005a
            boolean r1 = r4.f302569e
            boolean r3 = r5.mo97192j()
            if (r1 != r3) goto L_0x005a
            int r1 = r4.f302570f
            int r3 = r5.mo97183b()
            if (r1 != r3) goto L_0x005a
            boolean r1 = r4.f302571g
            boolean r3 = r5.mo97188g()
            if (r1 != r3) goto L_0x005a
            boolean r1 = r4.f302572h
            boolean r5 = r5.mo97187f()
            if (r1 != r5) goto L_0x005a
            return r0
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.errorui.AutoValue_StartupConfig.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo97187f() {
        return this.f302572h;
    }

    /* renamed from: g */
    public final boolean mo97188g() {
        return this.f302571g;
    }

    /* renamed from: h */
    public final boolean mo97189h() {
        return this.f302566b;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((this.f302565a ^ 1000003) * 1000003) ^ (true != this.f302566b ? 1237 : 1231)) * 1000003;
        Bundle bundle = this.f302567c;
        int hashCode = (((((((((i2 ^ (bundle == null ? 0 : bundle.hashCode())) * 1000003) ^ (true != this.f302568d ? 1237 : 1231)) * 1000003) ^ (true != this.f302569e ? 1237 : 1231)) * 1000003) ^ this.f302570f) * 1000003) ^ (true != this.f302571g ? 1237 : 1231)) * 1000003;
        if (true == this.f302572h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo97191i() {
        return this.f302568d;
    }

    /* renamed from: j */
    public final boolean mo97192j() {
        return this.f302569e;
    }

    public final String toString() {
        int i = this.f302565a;
        boolean z = this.f302566b;
        String valueOf = String.valueOf(this.f302567c);
        boolean z2 = this.f302568d;
        boolean z3 = this.f302569e;
        int i2 = this.f302570f;
        boolean z4 = this.f302571g;
        boolean z5 = this.f302572h;
        return "StartupConfig{triggeredBy=" + i + ", hasPromptedForHotwordTraining=" + z + ", relaunchBundle=" + valueOf + ", supportSignedOutMode=" + z2 + ", supportTryBeforeYouBuy=" + z3 + ", valuePropId=" + i2 + ", forceRunOnboarding=" + z4 + ", forceCheckUdc=" + z5 + "}";
    }
}

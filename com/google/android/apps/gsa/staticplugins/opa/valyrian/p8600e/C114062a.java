package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.e.a */
/* compiled from: PG */
public final class C114062a extends C114063b {

    /* renamed from: a */
    private final boolean f315767a;

    /* renamed from: b */
    private final boolean f315768b;

    /* renamed from: c */
    private final boolean f315769c;

    /* renamed from: d */
    private final boolean f315770d;

    /* renamed from: e */
    private final Drawable f315771e;

    public C114062a(boolean z, boolean z2, boolean z3, boolean z4, Drawable drawable) {
        this.f315767a = z;
        this.f315768b = z2;
        this.f315769c = z3;
        this.f315770d = z4;
        this.f315771e = drawable;
    }

    /* renamed from: a */
    public final Drawable mo100973a() {
        return this.f315771e;
    }

    /* renamed from: b */
    public final boolean mo100974b() {
        return this.f315767a;
    }

    /* renamed from: c */
    public final boolean mo100975c() {
        return this.f315769c;
    }

    /* renamed from: d */
    public final boolean mo100976d() {
        return this.f315770d;
    }

    /* renamed from: e */
    public final boolean mo100977e() {
        return this.f315768b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1 = r4.f315771e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e.C114063b
            r2 = 0
            if (r1 == 0) goto L_0x0042
            com.google.android.apps.gsa.staticplugins.opa.valyrian.e.b r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e.C114063b) r5
            boolean r1 = r4.f315767a
            boolean r3 = r5.mo100974b()
            if (r1 != r3) goto L_0x0042
            boolean r1 = r4.f315768b
            boolean r3 = r5.mo100977e()
            if (r1 != r3) goto L_0x0042
            boolean r1 = r4.f315769c
            boolean r3 = r5.mo100975c()
            if (r1 != r3) goto L_0x0042
            boolean r1 = r4.f315770d
            boolean r3 = r5.mo100976d()
            if (r1 != r3) goto L_0x0042
            android.graphics.drawable.Drawable r1 = r4.f315771e
            if (r1 != 0) goto L_0x0036
            android.graphics.drawable.Drawable r5 = r5.mo100973a()
            if (r5 != 0) goto L_0x0042
            goto L_0x0041
        L_0x0036:
            android.graphics.drawable.Drawable r5 = r5.mo100973a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e.C114062a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.f315767a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f315768b ? 1237 : 1231)) * 1000003) ^ (true != this.f315769c ? 1237 : 1231)) * 1000003;
        if (true == this.f315770d) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        Drawable drawable = this.f315771e;
        return i3 ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        boolean z = this.f315767a;
        boolean z2 = this.f315768b;
        boolean z3 = this.f315769c;
        boolean z4 = this.f315770d;
        String valueOf = String.valueOf(this.f315771e);
        return "ChatContentContext{comboBoxEnabled=" + z + ", webViewShown=" + z2 + ", inThirdPartyConversation=" + z3 + ", thirdPartyHeaderShown=" + z4 + ", thirdPartyLogo=" + valueOf + "}";
    }
}

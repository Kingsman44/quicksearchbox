package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.f */
/* compiled from: PG */
final class C102057f extends C102049ab {

    /* renamed from: a */
    private final CharSequence f284743a;

    /* renamed from: b */
    private final CharSequence f284744b;

    /* renamed from: c */
    private final C102076y f284745c;

    /* renamed from: d */
    private final C102229r f284746d;

    public C102057f(CharSequence charSequence, CharSequence charSequence2, C102076y yVar, C102229r rVar) {
        this.f284743a = charSequence;
        this.f284744b = charSequence2;
        this.f284745c = yVar;
        this.f284746d = rVar;
    }

    /* renamed from: a */
    public final C102229r mo92817a() {
        return this.f284746d;
    }

    /* renamed from: b */
    public final C102076y mo92818b() {
        return this.f284745c;
    }

    /* renamed from: c */
    public final CharSequence mo92819c() {
        return this.f284744b;
    }

    /* renamed from: d */
    public final CharSequence mo92820d() {
        return this.f284743a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f284746d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f284745c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102049ab
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.ab r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102049ab) r5
            java.lang.CharSequence r1 = r4.f284743a
            java.lang.CharSequence r3 = r5.mo92820d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.CharSequence r1 = r4.f284744b
            java.lang.CharSequence r3 = r5.mo92819c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.y r1 = r4.f284745c
            if (r1 != 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.y r1 = r5.mo92818b()
            if (r1 != 0) goto L_0x004f
            goto L_0x0038
        L_0x002e:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.y r3 = r5.mo92818b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0038:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.r r1 = r4.f284746d
            if (r1 != 0) goto L_0x0043
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.r r5 = r5.mo92817a()
            if (r5 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.r r5 = r5.mo92817a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102057f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f284743a.hashCode() ^ 1000003) * 1000003) ^ this.f284744b.hashCode()) * 1000003;
        C102076y yVar = this.f284745c;
        int i2 = 0;
        if (yVar == null) {
            i = 0;
        } else {
            i = yVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C102229r rVar = this.f284746d;
        if (rVar != null) {
            i2 = rVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        CharSequence charSequence = this.f284743a;
        CharSequence charSequence2 = this.f284744b;
        String valueOf = String.valueOf(this.f284745c);
        String valueOf2 = String.valueOf(this.f284746d);
        return "SummaryPage{title=" + ((String) charSequence) + ", summary=" + ((String) charSequence2) + ", contentArea=" + valueOf + ", footerSpecs=" + valueOf2 + "}";
    }
}

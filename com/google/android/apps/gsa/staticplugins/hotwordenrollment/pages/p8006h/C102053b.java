package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.b */
/* compiled from: PG */
final class C102053b extends C102061j {

    /* renamed from: a */
    private final CharSequence f284731a;

    /* renamed from: b */
    private final C102060i f284732b;

    /* renamed from: c */
    private final int f284733c;

    public C102053b(int i, CharSequence charSequence, C102060i iVar) {
        this.f284733c = i;
        this.f284731a = charSequence;
        this.f284732b = iVar;
    }

    /* renamed from: a */
    public final C102060i mo92823a() {
        return this.f284732b;
    }

    /* renamed from: b */
    public final CharSequence mo92824b() {
        return this.f284731a;
    }

    /* renamed from: c */
    public final int mo92825c() {
        return this.f284733c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f284732b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f284731a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102061j
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.j r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102061j) r5
            int r1 = r4.f284733c
            int r3 = r5.mo92825c()
            if (r1 != r3) goto L_0x003f
            java.lang.CharSequence r1 = r4.f284731a
            if (r1 != 0) goto L_0x001e
            java.lang.CharSequence r1 = r5.mo92824b()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.CharSequence r3 = r5.mo92824b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.i r1 = r4.f284732b
            if (r1 != 0) goto L_0x0033
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.i r5 = r5.mo92823a()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.i r5 = r5.mo92823a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h.C102053b.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String str = this.f284733c != 1 ? "SHOW" : "DONT_SHOW";
        String valueOf = String.valueOf(this.f284731a);
        String valueOf2 = String.valueOf(this.f284732b);
        return "HomeSummaryContent{googleHomeAppDownloadLink=" + str + ", inviteOthersMessage=" + valueOf + ", exampleQueries=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f284733c ^ 1000003) * 1000003;
        CharSequence charSequence = this.f284731a;
        int i3 = 0;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        C102060i iVar = this.f284732b;
        if (iVar != null) {
            i3 = iVar.hashCode();
        }
        return i4 ^ i3;
    }
}

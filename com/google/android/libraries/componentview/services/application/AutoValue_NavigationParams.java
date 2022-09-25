package com.google.android.libraries.componentview.services.application;

/* compiled from: PG */
final class AutoValue_NavigationParams extends NavigationParams {

    /* renamed from: a */
    private final boolean f57714a;

    /* renamed from: b */
    private final Long f57715b;

    public AutoValue_NavigationParams(boolean z, Long l) {
        this.f57714a = z;
        this.f57715b = l;
    }

    /* renamed from: a */
    public final Long mo25467a() {
        return this.f57715b;
    }

    /* renamed from: b */
    public final boolean mo25468b() {
        return this.f57714a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f57715b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.componentview.services.application.NavigationParams
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.componentview.services.application.NavigationParams r5 = (com.google.android.libraries.componentview.services.application.NavigationParams) r5
            boolean r1 = r4.f57714a
            boolean r3 = r5.mo25468b()
            if (r1 != r3) goto L_0x002a
            java.lang.Long r1 = r4.f57715b
            if (r1 != 0) goto L_0x001e
            java.lang.Long r5 = r5.mo25467a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.Long r5 = r5.mo25467a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.services.application.AutoValue_NavigationParams.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f57714a ? 1237 : 1231) ^ 1000003) * 1000003;
        Long l = this.f57715b;
        return i ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        boolean z = this.f57714a;
        Long l = this.f57715b;
        return "NavigationParams{query=" + z + ", clickId=" + l + "}";
    }
}

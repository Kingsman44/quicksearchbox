package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cx */
/* compiled from: PG */
enum C79801cx {
    S3("voice: ", true),
    ASSISTANT_SERVER("assistant server query: ", true),
    TEXT("assistant voiceless request", false),
    EMPTY("voice: <empty>", false),
    ZEROSTATE("client sync request: zerostate", false);
    

    /* renamed from: g */
    private final String f218789g;

    /* renamed from: h */
    private final boolean f218790h;

    private C79801cx(String str, boolean z) {
        this.f218789g = str;
        this.f218790h = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo74235a(java.lang.String r5, p3186j$.util.Optional r6) {
        /*
            r4 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "http"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "go"
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "release-others-sherlog-link"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = r4.f218789g
            boolean r2 = r4.f218790h
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0026
            java.lang.Object r6 = r6.orElse(r3)
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L_0x0026:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r6.concat(r1)
            java.lang.String r1 = "dataid_query"
            android.net.Uri$Builder r6 = r0.appendQueryParameter(r1, r6)
            java.lang.String r0 = "account"
            android.net.Uri$Builder r5 = r6.appendQueryParameter(r0, r5)
            android.net.Uri r5 = r5.build()
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79801cx.mo74235a(java.lang.String, j$.util.Optional):java.lang.String");
    }
}

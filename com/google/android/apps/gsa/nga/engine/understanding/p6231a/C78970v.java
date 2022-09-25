package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.v */
/* compiled from: PG */
final class C78970v extends C78953e {

    /* renamed from: a */
    private final String f217224a;

    /* renamed from: b */
    private final C78952d f217225b;

    /* renamed from: c */
    private final String f217226c;

    public C78970v(String str, C78952d dVar, String str2) {
        this.f217224a = str;
        this.f217225b = dVar;
        this.f217226c = str2;
    }

    /* renamed from: a */
    public final C78952d mo73707a() {
        return this.f217225b;
    }

    /* renamed from: b */
    public final String mo73708b() {
        return this.f217226c;
    }

    /* renamed from: c */
    public final String mo73709c() {
        return this.f217224a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f217226c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78953e
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.nga.engine.understanding.a.e r5 = (com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78953e) r5
            java.lang.String r1 = r4.f217224a
            java.lang.String r3 = r5.mo73709c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.nga.engine.understanding.a.d r1 = r4.f217225b
            com.google.android.apps.gsa.nga.engine.understanding.a.d r3 = r5.mo73707a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.f217226c
            if (r1 != 0) goto L_0x002e
            java.lang.String r5 = r5.mo73708b()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            java.lang.String r5 = r5.mo73708b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78970v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f217224a.hashCode() ^ 1000003) * 1000003) ^ this.f217225b.hashCode()) * 1000003;
        String str = this.f217226c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f217224a;
        String obj = this.f217225b.toString();
        String str2 = this.f217226c;
        return "AppSearchClassificationResult{query=" + str + ", target=" + obj + ", origin=" + str2 + "}";
    }
}

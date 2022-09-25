package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a;

import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.p.a.d */
/* compiled from: PG */
final class C78751d extends C78752e {

    /* renamed from: a */
    public final boolean f216799a;

    /* renamed from: b */
    public final Uri f216800b;

    public C78751d(boolean z, Uri uri) {
        this.f216799a = z;
        this.f216800b = uri;
    }

    /* renamed from: a */
    public final Uri mo73601a() {
        return this.f216800b;
    }

    /* renamed from: b */
    public final boolean mo73602b() {
        return this.f216799a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f216800b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a.C78752e
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.gsa.nga.engine.ui.e.p.a.e r5 = (com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a.C78752e) r5
            boolean r1 = r4.f216799a
            boolean r3 = r5.mo73602b()
            if (r1 != r3) goto L_0x002a
            android.net.Uri r1 = r4.f216800b
            if (r1 != 0) goto L_0x001e
            android.net.Uri r5 = r5.mo73601a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            android.net.Uri r5 = r5.mo73601a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a.C78751d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f216799a ? 1237 : 1231) ^ 1000003) * 1000003;
        Uri uri = this.f216800b;
        return i ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        boolean z = this.f216799a;
        String valueOf = String.valueOf(this.f216800b);
        return "OnScreenshotFinished{screenshotSuccessful=" + z + ", uri=" + valueOf + "}";
    }
}

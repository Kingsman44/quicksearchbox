package com.google.android.libraries.notifications;

/* renamed from: com.google.android.libraries.notifications.b */
/* compiled from: PG */
final class C29776b extends C29992g {

    /* renamed from: b */
    private final Throwable f80678b;

    /* renamed from: c */
    private final int f80679c;

    public C29776b(int i, Throwable th) {
        this.f80679c = i;
        this.f80678b = th;
    }

    /* renamed from: a */
    public final Throwable mo34948a() {
        return this.f80678b;
    }

    /* renamed from: b */
    public final int mo34949b() {
        return this.f80679c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f80678b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.C29992g
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.notifications.g r5 = (com.google.android.libraries.notifications.C29992g) r5
            int r1 = r4.f80679c
            int r3 = r5.mo34949b()
            if (r1 != r3) goto L_0x002a
            java.lang.Throwable r1 = r4.f80678b
            if (r1 != 0) goto L_0x001e
            java.lang.Throwable r5 = r5.mo34948a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.Throwable r5 = r5.mo34948a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.C29776b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f80679c ^ 1000003) * 1000003;
        Throwable th = this.f80678b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i = this.f80679c;
        String str = i != 1 ? i != 2 ? "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS";
        String valueOf = String.valueOf(this.f80678b);
        return "Result{code=" + str + ", error=" + valueOf + "}";
    }
}

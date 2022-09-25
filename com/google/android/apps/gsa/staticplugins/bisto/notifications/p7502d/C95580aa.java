package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aa */
/* compiled from: PG */
public final class C95580aa extends C95629y {

    /* renamed from: a */
    private final long f267479a;

    public C95580aa(long j) {
        this.f267479a = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = r7.f267479a;
        r0 = r8.f252642b.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r0 < 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r8.f252642b.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r5.mo84163a(r8.f252641a, r2) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r5.f252637a != 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r2 = r7.f267479a;
        r0 = r8.f252642b.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r0 < 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r8.f252642b.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r5.mo84163a(r8.f252641a, r2) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r5.f252639c == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r5 = r5.f252637a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (com.google.android.apps.gsa.shared.notificationlistening.common.C90433n.m147108k(r5) != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r5 == 2) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89516a(com.google.android.apps.gsa.shared.notificationlistening.common.C90433n r8) {
        /*
            r7 = this;
            boolean r0 = super.mo89516a(r8)
            r1 = 0
            if (r0 == 0) goto L_0x007d
            long r2 = r7.f267479a
            java.util.List r0 = r8.f252642b
            int r0 = r0.size()
        L_0x000f:
            int r0 = r0 + -1
            r4 = 1
            if (r0 < 0) goto L_0x002b
            java.util.List r5 = r8.f252642b
            java.lang.Object r5 = r5.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.m r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r5
            com.google.android.libraries.f.a r6 = r8.f252641a
            boolean r6 = r5.mo84163a(r6, r2)
            if (r6 != 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            int r5 = r5.f252637a
            if (r5 != 0) goto L_0x000f
        L_0x0029:
            r1 = 1
            goto L_0x007d
        L_0x002b:
            long r2 = r7.f267479a
            java.util.List r0 = r8.f252642b
            int r0 = r0.size()
        L_0x0033:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x004e
            java.util.List r5 = r8.f252642b
            java.lang.Object r5 = r5.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.m r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r5
            com.google.android.libraries.f.a r6 = r8.f252641a
            boolean r6 = r5.mo84163a(r6, r2)
            if (r6 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int r5 = r5.f252637a
            if (r5 != r4) goto L_0x004d
            goto L_0x0029
        L_0x004d:
            goto L_0x0033
        L_0x004e:
            long r2 = r7.f267479a
            java.util.List r0 = r8.f252642b
            int r0 = r0.size()
        L_0x0056:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x007d
            java.util.List r5 = r8.f252642b
            java.lang.Object r5 = r5.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.m r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r5
            com.google.android.libraries.f.a r6 = r8.f252641a
            boolean r6 = r5.mo84163a(r6, r2)
            if (r6 != 0) goto L_0x006b
            goto L_0x007d
        L_0x006b:
            boolean r6 = r5.f252639c
            if (r6 == 0) goto L_0x007c
            int r5 = r5.f252637a
            boolean r6 = com.google.android.apps.gsa.shared.notificationlistening.common.C90433n.m147108k(r5)
            if (r6 != 0) goto L_0x007b
            r6 = 2
            if (r5 == r6) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            return r4
        L_0x007c:
            goto L_0x0056
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95580aa.mo89516a(com.google.android.apps.gsa.shared.notificationlistening.common.n):boolean");
    }
}

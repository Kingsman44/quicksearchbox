package com.google.android.apps.search.googleapp.silkpane;

import com.google.android.libraries.web.contrib.requestblock.C43721h;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.i */
/* compiled from: PG */
public final /* synthetic */ class C139287i implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ SilkPaneBlockedUrlObserver f378845a;

    public /* synthetic */ C139287i(SilkPaneBlockedUrlObserver silkPaneBlockedUrlObserver) {
        this.f378845a = silkPaneBlockedUrlObserver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r2.equals("androidplatform.net") != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0.f378801d.mo113398d(r1) == false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30517a(com.google.android.libraries.web.p3353c.C43367l r11) {
        /*
            r10 = this;
            com.google.android.apps.search.googleapp.silkpane.SilkPaneBlockedUrlObserver r0 = r10.f378845a
            java.lang.String r1 = r11.f113296b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            boolean r2 = r0.f378800c
            java.lang.String r3 = "androidplatform.net"
            java.lang.String r4 = "youtu.be"
            java.lang.String r5 = "youtube.com"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x001f
            com.google.android.apps.search.googleapp.o.c r2 = r0.f378801d
            boolean r1 = r2.mo113398d(r1)
            if (r1 != 0) goto L_0x002b
        L_0x001c:
            r1 = 1
            goto L_0x00a9
        L_0x001f:
            java.lang.String r1 = r11.f113296b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = r1.getAuthority()
            if (r2 != 0) goto L_0x002e
        L_0x002b:
            r1 = 0
            goto L_0x00a9
        L_0x002e:
            r8 = 92
            int r8 = r2.lastIndexOf(r8)
            r9 = -1
            if (r8 != r9) goto L_0x002b
            r8 = 64
            int r8 = r2.lastIndexOf(r8)
            if (r8 == r9) goto L_0x0040
            goto L_0x002b
        L_0x0040:
            int r8 = r1.getPort()
            if (r8 == r9) goto L_0x0050
            java.lang.String r8 = ":"
            int r8 = r2.lastIndexOf(r8)
            java.lang.String r2 = r2.substring(r7, r8)
        L_0x0050:
            boolean r1 = com.google.android.libraries.web.shared.C44076a.m77823f(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "google.com"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".google.com"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".google.com.hk"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".gstatic.com"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".c.googlers.com"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".google"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".youtube.com"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = ".youtube"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x001c
            goto L_0x002b
        L_0x00a9:
            boolean r0 = r0.f378799b
            if (r0 == 0) goto L_0x00e5
            java.lang.String r11 = r11.f113296b
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r0 = r11.getAuthority()
            if (r0 != 0) goto L_0x00ba
            goto L_0x00e4
        L_0x00ba:
            boolean r11 = com.google.android.libraries.web.shared.C44076a.m77823f(r11)
            if (r11 == 0) goto L_0x00e3
            java.lang.String r11 = "gstatic.com"
            boolean r11 = r0.endsWith(r11)
            if (r11 != 0) goto L_0x00e4
            boolean r11 = r0.endsWith(r5)
            if (r11 != 0) goto L_0x00e4
            boolean r11 = r0.endsWith(r4)
            if (r11 != 0) goto L_0x00e4
            java.lang.String r11 = "youtube"
            boolean r11 = r0.endsWith(r11)
            if (r11 != 0) goto L_0x00e4
            boolean r11 = r0.endsWith(r3)
            if (r11 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r6 = 0
        L_0x00e4:
            r1 = r1 | r6
        L_0x00e5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.silkpane.C139287i.mo30517a(com.google.android.libraries.web.c.l):boolean");
    }
}

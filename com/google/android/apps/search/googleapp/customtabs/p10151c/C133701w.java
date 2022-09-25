package com.google.android.apps.search.googleapp.customtabs.p10151c;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.w */
/* compiled from: PG */
public final /* synthetic */ class C133701w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133678ac f364177a;

    public /* synthetic */ C133701w(C133678ac acVar) {
        this.f364177a = acVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r6 = this;
            com.google.android.apps.search.googleapp.customtabs.c.ac r0 = r6.f364177a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.PackageManager r3 = r0.f364124c     // Catch:{ NullPointerException -> 0x0027 }
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r1 = r3.resolveActivity(r1, r4)     // Catch:{ NullPointerException -> 0x0027 }
            if (r1 == 0) goto L_0x0036
            int r3 = r1.match
            if (r3 <= 0) goto L_0x0036
            android.content.pm.ActivityInfo r3 = r1.activityInfo
            if (r3 == 0) goto L_0x0036
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            goto L_0x0037
        L_0x0027:
            r1 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac.f364122a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Unable to detect default browser because PackageManager.resolveActivity() failed"
            r5 = 40080(0x9c90, float:5.6164E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r5)).mo56386p(r4)
        L_0x0036:
            r1 = r2
        L_0x0037:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "android.support.customtabs.action.CustomTabsService"
            r3.setAction(r4)
            android.content.pm.PackageManager r0 = r0.f364124c
            r4 = 0
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ServiceInfo r5 = r4.serviceInfo
            if (r5 == 0) goto L_0x0050
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            java.lang.String r4 = r4.packageName
            r3.mo55395g(r4)
            goto L_0x0050
        L_0x0068:
            com.google.common.b.gu r0 = r3.mo55394f()
            if (r1 == 0) goto L_0x0086
            com.google.common.b.gu r3 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac.f364123b
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.search.googleapp.customtabs.c.z r4 = new com.google.android.apps.search.googleapp.customtabs.c.z
            r4.<init>(r1)
            boolean r3 = r3.anyMatch(r4)
            if (r3 == 0) goto L_0x0086
            boolean r3 = r0.contains(r1)
            if (r3 == 0) goto L_0x0086
            return r1
        L_0x0086:
            com.google.common.b.gu r1 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac.f364123b
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.search.googleapp.customtabs.c.aa r3 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133676aa.f364120a
            j$.util.stream.Stream r1 = r1.map(r3)
            com.google.android.apps.search.googleapp.customtabs.c.ab r3 = new com.google.android.apps.search.googleapp.customtabs.c.ab
            r3.<init>(r0)
            j$.util.stream.Stream r0 = r1.filter(r3)
            j$.util.Optional r0 = r0.findFirst()
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.customtabs.p10151c.C133701w.call():java.lang.Object");
    }
}

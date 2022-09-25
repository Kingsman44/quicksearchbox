package com.google.android.libraries.lens.view.p2092c;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.c.r */
/* compiled from: PG */
public final /* synthetic */ class C25722r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25727w f69941a;

    public /* synthetic */ C25722r(C25727w wVar) {
        this.f69941a = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.ar.lens"
            com.google.android.libraries.lens.view.c.w r1 = r5.f69941a
            boolean r2 = r1.f69958h
            r3 = 0
            if (r2 != 0) goto L_0x0012
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.INELIGIBLE_FEATURE_DISABLED
            com.google.android.libraries.lens.view.c.ad r1 = new com.google.android.libraries.lens.view.c.ad
            r1.<init>(r0, r3)
            goto L_0x00e0
        L_0x0012:
            android.content.Context r2 = r1.f69953c
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r2)
            android.content.ComponentName r4 = com.google.android.libraries.lens.view.p2092c.C25727w.f69951a
            int[] r2 = r2.getAppWidgetIds(r4)
            int r2 = r2.length
            boolean r4 = r1.mo30864d()
            if (r4 == 0) goto L_0x0030
            if (r2 <= 0) goto L_0x0030
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.INELIGIBLE_QSB_PRESENT
            com.google.android.libraries.lens.view.c.ad r1 = new com.google.android.libraries.lens.view.c.ad
            r1.<init>(r0, r3)
            goto L_0x00e0
        L_0x0030:
            android.content.Context r2 = r1.f69953c
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r2)
            boolean r2 = r2.isRequestPinAppWidgetSupported()
            if (r2 != 0) goto L_0x003d
            goto L_0x0061
        L_0x003d:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "google"
            boolean r2 = com.google.common.base.C58890d.m90990e(r2, r4)
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r4 = "Pixel"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0061
        L_0x0051:
            boolean r2 = r1.mo30864d()
            if (r2 == 0) goto L_0x0061
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.ELIGIBLE
            com.google.android.libraries.lens.view.c.ad r1 = new com.google.android.libraries.lens.view.c.ad
            r2 = 1
            r1.<init>(r0, r2)
            goto L_0x00e0
        L_0x0061:
            android.content.Context r2 = r1.f69953c     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            r2.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r4 = "android.intent.action.MAIN"
            r2.<init>(r4)     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r2.addCategory(r4)     // Catch:{ NameNotFoundException -> 0x008e }
            r2.setPackage(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.Context r0 = r1.f69953c     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            java.util.List r0 = r0.queryIntentActivities(r2, r3)     // Catch:{ NameNotFoundException -> 0x008e }
            if (r0 == 0) goto L_0x008f
            boolean r0 = r0.isEmpty()     // Catch:{ NameNotFoundException -> 0x008e }
            if (r0 != 0) goto L_0x008f
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.INELIGIBLE_APP_INSTALLED
            goto L_0x00ca
        L_0x008e:
        L_0x008f:
            android.content.Context r0 = r1.f69953c
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            if (r0 == 0) goto L_0x00c8
            boolean r1 = r0.isRequestPinShortcutSupported()
            if (r1 != 0) goto L_0x00a2
            goto L_0x00c8
        L_0x00a2:
            java.util.List r0 = r0.getPinnedShortcuts()
            java.util.Iterator r0 = r0.iterator()
        L_0x00aa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r1 = r0.next()
            android.content.pm.ShortcutInfo r1 = (android.content.pm.ShortcutInfo) r1
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = "LensHomescreenShortcut"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00aa
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.INELIGIBLE_SHORTCUT_ALREADY_PRESENT
            goto L_0x00ca
        L_0x00c5:
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.ELIGIBLE
            goto L_0x00ca
        L_0x00c8:
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.INELIGIBLE_SHORTCUT_NOT_SUPPORTED
        L_0x00ca:
            com.google.android.libraries.lens.view.c.s r1 = com.google.android.libraries.lens.view.p2092c.C25723s.ELIGIBLE
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00db
            com.google.android.libraries.lens.view.c.s r0 = com.google.android.libraries.lens.view.p2092c.C25723s.ELIGIBLE
            com.google.android.libraries.lens.view.c.ad r1 = new com.google.android.libraries.lens.view.c.ad
            r2 = 2
            r1.<init>(r0, r2)
            goto L_0x00e0
        L_0x00db:
            com.google.android.libraries.lens.view.c.ad r1 = new com.google.android.libraries.lens.view.c.ad
            r1.<init>(r0, r3)
        L_0x00e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2092c.C25722r.call():java.lang.Object");
    }
}

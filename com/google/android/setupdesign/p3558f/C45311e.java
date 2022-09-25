package com.google.android.setupdesign.p3558f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;

/* renamed from: com.google.android.setupdesign.f.e */
/* compiled from: PG */
public final class C45311e {

    /* renamed from: a */
    private static boolean f118365a = false;

    /* renamed from: b */
    private static C45311e f118366b;

    /* renamed from: c */
    private final String f118367c;

    /* renamed from: d */
    private final Resources f118368d;

    private C45311e(String str, Resources resources) {
        this.f118367c = str;
        this.f118368d = resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r5.getResources();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.setupdesign.p3558f.C45310d m80757a(android.content.Context r5, int r6) {
        /*
            com.google.android.setupdesign.f.e r0 = m80758b(r5)
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = r1.getResourceEntryName(r6)
            java.lang.String r1 = r1.getResourceTypeName(r6)
            android.content.res.Resources r3 = r0.f118368d
            java.lang.String r4 = r0.f118367c
            int r1 = r3.getIdentifier(r2, r1, r4)
            if (r1 == 0) goto L_0x0025
            com.google.android.setupdesign.f.d r5 = new com.google.android.setupdesign.f.d
            android.content.res.Resources r6 = r0.f118368d
            r0 = 1
            r5.<init>(r6, r1, r0)
            return r5
        L_0x0025:
            com.google.android.setupdesign.f.d r0 = new com.google.android.setupdesign.f.d
            r5.getPackageName()
            android.content.res.Resources r5 = r5.getResources()
            r1 = 0
            r0.<init>(r5, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.p3558f.C45311e.m80757a(android.content.Context, int):com.google.android.setupdesign.f.d");
    }

    /* renamed from: b */
    public static synchronized C45311e m80758b(Context context) {
        C45311e eVar;
        synchronized (C45311e.class) {
            if (!f118365a) {
                PackageManager packageManager = context.getPackageManager();
                for (ResolveInfo next : packageManager.queryBroadcastReceivers(new Intent("com.android.setupwizard.action.PARTNER_CUSTOMIZATION"), 1835520)) {
                    if (next.activityInfo != null) {
                        ApplicationInfo applicationInfo = next.activityInfo.applicationInfo;
                        if ((applicationInfo.flags & 1) != 0) {
                            try {
                                f118366b = new C45311e(applicationInfo.packageName, packageManager.getResourcesForApplication(applicationInfo));
                                break;
                            } catch (PackageManager.NameNotFoundException unused) {
                                Log.w("(setupdesign) Partner", "Failed to find resources for ".concat(String.valueOf(applicationInfo.packageName)));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                f118365a = true;
            }
            eVar = f118366b;
        }
        return eVar;
    }

    /* renamed from: c */
    public static String m80759c(Context context, int i) {
        C45310d a = m80757a(context, i);
        return a.f118362a.getString(a.f118363b);
    }

    /* renamed from: d */
    public static boolean m80760d(Context context, int i) {
        C45310d a = m80757a(context, i);
        return a.f118362a.getBoolean(a.f118363b);
    }
}

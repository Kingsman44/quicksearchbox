package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.m */
/* compiled from: PG */
public final class C22481m {

    /* renamed from: a */
    public static final Uri f62054a = Uri.parse("clock-app://com.google.android.deskclock");

    /* renamed from: a */
    public static int m41932a(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 1) {
            return Integer.parseInt(pathSegments.get(1));
        }
        throw new C22534k();
    }

    /* renamed from: b */
    public static void m41933b(boolean z) {
        if (!z) {
            throw new C22534k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m41934c(java.util.List r3) {
        /*
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r3.next()
            com.google.assistant.e.i.a.nk r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51592nk) r0
            java.lang.String r0 = r0.f134467d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            boolean r2 = m41936e(r0)
            if (r2 != 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            java.lang.String r0 = r0.getHost()
            if (r0 == 0) goto L_0x0034
            java.lang.String r2 = "com.google.android.deskclock"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0034
            goto L_0x000c
        L_0x0034:
            return r1
        L_0x0035:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1846f.C22481m.m41934c(java.util.List):boolean");
    }

    /* renamed from: d */
    public static boolean m41935d(PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.deskclock", 0);
            if (packageInfo != null) {
                if (packageInfo.getLongVersionCode() >= 62000712) {
                    if (packageInfo.applicationInfo == null || !packageInfo.applicationInfo.enabled) {
                        return false;
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m41936e(Uri uri) {
        return (uri.getHost() == null || uri.getScheme() == null || !uri.getScheme().equals("clock-app") || uri.getLastPathSegment() == null) ? false : true;
    }
}

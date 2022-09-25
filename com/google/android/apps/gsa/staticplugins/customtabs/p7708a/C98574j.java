package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.j */
/* compiled from: PG */
public abstract class C98574j {

    /* renamed from: a */
    public static final Uri f275315a;

    /* renamed from: b */
    private static final C59071e f275316b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.a.j");

    /* renamed from: c */
    private static final Intent f275317c;

    static {
        Uri fromParts = Uri.fromParts("http", BuildConfig.FLAVOR, (String) null);
        f275315a = fromParts;
        f275317c = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(fromParts);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f275316b.mo56226d()).mo56382g(r2)).mo56372aa(19115)).mo56386p("PackageManager.resolveActivity threw a NullPointerException. No default browser can be detected.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j m163298c(android.content.pm.PackageManager r8) {
        /*
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.Intent r0 = f275317c     // Catch:{ all -> 0x00d5 }
            r1 = 131072(0x20000, float:1.83671E-40)
            java.util.List r0 = r8.queryIntentActivities(r0, r1)     // Catch:{ all -> 0x00d5 }
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0012:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00d5 }
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch:{ all -> 0x00d5 }
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r2.packageName     // Catch:{ all -> 0x00d5 }
            r1.mo55395g(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0012
        L_0x0026:
            com.google.common.b.gu r0 = r1.mo55394f()     // Catch:{ all -> 0x00d5 }
            r1 = r0
            com.google.common.b.pq r1 = (com.google.common.p4522b.C58724pq) r1
            int r2 = r1.f156474d
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 != r4) goto L_0x003b
            java.lang.Object r2 = r0.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0061
        L_0x003b:
            if (r2 <= r4) goto L_0x0060
            android.content.Intent r2 = f275317c     // Catch:{ NullPointerException -> 0x0052 }
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r8.resolveActivity(r2, r4)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0060
            int r4 = r2.match     // Catch:{ NullPointerException -> 0x0052 }
            if (r4 <= 0) goto L_0x0060
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch:{ NullPointerException -> 0x0052 }
            java.lang.String r2 = r2.packageName     // Catch:{ NullPointerException -> 0x0052 }
            goto L_0x0061
        L_0x0050:
            r2 = move-exception
            throw r2     // Catch:{ NullPointerException -> 0x0052 }
        L_0x0052:
            r2 = move-exception
            com.google.common.f.e r4 = f275316b
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "PackageManager.resolveActivity threw a NullPointerException. No default browser can be detected."
            r7 = 19115(0x4aab, float:2.6786E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r2)).mo56372aa(r7)).mo56386p(r6)
        L_0x0060:
            r2 = r5
        L_0x0061:
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x00d3 }
            r4.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = "android.support.customtabs.action.CustomTabsService"
            r4.setAction(r6)     // Catch:{ all -> 0x00d3 }
            java.util.List r8 = r8.queryIntentServices(r4, r3)     // Catch:{ all -> 0x00d3 }
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00d3 }
        L_0x0077:
            boolean r6 = r8.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x00d3 }
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch:{ all -> 0x00d3 }
            android.content.pm.ServiceInfo r6 = r6.serviceInfo     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = r6.packageName     // Catch:{ all -> 0x00d3 }
            r4.mo55395g(r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x0077
        L_0x008b:
            com.google.common.b.gu r8 = r4.mo55394f()     // Catch:{ all -> 0x00d3 }
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x009d
            int r8 = r1.f156474d
            com.google.android.apps.gsa.staticplugins.customtabs.a.a r8 = new com.google.android.apps.gsa.staticplugins.customtabs.a.a
            r8.<init>(r0, r5)
            return r8
        L_0x009d:
            if (r2 == 0) goto L_0x00af
            com.google.common.b.gu r4 = com.google.android.apps.gsa.shared.util.C90721ae.f253800i
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x00af
            boolean r4 = r8.contains(r2)
            if (r4 == 0) goto L_0x00af
            r5 = r2
            goto L_0x00c7
        L_0x00af:
            com.google.common.b.gu r2 = com.google.android.apps.gsa.shared.util.C90721ae.f253800i
            r4 = r2
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4
            int r4 = r4.f156474d
        L_0x00b6:
            if (r3 >= r4) goto L_0x00c7
            java.lang.Object r6 = r2.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            int r3 = r3 + 1
            boolean r7 = r8.contains(r6)
            if (r7 == 0) goto L_0x00b6
            r5 = r6
        L_0x00c7:
            int r1 = r1.f156474d
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8
            int r8 = r8.f156474d
            com.google.android.apps.gsa.staticplugins.customtabs.a.a r8 = new com.google.android.apps.gsa.staticplugins.customtabs.a.a
            r8.<init>(r0, r5)
            return r8
        L_0x00d3:
            r8 = move-exception
            throw r8
        L_0x00d5:
            r8 = move-exception
            goto L_0x00d8
        L_0x00d7:
            throw r8
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j.m163298c(android.content.pm.PackageManager):com.google.android.apps.gsa.staticplugins.customtabs.a.j");
    }

    /* renamed from: a */
    public abstract C58485gu mo91179a();

    /* renamed from: b */
    public abstract String mo91180b();
}

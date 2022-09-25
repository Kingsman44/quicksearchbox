package com.google.android.apps.gsa.notificationlistener;

import com.google.android.libraries.gsa.p1876k.C22870f;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.notificationlistener.w */
/* compiled from: PG */
public final /* synthetic */ class C83407w implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C83410z f227300a;

    /* renamed from: b */
    public final /* synthetic */ List f227301b;

    public /* synthetic */ C83407w(C83410z zVar, List list) {
        this.f227300a = zVar;
        this.f227301b = list;
    }

    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.apps.gsa.notificationlistener.z r0 = r12.f227300a
            java.util.List r1 = r12.f227301b
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r2 = (com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification) r2
            com.google.common.b.gu r2 = r2.mo84113d()
            int r3 = r2.size()
            r4 = 0
        L_0x001f:
            if (r4 >= r3) goto L_0x000a
            java.lang.Object r5 = r2.get(r4)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5
            java.lang.String r6 = r5.f252545v
            if (r6 == 0) goto L_0x00b8
            java.lang.String r7 = "audio"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L_0x00b8
            com.google.android.libraries.search.b.b r6 = r0.f227307c
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96808F
            r6.mo19974a(r7)
            r6 = 0
            android.content.Context r7 = r0.f227305a     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            android.net.Uri r8 = r5.f252546w     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r8.getClass()
            java.io.InputStream r7 = com.google.android.libraries.gsa.util.C23335a.m43765b(r7, r8)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r7 == 0) goto L_0x007f
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            android.content.Context r9 = r0.f227305a     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            java.io.File r9 = r9.getCacheDir()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            java.lang.String r5 = r5.f252547x     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r5.getClass()
            r8.<init>(r9, r5)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            com.google.common.p4541l.C59332o.m92211b(r7, r5)     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.search.b.b r6 = r0.f227307c     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.search.b.i.f r8 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96809G     // Catch:{ Exception -> 0x0075 }
            com.google.net.a.a.b r9 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.search.b.i.a r8 = r8.mo40805c(r9)     // Catch:{ Exception -> 0x0075 }
            r6.mo19974a(r8)     // Catch:{ Exception -> 0x0075 }
            r6 = r5
            goto L_0x007f
        L_0x0073:
            r0 = move-exception
            goto L_0x00ac
        L_0x0075:
            r6 = move-exception
            goto L_0x0091
        L_0x0077:
            r0 = move-exception
            r5 = r6
            goto L_0x00ac
        L_0x007a:
            r5 = move-exception
            r11 = r6
            r6 = r5
            r5 = r11
            goto L_0x0091
        L_0x007f:
            if (r7 == 0) goto L_0x0084
            r7.close()
        L_0x0084:
            if (r6 == 0) goto L_0x00b8
            r6.close()
            goto L_0x00b8
        L_0x008a:
            r0 = move-exception
            r5 = r6
            goto L_0x00ad
        L_0x008d:
            r5 = move-exception
            r7 = r6
            r6 = r5
            r5 = r7
        L_0x0091:
            com.google.android.libraries.search.b.b r8 = r0.f227307c     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96809G     // Catch:{ all -> 0x0073 }
            com.google.net.a.a.b r10 = com.google.net.p4726a.p4727a.C62722b.INTERNAL     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.search.b.i.a r9 = r9.mo40805c(r10)     // Catch:{ all -> 0x0073 }
            r8.mo19974a(r9)     // Catch:{ all -> 0x0073 }
            r6.printStackTrace()     // Catch:{ all -> 0x0073 }
            if (r7 == 0) goto L_0x00a6
            r7.close()
        L_0x00a6:
            if (r5 == 0) goto L_0x00b8
            r5.close()
            goto L_0x00b8
        L_0x00ac:
            r6 = r7
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()
        L_0x00b2:
            if (r5 == 0) goto L_0x00b7
            r5.close()
        L_0x00b7:
            throw r0
        L_0x00b8:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.notificationlistener.C83407w.run():void");
    }
}

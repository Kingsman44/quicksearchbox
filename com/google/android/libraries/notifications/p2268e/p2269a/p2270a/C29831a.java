package com.google.android.libraries.notifications.p2268e.p2269a.p2270a;

import android.text.TextUtils;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.data.impl.C29806k;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import java.util.Set;

/* renamed from: com.google.android.libraries.notifications.e.a.a.a */
/* compiled from: PG */
public final class C29831a {

    /* renamed from: a */
    private final C29823n f80849a;

    /* renamed from: b */
    private final C29826q f80850b;

    /* renamed from: c */
    private final C29959j f80851c;

    /* renamed from: d */
    private final Set f80852d;

    /* renamed from: e */
    private final C29806k f80853e;

    /* renamed from: f */
    private final C29835a f80854f;

    public C29831a(C29823n nVar, C29826q qVar, C29806k kVar, C29959j jVar, C29835a aVar, Set set) {
        this.f80849a = nVar;
        this.f80850b = qVar;
        this.f80853e = kVar;
        this.f80851c = jVar;
        this.f80854f = aVar;
        this.f80852d = set;
    }

    /* renamed from: b */
    private final synchronized void m55180b(C29820k kVar, boolean z) {
        if (!z) {
            C29834a a = this.f80854f.mo35159a(C55489bz.NOTIFICATION_DATA_CLEANED);
            a.mo35145j(kVar);
            a.mo35136a();
        } else if (kVar == null) {
            this.f80854f.mo35159a(C55489bz.ACCOUNT_DATA_CLEANED).mo35136a();
        } else {
            C30058b.m55794f("AccountCleanupUtil", "Account deleted: %s", kVar.mo35009h());
            if (!TextUtils.isEmpty(kVar.mo35012j())) {
                C29834a a2 = this.f80854f.mo35159a(C55489bz.ACCOUNT_DATA_CLEANED);
                a2.mo35148m(kVar.mo35012j());
                a2.mo35136a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35134a(com.google.android.libraries.notifications.data.C29820k r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            r0 = 0
            goto L_0x0009
        L_0x0005:
            java.lang.String r0 = r5.mo35009h()     // Catch:{ all -> 0x004f }
        L_0x0009:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x004f }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "AccountCleanupUtil"
            java.lang.String r3 = "Notification data deleted: %s"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r2, r3, r1)     // Catch:{ all -> 0x004f }
            r4.m55180b(r5, r6)     // Catch:{ all -> 0x004f }
            com.google.android.libraries.notifications.e.j.j r1 = r4.f80851c     // Catch:{ all -> 0x004f }
            r2 = 11
            r1.mo35248c(r5, r2)     // Catch:{ all -> 0x004f }
            java.util.Set r1 = r4.f80852d     // Catch:{ all -> 0x004f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004f }
        L_0x0026:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004f }
            com.google.android.libraries.notifications.f.a r2 = (com.google.android.libraries.notifications.p2289f.C29987a) r2     // Catch:{ all -> 0x004f }
            r2.mo35294e()     // Catch:{ all -> 0x004f }
            goto L_0x0026
        L_0x0036:
            com.google.android.libraries.notifications.data.q r1 = r4.f80850b     // Catch:{ all -> 0x004f }
            r1.mo35098c(r0)     // Catch:{ all -> 0x004f }
            com.google.android.libraries.notifications.data.impl.k r1 = r4.f80853e     // Catch:{ all -> 0x004f }
            com.google.android.libraries.notifications.data.impl.n r1 = r1.f80821a     // Catch:{ all -> 0x004f }
            r1.mo35109d(r5)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x004d
            if (r6 == 0) goto L_0x004d
            com.google.android.libraries.notifications.data.n r5 = r4.f80849a     // Catch:{ all -> 0x004f }
            r5.mo35090d(r0)     // Catch:{ all -> 0x004f }
            monitor-exit(r4)
            return
        L_0x004d:
            monitor-exit(r4)
            return
        L_0x004f:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0053
        L_0x0052:
            throw r5
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2269a.p2270a.C29831a.mo35134a(com.google.android.libraries.notifications.data.k, boolean):void");
    }
}

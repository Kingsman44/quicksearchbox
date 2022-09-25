package com.google.android.libraries.web.webview.p3471a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.p3606d.C46094l;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.a.m */
/* compiled from: PG */
public final class C44329m {

    /* renamed from: a */
    public final C71788b f115263a;

    /* renamed from: b */
    private final C71422aw f115264b;

    /* renamed from: c */
    private final C42876ab f115265c;

    /* renamed from: d */
    private final C46094l f115266d;

    /* renamed from: e */
    private final C46128f f115267e;

    public C44329m(C71422aw awVar, C42876ab abVar, C71788b bVar, C46094l lVar, C46128f fVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(abVar, "accountInfoProtoDataStore");
        C69664n.m101061g(bVar, "mutex");
        C69664n.m101061g(fVar, "gcoreAccountName");
        this.f115264b = awVar;
        this.f115265c = abVar;
        this.f115263a = bVar;
        this.f115266d = lVar;
        this.f115267e = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo47223a(String str) {
        return C71663i.m104692e(this.f115264b, (C71424ay) null, new C44327k(this, str, (C69577g) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r8 == r1) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r1) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47224b(java.lang.String r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.web.webview.p3471a.C44328l
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.web.webview.a.l r0 = (com.google.android.libraries.web.webview.p3471a.C44328l) r0
            int r1 = r0.f115262e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115262e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.a.l r0 = new com.google.android.libraries.web.webview.a.l
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f115260c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115262e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f115258a
            java.lang.String r7 = (java.lang.String) r7
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0097 }
            goto L_0x0093
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.f115259b
            java.lang.Object r2 = r0.f115258a
            com.google.android.libraries.web.webview.a.m r2 = (com.google.android.libraries.web.webview.p3471a.C44329m) r2
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0097 }
            goto L_0x007e
        L_0x0043:
            java.lang.Object r7 = r0.f115259b
            java.lang.Object r2 = r0.f115258a
            com.google.android.libraries.web.webview.a.m r2 = (com.google.android.libraries.web.webview.p3471a.C44329m) r2
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0097 }
            goto L_0x0068
        L_0x004d:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.storage.protostore.ab r8 = r6.f115265c     // Catch:{ all -> 0x0097 }
            com.google.common.util.concurrent.cx r8 = r8.mo46042d()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "accountInfoProtoDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ all -> 0x0097 }
            r0.f115258a = r6     // Catch:{ all -> 0x0097 }
            r0.f115259b = r7     // Catch:{ all -> 0x0097 }
            r0.f115262e = r5     // Catch:{ all -> 0x0097 }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x0097 }
            if (r8 == r1) goto L_0x0096
            r2 = r6
        L_0x0068:
            com.google.android.libraries.web.webview.a.e r8 = (com.google.android.libraries.web.webview.p3471a.C44321e) r8     // Catch:{ all -> 0x0097 }
            int r8 = r8.f115247b     // Catch:{ all -> 0x0097 }
            com.google.apps.tiktok.account.d.l r5 = r2.f115266d     // Catch:{ all -> 0x0097 }
            com.google.common.util.concurrent.cx r8 = r5.mo50203a(r8)     // Catch:{ all -> 0x0097 }
            r0.f115258a = r2     // Catch:{ all -> 0x0097 }
            r0.f115259b = r7     // Catch:{ all -> 0x0097 }
            r0.f115262e = r4     // Catch:{ all -> 0x0097 }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x0097 }
            if (r8 == r1) goto L_0x0096
        L_0x007e:
            com.google.apps.tiktok.account.AccountId r8 = (com.google.apps.tiktok.account.AccountId) r8     // Catch:{ all -> 0x0097 }
            com.google.apps.tiktok.account.data.a.f r2 = r2.f115267e     // Catch:{ all -> 0x0097 }
            com.google.common.util.concurrent.cx r8 = r2.mo50215b(r8)     // Catch:{ all -> 0x0097 }
            r0.f115258a = r7     // Catch:{ all -> 0x0097 }
            r2 = 0
            r0.f115259b = r2     // Catch:{ all -> 0x0097 }
            r0.f115262e = r3     // Catch:{ all -> 0x0097 }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x0097 }
            if (r8 == r1) goto L_0x0096
        L_0x0093:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0097 }
            goto L_0x0099
        L_0x0096:
            return r1
        L_0x0097:
            java.lang.String r8 = ""
        L_0x0099:
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3471a.C44329m.mo47224b(java.lang.String, h.c.g):java.lang.Object");
    }
}

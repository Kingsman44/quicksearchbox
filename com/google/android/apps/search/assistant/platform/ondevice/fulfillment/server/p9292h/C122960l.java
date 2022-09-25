package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.android.libraries.mdi.C29690f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.l */
/* compiled from: PG */
public final class C122960l {

    /* renamed from: a */
    public final C47770dh f340490a;

    /* renamed from: b */
    public C29690f f340491b;

    /* renamed from: c */
    public C123051cr f340492c;

    /* renamed from: d */
    public C60872cz f340493d;

    /* renamed from: e */
    public final ArrayList f340494e = new ArrayList();

    /* renamed from: f */
    private final C58881cr f340495f;

    /* renamed from: g */
    private final long f340496g;

    /* renamed from: h */
    private final String f340497h;

    /* renamed from: i */
    private final C60888db f340498i;

    /* renamed from: j */
    private boolean f340499j = false;

    public C122960l(C58881cr crVar, long j, String str, C47770dh dhVar, C60888db dbVar) {
        this.f340495f = crVar;
        this.f340496g = j;
        this.f340497h = str;
        this.f340490a = dhVar;
        this.f340498i = dbVar;
    }

    /* renamed from: a */
    public final synchronized C123051cr mo105798a() {
        C123051cr crVar;
        C60870cx cxVar = (C60870cx) this.f340495f.mo6453a();
        crVar = new C123051cr(cxVar);
        this.f340492c = crVar;
        C122957i iVar = new C122957i(this, crVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(iVar), this.f340498i);
        return crVar;
    }

    /* renamed from: b */
    public final synchronized C123051cr mo105799b() {
        C123051cr crVar = this.f340492c;
        if (crVar != null) {
            return crVar;
        }
        return mo105798a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo105800c() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f340496g     // Catch:{ all -> 0x0025 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0023
            boolean r2 = r5.f340499j     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0023
            com.google.common.util.concurrent.cz r2 = r5.f340493d     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0012
            goto L_0x0023
        L_0x0012:
            com.google.common.util.concurrent.db r2 = r5.f340498i     // Catch:{ all -> 0x0025 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.d r3 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.d     // Catch:{ all -> 0x0025 }
            r3.<init>(r5)     // Catch:{ all -> 0x0025 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x0025 }
            com.google.common.util.concurrent.cz r0 = r2.mo29164d(r3, r0, r4)     // Catch:{ all -> 0x0025 }
            r5.f340493d = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r5)
            return
        L_0x0023:
            monitor-exit(r5)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122960l.mo105800c():void");
    }

    /* renamed from: d */
    public final synchronized void mo105801d() {
        this.f340499j = true;
        C60872cz czVar = this.f340493d;
        if (czVar != null) {
            czVar.cancel(false);
        }
    }

    /* renamed from: e */
    public final C122959k mo105802e() {
        C122959k kVar = new C122959k(new C122953e(this), this.f340497h);
        synchronized (this) {
            this.f340494e.add(kVar);
        }
        return kVar;
    }
}

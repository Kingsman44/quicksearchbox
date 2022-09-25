package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.i */
/* compiled from: PG */
final class C122957i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C123051cr f340482a;

    /* renamed from: b */
    final /* synthetic */ C122960l f340483b;

    public C122957i(C122960l lVar, C123051cr crVar) {
        this.f340483b = lVar;
        this.f340482a = crVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C122960l lVar = this.f340483b;
        C123051cr crVar = this.f340482a;
        synchronized (lVar) {
            if (lVar.f340492c == crVar) {
                lVar.f340492c = null;
                Collection.EL.removeIf(lVar.f340494e, C122954f.f340479a);
                C58485gu j = C58485gu.m89842j(lVar.f340494e);
                Collection.EL.forEach(j, C122955g.f340480a);
                lVar.mo105800c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        p3186j$.util.Collection.EL.forEach(r2, new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122956h(r1));
        r2.size();
        r0.mo105800c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17911gm(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.android.libraries.mdi.f r5 = (com.google.android.libraries.mdi.C29690f) r5
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.l r0 = r4.f340483b
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cr r1 = r4.f340482a
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
            monitor-enter(r0)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cr r3 = r0.f340492c     // Catch:{ all -> 0x003a }
            if (r3 == r1) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0011:
            com.google.android.libraries.mdi.f r3 = r0.f340491b     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x002a
        L_0x001b:
            r0.f340491b = r5     // Catch:{ all -> 0x003a }
            java.util.ArrayList r5 = r0.f340494e     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.f r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122954f.f340479a     // Catch:{ all -> 0x003a }
            p3186j$.util.Collection.EL.removeIf(r5, r2)     // Catch:{ all -> 0x003a }
            java.util.ArrayList r5 = r0.f340494e     // Catch:{ all -> 0x003a }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r5)     // Catch:{ all -> 0x003a }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.h r5 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.h
            r5.<init>(r1)
            p3186j$.util.Collection.EL.forEach(r2, r5)
            r2.size()
            r0.mo105800c()
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122957i.mo17911gm(java.lang.Object):void");
    }
}

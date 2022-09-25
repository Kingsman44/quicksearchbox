package com.google.android.apps.gsa.opa.p6435c;

import android.telephony.PhoneStateListener;

/* renamed from: com.google.android.apps.gsa.opa.c.h */
/* compiled from: PG */
final class C83596h extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ C83600l f227903a;

    public C83596h(C83600l lVar) {
        this.f227903a = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCallStateChanged(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.Class<androidx.annotation.b> r9 = androidx.annotation.C0826b.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r9)
            com.google.android.apps.gsa.opa.c.l r9 = r7.f227903a
            java.lang.Object r0 = r9.f227909d
            monitor-enter(r0)
            r1 = 0
            r2 = 2
            if (r8 == 0) goto L_0x007c
            if (r8 == r2) goto L_0x0027
            com.google.common.f.e r8 = com.google.android.apps.gsa.opa.p6435c.C83601m.f227916a     // Catch:{ all -> 0x012d }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x012d }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x012d }
            r9 = 6777(0x1a79, float:9.497E-42)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x012d }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x012d }
            java.lang.String r9 = "Unknown Call State"
            r8.mo56386p(r9)     // Catch:{ all -> 0x012d }
            goto L_0x0129
        L_0x0027:
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.f.a r8 = r8.f227920e     // Catch:{ all -> 0x012d }
            long r2 = r8.mo26871c()     // Catch:{ all -> 0x012d }
            r9.f227913h = r2     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.f.a r8 = r8.f227920e     // Catch:{ all -> 0x012d }
            long r2 = r8.mo26870b()     // Catch:{ all -> 0x012d }
            r9.f227914i = r2     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.conversation.clientop.communication.a.a r8 = r9.f227912g     // Catch:{ all -> 0x012d }
            r2 = 3
            r3 = 0
            r8.mo27600a(r2, r3)     // Catch:{ all -> 0x012d }
            com.google.common.util.concurrent.cx r8 = r9.f227910e     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0049
            r8.cancel(r1)     // Catch:{ all -> 0x012d }
        L_0x0049:
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            dagger.a r8 = r8.f227919d     // Catch:{ all -> 0x012d }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247709mK     // Catch:{ all -> 0x012d }
            long r1 = r8.mo79743a(r1)     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.k.g r8 = r8.f227918c     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.f r3 = new com.google.android.apps.gsa.opa.c.f     // Catch:{ all -> 0x012d }
            r3.<init>(r9, r1)     // Catch:{ all -> 0x012d }
            java.lang.String r4 = "call duration timeout future"
            com.google.common.util.concurrent.cx r8 = r8.mo28204d(r4, r1, r3)     // Catch:{ all -> 0x012d }
            r9.f227911f = r8     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.k.g r8 = r8.f227918c     // Catch:{ all -> 0x012d }
            com.google.common.util.concurrent.cx r9 = r9.f227911f     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.j r1 = new com.google.android.apps.gsa.opa.c.j     // Catch:{ all -> 0x012d }
            r1.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "call duration timeout future callback"
            r8.mo28211k(r9, r2, r1)     // Catch:{ all -> 0x012d }
            goto L_0x0129
        L_0x007c:
            boolean r8 = r9.mo76956c()     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x012b
            com.google.common.util.concurrent.cx r8 = r9.f227911f     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x008e
            boolean r8 = r8.isDone()     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x008e
            goto L_0x012b
        L_0x008e:
            com.google.common.util.concurrent.cx r8 = r9.f227911f     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0095
            r8.cancel(r1)     // Catch:{ all -> 0x012d }
        L_0x0095:
            r9.mo76955b()     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.f.a r8 = r8.f227920e     // Catch:{ all -> 0x012d }
            long r3 = r8.mo26871c()     // Catch:{ all -> 0x012d }
            long r5 = r9.f227913h     // Catch:{ all -> 0x012d }
            long r3 = r3 - r5
            com.google.android.apps.gsa.opa.c.m r8 = r9.f227915j     // Catch:{ all -> 0x012d }
            dagger.a r8 = r8.f227919d     // Catch:{ all -> 0x012d }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247709mK     // Catch:{ all -> 0x012d }
            long r5 = r8.mo79743a(r1)     // Catch:{ all -> 0x012d }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ce
            com.google.common.f.e r8 = com.google.android.apps.gsa.opa.p6435c.C83601m.f227916a     // Catch:{ all -> 0x012d }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x012d }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x012d }
            r9 = 6780(0x1a7c, float:9.501E-42)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x012d }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x012d }
            java.lang.String r9 = "Got call duration after allowed tracking time completed."
            r8.mo56386p(r9)     // Catch:{ all -> 0x012d }
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x00ce:
            com.google.assistant.ab.ca r8 = com.google.assistant.p3745ab.C48273ca.f124851d     // Catch:{ all -> 0x012d }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x012d }
            com.google.assistant.ab.bz r8 = (com.google.assistant.p3745ab.C48269bz) r8     // Catch:{ all -> 0x012d }
            float r1 = (float) r3     // Catch:{ all -> 0x012d }
            r8.copyOnWrite()     // Catch:{ all -> 0x012d }
            com.google.protobuf.bv r3 = r8.instance     // Catch:{ all -> 0x012d }
            com.google.assistant.ab.ca r3 = (com.google.assistant.p3745ab.C48273ca) r3     // Catch:{ all -> 0x012d }
            int r4 = r3.f124853a     // Catch:{ all -> 0x012d }
            r2 = r2 | r4
            r3.f124853a = r2     // Catch:{ all -> 0x012d }
            r3.f124855c = r1     // Catch:{ all -> 0x012d }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x012d }
            com.google.assistant.ab.ca r8 = (com.google.assistant.p3745ab.C48273ca) r8     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.conversation.clientop.communication.a.a r1 = r9.f227912g     // Catch:{ all -> 0x012d }
            r2 = 5
            r1.mo27600a(r2, r8)     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.m r1 = r9.f227915j     // Catch:{ all -> 0x012d }
            android.content.Context r1 = r1.f227917b     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "android.permission.READ_CALL_LOG"
            int r1 = r1.checkSelfPermission(r2)     // Catch:{ all -> 0x012d }
            r2 = -1
            if (r1 != r2) goto L_0x0107
            com.google.android.libraries.gsa.conversation.clientop.communication.a.a r9 = r9.f227912g     // Catch:{ all -> 0x012d }
            r1 = 9
            r9.mo27600a(r1, r8)     // Catch:{ all -> 0x012d }
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x0107:
            com.google.android.apps.gsa.opa.c.m r1 = r9.f227915j     // Catch:{ all -> 0x012d }
            com.google.android.libraries.gsa.k.g r2 = r1.f227918c     // Catch:{ all -> 0x012d }
            java.lang.String r3 = r9.f227907b     // Catch:{ all -> 0x012d }
            dagger.a r1 = r1.f227919d     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249664G     // Catch:{ all -> 0x012d }
            long r4 = r1.mo79743a(r4)     // Catch:{ all -> 0x012d }
            com.google.common.util.concurrent.cx r1 = r9.mo76954a(r3, r4)     // Catch:{ all -> 0x012d }
            com.google.android.apps.gsa.opa.c.k r3 = new com.google.android.apps.gsa.opa.c.k     // Catch:{ all -> 0x012d }
            r3.<init>(r9, r8)     // Catch:{ all -> 0x012d }
            java.lang.String r8 = "#Listener.onStatusChange"
            r2.mo28211k(r1, r8, r3)     // Catch:{ all -> 0x012d }
        L_0x0129:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x012b:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x012d:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.opa.p6435c.C83596h.onCallStateChanged(int, java.lang.String):void");
    }
}

package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82414eh;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.x */
/* compiled from: PG */
public final class C113920x {

    /* renamed from: e */
    private static final C59071e f315453e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.v.x");

    /* renamed from: a */
    public final Object f315454a = new Object();

    /* renamed from: b */
    public long f315455b;

    /* renamed from: c */
    public final LinkedHashMap f315456c = new LinkedHashMap();

    /* renamed from: d */
    public final Set f315457d = C58758qx.m90653k();

    /* renamed from: f */
    private final C58833ax f315458f;

    /* renamed from: g */
    private final C58833ax f315459g;

    /* renamed from: h */
    private final C113898b f315460h;

    public C113920x(C113898b bVar, C58833ax axVar, C58833ax axVar2) {
        this.f315460h = bVar;
        this.f315458f = axVar;
        this.f315459g = axVar2;
    }

    /* renamed from: a */
    public final C89849ae mo100772a(long j) {
        C89849ae aeVar;
        String str;
        synchronized (this.f315454a) {
            C113918v vVar = (C113918v) this.f315456c.get(Long.valueOf(j));
            if (vVar == null) {
                aeVar = null;
            } else {
                aeVar = vVar.f315419b;
            }
        }
        if (this.f315459g.mo56113h()) {
            C83305i iVar = (C83305i) this.f315459g.mo56107c();
            if (aeVar == null) {
                str = "NULL";
            } else {
                str = aeVar.name();
            }
            if (str != null) {
                iVar.mo75579d(new C82414eh("NGA_QUERY_TRACKER_STATUS", str));
            } else {
                throw new NullPointerException("Null returnedEndEvent");
            }
        }
        return aeVar;
    }

    /* renamed from: b */
    public final void mo100773b(C113919w wVar) {
        long j = this.f315455b;
        if (j != 0) {
            mo100774c(j, wVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100774c(long r7, com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w r9) {
        /*
            r6 = this;
            com.google.common.base.ax r0 = r6.f315458f
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x00a4
            com.google.common.base.ax r0 = r6.f315458f
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bo r0 = (com.google.android.apps.gsa.nga.api.C74714bo) r0
            boolean r0 = r0.mo71081c()
            if (r0 == 0) goto L_0x00a4
            java.util.Set r0 = r6.f315457d
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.e r1 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107808e) r1
            if (r1 == 0) goto L_0x001c
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.q r1 = r1.f299981a
            com.google.android.apps.gsa.staticplugins.opa.v.w r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.NO_CONNECTIVITY
            com.google.android.apps.gsa.staticplugins.opa.ak.c.c.m r2 = com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106285m.INITIALIZE_QUERY_EVENT_DATA
            int r2 = r9.ordinal()
            r3 = 11
            if (r2 == r3) goto L_0x008c
            switch(r2) {
                case 16: goto L_0x0086;
                case 17: goto L_0x0083;
                case 18: goto L_0x0080;
                case 19: goto L_0x007d;
                case 20: goto L_0x0055;
                case 21: goto L_0x0042;
                case 22: goto L_0x0042;
                case 23: goto L_0x0042;
                case 24: goto L_0x0042;
                case 25: goto L_0x0042;
                case 26: goto L_0x0042;
                case 27: goto L_0x0042;
                case 28: goto L_0x0042;
                case 29: goto L_0x0042;
                case 30: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x001c
        L_0x0042:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f300028g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247057V
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x001c
            com.google.android.apps.gsa.staticplugins.opa.v.b r2 = r1.f300031j
            com.google.android.apps.gsa.shared.logger.b.ae r2 = r2.mo100758b(r9)
            if (r2 == 0) goto L_0x001c
            goto L_0x0088
        L_0x0055:
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_SUCCESS
            r1.mo96302g(r7, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FOLLOW_ON_QUERY_COMMIT_ACTION_V2
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f300028g
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247057V
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x001c
            dagger.a r1 = r1.f300026e
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.f r3 = new com.google.android.apps.gsa.shared.logger.b.f
            r3.<init>()
            r3.f246201a = r2
            com.google.android.apps.gsa.shared.logger.b.g r2 = r3.mo83699a()
            r1.mo74236a(r2)
            goto L_0x001c
        L_0x007d:
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED
            goto L_0x0088
        L_0x0080:
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_FAILURE
            goto L_0x0088
        L_0x0083:
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN
            goto L_0x0088
        L_0x0086:
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_SUCCESS
        L_0x0088:
            r1.mo96302g(r7, r2)
            goto L_0x001c
        L_0x008c:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f300028g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251199eM
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x001c
            com.google.android.libraries.gsa.k.g r2 = r1.f300027f
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.j r3 = new com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.j
            r3.<init>(r1, r7)
            java.lang.String r1 = "NgaClientEventSubCtrl: onQueryStateUpdate"
            r2.mo28212l(r1, r3)
            goto L_0x001c
        L_0x00a4:
            java.lang.Object r0 = r6.f315454a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r6.f315456c     // Catch:{ all -> 0x019d }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x019d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.opa.v.v r1 = (com.google.android.apps.gsa.staticplugins.opa.p8595v.C113918v) r1     // Catch:{ all -> 0x019d }
            if (r1 != 0) goto L_0x00de
        L_0x00b5:
            java.util.LinkedHashMap r1 = r6.f315456c     // Catch:{ all -> 0x019d }
            int r1 = r1.size()     // Catch:{ all -> 0x019d }
            r2 = 10
            if (r1 < r2) goto L_0x00d0
            java.util.LinkedHashMap r1 = r6.f315456c     // Catch:{ all -> 0x019d }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x019d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x019d }
            r1.next()     // Catch:{ all -> 0x019d }
            r1.remove()     // Catch:{ all -> 0x019d }
            goto L_0x00b5
        L_0x00d0:
            com.google.android.apps.gsa.staticplugins.opa.v.v r1 = new com.google.android.apps.gsa.staticplugins.opa.v.v     // Catch:{ all -> 0x019d }
            r1.<init>()     // Catch:{ all -> 0x019d }
            java.util.LinkedHashMap r2 = r6.f315456c     // Catch:{ all -> 0x019d }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x019d }
            r2.put(r3, r1)     // Catch:{ all -> 0x019d }
        L_0x00de:
            com.google.common.base.ax r2 = r6.f315459g     // Catch:{ all -> 0x019d }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0153
            com.google.android.apps.gsa.staticplugins.opa.v.w r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.END_STATE_LOGGED     // Catch:{ all -> 0x019d }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0153
            java.util.List r2 = r1.f315418a     // Catch:{ all -> 0x019d }
            boolean r2 = r2.contains(r9)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0125
            com.google.common.f.e r2 = f315453e     // Catch:{ all -> 0x019d }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x019d }
            r3 = 24351(0x5f1f, float:3.4123E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "End state already logged"
            r2.mo56386p(r3)     // Catch:{ all -> 0x019d }
            com.google.common.base.ax r2 = r6.f315459g     // Catch:{ all -> 0x019d }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.i r2 = (com.google.android.apps.gsa.nga.shared.p6407v.C83305i) r2     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.c.jz r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka.m131549c()     // Catch:{ all -> 0x019d }
            java.lang.String r4 = "endstate_double_log"
            r5 = r3
            com.google.android.apps.gsa.nga.shared.v.c.bm r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm) r5     // Catch:{ all -> 0x019d }
            r5.f224930b = r4     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.c.ka r3 = r3.mo75772a()     // Catch:{ all -> 0x019d }
            r2.mo75579d(r3)     // Catch:{ all -> 0x019d }
        L_0x0125:
            java.util.List r2 = r1.f315418a     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.opa.v.w r3 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.HANDOVER_RECEIVED     // Catch:{ all -> 0x019d }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0153
            java.util.List r2 = r1.f315418a     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.opa.v.w r3 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.HANDOVER_CONFIRMED     // Catch:{ all -> 0x019d }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x019d }
            if (r2 != 0) goto L_0x0153
            com.google.common.base.ax r2 = r6.f315459g     // Catch:{ all -> 0x019d }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.i r2 = (com.google.android.apps.gsa.nga.shared.p6407v.C83305i) r2     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.c.jz r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka.m131549c()     // Catch:{ all -> 0x019d }
            java.lang.String r4 = "handover_not_confirmed"
            r5 = r3
            com.google.android.apps.gsa.nga.shared.v.c.bm r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm) r5     // Catch:{ all -> 0x019d }
            r5.f224930b = r4     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.nga.shared.v.c.ka r3 = r3.mo75772a()     // Catch:{ all -> 0x019d }
            r2.mo75579d(r3)     // Catch:{ all -> 0x019d }
        L_0x0153:
            java.util.List r2 = r1.f315418a     // Catch:{ all -> 0x019d }
            r2.add(r9)     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.staticplugins.opa.v.w r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.HANDED_OVER_TO_OPA     // Catch:{ all -> 0x019d }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x019d }
            if (r2 != 0) goto L_0x0168
            com.google.android.apps.gsa.staticplugins.opa.v.w r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.HANDED_OVER_TO_OPA_WITHOUT_UI     // Catch:{ all -> 0x019d }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x016b
        L_0x0168:
            r2 = 1
            r1.f315420c = r2     // Catch:{ all -> 0x019d }
        L_0x016b:
            com.google.android.apps.gsa.staticplugins.opa.v.b r2 = r6.f315460h     // Catch:{ all -> 0x019d }
            com.google.android.apps.gsa.shared.logger.b.ae r9 = r2.mo100758b(r9)     // Catch:{ all -> 0x019d }
            if (r9 == 0) goto L_0x019b
            com.google.android.apps.gsa.shared.logger.b.ae r2 = r1.f315419b     // Catch:{ all -> 0x019d }
            if (r2 != 0) goto L_0x017a
            r1.f315419b = r9     // Catch:{ all -> 0x019d }
            goto L_0x019b
        L_0x017a:
            com.google.common.f.e r1 = f315453e     // Catch:{ all -> 0x019d }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            r3 = 24350(0x5f1e, float:3.4122E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x019d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "Multiple end states for request id %d. Already tracked end state flow event %s, newly received end state flow event %s"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x019d }
            java.lang.String r8 = r2.name()     // Catch:{ all -> 0x019d }
            java.lang.String r9 = r9.name()     // Catch:{ all -> 0x019d }
            r1.mo56359L(r3, r7, r8, r9)     // Catch:{ all -> 0x019d }
        L_0x019b:
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            return
        L_0x019d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x01a0:
            throw r7
        L_0x01a1:
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8595v.C113920x.mo100774c(long, com.google.android.apps.gsa.staticplugins.opa.v.w):void");
    }

    /* renamed from: d */
    public final boolean mo100775d(long j, C113919w wVar) {
        boolean z;
        synchronized (this.f315454a) {
            C113918v vVar = (C113918v) this.f315456c.get(Long.valueOf(j));
            z = false;
            if (vVar != null && vVar.f315418a.contains(wVar)) {
                z = true;
            }
        }
        return z;
    }
}

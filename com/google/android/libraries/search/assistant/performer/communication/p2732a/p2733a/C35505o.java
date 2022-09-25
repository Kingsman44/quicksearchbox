package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import android.os.Build;
import android.telephony.PhoneStateListener;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60872cz;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.o */
/* compiled from: PG */
final class C35505o {

    /* renamed from: a */
    public final PhoneStateListener f93228a;

    /* renamed from: b */
    public C35504n f93229b;

    /* renamed from: c */
    public String f93230c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public final Object f93231d = new Object();

    /* renamed from: e */
    public C60872cz f93232e;

    /* renamed from: f */
    public long f93233f;

    /* renamed from: g */
    public long f93234g;

    /* renamed from: h */
    final /* synthetic */ C35506p f93235h;

    /* renamed from: i */
    private C60872cz f93236i;

    public C35505o(C35506p pVar) {
        this.f93235h = pVar;
        this.f93228a = new C35499i(this, pVar.f93239c);
        if (Build.VERSION.SDK_INT >= 31) {
            this.f93229b = new C35504n(this);
        }
        this.f93232e = null;
        this.f93236i = null;
    }

    /* renamed from: c */
    public final boolean mo39680c() {
        boolean z;
        synchronized (this.f93231d) {
            z = this.f93233f > -1;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo39679b() {
        PhoneStateListener phoneStateListener;
        C35504n nVar;
        synchronized (this.f93231d) {
            if (Build.VERSION.SDK_INT >= 31 && (nVar = this.f93229b) != null) {
                this.f93235h.f93242f.unregisterTelephonyCallback(nVar);
            } else if (Build.VERSION.SDK_INT < 31 && (phoneStateListener = this.f93228a) != null) {
                this.f93235h.f93242f.listen(phoneStateListener, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0162, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0164, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39678a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f93231d
            monitor-enter(r0)
            r1 = 0
            r2 = 2
            if (r8 == 0) goto L_0x006e
            if (r8 == r2) goto L_0x0021
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35506p.f93237a     // Catch:{ all -> 0x0165 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x0165 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0165 }
            r1 = 51729(0xca11, float:7.2488E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r1)     // Catch:{ all -> 0x0165 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = "Unknown Call State"
            r8.mo56386p(r1)     // Catch:{ all -> 0x0165 }
            goto L_0x0161
        L_0x0021:
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.f.a r8 = r8.f93240d     // Catch:{ all -> 0x0165 }
            long r2 = r8.mo26871c()     // Catch:{ all -> 0x0165 }
            r7.f93233f = r2     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.f.a r8 = r8.f93240d     // Catch:{ all -> 0x0165 }
            long r2 = r8.mo26870b()     // Catch:{ all -> 0x0165 }
            r7.f93234g = r2     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.c.a r8 = r8.f93243g     // Catch:{ all -> 0x0165 }
            r8.mo39708b()     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.cz r8 = r7.f93232e     // Catch:{ all -> 0x0165 }
            if (r8 == 0) goto L_0x0043
            r8.cancel(r1)     // Catch:{ all -> 0x0165 }
        L_0x0043:
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            e.a.a.g.b.a.r r8 = r8.f93244h     // Catch:{ all -> 0x0165 }
            long r1 = r8.mo60461a()     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r8 = r8.f93239c     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.d r3 = new com.google.android.libraries.search.assistant.performer.communication.a.a.d     // Catch:{ all -> 0x0165 }
            r3.<init>(r7, r1)     // Catch:{ all -> 0x0165 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.cz r8 = r8.mo29164d(r3, r1, r4)     // Catch:{ all -> 0x0165 }
            r7.f93236i = r8     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.k r1 = new com.google.android.libraries.search.assistant.performer.communication.a.a.k     // Catch:{ all -> 0x0165 }
            r1.<init>()     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r2 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r2 = r2.f93239c     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.bz r1 = com.google.apps.tiktok.tracing.C47810es.m84974n(r1)     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r1, r2)     // Catch:{ all -> 0x0165 }
            goto L_0x0161
        L_0x006e:
            boolean r8 = r7.mo39680c()     // Catch:{ all -> 0x0165 }
            if (r8 == 0) goto L_0x0163
            com.google.common.util.concurrent.cz r8 = r7.f93236i     // Catch:{ all -> 0x0165 }
            if (r8 == 0) goto L_0x007e
            boolean r8 = r8.isDone()     // Catch:{ all -> 0x0165 }
            if (r8 != 0) goto L_0x0163
        L_0x007e:
            com.google.common.util.concurrent.cz r8 = r7.f93236i     // Catch:{ all -> 0x0165 }
            if (r8 == 0) goto L_0x0085
            r8.cancel(r1)     // Catch:{ all -> 0x0165 }
        L_0x0085:
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r8 = r8.f93239c     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.e r1 = new com.google.android.libraries.search.assistant.performer.communication.a.a.e     // Catch:{ all -> 0x0165 }
            r1.<init>(r7)     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.cx r8 = r8.mo19398a(r1)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.l r1 = new com.google.android.libraries.search.assistant.performer.communication.a.a.l     // Catch:{ all -> 0x0165 }
            r1.<init>()     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r3 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r3 = r3.f93239c     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.bz r1 = com.google.apps.tiktok.tracing.C47810es.m84974n(r1)     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r1, r3)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.f.a r8 = r8.f93240d     // Catch:{ all -> 0x0165 }
            long r3 = r8.mo26871c()     // Catch:{ all -> 0x0165 }
            long r5 = r7.f93233f     // Catch:{ all -> 0x0165 }
            long r3 = r3 - r5
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            e.a.a.g.b.a.r r8 = r8.f93244h     // Catch:{ all -> 0x0165 }
            long r5 = r8.mo60461a()     // Catch:{ all -> 0x0165 }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d1
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35506p.f93237a     // Catch:{ all -> 0x0165 }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x0165 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0165 }
            r1 = 51732(0xca14, float:7.2492E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r1)     // Catch:{ all -> 0x0165 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = "Got call duration after allowed tracking time completed."
            r8.mo56386p(r1)     // Catch:{ all -> 0x0165 }
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x00d1:
            com.google.assistant.ab.ca r8 = com.google.assistant.p3745ab.C48273ca.f124851d     // Catch:{ all -> 0x0165 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0165 }
            com.google.assistant.ab.bz r8 = (com.google.assistant.p3745ab.C48269bz) r8     // Catch:{ all -> 0x0165 }
            float r1 = (float) r3     // Catch:{ all -> 0x0165 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0165 }
            com.google.protobuf.bv r3 = r8.instance     // Catch:{ all -> 0x0165 }
            com.google.assistant.ab.ca r3 = (com.google.assistant.p3745ab.C48273ca) r3     // Catch:{ all -> 0x0165 }
            int r4 = r3.f124853a     // Catch:{ all -> 0x0165 }
            r2 = r2 | r4
            r3.f124853a = r2     // Catch:{ all -> 0x0165 }
            r3.f124855c = r1     // Catch:{ all -> 0x0165 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0165 }
            com.google.assistant.ab.ca r8 = (com.google.assistant.p3745ab.C48273ca) r8     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r1 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.c r1 = r1.mo39681c(r8)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r2 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.c.a r2 = r2.f93243g     // Catch:{ all -> 0x0165 }
            r3 = r1
            com.google.android.libraries.search.assistant.performer.communication.a.a.a r3 = (com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35491a) r3     // Catch:{ all -> 0x0165 }
            com.google.assistant.ab.ca r3 = r3.f93214a     // Catch:{ all -> 0x0165 }
            r4 = r1
            com.google.android.libraries.search.assistant.performer.communication.a.a.a r4 = (com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35491a) r4     // Catch:{ all -> 0x0165 }
            j$.time.Duration r4 = r4.f93215b     // Catch:{ all -> 0x0165 }
            r2.mo39709c(r3, r4)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r2 = r7.f93235h     // Catch:{ all -> 0x0165 }
            android.content.Context r2 = r2.f93238b     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "android.permission.READ_CALL_LOG"
            int r2 = r2.checkSelfPermission(r3)     // Catch:{ all -> 0x0165 }
            r3 = -1
            if (r2 != r3) goto L_0x0126
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.c.a r8 = r8.f93243g     // Catch:{ all -> 0x0165 }
            r2 = r1
            com.google.android.libraries.search.assistant.performer.communication.a.a.a r2 = (com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35491a) r2     // Catch:{ all -> 0x0165 }
            com.google.assistant.ab.ca r2 = r2.f93214a     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.a r1 = (com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35491a) r1     // Catch:{ all -> 0x0165 }
            j$.time.Duration r1 = r1.f93215b     // Catch:{ all -> 0x0165 }
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.PERMISSION_DENIED     // Catch:{ all -> 0x0165 }
            r8.mo39713g(r2, r1, r3)     // Catch:{ all -> 0x0165 }
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x0126:
            java.lang.String r1 = r7.f93230c     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.g r2 = new com.google.android.libraries.search.assistant.performer.communication.a.a.g     // Catch:{ all -> 0x0165 }
            r2.<init>(r7, r1)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r1 = r7.f93235h     // Catch:{ all -> 0x0165 }
            e.a.a.g.b.a.r r1 = r1.f93244h     // Catch:{ all -> 0x0165 }
            g.a.a r1 = r1.f184849a     // Catch:{ all -> 0x0165 }
            java.lang.Object r1 = r1.mo17428b()     // Catch:{ all -> 0x0165 }
            com.google.apps.tiktok.experiments.i r1 = (com.google.apps.tiktok.experiments.C46897i) r1     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "com.google.android.apps.search.assistant.user 45370893"
            com.google.apps.tiktok.experiments.p r1 = r1.mo50901a(r3)     // Catch:{ all -> 0x0165 }
            long r3 = r1.mo50903b()     // Catch:{ all -> 0x0165 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r5 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r5 = r5.f93239c     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.r r2 = com.google.apps.tiktok.tracing.C47810es.m84965e(r2)     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92902k(r2, r3, r1, r5)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.m r2 = new com.google.android.libraries.search.assistant.performer.communication.a.a.m     // Catch:{ all -> 0x0165 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x0165 }
            com.google.android.libraries.search.assistant.performer.communication.a.a.p r8 = r7.f93235h     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.db r8 = r8.f93239c     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.bz r2 = com.google.apps.tiktok.tracing.C47810es.m84974n(r2)     // Catch:{ all -> 0x0165 }
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r8)     // Catch:{ all -> 0x0165 }
        L_0x0161:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x0163:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x0165:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35505o.mo39678a(int):void");
    }
}

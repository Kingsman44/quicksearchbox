package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ak */
/* compiled from: PG */
public final class C131771ak implements C47102r {

    /* renamed from: a */
    private final Set f359948a;

    /* renamed from: b */
    private final boolean f359949b;

    /* renamed from: c */
    private final C47770dh f359950c;

    /* renamed from: d */
    private final C130895ag f359951d;

    /* renamed from: e */
    private final C58974d f359952e;

    public C131771ak(Set set, boolean z, C47770dh dhVar, C130895ag agVar, C130603a aVar) {
        this.f359948a = set;
        this.f359949b = z;
        this.f359950c = dhVar;
        this.f359951d = agVar;
        this.f359952e = aVar.mo109740b(this);
    }

    /* renamed from: a */
    private final C60870cx m214273a(Intent intent, String str) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream(this.f359948a).filter(new C131767ag(str)).map(new C131768ah(intent)).collect(C58370cn.f155946a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r6, int r7) {
        /*
            r5 = this;
            com.google.common.f.a.d r7 = r5.f359952e
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            r0 = 39359(0x99bf, float:5.5154E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            r7.mo56385o(r6)
            r6.getExtras()
            boolean r7 = r5.f359949b
            if (r7 != 0) goto L_0x0042
            com.google.common.f.a.d r6 = r5.f359952e
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "LocationUpdateReceiver not enabled."
            r0 = 39363(0x99c3, float:5.516E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r0)).mo56386p(r7)
            java.util.Set r6 = r5.f359948a
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ai r7 = com.google.android.apps.search.assistant.verticals.ambient.trigger.location.C131769ai.f359946a
            j$.util.stream.Stream r6 = r6.map(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r6 = r6.collect(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92896e(r6)
            return r6
        L_0x0042:
            java.lang.String r7 = r6.getAction()
            java.lang.String r7 = com.google.common.base.C58837ba.m90858g(r7)
            int r0 = r7.hashCode()
            r1 = -15403188(0xffffffffff14f74c, float:-1.9800978E38)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x0075
            r1 = 296859820(0x11b1b8ac, float:2.803949E-28)
            if (r0 == r1) goto L_0x006b
            r1 = 544111955(0x206e7d53, float:2.020085E-19)
            if (r0 == r1) goto L_0x0061
            goto L_0x007f
        L_0x0061:
            java.lang.String r0 = "com.google.android.search.assistant.ambient.REGISTER_UPDATES"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 0
            goto L_0x0080
        L_0x006b:
            java.lang.String r0 = "com.google.android.search.assistant.ambient.UNREGISTER_UPDATES"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x0075:
            java.lang.String r0 = "com.google.android.search.assistant.ambient.CSL_UPDATE_EVENT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 2
            goto L_0x0080
        L_0x007f:
            r0 = -1
        L_0x0080:
            if (r0 == 0) goto L_0x0102
            if (r0 == r4) goto L_0x00db
            if (r0 == r2) goto L_0x0092
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Unexpected intent."
            r6.<init>(r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92899h(r6)
            return r6
        L_0x0092:
            java.util.WeakHashMap r0 = com.google.apps.tiktok.tracing.C47831fm.f123851a     // Catch:{ IllegalStateException -> 0x00ab }
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r0 = r5.f359951d     // Catch:{ IllegalStateException -> 0x00ab }
            r0.mo109865A()     // Catch:{ IllegalStateException -> 0x00ab }
            com.google.android.libraries.performance.primes.ax r0 = com.google.android.libraries.performance.primes.C31167ax.m58112a()     // Catch:{ IllegalStateException -> 0x00ab }
            java.lang.String r1 = "CSL_PLACE_INFERENCE_TIME"
            com.google.android.libraries.performance.primes.au r1 = com.google.android.libraries.performance.primes.C31164au.m58092b(r1)     // Catch:{ IllegalStateException -> 0x00ab }
            r0.mo36914e(r1)     // Catch:{ IllegalStateException -> 0x00ab }
            com.google.common.util.concurrent.cx r6 = r5.m214273a(r6, r7)     // Catch:{ IllegalStateException -> 0x00ab }
            return r6
        L_0x00ab:
            com.google.apps.tiktok.tracing.dh r0 = r5.f359950c
            java.lang.String r1 = "CSL_UPDATE"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            com.google.common.util.concurrent.cx r6 = r5.m214273a(r6, r7)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00bc
            r0.close()
        L_0x00bc:
            return r6
        L_0x00bd:
            r6 = move-exception
            if (r0 == 0) goto L_0x00da
            r0.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00da
        L_0x00c4:
            r7 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00da }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r3] = r1     // Catch:{ Exception -> 0x00da }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch:{ Exception -> 0x00da }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00da }
            r1[r3] = r7     // Catch:{ Exception -> 0x00da }
            r0.invoke(r6, r1)     // Catch:{ Exception -> 0x00da }
        L_0x00da:
            throw r6
        L_0x00db:
            com.google.common.f.a.d r6 = r5.f359952e
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "LocationUpdateReceiver stop."
            r0 = 39362(0x99c2, float:5.5158E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r0)).mo56386p(r7)
            java.util.Set r6 = r5.f359948a
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ai r7 = com.google.android.apps.search.assistant.verticals.ambient.trigger.location.C131769ai.f359946a
            j$.util.stream.Stream r6 = r6.map(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r6 = r6.collect(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92896e(r6)
            return r6
        L_0x0102:
            com.google.common.f.a.d r7 = r5.f359952e
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r0 = "LocationUpdateReceiver start."
            r1 = 39361(0x99c1, float:5.5157E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r1)).mo56386p(r0)
            java.lang.String r7 = "USER ACTION"
            boolean r6 = r6.getBooleanExtra(r7, r3)
            java.util.Set r7 = r5.f359948a
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.location.aj r0 = new com.google.android.apps.search.assistant.verticals.ambient.trigger.location.aj
            r0.<init>(r6)
            j$.util.stream.Stream r6 = r7.map(r0)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r6 = r6.collect(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92896e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.C131771ak.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}

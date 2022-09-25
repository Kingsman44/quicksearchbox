package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37469cr;
import com.google.android.libraries.search.p2904c.C37496dc;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.libraries.search.p2904c.p2908b.C37373b;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37369f;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2942m.p2946d.C37883a;
import com.google.android.libraries.search.p2904c.p2977w.p2979b.C38140a;
import com.google.android.libraries.search.p2904c.p2977w.p2979b.p2981b.C38150a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.w.b.a.h */
/* compiled from: PG */
public final class C38148h implements C38140a {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f101076a = C59071e.m91331h();

    /* renamed from: b */
    public final C37369f f101077b;

    /* renamed from: c */
    public final C37895i f101078c;

    /* renamed from: d */
    public final C71422aw f101079d;

    /* renamed from: e */
    public final C60836bq f101080e;

    /* renamed from: f */
    private final Executor f101081f;

    /* renamed from: g */
    private final C71422aw f101082g;

    /* renamed from: h */
    private final C37883a f101083h;

    /* renamed from: i */
    private final C60836bq f101084i = new C60836bq();

    public C38148h(C37369f fVar, C37895i iVar, Executor executor, C71422aw awVar, C71422aw awVar2, C60836bq bqVar, C37883a aVar) {
        C69664n.m101061g(fVar, "audioAdapterStoreMap");
        C69664n.m101061g(iVar, "clientsManager");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(awVar2, "blockingScope");
        C69664n.m101061g(bqVar, "audioExecutionSequencer");
        C69664n.m101061g(aVar, "timeoutTracker");
        this.f101077b = fVar;
        this.f101078c = iVar;
        this.f101081f = executor;
        this.f101082g = awVar;
        this.f101079d = awVar2;
        this.f101080e = bqVar;
        this.f101083h = aVar;
    }

    /* renamed from: e */
    private final C60870cx m67342e(C37384h hVar, C37500dg dgVar) {
        C59052c cVar = (C59052c) f101076a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
        String name = hVar.name();
        cVar.mo56379ah(new C59094n(52982));
        cVar.mo56389s("#audio# disconnect audio adapter(%s) route", name);
        this.f101083h.mo41122a(C37373b.m66392d(hVar));
        return mo41283b(this.f101084i, this.f101082g, new C38143c(this, hVar, dgVar, (C69577g) null));
    }

    /* renamed from: a */
    public final C60870cx mo41282a(C37467cp cpVar) {
        C37469cr crVar;
        C37496dc dcVar;
        C37502di diVar;
        C69664n.m101061g(cpVar, "route");
        C59071e eVar = f101076a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
        C37465cn a = C37465cn.m66491a(cpVar.f99460a);
        cVar.mo56379ah(new C59094n(52980));
        cVar.mo56389s("#audio# disconnect route(%s) by type", a);
        switch (C37465cn.m66491a(cpVar.f99460a).ordinal()) {
            case 0:
            case 1:
            case 2:
            case 6:
                C59052c cVar2 = (C59052c) eVar.mo56224b();
                cVar2.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
                C37465cn a2 = C37465cn.m66491a(cpVar.f99460a);
                cVar2.mo56379ah(new C59094n(52981));
                cVar2.mo56389s("#audio# no disconnect support for route(%s) by type", a2);
                return C60856cj.m92900i(C38150a.STATUS_NOT_SUPPORTED);
            case 3:
                C37384h hVar = C37384h.BISTO;
                if (cpVar.f99460a == 4) {
                    crVar = (C37469cr) cpVar.f99461b;
                } else {
                    crVar = C37469cr.f99462d;
                }
                C37500dg dgVar = crVar.f99466c;
                if (dgVar == null) {
                    dgVar = C37500dg.f99557c;
                }
                C69664n.m101060f(dgVar, "route.bistoAudioRoute.precachedBufferId");
                return m67342e(hVar, dgVar);
            case 4:
                if (cpVar.f99460a == 5) {
                    dcVar = (C37496dc) cpVar.f99461b;
                } else {
                    dcVar = C37496dc.f99549c;
                }
                C37655hb hbVar = dcVar.f99552b;
                if (hbVar == null) {
                    hbVar = C37655hb.f100025d;
                }
                int i = hbVar.f100028b;
                C59052c cVar3 = (C59052c) eVar.mo56224b();
                cVar3.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
                cVar3.mo56379ah(new C59094n(52983));
                cVar3.mo56387q("#audio# disconnect handover route(handOffId(%d))", i);
                return mo41283b(this.f101084i, this.f101082g, new C38144d(this, i, (C69577g) null));
            case 5:
                C37384h hVar2 = C37384h.SODA;
                if (cpVar.f99460a == 6) {
                    diVar = (C37502di) cpVar.f99461b;
                } else {
                    diVar = C37502di.f99561c;
                }
                C37500dg dgVar2 = diVar.f99564b;
                if (dgVar2 == null) {
                    dgVar2 = C37500dg.f99557c;
                }
                C69664n.m101060f(dgVar2, "route.sodaRoute.precachedBufferId");
                return m67342e(hVar2, dgVar2);
            default:
                throw new C69677g();
        }
    }

    /* renamed from: b */
    public final C60870cx mo41283b(C60836bq bqVar, C71422aw awVar, C69626l lVar) {
        C60870cx b = bqVar.mo57305b(new C38146f(awVar, lVar), this.f101081f);
        C69664n.m101060f(b, "operationScope: Coroutin…} }, lightweightExecutor)");
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41284c(com.google.android.libraries.search.p2904c.p2908b.C37363a r6, com.google.android.libraries.search.p2904c.p2908b.C37384h r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38141a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.c.w.b.a.a r0 = (com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38141a) r0
            int r1 = r0.f101053d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101053d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.w.b.a.a r0 = new com.google.android.libraries.search.c.w.b.a.a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f101051b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101053d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r7 = r0.f101050a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002a }
            goto L_0x004a
        L_0x002a:
            r6 = move-exception
            goto L_0x004e
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            p5462h.C69714l.m101134b(r8)
            com.google.common.util.concurrent.cx r6 = r6.mo24475e(r3)     // Catch:{ all -> 0x002a }
            java.lang.String r8 = "audioAdapter.disconnect(/* timedOut= */ false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x002a }
            r0.f101050a = r7     // Catch:{ all -> 0x002a }
            r0.f101053d = r4     // Catch:{ all -> 0x002a }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ all -> 0x002a }
            if (r8 == r1) goto L_0x004d
        L_0x004a:
            com.google.android.libraries.search.c.b.f r8 = (com.google.android.libraries.search.p2904c.p2908b.C37382f) r8     // Catch:{ all -> 0x002a }
            goto L_0x0052
        L_0x004d:
            return r1
        L_0x004e:
            java.lang.Object r8 = p5462h.C69714l.m101133a(r6)
        L_0x0052:
            java.lang.Throwable r6 = p5462h.C69702k.m101124a(r8)
            java.lang.String r0 = "ALT.RouteDisconnector"
            if (r6 != 0) goto L_0x008d
            com.google.android.libraries.search.c.b.f r8 = (com.google.android.libraries.search.p2904c.p2908b.C37382f) r8
            com.google.common.f.e r6 = f101076a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r1, r0)
            com.google.android.libraries.search.c.b.h r7 = (com.google.android.libraries.search.p2904c.p2908b.C37384h) r7
            java.lang.String r7 = r7.name()
            java.lang.String r0 = r8.name()
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52985(0xcef9, float:7.4248E-41)
            r1.<init>(r2)
            r6.mo56379ah(r1)
            java.lang.String r1 = "#audio# adapter(%s) was disconnected with status(%s)"
            r6.mo56354G(r1, r7, r0)
            com.google.android.libraries.search.c.b.f r6 = com.google.android.libraries.search.p2904c.p2908b.C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS
            if (r8 != r6) goto L_0x0088
            r3 = 1
        L_0x0088:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            goto L_0x00ba
        L_0x008d:
            com.google.common.f.e r8 = f101076a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r1, r0)
            com.google.common.f.x r6 = r8.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.android.libraries.search.c.b.h r7 = (com.google.android.libraries.search.p2904c.p2908b.C37384h) r7
            java.lang.String r7 = r7.name()
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 52984(0xcef8, float:7.4246E-41)
            r8.<init>(r0)
            r6.mo56379ah(r8)
            java.lang.String r8 = "#audio# adapter(%s) failed to disconnect"
            r6.mo56389s(r8, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
        L_0x00ba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38148h.mo41284c(com.google.android.libraries.search.c.b.a, com.google.android.libraries.search.c.b.h, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41285d(com.google.android.libraries.search.p2904c.p2908b.C37363a r6, com.google.android.libraries.search.p2904c.p2908b.C37384h r7, com.google.android.libraries.search.p2904c.C37500dg r8, p5462h.p5466c.C69577g r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38147g
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.c.w.b.a.g r0 = (com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38147g) r0
            int r1 = r0.f101075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101075e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.w.b.a.g r0 = new com.google.android.libraries.search.c.w.b.a.g
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f101073c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101075e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f101072b
            java.lang.Object r7 = r0.f101071a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x002b }
            goto L_0x0065
        L_0x002b:
            r6 = move-exception
            goto L_0x0069
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.c.b.n r9 = com.google.android.libraries.search.p2904c.p2908b.C37390n.f99313d     // Catch:{ all -> 0x002b }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.c.b.m r9 = (com.google.android.libraries.search.p2904c.p2908b.C37389m) r9     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.c.b.r r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")     // Catch:{ all -> 0x002b }
            r9.mo40926b(r8)     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.c.b.n r9 = r9.mo40925a()     // Catch:{ all -> 0x002b }
            com.google.common.util.concurrent.cx r6 = r6.mo24476f(r9)     // Catch:{ all -> 0x002b }
            java.lang.String r9 = "audioAdapter.stopListening(stopParams)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)     // Catch:{ all -> 0x002b }
            r0.f101071a = r7     // Catch:{ all -> 0x002b }
            r0.f101072b = r8     // Catch:{ all -> 0x002b }
            r0.f101075e = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ all -> 0x002b }
            if (r9 == r1) goto L_0x0068
        L_0x0065:
            com.google.android.libraries.search.c.du r9 = (com.google.android.libraries.search.p2904c.C37514du) r9     // Catch:{ all -> 0x002b }
            goto L_0x006d
        L_0x0068:
            return r1
        L_0x0069:
            java.lang.Object r9 = p5462h.C69714l.m101133a(r6)
        L_0x006d:
            java.lang.Throwable r6 = p5462h.C69702k.m101124a(r9)
            r0 = 0
            java.lang.String r1 = "ALT.RouteDisconnector"
            if (r6 != 0) goto L_0x00af
            com.google.android.libraries.search.c.du r9 = (com.google.android.libraries.search.p2904c.C37514du) r9
            com.google.common.f.e r6 = f101076a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r2, r1)
            com.google.android.libraries.search.c.b.h r7 = (com.google.android.libraries.search.p2904c.p2908b.C37384h) r7
            java.lang.String r7 = r7.name()
            java.lang.String r1 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)
            java.lang.String r1 = com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38149i.m67347a(r9)
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 52987(0xcefb, float:7.425E-41)
            r2.<init>(r4)
            r6.mo56379ah(r2)
            java.lang.String r2 = "#audio# adapter(%s) was stopped(bufferId(%d)) with status(%s)"
            r6.mo56359L(r2, r7, r8, r1)
            int r6 = r9.f99631a
            if (r6 != r3) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            goto L_0x00dc
        L_0x00af:
            com.google.common.f.e r9 = f101076a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r2, r1)
            com.google.common.f.x r6 = r9.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.android.libraries.search.c.b.h r7 = (com.google.android.libraries.search.p2904c.p2908b.C37384h) r7
            java.lang.String r7 = r7.name()
            com.google.common.f.n r9 = new com.google.common.f.n
            r1 = 52986(0xcefa, float:7.4249E-41)
            r9.<init>(r1)
            r6.mo56379ah(r9)
            java.lang.String r9 = "#audio# adapter(%s) failed to stop(bufferId(%d))"
            r6.mo56354G(r9, r7, r8)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x00dc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38148h.mo41285d(com.google.android.libraries.search.c.b.a, com.google.android.libraries.search.c.b.h, com.google.android.libraries.search.c.dg, h.c.g):java.lang.Object");
    }
}

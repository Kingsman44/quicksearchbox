package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ab */
/* compiled from: PG */
final class C93079ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C93081ad f259631a;

    public C93079ab(C93081ad adVar) {
        this.f259631a = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C93081ad.f259632a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(13312)).mo56386p("sendUpdateToMediaCard failed due to client op issue");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r0 == com.google.assistant.p3897e.p3921j.C52235kf.IGNORE) goto L_0x0041;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17911gm(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.assistant.e.j.ec r4 = (com.google.assistant.p3897e.p3921j.C52070ec) r4
            if (r4 != 0) goto L_0x0019
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93081ad.f259632a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "MediaInitPerformer"
            r4.mo56378ag(r0, r1)
            java.lang.String r0 = "sendUpdateToMediaCard with null clientOpResult"
            r1 = 13313(0x3401, float:1.8655E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0019:
            com.google.assistant.e.j.kg r0 = r4.f136654b
            if (r0 != 0) goto L_0x001f
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x001f:
            int r0 = r0.f137092b
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r0)
            if (r0 != 0) goto L_0x0029
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x0029:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.OK
            if (r0 == r1) goto L_0x0041
            com.google.assistant.e.j.kg r0 = r4.f136654b
            if (r0 != 0) goto L_0x0033
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x0033:
            int r0 = r0.f137092b
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r0)
            if (r0 != 0) goto L_0x003d
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x003d:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.IGNORE
            if (r0 != r1) goto L_0x004d
        L_0x0041:
            com.google.assistant.e.j.kg r4 = r4.f136654b
            if (r4 != 0) goto L_0x0047
            com.google.assistant.e.j.kg r4 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x0047:
            int r4 = r4.f137091a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0092
        L_0x004d:
            com.google.android.apps.gsa.search.shared.service.b.zi r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi.f238978e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.zf r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88372zf) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.apps.gsa.search.shared.service.b.zi r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi) r0
            r1 = 5
            r0.f238981b = r1
            int r1 = r0.f238980a
            r1 = r1 | 1
            r0.f238980a = r1
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.search.shared.service.b.zi r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi) r4
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ad r0 = r3.f259631a
            dagger.a r0 = r0.f259638f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.a.ai r0 = (com.google.android.apps.gsa.search.core.p6491a.C84350ai) r0
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.UPDATE_MEDIA_EXECUTION
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88376zj.f238984a
            r1.mo81965b(r2, r4)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r4 = r1.mo81964a()
            com.google.common.util.concurrent.cx r4 = r0.mo77886a(r4)
            java.lang.String r0 = "Service event sent, received: %b"
            java.lang.String r1 = "Failed to send service event to active client."
            java.lang.String r2 = "MediaInitiationPerformer"
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148481o(r4, r2, r0, r1)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93079ab.mo17911gm(java.lang.Object):void");
    }
}

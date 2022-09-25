package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.C39365bn;
import com.google.android.libraries.search.p3055n.C39374bw;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.b.b.bl */
/* compiled from: PG */
final class C39318bl implements C70862aj {

    /* renamed from: a */
    public final C70862aj f103560a;

    /* renamed from: b */
    public final C39280aa f103561b;

    /* renamed from: c */
    public boolean f103562c = false;

    /* renamed from: d */
    final /* synthetic */ C39319bm f103563d;

    public C39318bl(C39319bm bmVar, C70862aj ajVar, C39280aa aaVar) {
        this.f103563d = bmVar;
        this.f103560a = ajVar;
        this.f103561b = aaVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59104x b = C39319bm.f103564a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) b).mo56372aa(53454)).mo56386p("#onCompleted");
        C39319bm bmVar = this.f103563d;
        C46459k.m82829b(bmVar.f103567d.mo51512b(new C39313bg(this), bmVar.f103568e), "SodaAsrFrontend: onCompleted failed to clean up.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C39319bm.f103564a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53455)).mo56389s("SodaAsrFrontendService ending due to client error: %s", th.getMessage());
        C39319bm bmVar = this.f103563d;
        C46459k.m82829b(bmVar.f103567d.mo51512b(new C39308bb(this, th), bmVar.f103568e), "SodaAsrFrontend: onError failed to clean up.", new Object[0]);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C39670cx cxVar = (C39670cx) obj;
        C62940bt r0 = C62942bv.checkIsLite(C39374bw.f103687e);
        cxVar.mo58887l(r0);
        if (cxVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x b = C39319bm.f103564a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) b).mo56372aa(53461)).mo56386p("SodaAsrCompatibilityCheckRequest");
            C70862aj ajVar = this.f103560a;
            C39319bm bmVar = this.f103563d;
            C46459k.m82829b(bmVar.f103567d.mo51512b(new C39297ar(this, cxVar, ajVar), bmVar.f103568e), "SodaAsrFrontend: checkAsrCompatibility failed.", new Object[0]);
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C39655ci.f104378k);
        cxVar.mo58887l(r02);
        if (cxVar.f169962ag.mo58857o(r02.f169971d)) {
            C59104x b2 = C39319bm.f103564a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) b2).mo56372aa(53460)).mo56386p("SodaAsrStartRequest");
            C70862aj ajVar2 = this.f103560a;
            C39317bk bkVar = new C39317bk(this, ajVar2);
            C39319bm bmVar2 = this.f103563d;
            C46459k.m82829b(bmVar2.f103567d.mo51512b(new C39304ay(this, cxVar, bkVar, ajVar2), bmVar2.f103568e), "SodaAsrFrontend: startAsr failed.", new Object[0]);
            return;
        }
        C62940bt r03 = C62942bv.checkIsLite(C39666ct.f104416f);
        cxVar.mo58887l(r03);
        if (cxVar.f169962ag.mo58857o(r03.f169971d)) {
            C59104x b3 = C39319bm.f103564a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) b3).mo56372aa(53459)).mo56386p("SodaAsrUpdateRequest");
            C39319bm bmVar3 = this.f103563d;
            C46459k.m82829b(bmVar3.f103567d.mo51512b(new C39309bc(this, cxVar), bmVar3.f103568e), "SodaAsrFrontend: update failed.", new Object[0]);
            return;
        }
        C62940bt r04 = C62942bv.checkIsLite(C39361bj.f103655d);
        cxVar.mo58887l(r04);
        if (cxVar.f169962ag.mo58857o(r04.f169971d)) {
            C58976aa aaVar = C58975e.f156826a;
            C39319bm bmVar4 = this.f103563d;
            C46459k.m82829b(bmVar4.f103567d.mo51512b(new C39303ax(this, cxVar), bmVar4.f103568e), "SodaAsrFrontend: pushAudio failed.", new Object[0]);
            return;
        }
        C62940bt r05 = C62942bv.checkIsLite(C39365bn.f103661n);
        cxVar.mo58887l(r05);
        if (cxVar.f169962ag.mo58857o(r05.f169971d)) {
            C59104x b4 = C39319bm.f103564a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) b4).mo56372aa(53457)).mo56386p("QueryFulfillmentSignalRequest");
            C39319bm bmVar5 = this.f103563d;
            C46459k.m82829b(bmVar5.f103567d.mo51512b(new C39314bh(this, cxVar), bmVar5.f103568e), "SodaAsrFrontend: queryFulfillment failed.", new Object[0]);
            return;
        }
        C59104x c = C39319bm.f103564a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) c).mo56372aa(53456)).mo56386p("SodaRequest not handled!");
    }

    /* renamed from: d */
    public final C60870cx mo41768d(Throwable th) {
        this.f103562c = true;
        return this.f103563d.mo41772e(this.f103560a, th.getMessage(), true);
    }
}

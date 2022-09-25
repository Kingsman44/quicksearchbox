package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bn */
/* compiled from: PG */
public final /* synthetic */ class C114593bn implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114602bw f317824a;

    /* renamed from: b */
    public final /* synthetic */ C53422nh f317825b;

    public /* synthetic */ C114593bn(C114602bw bwVar, C53422nh nhVar) {
        this.f317824a = bwVar;
        this.f317825b = nhVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114602bw bwVar = this.f317824a;
        C53422nh nhVar = this.f317825b;
        C59104x d = C114602bw.f317838a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSResponseDataManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(29204)).mo56386p("#onServiceEvent(): failed to fetch new agenda local content");
        new C90873ag(bwVar.mo101442d(false), bwVar.f317845f, "getLocalAgendaFuture", new C114595bp(bwVar, nhVar)).mo85223a(new C114596bq(bwVar, nhVar));
    }
}

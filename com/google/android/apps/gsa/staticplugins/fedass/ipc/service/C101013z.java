package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100967b;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.z */
/* compiled from: PG */
final class C101013z extends C100967b {

    /* renamed from: a */
    final /* synthetic */ TrainCommunicationService f282112a;

    public C101013z(TrainCommunicationService trainCommunicationService) {
        this.f282112a = trainCommunicationService;
    }

    /* renamed from: e */
    public final void mo92117e(String str, C100971f fVar) {
        C59104x b = TrainCommunicationService.f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19624)).mo56386p("logTrainingCacheStats()");
        C101012y yVar = this.f282112a.f282039b;
        C100992e eVar = new C100992e(yVar, str, fVar);
        C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(eVar), yVar.f282105b));
        C101010w wVar = new C101010w();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(wVar), yVar.f282105b);
    }

    /* renamed from: f */
    public final void mo92118f(String str, C100971f fVar) {
        C59104x b = TrainCommunicationService.f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19625)).mo56386p("performCacheMaintenance()");
        C101012y yVar = this.f282112a.f282039b;
        C100996i iVar = new C100996i(yVar, str, fVar);
        C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(iVar), yVar.f282105b));
        C101009v vVar = new C101009v();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(vVar), yVar.f282105b);
    }

    /* renamed from: g */
    public final void mo92119g(String str, boolean z, C100971f fVar) {
        C59104x b = TrainCommunicationService.f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19626)).mo56386p("registerTraining()");
        C101012y yVar = this.f282112a.f282039b;
        C101004q qVar = new C101004q(yVar, str, z, fVar);
        C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(qVar), yVar.f282105b));
        C101007t tVar = new C101007t();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(tVar), yVar.f282105b);
    }

    /* renamed from: h */
    public final void mo92120h(C100971f fVar) {
        C59104x b = TrainCommunicationService.f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19627)).mo56386p("unRegisterTraining()");
        C101012y yVar = this.f282112a.f282039b;
        C100991d dVar = new C100991d(yVar, fVar);
        C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(dVar), yVar.f282105b));
        C101008u uVar = new C101008u();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(uVar), yVar.f282105b);
    }
}

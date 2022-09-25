package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.libraries.lens.sdk.avs.C24897n;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.AppFlowEvent;
import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.C24882q;
import com.google.android.libraries.lens.sdk.avs.data.C24883r;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.y */
/* compiled from: PG */
final class C78609y implements C24897n {

    /* renamed from: a */
    final /* synthetic */ C24898o f216414a;

    /* renamed from: b */
    final /* synthetic */ C24876k f216415b;

    /* renamed from: c */
    final /* synthetic */ C2164c f216416c;

    /* renamed from: d */
    final /* synthetic */ C78583aa f216417d;

    public C78609y(C78583aa aaVar, C24898o oVar, C24876k kVar, C2164c cVar) {
        this.f216417d = aaVar;
        this.f216414a = oVar;
        this.f216415b = kVar;
        this.f216416c = cVar;
    }

    /* renamed from: a */
    public final void mo30121a(C24870e eVar) {
        C59104x c = C78583aa.f216340a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AvsController");
        ((C59052c) ((C59052c) c).mo56372aa(5221)).mo56387q("Lens visual search client returned error, code: %d.", eVar.mo30073a());
        C89859i iVar = this.f216417d.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_ERROR;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
        int a = eVar.mo30073a();
        eiVar.copyOnWrite();
        C59753ej ejVar = (C59753ej) eiVar.instance;
        ejVar.f161451a |= 1;
        ejVar.f161452b = a;
        C59753ej ejVar2 = (C59753ej) eiVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        ejVar2.getClass();
        cbVar.f160126g = ejVar2;
        cbVar.f160062a |= 2;
        fVar.f246203c = (C59687cb) ajVar.build();
        iVar.mo74236a(fVar.mo83699a());
        this.f216416c.mo5437b(new C24877l());
        C24898o oVar = this.f216414a;
        C24883r rVar = new C24883r();
        rVar.mo30112b(this.f216417d.f216355o);
        oVar.mo30129f(rVar);
        this.f216417d.f216355o = BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final void mo30122b(C24877l lVar) {
        C89859i iVar = this.f216417d.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_QUERY_RESPONSE;
        iVar.mo74236a(fVar.mo83699a());
        this.f216416c.mo5437b(lVar);
        C24898o oVar = this.f216414a;
        C24883r rVar = new C24883r();
        rVar.mo30112b(this.f216417d.f216355o);
        oVar.mo30129f(rVar);
        this.f216417d.f216355o = BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public final void mo30123c(C24882q qVar) {
        C89859i iVar = this.f216417d.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_SESSION_STARTED;
        iVar.mo74236a(fVar.mo83699a());
        C78583aa aaVar = this.f216417d;
        String a = qVar.mo30109a();
        a.getClass();
        aaVar.f216355o = a;
        C24898o oVar = this.f216414a;
        C24876k kVar = this.f216415b;
        kVar.mo30091e(this.f216417d.f216355o);
        oVar.mo30126c(kVar);
        C89859i iVar2 = this.f216417d.f216353m;
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = C89849ae.ASSISTANT_AVS_QUERY_REQUEST;
        iVar2.mo74236a(fVar2.mo83699a());
    }

    /* renamed from: d */
    public final void mo30124d(C24884s sVar) {
        C89859i iVar = this.f216417d.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_SESSION_STOPPED;
        iVar.mo74236a(fVar.mo83699a());
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f216417d.f216352l.mo85405j(C90040cs.f248672k) || sVar.mo30113a() == null) {
            this.f216417d.f216356p = C58485gu.m89845m();
        } else {
            C78583aa aaVar2 = this.f216417d;
            AppFlowEvent[] a = sVar.mo30113a();
            a.getClass();
            aaVar2.f216356p = C58485gu.m89844l(a);
        }
        this.f216414a.mo30125a();
        C89859i iVar2 = this.f216417d.f216353m;
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = C89849ae.ASSISTANT_AVS_DISCONNECTED;
        iVar2.mo74236a(fVar2.mo83699a());
    }
}

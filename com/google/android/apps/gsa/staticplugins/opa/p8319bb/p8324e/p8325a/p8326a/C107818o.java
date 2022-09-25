package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.o */
/* compiled from: PG */
final class C107818o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C89849ae f299999a;

    /* renamed from: b */
    final /* synthetic */ long f300000b;

    /* renamed from: c */
    final /* synthetic */ Query f300001c;

    /* renamed from: d */
    final /* synthetic */ C107820q f300002d;

    public C107818o(C107820q qVar, C89849ae aeVar, long j, Query query) {
        this.f300002d = qVar;
        this.f299999a = aeVar;
        this.f300000b = j;
        this.f300001c = query;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C107820q.f300003a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NgaClientEventSubCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(26314)).mo56386p("Failed to record hotword rejection timestamp in query app flow metadata");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89856f fVar = new C89856f();
        fVar.f246201a = this.f299999a;
        fVar.mo83701c("rId", Long.toString(this.f300000b));
        fVar.f246203c = C90499g.m147581a(this.f300001c, ((Long) obj).longValue());
        ((C89859i) this.f300002d.f300026e.mo27525b()).mo74236a(fVar.mo83699a());
    }
}

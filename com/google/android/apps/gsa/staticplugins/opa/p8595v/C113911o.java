package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.o */
/* compiled from: PG */
final class C113911o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f315369a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f315370b;

    /* renamed from: c */
    final /* synthetic */ boolean f315371c;

    /* renamed from: d */
    final /* synthetic */ C89856f f315372d;

    /* renamed from: e */
    final /* synthetic */ C113916t f315373e;

    public C113911o(C113916t tVar, C58833ax axVar, C58833ax axVar2, boolean z, C89856f fVar) {
        this.f315373e = tVar;
        this.f315369a = axVar;
        this.f315370b = axVar2;
        this.f315371c = z;
        this.f315372d = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C113916t.f315389a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24299)).mo56386p("Failed to record hotword rejection timestamp in query app flow metadata");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f315373e.mo100761e(this.f315369a, this.f315370b, this.f315371c, this.f315372d, (C59582aj) obj);
    }
}

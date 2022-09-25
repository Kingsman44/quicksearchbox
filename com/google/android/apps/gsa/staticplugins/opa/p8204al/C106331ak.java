package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4457a.C57975a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.ak */
/* compiled from: PG */
final class C106331ak extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C89859i f296645a;

    /* renamed from: b */
    final /* synthetic */ long f296646b;

    /* renamed from: c */
    final /* synthetic */ C22871g f296647c;

    /* renamed from: d */
    final /* synthetic */ C119052h f296648d;

    public C106331ak(C89859i iVar, long j, C22871g gVar, C119052h hVar) {
        this.f296645a = iVar;
        this.f296646b = j;
        this.f296647c = gVar;
        this.f296648d = hVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        this.f296647c.mo28212l("recognizedTextSource#onNext", new C106328ah((C118896b) obj, this.f296648d));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C89859i iVar = this.f296645a;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.VOICE_SEARCH_EMBEDDED_FIRST_RECOGNITION;
        fVar.mo83701c("rId", Long.toString(this.f296646b));
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        this.f296647c.mo28212l("recognizedTextSource#onEnd", new C106329ai(this.f296648d));
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f296647c.mo28212l("recognizedTextSource#onFailure", new C106330aj(th, this.f296648d));
    }
}

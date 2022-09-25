package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110979aq;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a.C113226e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48676ak;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import com.google.common.base.C58810aa;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.j */
/* compiled from: PG */
public final /* synthetic */ class C111560j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111565o f310267a;

    /* renamed from: b */
    public final /* synthetic */ C48676ak f310268b;

    public /* synthetic */ C111560j(C111565o oVar, C48676ak akVar) {
        this.f310267a = oVar;
        this.f310268b = akVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111565o oVar = this.f310267a;
        C48676ak akVar = this.f310268b;
        Drawable drawable = (Drawable) obj;
        C113414ey q = oVar.mo100187q();
        C110979aq aqVar = (C110979aq) oVar.f310284h.mo27525b();
        if (!C113226e.m187266a(akVar)) {
            return Optional.empty();
        }
        C58810aa h = C113226e.f313561a.mo56069h();
        C48722d dVar = akVar.f125936k;
        if (dVar == null) {
            dVar = C48722d.f126069m;
        }
        C113501m a = ((C113502n) h.mo56070hd(dVar)).mo100036a();
        a.mo99920b(drawable);
        C113502n a2 = a.mo99919a();
        q.mo100164i(akVar.f125929d);
        q.mo100180y(akVar.f125931f);
        C48580an b = C48580an.m85241b(akVar.f125934i);
        if (b == null) {
            b = C48580an.UNKNOWN;
        }
        q.mo100177v(b);
        q.mo100176u(akVar.f125932g);
        q.mo100167l(akVar.f125930e);
        String str = akVar.f125929d;
        C48722d dVar2 = akVar.f125936k;
        if (dVar2 == null) {
            dVar2 = C48722d.f126069m;
        }
        q.mo100173r(aqVar.mo99003a(str, dVar2.f126073c, a2));
        q.mo100174s(akVar.f125935j);
        q.mo100159d(a2);
        q.mo100175t(C48672ag.OFFLINE_WORKER);
        C48672ag b2 = C48672ag.m85259b(akVar.f125933h);
        if (b2 == null) {
            b2 = C48672ag.UNKNOWN;
        }
        q.mo100165j(b2);
        return Optional.m71637of(q.mo100156a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

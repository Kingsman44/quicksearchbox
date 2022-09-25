package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54244h;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.z */
/* compiled from: PG */
public final /* synthetic */ class C111518z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111518z f310189a = new C111518z();

    private /* synthetic */ C111518z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C54228aq aqVar = (C54228aq) obj;
        Optional filter = Optional.m71637of(aqVar).filter(C111514v.f310185a).map(C111515w.f310186a).filter(C111516x.f310187a).filter(C111517y.f310188a);
        if (!filter.isPresent()) {
            return C113415ez.f314042L;
        }
        C113414ey R = C113415ez.m187750R();
        R.mo100164i(((C54244h) filter.get()).f142425b);
        C113386e eVar = (C113386e) R;
        eVar.f313970r = Optional.m71637of(((C54244h) filter.get()).f142426c);
        R.mo100175t(C48672ag.CALCULATOR);
        R.mo100180y(10090);
        R.mo100177v(C48580an.CALCULATOR);
        R.mo100167l(10090);
        eVar.f313955c = Optional.m71637of(aqVar);
        return R.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.z */
/* compiled from: PG */
public final /* synthetic */ class C111689z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C48578al f310494a;

    public /* synthetic */ C111689z(C48578al alVar) {
        this.f310494a = alVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48578al alVar = this.f310494a;
        C113414ey R = C113415ez.m187750R();
        R.mo100164i(((C111649ad) obj).f310418c);
        R.mo100167l(10070);
        R.mo100180y(10070);
        R.mo100177v(C48580an.GEO_CHIP);
        R.mo100175t(C48672ag.TAPAS_SERVER);
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        ((C113386e) R).f313956d = Optional.m71637of(alVar);
        return C58485gu.m89846n(R.mo100156a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

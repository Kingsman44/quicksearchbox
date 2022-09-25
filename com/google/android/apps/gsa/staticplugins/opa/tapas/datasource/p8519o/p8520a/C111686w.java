package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.w */
/* compiled from: PG */
public final /* synthetic */ class C111686w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C48578al f310489a;

    /* renamed from: b */
    public final /* synthetic */ C65379d f310490b;

    public /* synthetic */ C111686w(C48578al alVar, C65379d dVar) {
        this.f310489a = alVar;
        this.f310490b = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48578al alVar = this.f310489a;
        C65379d dVar = this.f310490b;
        String str = (String) obj;
        C113414ey R = C113415ez.m187750R();
        R.mo100167l(10001);
        R.mo100180y(10080);
        R.mo100177v(C48580an.ENTITY);
        R.mo100175t(C48672ag.TAPAS_SERVER);
        C113386e eVar = (C113386e) R;
        eVar.f313956d = Optional.m71637of(alVar);
        R.mo100164i(dVar.f177779b);
        eVar.f313969q = Optional.m71637of(dVar);
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        C112142i iVar = C112142i.DISPLAY_TEXT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(C58890d.m90988c(dVar.f177779b), 1.0f);
        eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
        return R.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

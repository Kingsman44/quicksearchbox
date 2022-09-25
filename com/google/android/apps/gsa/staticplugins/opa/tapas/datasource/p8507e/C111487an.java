package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113161bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.an */
/* compiled from: PG */
public final /* synthetic */ class C111487an implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111487an f310133a = new C111487an();

    private /* synthetic */ C111487an() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C54228aq aqVar = (C54228aq) obj;
        String b = C113161bs.m187176b(aqVar.f142331b);
        C113414ey R = C113415ez.m187750R();
        R.mo100164i(b);
        R.mo100175t(C48672ag.COMPLETE_SERVER);
        R.mo100180y(35);
        R.mo100177v(C48580an.PERSONALIZED_QUERY);
        R.mo100167l(10001);
        C113386e eVar = (C113386e) R;
        eVar.f313967o = Optional.m71637of(C113300by.QUERY_TEXT);
        C112142i iVar = C112142i.DISPLAY_TEXT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(C58890d.m90988c(b), 1.0f);
        eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
        eVar.f313955c = Optional.m71637of(aqVar);
        return R.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

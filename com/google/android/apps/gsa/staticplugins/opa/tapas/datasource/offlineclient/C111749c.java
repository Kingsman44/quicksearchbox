package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.offlineclient;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.offlineclient.c */
/* compiled from: PG */
public final /* synthetic */ class C111749c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111749c f310634a = new C111749c();

    private /* synthetic */ C111749c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = OfflineClientSource.f310625c;
        C113414ey R = C113415ez.m187750R();
        R.mo100164i((String) obj);
        R.mo100175t(C48672ag.OFFLINE_CLIENT);
        C113386e eVar = (C113386e) R;
        eVar.f313967o = Optional.m71637of(C113300by.QUERY_TEXT);
        R.mo100167l(10001);
        R.mo100180y(35);
        R.mo100177v(C48580an.PERSONALIZED_QUERY);
        eVar.f313966n = Optional.m71637of(C54813af.OFFLINE_CLIENT);
        return R.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.C48755m;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.j */
/* compiled from: PG */
public final class C111673j implements C111674k {
    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        Optional b = C113148bf.m187155b(alVar);
        if (!b.isPresent()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C48755m mVar = (C48755m) b.get();
        C113414ey R = C113415ez.m187750R();
        R.mo100164i(mVar.f126154a);
        ((C113386e) R).f313970r = Optional.m71637of(mVar.f126155b);
        R.mo100175t(C48672ag.TAPAS_SERVER);
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        R.mo100180y(10090);
        R.mo100177v(C48580an.CALCULATOR);
        R.mo100167l(10090);
        return C60856cj.m92900i(C58485gu.m89846n(R.mo100156a()));
    }
}

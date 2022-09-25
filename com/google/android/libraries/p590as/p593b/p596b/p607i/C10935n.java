package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.i.n */
/* compiled from: PG */
public final /* synthetic */ class C10935n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C10905af f36048a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f36049b;

    public /* synthetic */ C10935n(C10905af afVar, C29409fd fdVar) {
        this.f36048a = afVar;
        this.f36049b = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C10905af afVar = this.f36048a;
        C29409fd fdVar = this.f36049b;
        C10882h hVar = (C10882h) obj;
        if (hVar.mo19290h() != 2 || !hVar.mo19285d().mo56113h()) {
            ((C58970a) ((C58970a) C10905af.f35995a.mo56225c()).mo56372aa(54039)).mo56389s("LanguagePack descriptor does not seem to describe a downloadable zipfile! Skipping download attempt: %s", hVar);
            return C60856cj.m92900i(false);
        }
        C60870cx a = afVar.f35998d.mo19347a();
        C10938q qVar = new C10938q(afVar, hVar, fdVar);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(qVar), afVar.f35999e);
        C10901ab abVar = new C10901ab(hVar);
        C60856cj.m92911t(h, C47810es.m84974n(abVar), afVar.f35999e);
        return h;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

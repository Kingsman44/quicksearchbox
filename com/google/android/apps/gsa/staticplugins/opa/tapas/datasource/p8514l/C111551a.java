package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a.C113226e;
import com.google.assistant.p3781ad.p3789d.p3791b.C48676ak;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import com.google.assistant.p3781ad.p3789d.p3791b.C48742x;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.a */
/* compiled from: PG */
public final /* synthetic */ class C111551a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111565o f310258a;

    public /* synthetic */ C111551a(C111565o oVar) {
        this.f310258a = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111565o oVar = this.f310258a;
        C48676ak akVar = (C48676ak) obj;
        if (!C113226e.m187266a(akVar)) {
            return C60856cj.m92900i(Optional.empty());
        }
        int a = C48742x.m85276a(akVar.f125928c);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            return C60856cj.m92900i(Optional.empty());
        }
        C48722d dVar = akVar.f125936k;
        if (dVar == null) {
            dVar = C48722d.f126069m;
        }
        String str = dVar.f126073c;
        C60870cx a2 = oVar.f310279c.mo99924a(str);
        return C60856cj.m92895d(a2, oVar.f310285i).mo57334a(new C111562l(oVar, str, a2, akVar), oVar.f310283g);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.common.base.C58835az;
import com.google.common.base.C58890d;
import com.google.common.p4535g.C59203do;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C111289d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111296k f309693a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309694b;

    public /* synthetic */ C111289d(C111296k kVar, C113405ep epVar) {
        this.f309693a = kVar;
        this.f309694b = epVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        double d;
        C111296k kVar = this.f309693a;
        C113405ep epVar = this.f309694b;
        C49335l lVar = (C49335l) obj;
        String str = lVar.f127515c;
        String p = epVar.mo100033p();
        int i = epVar.mo100022f().f53684l;
        if (kVar.f309712f.mo79746e(C90063do.f249357bx)) {
            d = ((C113126ak) kVar.f309710d.mo27525b()).mo99887a(C58890d.m90988c(p), Collection.EL.stream(C113126ak.f313427a.mo56155i(C58890d.m90988c(str))), i);
        } else if (C58890d.m90988c(str).contains(C58890d.m90988c(p))) {
            double length = (double) p.length();
            double length2 = (double) str.length();
            Double.isNaN(length);
            Double.isNaN(length2);
            d = length / length2;
        } else {
            d = C59203do.f157270a;
        }
        return new C58835az(lVar, Double.valueOf(d));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

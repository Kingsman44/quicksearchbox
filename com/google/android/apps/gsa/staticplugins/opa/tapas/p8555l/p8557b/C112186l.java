package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.l */
/* compiled from: PG */
public final /* synthetic */ class C112186l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112186l f311478a = new C112186l();

    private /* synthetic */ C112186l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C86124t tVar = (C86124t) obj;
        C59071e eVar = C112189o.f311481a;
        try {
            return (C58485gu) Collection.EL.stream(tVar.mo79745c(C90063do.f249565ft)).filter(C112187m.f311479a).map(C112188n.f311480a).collect(C58370cn.f155946a);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C112189o.f311481a.mo56225c()).mo56382g(e)).mo56372aa(27637)).mo56386p("Caught error while parsing reflection predictors");
            return C58485gu.m89845m();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

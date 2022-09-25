package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131085h;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C130990ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f358381a;

    public /* synthetic */ C130990ad(C58485gu guVar) {
        this.f358381a = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f358381a;
        C50682r rVar = (C50682r) obj;
        if (rVar != null) {
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C130989ac(rVar)).collect(C58370cn.f155946a);
            if (guVar2 != null) {
                return new C131085h(rVar, guVar2);
            }
            throw new NullPointerException("Null appEvents");
        }
        throw new NullPointerException("Null headphoneConnection");
    }
}

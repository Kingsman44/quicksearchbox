package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.common.p4535g.C59123ap;
import com.google.common.p4535g.C59133az;
import com.google.common.p4535g.C59136bb;
import com.google.common.p4535g.C59143bi;
import com.google.common.p4535g.C59203do;
import com.google.common.p4535g.C59218l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C131126ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ C59136bb f358621a;

    public /* synthetic */ C131126ab(C59136bb bbVar) {
        this.f358621a = bbVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59136bb bbVar = this.f358621a;
        C59143bi biVar = (C59143bi) obj;
        if (biVar.mo56527j(bbVar)) {
            return new C59218l(C59203do.f157270a);
        }
        C59218l lVar = new C59218l(3.141592653589793d);
        for (int i = 0; i < biVar.mo56517b(); i++) {
            C59133az c = biVar.mo56518c(i);
            C59136bb n = C59136bb.m91671n(bbVar);
            C59218l lVar2 = new C59218l(3.141592653589793d);
            int i2 = 0;
            while (i2 < c.f157143d) {
                int i3 = i2 + 1;
                lVar2 = C59218l.m91870d(lVar2, C59123ap.m91588h(n, c.mo56481i(i2), c.mo56481i(i3)));
                i2 = i3;
            }
            lVar = C59218l.m91870d(lVar, lVar2);
        }
        return lVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

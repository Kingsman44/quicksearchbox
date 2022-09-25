package com.google.android.libraries.search.logging.appflows;

import com.google.android.libraries.search.p2871b.C37238g;
import com.google.android.libraries.search.p2871b.C37305o;
import com.google.android.libraries.search.p2871b.C37318s;
import com.google.android.libraries.search.p2871b.C37319t;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.logging.appflows.p */
/* compiled from: PG */
public final /* synthetic */ class C38793p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C38826t f102375a;

    public /* synthetic */ C38793p(C38826t tVar) {
        this.f102375a = tVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C38826t tVar = this.f102375a;
        C38790m mVar = (C38790m) obj;
        C37305o oVar = tVar.f102444a;
        C38794q qVar = new C38794q(tVar, mVar);
        C37318s g = C37319t.m66313g();
        String str = tVar.f102445b;
        String name = mVar.name();
        String name2 = mVar.f102373c.name();
        ((C37238g) g).f98912a = str + " private logger for " + name + ", TNGAppId: " + name2;
        g.mo40745c(mVar.f102373c.getNumber());
        g.mo40746d(true);
        g.mo40747e(true);
        return oVar.mo40851a(qVar, g.mo40743a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

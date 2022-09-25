package com.google.android.libraries.search.logging.appflows;

import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.p2871b.C37238g;
import com.google.android.libraries.search.p2871b.C37318s;
import com.google.android.libraries.search.p2871b.C37319t;
import com.google.android.libraries.search.p2871b.p2891f.C37237b;
import com.google.common.p4522b.C58800sl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.logging.appflows.s */
/* compiled from: PG */
public final /* synthetic */ class C38796s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C38826t f102380a;

    /* renamed from: b */
    public final /* synthetic */ C38792o f102381b;

    public /* synthetic */ C38796s(C38826t tVar, C38792o oVar) {
        this.f102380a = tVar;
        this.f102381b = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C38826t tVar = this.f102380a;
        C38792o oVar = this.f102381b;
        C38828b bVar = (C38828b) obj;
        C37318s g = C37319t.m66313g();
        String str = tVar.f102445b;
        int number = bVar.getNumber();
        ((C37238g) g).f98912a = str + " logger for TNGAppId: " + number;
        g.mo40745c(bVar.getNumber());
        g.mo40746d(true);
        g.mo40747e(true);
        C58800sl lA = oVar.mo41623a().iterator();
        while (lA.hasNext()) {
            g.mo40744b().mo55373c((C37237b) lA.next());
        }
        return tVar.f102444a.mo40851a(new C38795r(tVar, bVar), g.mo40743a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

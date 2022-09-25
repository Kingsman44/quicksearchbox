package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.iw */
/* compiled from: PG */
public final /* synthetic */ class C109300iw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109317jh f304480a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f304481b;

    public /* synthetic */ C109300iw(C109317jh jhVar, C58528ij ijVar) {
        this.f304480a = jhVar;
        this.f304481b = ijVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C109317jh jhVar = this.f304480a;
        C58528ij ijVar = this.f304481b;
        C123744bk bkVar = (C123744bk) obj;
        if (bkVar.f341808c != 24) {
            return Stream.CC.m71936of((T[]) new C89128d[0]);
        }
        C53430np npVar = (C53430np) bkVar.f341809d;
        C58495hd hdVar = C109317jh.f304502b;
        C51133hp a = C51133hp.m86035a(npVar.f140226c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        C89126b bVar = (C89126b) hdVar.get(a);
        if (bVar == null) {
            return Stream.CC.m71936of((T[]) new C89128d[0]);
        }
        if (!ijVar.contains(bVar)) {
            return Stream.CC.m71936of((T[]) new C89128d[0]);
        }
        if (!jhVar.f304503c.mo79746e(C90069du.f249740r)) {
            return Collection.EL.stream(npVar.f140225b).map(new C109310ja(bVar));
        }
        return Collection.EL.stream(npVar.f140225b).map(new C109303iz(bVar, jhVar.mo97759b(npVar)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4546c.C59407o;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C101551e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C101560n f283393a;

    public /* synthetic */ C101551e(C101560n nVar) {
        this.f283393a = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C101560n nVar = this.f283393a;
        ((C59052c) ((C59052c) C101560n.f283404a.mo56224b()).mo56372aa(20337)).mo56386p("#getAuthTokenCheckResponseWithRetry");
        C59407o e = C59407o.m92309e(C59407o.m92308d(Duration.ofMillis(nVar.f283407d.mo79743a(C90014bt.f247477hr))), (int) nVar.f283407d.mo79743a(C90014bt.f247478hs));
        return C90877ak.m148470d(nVar.f283408e, "auth token check (verify account linked) request", new C101556j(nVar, (C89824t) obj), new C101559m(), e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

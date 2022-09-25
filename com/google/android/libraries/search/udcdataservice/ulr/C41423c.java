package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.libraries.search.udcdataservice.ulr.C41427g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.c */
/* compiled from: PG */
public final /* synthetic */ class C41423c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C41427g f108202a;

    public /* synthetic */ C41423c(C41427g gVar) {
        this.f108202a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C41438q gn = ((C41427g.C41428a) C47245e.m84045a(this.f108202a.f108207b, C41427g.C41428a.class, (AccountId) obj)).mo43953gn();
        return gn.mo43956b(gn.mo43955a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

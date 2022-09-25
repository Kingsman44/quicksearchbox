package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.bf */
/* compiled from: PG */
public final /* synthetic */ class C86025bf implements Function {

    /* renamed from: a */
    public final /* synthetic */ C86029bj f232585a;

    public /* synthetic */ C86025bf(C86029bj bjVar) {
        this.f232585a = bjVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f232585a.mo79693a((Account) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

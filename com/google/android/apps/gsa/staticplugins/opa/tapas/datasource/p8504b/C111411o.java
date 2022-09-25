package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Pair;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.o */
/* compiled from: PG */
public final /* synthetic */ class C111411o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111419w f309970a;

    /* renamed from: b */
    public final /* synthetic */ PackageManager f309971b;

    public /* synthetic */ C111411o(C111419w wVar, PackageManager packageManager) {
        this.f309970a = wVar;
        this.f309971b = packageManager;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111419w wVar = this.f309970a;
        PackageManager packageManager = this.f309971b;
        Pair pair = (Pair) obj;
        String str = (String) pair.first;
        Optional i = wVar.f309984e.mo99850i(packageManager, str);
        if (i.isEmpty()) {
            return Stream.CC.m71936of((T[]) new C111418v[0]);
        }
        return Stream.CC.m71935of(new C111391a(str, ((Double) pair.second).doubleValue(), (Intent) i.get()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.c */
/* compiled from: PG */
public final /* synthetic */ class C136085c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C136102t f370631a;

    public /* synthetic */ C136085c(C136102t tVar) {
        this.f370631a = tVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.ofNullable(((C136043aa) obj).mo112368a(this.f370631a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

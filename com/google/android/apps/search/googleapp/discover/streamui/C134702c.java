package com.google.android.apps.search.googleapp.discover.streamui;

import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134725e;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.c */
/* compiled from: PG */
public final class C134702c implements Function {

    /* renamed from: a */
    final /* synthetic */ C134766q f366819a;

    public C134702c(C134766q qVar) {
        this.f366819a = qVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C69664n.m101061g((C134766q) obj, "it");
        return new C134725e(this.f366819a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

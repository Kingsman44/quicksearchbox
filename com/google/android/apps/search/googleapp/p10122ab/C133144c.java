package com.google.android.apps.search.googleapp.p10122ab;

import android.content.Context;
import com.google.android.material.p3506c.C44581b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.ab.c */
/* compiled from: PG */
public final /* synthetic */ class C133144c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Context f362959a;

    public /* synthetic */ C133144c(Context context) {
        this.f362959a = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new C44581b(this.f362959a, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

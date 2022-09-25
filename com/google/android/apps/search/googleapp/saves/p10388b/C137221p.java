package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.p */
/* compiled from: PG */
public final /* synthetic */ class C137221p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C137221p f373345a = new C137221p();

    private /* synthetic */ C137221p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return (String) C60856cj.m92909r((C60870cx) obj);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C137230y.f373360a.mo56226d()).mo56382g(e)).mo56372aa(40942)).mo56386p("Failed to retrieve URL for listener notification");
            return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

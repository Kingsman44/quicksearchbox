package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.a */
/* compiled from: PG */
public final /* synthetic */ class C106776a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297561a;

    public /* synthetic */ C106776a(C106791p pVar) {
        this.f297561a = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106791p pVar = this.f297561a;
        try {
            return (Pair) C60856cj.m92909r((C60870cx) obj);
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) pVar.f297585a.mo56225c()).mo56382g(e)).mo56372aa(23196)).mo56386p("getting child view");
            return new Pair(C106734a.UNDEFINED, Optional.empty());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

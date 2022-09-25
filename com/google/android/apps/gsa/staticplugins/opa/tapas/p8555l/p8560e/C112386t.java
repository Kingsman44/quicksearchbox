package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.t */
/* compiled from: PG */
public final /* synthetic */ class C112386t implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C112386t f311821a = new C112386t();

    private /* synthetic */ C112386t() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Float f = (Float) obj;
        Float f2 = (Float) obj2;
        C59104x c = C112312ag.f311670b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ReflectionOnline");
        ((C59052c) ((C59052c) c).mo56372aa(27667)).mo56389s("Unexpected duplicate score, using first: %f", f);
        return f;
    }
}

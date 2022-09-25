package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13100d;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13101e;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32438ae;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.e */
/* compiled from: PG */
final class C13086e implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C32438ae f40594a;

    public C13086e(C32438ae aeVar) {
        this.f40594a = aeVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C13101e eVar = (C13101e) obj;
        C69664n.m101061g(eVar, "resp");
        C13100d a = eVar.mo20891a();
        a.mo20881c(this.f40594a);
        return a.mo20879a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

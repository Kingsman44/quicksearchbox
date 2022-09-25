package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13100d;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13101e;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32434aa;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.b */
/* compiled from: PG */
final class C13083b implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C32434aa f40589a;

    public C13083b(C32434aa aaVar) {
        this.f40589a = aaVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C13101e eVar = (C13101e) obj;
        C69664n.m101061g(eVar, "resp");
        C13100d a = eVar.mo20891a();
        C32434aa aaVar = this.f40589a;
        a.mo20880b(new C32434aa(aaVar.f86903a, aaVar.f86904b));
        return a.mo20879a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

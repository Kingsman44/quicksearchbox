package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71816z;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.fj */
/* compiled from: PG */
final class C32749fj implements Function {

    /* renamed from: a */
    final /* synthetic */ C32750fk f87859a;

    /* renamed from: b */
    final /* synthetic */ C32675cq f87860b;

    public C32749fj(C32750fk fkVar, C32675cq cqVar) {
        this.f87859a = fkVar;
        this.f87860b = cqVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C69664n.m101061g((C32858d) obj, "it");
        C32750fk fkVar = this.f87859a;
        C59071e eVar = C32750fk.f87861a;
        if (fkVar.f87872k) {
            this.f87860b.f87574c.mo38234b(this.f87859a.f87866e);
        } else {
            this.f87860b.f87574c.f87568b.mo38216c();
        }
        return new C32669ck(new C71816z());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

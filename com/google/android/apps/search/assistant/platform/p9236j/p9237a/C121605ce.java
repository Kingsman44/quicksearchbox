package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ce */
/* compiled from: PG */
final class C121605ce implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C121616cp f337404a;

    public C121605ce(C121616cp cpVar) {
        this.f337404a = cpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (((C33504b) obj) != null) {
            C121616cp cpVar = this.f337404a;
            cpVar.f337447d.set(C121598by.m200900a(cpVar.f337446c));
            return null;
        }
        Object obj2 = this.f337404a.f337447d.get();
        Instant a = C121598by.m200900a(this.f337404a.f337446c);
        throw new IllegalStateException("Inconsistent 'onDestroy' callback: session doesn't exist, destroyed at " + obj2 + ", now is " + a + ".");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

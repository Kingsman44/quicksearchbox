package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cd */
/* compiled from: PG */
final class C121604cd implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C33504b f337402a;

    /* renamed from: b */
    final /* synthetic */ C121616cp f337403b;

    public C121604cd(C33504b bVar, C121616cp cpVar) {
        this.f337402a = bVar;
        this.f337403b = cpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C33504b bVar = (C33504b) obj;
        if (bVar == null) {
            C121616cp cpVar = this.f337403b;
            cpVar.f337447d.set(C121598by.m200900a(cpVar.f337446c));
            return this.f337402a;
        }
        String c = C33914a.m62568c(bVar);
        String c2 = C33914a.m62568c(this.f337402a);
        Object obj2 = this.f337403b.f337447d.get();
        Instant a = C121598by.m200900a(this.f337403b.f337446c);
        throw new IllegalStateException("Inconsistent 'onCreate' callback: session(" + c + ") exists, this session(" + c2 + "), populated at " + obj2 + ", now is " + a + ".");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

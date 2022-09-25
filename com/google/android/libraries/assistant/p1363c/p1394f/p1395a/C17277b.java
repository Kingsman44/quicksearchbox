package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.apps.tiktok.concurrent.C46423aj;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.f.a.b */
/* compiled from: PG */
final class C17277b implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C17278c f50070a;

    public C17277b(C17278c cVar) {
        this.f50070a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Object apply(Object obj) {
        C17276a aVar = (C17276a) obj;
        Instant a = this.f50070a.f50073c.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        if (aVar != null) {
            C69664n.m101061g(a, "now");
            if (a.isBefore(aVar.f50068b.plus(aVar.f50069c.f50072b))) {
                return aVar;
            }
        }
        if (aVar != null) {
            aVar.f50067a.mo50395b().cancel(false);
        }
        C17278c cVar = this.f50070a;
        return new C17276a(cVar, new C46423aj(cVar.f50071a, cVar.f50074d), a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

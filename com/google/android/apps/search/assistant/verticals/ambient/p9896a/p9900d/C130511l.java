package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.d.l */
/* compiled from: PG */
final class C130511l implements Function {

    /* renamed from: a */
    final /* synthetic */ C130515p f357511a;

    /* renamed from: b */
    final /* synthetic */ C130505f f357512b;

    /* renamed from: c */
    final /* synthetic */ C130509j f357513c;

    public C130511l(C130515p pVar, C130505f fVar, C130509j jVar) {
        this.f357511a = pVar;
        this.f357512b = fVar;
        this.f357513c = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C50818do doVar = (C50818do) obj;
        C58974d dVar = this.f357511a.f357533d;
        Class<?> cls = this.f357512b.getClass();
        int i = C69649af.f186028a;
        new C69657g(cls).mo61379b();
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (a != null) {
            a.name();
        }
        int i2 = doVar.f132307d;
        C130505f fVar = this.f357512b;
        C130509j jVar = this.f357513c;
        C69664n.m101060f(doVar, "card");
        return new C130503d(fVar, jVar, doVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

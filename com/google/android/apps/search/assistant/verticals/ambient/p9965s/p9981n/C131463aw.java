package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9982a.C131440f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.aw */
/* compiled from: PG */
public final /* synthetic */ class C131463aw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131465ay f359293a;

    public /* synthetic */ C131463aw(C131465ay ayVar) {
        this.f359293a = ayVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131465ay ayVar = this.f359293a;
        C53212fn fnVar = (C53212fn) obj;
        C131440f fVar = ayVar.f359296b;
        String str = fnVar.f139471b;
        String str2 = (String) Collection.EL.stream(fnVar.f139474e).collect(Collectors.joining(" "));
        C60870cx a = fVar.mo110174a(str, fnVar.f139472c, C60945d.m93099d(fnVar.f139470a));
        C131458ar arVar = new C131458ar(fnVar);
        return C60922j.m93044g(a, C47810es.m84963c(arVar), ayVar.f359297c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

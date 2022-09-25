package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.am */
/* compiled from: PG */
public final /* synthetic */ class C16016am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47431a;

    /* renamed from: b */
    public final /* synthetic */ String f47432b;

    public /* synthetic */ C16016am(C16027ax axVar, String str) {
        this.f47431a = axVar;
        this.f47432b = str;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47431a;
        String str = this.f47432b;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).map(C16050w.f47508a).collect(C58370cn.f155946a);
        C58480gp e = C58485gu.m89837e();
        Stream filter = Collection.EL.stream(axVar.f47453d.mo22635j(str)).filter(new C16051x(guVar));
        Objects.requireNonNull(e);
        filter.forEach(new C16052y(e));
        C60870cx e2 = axVar.f47454e.mo22685e(guVar);
        C16053z zVar = new C16053z(e);
        return C60922j.m93044g(e2, C47810es.m84963c(zVar), axVar.f47452c);
    }
}

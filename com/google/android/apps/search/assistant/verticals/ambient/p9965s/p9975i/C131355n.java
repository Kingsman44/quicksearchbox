package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.n */
/* compiled from: PG */
public final /* synthetic */ class C131355n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131358q f359085a;

    /* renamed from: b */
    public final /* synthetic */ Optional f359086b;

    /* renamed from: c */
    public final /* synthetic */ Collection f359087c;

    public /* synthetic */ C131355n(C131358q qVar, Optional optional, Collection collection) {
        this.f359085a = qVar;
        this.f359086b = optional;
        this.f359087c = collection;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((C58485gu) obj).map(new C131354m(this.f359085a, this.f359086b, this.f359087c)).collect(C58370cn.f155946a));
    }
}

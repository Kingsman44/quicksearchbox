package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83774q;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bc */
/* compiled from: PG */
public final /* synthetic */ class C131474bc implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131481bj f359311a;

    public /* synthetic */ C131474bc(C131481bj bjVar) {
        this.f359311a = bjVar;
    }

    public final Object apply(Object obj) {
        C131481bj bjVar = this.f359311a;
        Instant minus = bjVar.f359322d.mo57444a().minus(bjVar.f359323e);
        C83774q qVar = (C83774q) C83781x.f228356c.createBuilder();
        Stream map = Collection.EL.stream((List) obj).filter(C131475bd.f359312a).map(C131476be.f359313a).map(new C131477bf(bjVar, minus));
        Objects.requireNonNull(qVar);
        map.forEach(new C131478bg(qVar));
        return Optional.m71637of((C83781x) qVar.build()).filter(C131479bh.f359317a);
    }
}

package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.n */
/* compiled from: PG */
public final /* synthetic */ class C131207n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131195b f358821a;

    public /* synthetic */ C131207n(C131195b bVar) {
        this.f358821a = bVar;
    }

    public final Object apply(Object obj) {
        C131195b bVar = this.f358821a;
        C131197d dVar = (C131197d) obj;
        if (Collection.EL.stream(dVar.f358809a).filter(new C131200g(bVar)).anyMatch(new C131201h(bVar))) {
            return dVar;
        }
        C131196c cVar = (C131196c) dVar.toBuilder();
        cVar.copyOnWrite();
        ((C131197d) cVar.instance).f358809a = C131197d.emptyProtobufList();
        Stream filter = Collection.EL.stream(dVar.f358809a).filter(new C131205l(bVar));
        Objects.requireNonNull(cVar);
        filter.forEach(new C131206m(cVar));
        cVar.mo110115a(bVar);
        return (C131197d) cVar.build();
    }
}

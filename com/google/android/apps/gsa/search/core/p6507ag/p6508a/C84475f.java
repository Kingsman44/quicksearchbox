package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import com.google.common.base.C58817ah;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.f */
/* compiled from: PG */
public final /* synthetic */ class C84475f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C84475f f229900a = new C84475f();

    private /* synthetic */ C84475f() {
    }

    public final Object apply(Object obj) {
        return (HashSet) Collection.EL.stream((List) obj).filter(C84478i.f229904a).flatMap(C84479j.f229905a).filter(C84480k.f229906a).collect(Collectors.toCollection(C84481l.f229907a));
    }
}

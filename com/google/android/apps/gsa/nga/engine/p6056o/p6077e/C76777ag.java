package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C76777ag implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f212154a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212155b;

    public /* synthetic */ C76777ag(C76795ay ayVar, C74965n nVar) {
        this.f212154a = ayVar;
        this.f212155b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76795ay ayVar = this.f212154a;
        C74965n nVar = this.f212155b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return Optional.empty();
        }
        Optional flatMap = nVar.mo71340o().flatMap(new C76771aa(ayVar));
        Objects.requireNonNull(guVar);
        Optional filter = flatMap.filter(new C76772ab(guVar));
        if (filter.isPresent()) {
            return filter;
        }
        if (guVar.contains(ayVar.f212185g)) {
            return Optional.m71637of(ayVar.f212185g);
        }
        if (guVar.size() == 1) {
            return Optional.m71637of((y) guVar.get(0));
        }
        return Optional.empty();
    }
}

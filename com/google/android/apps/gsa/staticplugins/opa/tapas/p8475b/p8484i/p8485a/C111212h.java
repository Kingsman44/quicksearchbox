package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i.p8485a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3825an.p3830c.p3831a.C49292bk;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.assistant.p3825an.p3830c.p3831a.C49331h;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.a.h */
/* compiled from: PG */
public final class C111212h implements C68220f {
    /* renamed from: a */
    public static C49333j m184948a(C86124t tVar, C69464a aVar) {
        long a = tVar.mo79743a(C90063do.f249256aB);
        C49292bk bkVar = (C49292bk) C49293bl.f127401b.createBuilder();
        Stream map = Collection.EL.stream((Set) aVar.mo17428b()).flatMap(C111206b.f309503a).map(new C111207c((int) a));
        Objects.requireNonNull(bkVar);
        map.forEach(new C111208d(bkVar));
        C49331h hVar = (C49331h) C49333j.f127504f.createBuilder();
        hVar.copyOnWrite();
        C49333j jVar = (C49333j) hVar.instance;
        C49293bl blVar = (C49293bl) bkVar.build();
        blVar.getClass();
        jVar.f127508c = blVar;
        jVar.f127507b = 1;
        String x = tVar.mo79758x(C90063do.f249236I);
        hVar.copyOnWrite();
        C49333j jVar2 = (C49333j) hVar.instance;
        x.getClass();
        jVar2.f127506a |= 4;
        jVar2.f127509d = x;
        C49333j jVar3 = (C49333j) hVar.build();
        C68225k.m98532d(jVar3);
        return jVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}

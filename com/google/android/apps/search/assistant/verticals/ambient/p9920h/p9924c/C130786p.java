package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130804f;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130806h;
import com.google.assistant.p3860as.C49790d;
import com.google.assistant.p3860as.C49792f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60887da;
import java.util.Comparator;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.p */
/* compiled from: PG */
public final class C130786p implements C130804f {

    /* renamed from: a */
    public static final C59071e f358007a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.h.c.p");

    /* renamed from: b */
    public final C60887da f358008b;

    /* renamed from: c */
    public final C130806h f358009c;

    /* renamed from: d */
    public final boolean f358010d;

    public C130786p(C60887da daVar, C130806h hVar, boolean z) {
        this.f358008b = daVar;
        this.f358009c = hVar;
        this.f358010d = z;
    }

    /* renamed from: a */
    public static double m213158a(C49790d dVar) {
        return (double) (dVar.f128575b * dVar.f128576c);
    }

    /* renamed from: b */
    public static C58485gu m213159b(C58485gu guVar) {
        Comparator reversed = Comparator.EL.reversed(Comparator.CC.comparingDouble(C130778h.f357999a));
        Stream flatMap = Collection.EL.stream(guVar).flatMap(C130779i.f358000a);
        C130780j jVar = C130780j.f358001a;
        C130781k kVar = C130781k.f358002a;
        C130696a b = C130701b.m213087b();
        ((C130735c) b).f357921a = BuildConfig.FLAVOR;
        b.mo109787c(C59203do.f157270a);
        return C58485gu.m89836F(reversed, ((HashMap) flatMap.collect(Collectors.groupingBy(jVar, kVar, Collectors.reducing(b.mo109785a(), C130782l.f358003a)))).values());
    }

    /* renamed from: c */
    public static C58485gu m213160c(C49792f fVar, int i) {
        return (C58485gu) Collection.EL.stream(fVar.f128581a).map(new C130763b(i)).collect(C58370cn.f155946a);
    }
}

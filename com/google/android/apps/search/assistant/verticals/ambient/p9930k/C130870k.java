package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.k */
/* compiled from: PG */
public final /* synthetic */ class C130870k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130883x f358148a;

    public /* synthetic */ C130870k(C130883x xVar) {
        this.f358148a = xVar;
    }

    public final Object apply(Object obj) {
        C130883x xVar = this.f358148a;
        Collector collector = C130881v.f358160a;
        return (C58485gu) ((Stream) Collection.EL.stream(((HashMap) Collection.EL.stream(((C58495hd) obj).entrySet()).filter(new C130872m(xVar)).map(C130873n.f358152a).collect(Collectors.groupingBy(C130874o.f358153a, C130875p.f358154a, C130881v.f358160a))).entrySet()).min(C130876q.f358155a).map(C130877r.f358156a).orElse(Stream.CC.empty())).sorted(Comparator.CC.comparing(C130878s.f358157a)).collect(C130881v.f358160a);
    }
}

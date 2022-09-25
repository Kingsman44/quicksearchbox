package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.podcasts.b.b.k */
/* compiled from: PG */
public final /* synthetic */ class C140033k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380593a;

    /* renamed from: b */
    public final /* synthetic */ int f380594b;

    public /* synthetic */ C140033k(C140022ao aoVar, int i) {
        this.f380593a = aoVar;
        this.f380594b = i;
    }

    public final Object apply(Object obj) {
        Predicate predicate;
        Predicate predicate2;
        C140022ao aoVar = this.f380593a;
        int i = this.f380594b;
        C140075q qVar = (C140075q) obj;
        if (i == 1) {
            predicate2 = new C140046x(qVar);
        } else if (i != 2) {
            predicate = C140048z.f380619a;
            return (C58485gu) Collection.EL.stream(aoVar.f380560c.mo115391b()).filter(predicate).map(C140008aa.f380530a).collect(Collectors.collectingAndThen(Collectors.toCollection(C140009ab.f380531a), C140027e.f380585a));
        } else {
            predicate2 = new C140047y(qVar);
        }
        predicate = predicate2;
        return (C58485gu) Collection.EL.stream(aoVar.f380560c.mo115391b()).filter(predicate).map(C140008aa.f380530a).collect(Collectors.collectingAndThen(Collectors.toCollection(C140009ab.f380531a), C140027e.f380585a));
    }
}

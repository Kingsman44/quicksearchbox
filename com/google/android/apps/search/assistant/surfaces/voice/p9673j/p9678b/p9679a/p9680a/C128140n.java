package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C128140n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f352529a;

    public /* synthetic */ C128140n(List list) {
        this.f352529a = list;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !C128181m.OVER_APP.equals((C128181m) obj) || Collection.EL.stream(this.f352529a).anyMatch(C128142p.f352531a);
    }
}

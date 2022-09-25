package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q;
import com.google.common.p4580v.C60948g;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.b.b.x */
/* compiled from: PG */
public final /* synthetic */ class C140046x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C140075q f380617a;

    public /* synthetic */ C140046x(C140075q qVar) {
        this.f380617a = qVar;
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
        C140075q qVar = this.f380617a;
        C97874a aVar = (C97874a) obj;
        C97918h hVar = ((C97914d) aVar.instance).f273397c;
        if (hVar == null) {
            hVar = C97918h.f273412m;
        }
        C97920j jVar = hVar.f273423j;
        if (jVar == null) {
            jVar = C97920j.f273426e;
        }
        long max = Math.max(qVar.mo115425a(jVar.f273430c, jVar.f273431d), ((C97914d) aVar.instance).f273402h);
        if (max == -1) {
            return false;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(max);
        C60948g gVar = C60948g.f165068a;
        return Duration.between(ofEpochMilli, Instant.now()).compareTo(Duration.ofDays(7)) > 0;
    }
}

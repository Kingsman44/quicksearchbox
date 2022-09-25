package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.b.b.y */
/* compiled from: PG */
public final /* synthetic */ class C140047y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C140075q f380618a;

    public /* synthetic */ C140047y(C140075q qVar) {
        this.f380618a = qVar;
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
        C140075q qVar = this.f380618a;
        C97874a aVar = (C97874a) obj;
        C97918h hVar = ((C97914d) aVar.instance).f273397c;
        if (hVar == null) {
            hVar = C97918h.f273412m;
        }
        C97920j jVar = hVar.f273423j;
        if (jVar == null) {
            jVar = C97920j.f273426e;
        }
        String str = jVar.f273430c;
        C97918h hVar2 = ((C97914d) aVar.instance).f273397c;
        if (hVar2 == null) {
            hVar2 = C97918h.f273412m;
        }
        C97920j jVar2 = hVar2.f273423j;
        if (jVar2 == null) {
            jVar2 = C97920j.f273426e;
        }
        return qVar.mo115428d(str, jVar2.f273431d);
    }
}

package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139336r;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.c */
/* compiled from: PG */
public final /* synthetic */ class C139399c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C139409m f379046a;

    public /* synthetic */ C139399c(C139409m mVar) {
        this.f379046a = mVar;
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
        C139392b bVar = (C139392b) obj;
        C139336r rVar = this.f379046a.f379066e;
        C56610b bVar2 = bVar.f379032b;
        if (bVar2 == null) {
            bVar2 = C56610b.f151140k;
        }
        if (!rVar.mo114906d(bVar2.f151144c).mo114897b()) {
            return false;
        }
        C56610b bVar3 = bVar.f379032b;
        if (bVar3 == null) {
            bVar3 = C56610b.f151140k;
        }
        return C139336r.m226471e(bVar3.f151143b).mo114897b();
    }
}

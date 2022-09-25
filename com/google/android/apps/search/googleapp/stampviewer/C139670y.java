package com.google.android.apps.search.googleapp.stampviewer;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.y */
/* compiled from: PG */
public final /* synthetic */ class C139670y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f379648a;

    public /* synthetic */ C139670y(Set set) {
        this.f379648a = set;
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
        Set set = this.f379648a;
        C56610b bVar = ((C139392b) obj).f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        return !set.contains(bVar.f151143b);
    }
}

package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C102988q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C102909ar f287567a;

    public /* synthetic */ C102988q(C102909ar arVar) {
        this.f287567a = arVar;
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
        C102909ar arVar = this.f287567a;
        Optional optional = (Optional) obj;
        C81252aq aqVar = arVar.f287369c;
        Objects.requireNonNull(aqVar);
        if (!((Boolean) optional.flatMap(new C102897af(aqVar)).orElse(true)).booleanValue()) {
            return true;
        }
        return ((Boolean) arVar.f287369c.mo74948i(optional).orElse(false)).booleanValue();
    }
}

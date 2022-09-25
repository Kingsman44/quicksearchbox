package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C78928j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f217155a;

    public /* synthetic */ C78928j(Optional optional) {
        this.f217155a = optional;
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
        Optional optional = this.f217155a;
        int i = C78930l.f217158c;
        return Objects.equals(((Uri) obj).getHost(), ((Uri) optional.get()).getHost());
    }
}

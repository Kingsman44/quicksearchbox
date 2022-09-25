package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4709l.p4710a.C62614b;
import com.google.lens.p4709l.p4710a.C62616d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C27826i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C62614b f75887a;

    public /* synthetic */ C27826i(C62614b bVar) {
        this.f75887a = bVar;
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
        C62614b bVar = this.f75887a;
        C58974d dVar = C27830m.f75893a;
        C62614b a = C62614b.m94806a(((C62616d) obj).f169062b);
        if (a == null) {
            a = C62614b.LOTS_FEATURE_UNDEFINED;
        }
        return a == bVar;
    }
}

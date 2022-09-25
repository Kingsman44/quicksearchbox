package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.protos.p5132q.C65873p;
import com.google.protos.p5132q.C65874q;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.ondevice.k.dj */
/* compiled from: PG */
public final /* synthetic */ class C24626dj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C24626dj f67372a = new C24626dj();

    private /* synthetic */ C24626dj() {
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
        C65873p a = C65873p.m96817a(((C65874q) obj).f179085d);
        if (a == null) {
            a = C65873p.LINE;
        }
        return a.equals(C65873p.WORD);
    }
}

package com.google.android.libraries.lens.view.session;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.aq */
/* compiled from: PG */
public final /* synthetic */ class C27754aq implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f75757a;

    public /* synthetic */ C27754aq(Set set) {
        this.f75757a = set;
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
        Set set = this.f75757a;
        int i = C27761ax.f75765b;
        C56224ae aeVar = ((C56241av) obj).f149797e;
        if (aeVar == null) {
            aeVar = C56224ae.f149753h;
        }
        return set.contains(aeVar);
    }
}

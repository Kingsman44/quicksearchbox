package com.google.android.libraries.search.integrations.p3015b.p3016a;

import com.google.protos.p4874ap.p4877b.p4878a.C63694e;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.integrations.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C38498d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C38498d f101853a = new C38498d();

    private /* synthetic */ C38498d() {
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
        int i = C38499e.f101854a;
        C63700k kVar = ((C63694e) obj).f172215a;
        if (kVar == null) {
            kVar = C63700k.f172226e;
        }
        if (kVar.f172229b == 2 && ((Integer) kVar.f172230c).intValue() == 1) {
            return false;
        }
        return true;
    }
}

package com.google.android.libraries.lens.view.utils;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.utils.e */
/* compiled from: PG */
public final /* synthetic */ class C28115e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C28115e f76512a = new C28115e();

    private /* synthetic */ C28115e() {
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
        C56310h hVar = ((C56320r) obj).f150100g;
        if (hVar == null) {
            hVar = C56310h.f150072g;
        }
        return hVar.f150078e.size() > 0;
    }
}

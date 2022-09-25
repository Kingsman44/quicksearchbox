package com.google.android.libraries.lens.view.utils;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.utils.c */
/* compiled from: PG */
public final /* synthetic */ class C28113c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C28113c f76510a = new C28113c();

    private /* synthetic */ C28113c() {
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
        C56326x a = C56326x.m87970a(((C56320r) obj).f150103j);
        if (a == null) {
            a = C56326x.UNKNOWN;
        }
        return a != C56326x.NONE;
    }
}

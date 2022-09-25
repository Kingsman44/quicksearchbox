package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.ab.m */
/* compiled from: PG */
public final /* synthetic */ class C32418m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C32418m f86879a = new C32418m();

    private /* synthetic */ C32418m() {
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
        C59071e eVar = C32359aa.f86743a;
        int i = ((C32398bm) obj).f86834b;
        int a = C32396bk.m60186a(i);
        if (a != 0 && a == 3) {
            return true;
        }
        int a2 = C32396bk.m60186a(i);
        return a2 != 0 && a2 == 4;
    }
}

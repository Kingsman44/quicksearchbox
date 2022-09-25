package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C27841x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f75910a;

    public /* synthetic */ C27841x(String str) {
        this.f75910a = str;
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
        String str = this.f75910a;
        C58974d dVar = C27842y.f75911a;
        return ((C24442ad) obj).f66928b.equals(str);
    }
}

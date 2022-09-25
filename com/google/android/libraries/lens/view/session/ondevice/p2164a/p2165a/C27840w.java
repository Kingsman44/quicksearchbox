package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C27840w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f75909a;

    public /* synthetic */ C27840w(String str) {
        this.f75909a = str;
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
        String str = this.f75909a;
        C24440ab abVar = (C24440ab) obj;
        C58974d dVar = C27842y.f75911a;
        C24446ah a = C24446ah.m45519a(abVar.f66922d);
        if (a == null) {
            a = C24446ah.STATUS_UNKNOWN;
        }
        if (a != C24446ah.STATUS_DOWNLOADED) {
            return false;
        }
        C24465t tVar = abVar.f66920b;
        if (tVar == null) {
            tVar = C24465t.f66964f;
        }
        if (!tVar.f66967b.equals(str)) {
            return false;
        }
        C24465t tVar2 = abVar.f66920b;
        if (tVar2 == null) {
            tVar2 = C24465t.f66964f;
        }
        return tVar2.f66970e.equals("GddLensText");
    }
}

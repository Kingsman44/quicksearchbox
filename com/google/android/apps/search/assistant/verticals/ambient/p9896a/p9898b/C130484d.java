package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b;

import com.google.assistant.p3886c.C50818do;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C130484d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130487g f357460a;

    /* renamed from: b */
    public final /* synthetic */ Map f357461b;

    public /* synthetic */ C130484d(C130487g gVar, Map map) {
        this.f357460a = gVar;
        this.f357461b = map;
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
        C130487g gVar = this.f357460a;
        Map map = this.f357461b;
        C50818do doVar = (C50818do) obj;
        if ((doVar.f132304a & 4) == 0 || !map.containsKey(Integer.valueOf(doVar.f132307d))) {
            return true;
        }
        C63042fg fgVar = (C63042fg) map.get(Integer.valueOf(doVar.f132307d));
        fgVar.getClass();
        return !C62950b.m95474e(fgVar).isAfter(gVar.f357471c.mo57444a());
    }
}

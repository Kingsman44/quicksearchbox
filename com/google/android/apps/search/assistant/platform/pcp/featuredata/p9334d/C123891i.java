package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.i */
/* compiled from: PG */
public final /* synthetic */ class C123891i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f342209a;

    public /* synthetic */ C123891i(List list) {
        this.f342209a = list;
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
        C59071e eVar = C123904v.f342237a;
        return !this.f342209a.contains((String) obj);
    }
}

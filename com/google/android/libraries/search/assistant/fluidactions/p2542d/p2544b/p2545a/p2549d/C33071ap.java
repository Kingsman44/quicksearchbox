package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ap */
/* compiled from: PG */
public final /* synthetic */ class C33071ap implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f88538a = "location_select_complete";

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
        String str = this.f88538a;
        C51016dg dgVar = ((C50954az) obj).f132646f;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        return dgVar.f132830b.equals(str);
    }
}

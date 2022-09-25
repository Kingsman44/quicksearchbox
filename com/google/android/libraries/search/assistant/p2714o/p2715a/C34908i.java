package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.usage.UsageStats;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.o.a.i */
/* compiled from: PG */
public final /* synthetic */ class C34908i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34908i f92561a = new C34908i();

    private /* synthetic */ C34908i() {
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
        C58974d dVar = C34913n.f92566a;
        return ((UsageStats) obj).getTotalTimeInForeground() > 0;
    }
}

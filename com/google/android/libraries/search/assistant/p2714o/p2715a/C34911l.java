package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.ActivityManager;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.o.a.l */
/* compiled from: PG */
public final /* synthetic */ class C34911l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34911l f92564a = new C34911l();

    private /* synthetic */ C34911l() {
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
        return ((ActivityManager.RunningTaskInfo) obj).topActivity != null;
    }
}

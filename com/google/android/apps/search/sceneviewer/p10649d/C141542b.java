package com.google.android.apps.search.sceneviewer.p10649d;

import androidx.core.p097i.C1970e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.sceneviewer.d.b */
/* compiled from: PG */
public final /* synthetic */ class C141542b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C141542b f384179a = new C141542b();

    private /* synthetic */ C141542b() {
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
        return "session_id".equals(((C1970e) obj).f5888a);
    }
}

package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76007b;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.r */
/* compiled from: PG */
public final /* synthetic */ class C75999r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C75999r f210823a = new C75999r();

    private /* synthetic */ C75999r() {
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
        int i = C76005x.f210829a;
        int a = C76007b.m122569a(((C76008c) obj).f210840c);
        return a != 0 && a == 3;
    }
}

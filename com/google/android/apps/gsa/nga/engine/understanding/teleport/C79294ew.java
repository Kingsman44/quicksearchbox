package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80055ai;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ew */
/* compiled from: PG */
public final /* synthetic */ class C79294ew implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f217782a;

    /* renamed from: b */
    public final /* synthetic */ String f217783b;

    public /* synthetic */ C79294ew(Optional optional, String str) {
        this.f217782a = optional;
        this.f217783b = str;
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
        C80055ai aiVar = (C80055ai) obj;
        return aiVar.f219684a.equals(this.f217782a.get()) || aiVar.f219684a.equals(this.f217783b);
    }
}

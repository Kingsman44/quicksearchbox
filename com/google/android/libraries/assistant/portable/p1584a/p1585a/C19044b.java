package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61751m;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C19044b implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ C61751m f53445a;

    /* renamed from: b */
    public final /* synthetic */ C61746h f53446b;

    public /* synthetic */ C19044b(C61751m mVar, C61746h hVar) {
        this.f53445a = mVar;
        this.f53446b = hVar;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        return this.f53445a.mo58182a(i).f166796d.equals(this.f53446b.f166796d);
    }
}

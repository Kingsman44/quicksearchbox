package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.knowledge.p4661a.p4662a.C61751m;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.be */
/* compiled from: PG */
public final /* synthetic */ class C11096be implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ C61751m f36378a;

    public /* synthetic */ C11096be(C61751m mVar) {
        this.f36378a = mVar;
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
        return this.f36378a.mo58182a(i).f166796d.equals("person");
    }
}

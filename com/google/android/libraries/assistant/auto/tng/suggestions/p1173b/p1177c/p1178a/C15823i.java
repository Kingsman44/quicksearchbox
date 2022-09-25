package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.C15838a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C15823i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15830p f47051a;

    public /* synthetic */ C15823i(C15830p pVar) {
        this.f47051a = pVar;
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
        C58528ij ijVar = this.f47051a.f47064d;
        return ((C58759qy) ijVar).f156534a.equals(((C15838a) obj).mo22584a());
    }
}

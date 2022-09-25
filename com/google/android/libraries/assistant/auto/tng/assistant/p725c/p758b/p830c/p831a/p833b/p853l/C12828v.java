package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16342ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.v */
/* compiled from: PG */
public final /* synthetic */ class C12828v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f40038a;

    public /* synthetic */ C12828v(int i) {
        this.f40038a = i;
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
        int i = this.f40038a;
        C59071e eVar = C12830x.f40040a;
        int a = C16342ap.m33337a(((C16344ar) obj).f48118c);
        if (a == 0) {
            a = 1;
        }
        return a == i;
    }
}

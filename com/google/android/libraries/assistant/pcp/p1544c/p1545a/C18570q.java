package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C18570q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C18571r f52587a;

    public /* synthetic */ C18570q(C18571r rVar) {
        this.f52587a = rVar;
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
        return ((Map) this.f52587a.f52588a.mo27525b()).containsKey((C53306j) obj);
    }
}

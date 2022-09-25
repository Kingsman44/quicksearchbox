package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49062fa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60945d;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.k */
/* compiled from: PG */
public final /* synthetic */ class C36290k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49062fa f94774a;

    public /* synthetic */ C36290k(C49062fa faVar) {
        this.f94774a = faVar;
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
        C49062fa faVar = this.f94774a;
        C59071e eVar = C36295p.f94779a;
        C49062fa faVar2 = (C49062fa) ((Map.Entry) obj).getValue();
        return (faVar2.f126909a & 4) != 0 && !C60945d.m93099d(faVar.f126912d).isAfter(C60945d.m93099d(faVar2.f126912d).plus(C36295p.f94780b));
    }
}

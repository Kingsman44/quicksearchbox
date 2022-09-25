package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49035ea;
import com.google.assistant.p3803ag.p3809c.C49036eb;
import com.google.assistant.p3803ag.p3809c.C49040ef;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.an */
/* compiled from: PG */
public final /* synthetic */ class C18644an implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52670a;

    public /* synthetic */ C18644an(C58528ij ijVar) {
        this.f52670a = ijVar;
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
        C49040ef efVar = (C49040ef) obj;
        Optional map = Collection.EL.stream(efVar.f126839c).filter(new C18655f(this.f52670a)).findFirst().map(C18656g.f52687a);
        C49036eb ebVar = efVar.f126838b;
        if (ebVar == null) {
            ebVar = C49036eb.f126826b;
        }
        int a = C49035ea.m85350a(((C49036eb) map.orElse(ebVar)).f126828a);
        return a != 0 && a == 2;
    }
}

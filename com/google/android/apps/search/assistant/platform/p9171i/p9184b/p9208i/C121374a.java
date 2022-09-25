package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i;

import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.i.a */
/* compiled from: PG */
public final /* synthetic */ class C121374a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49270ap f337005a;

    public /* synthetic */ C121374a(C49270ap apVar) {
        this.f337005a = apVar;
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
        C54759g gVar = (C54759g) obj;
        C49308c cVar = this.f337005a.f127359e;
        if (cVar == null) {
            cVar = C49308c.f127443c;
        }
        String str = cVar.f127445a;
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        return str.equals(uVar.f143706a);
    }
}

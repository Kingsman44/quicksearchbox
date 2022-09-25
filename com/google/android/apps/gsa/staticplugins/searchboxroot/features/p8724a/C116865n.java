package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.n */
/* compiled from: PG */
public final /* synthetic */ class C116865n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49270ap f324346a;

    public /* synthetic */ C116865n(C49270ap apVar) {
        this.f324346a = apVar;
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
        C49308c cVar = this.f324346a.f127359e;
        if (cVar == null) {
            cVar = C49308c.f127443c;
        }
        String str = cVar.f127445a;
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        if (!uVar.f143706a.equals(str)) {
            return false;
        }
        C54758f fVar = gVar.f143682b;
        if (fVar == null) {
            fVar = C54758f.f143676b;
        }
        return !fVar.f143678a.isEmpty();
    }
}

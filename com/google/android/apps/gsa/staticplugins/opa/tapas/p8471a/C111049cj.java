package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cj */
/* compiled from: PG */
public final /* synthetic */ class C111049cj implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f309255a;

    /* renamed from: b */
    public final /* synthetic */ List f309256b;

    public /* synthetic */ C111049cj(List list, List list2) {
        this.f309255a = list;
        this.f309256b = list2;
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
        List list = this.f309255a;
        List list2 = this.f309256b;
        int i2 = C111053cn.f309260g;
        boolean booleanValue = ((Boolean) list.get(i)).booleanValue();
        C54759g gVar = (C54759g) list2.get(i);
        if (booleanValue) {
            C58976aa aaVar = C58975e.f156826a;
            if (gVar.f143681a == null) {
                C54773u uVar = C54773u.f143704c;
            }
            if (gVar.f143682b == null) {
                C54758f fVar = C54758f.f143676b;
                return true;
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C54773u uVar2 = gVar.f143681a;
            if (uVar2 == null) {
                uVar2 = C54773u.f143704c;
            }
            String str = uVar2.f143706a;
        }
        return booleanValue;
    }
}

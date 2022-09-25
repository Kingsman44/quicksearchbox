package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protos.p4948ba.p4949a.C64371d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.av */
/* compiled from: PG */
public final /* synthetic */ class C138400av implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C138400av f376498a = new C138400av();

    private /* synthetic */ C138400av() {
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
        C54228aq aqVar = (C54228aq) obj;
        int a = C64371d.m96393a(aqVar.f142332c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (C138029au.m224331a(a - 1) != null) {
            return true;
        }
        C58970a aVar = (C58970a) C138403ay.f376501a.mo56225c();
        aVar.mo56378ag(C38505d.f101864b, 146057017);
        C58970a aVar2 = (C58970a) aVar.mo56372aa(41213);
        int a2 = C64371d.m96393a(aqVar.f142332c);
        if (a2 != 0) {
            i = a2;
        }
        aVar2.mo56387q("Unsupported suggestion type (%d)", i - 1);
        return false;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.c */
/* compiled from: PG */
public final /* synthetic */ class C109368c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C109370e f304652a;

    public /* synthetic */ C109368c(C109370e eVar) {
        this.f304652a = eVar;
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
        C109370e eVar = this.f304652a;
        C53552al alVar = (C53552al) obj;
        C58495hd hdVar = eVar.f304655a;
        C53556ap b = C53556ap.m86865b(alVar.f140544d);
        if (b == null) {
            b = C53556ap.NONE;
        }
        if (!hdVar.containsKey(b)) {
            return false;
        }
        C58495hd hdVar2 = eVar.f304655a;
        C53556ap b2 = C53556ap.m86865b(alVar.f140544d);
        if (b2 == null) {
            b2 = C53556ap.NONE;
        }
        C109371f fVar = (C109371f) hdVar2.get(b2);
        fVar.getClass();
        return fVar.mo97812a(alVar);
    }
}

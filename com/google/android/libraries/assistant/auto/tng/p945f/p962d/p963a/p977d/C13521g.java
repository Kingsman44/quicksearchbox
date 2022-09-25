package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.g */
/* compiled from: PG */
public final /* synthetic */ class C13521g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C13526l f41454a;

    public /* synthetic */ C13521g(C13526l lVar) {
        this.f41454a = lVar;
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
        C13530f fVar = (C13530f) obj;
        C58495hd hdVar = ((C13498a) this.f41454a).f41407b;
        C13529e a = C13529e.m29814a(fVar.f41478c);
        if (a == null) {
            a = C13529e.UNRECOGNIZED;
        }
        Float f = (Float) hdVar.getOrDefault(a, Float.valueOf(0.0f));
        return ((double) f.floatValue()) > C59203do.f157270a && fVar.f41481f < f.floatValue();
    }
}

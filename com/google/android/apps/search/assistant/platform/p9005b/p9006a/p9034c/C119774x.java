package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.x */
/* compiled from: PG */
public final /* synthetic */ class C119774x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C32796ar f333639a;

    public /* synthetic */ C119774x(C32796ar arVar) {
        this.f333639a = arVar;
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
        C32796ar arVar = this.f333639a;
        C32796ar arVar2 = ((C32836cd) obj).f88043b;
        if (arVar2 == null) {
            arVar2 = C32796ar.f87973c;
        }
        return Objects.equals(arVar2, arVar);
    }
}

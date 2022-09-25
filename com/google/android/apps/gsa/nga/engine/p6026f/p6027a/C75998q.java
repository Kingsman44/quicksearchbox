package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76007b;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76021p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.q */
/* compiled from: PG */
public final /* synthetic */ class C75998q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80517f f210822a;

    public /* synthetic */ C75998q(C80517f fVar) {
        this.f210822a = fVar;
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
        C76021p pVar;
        C80517f fVar = this.f210822a;
        C76008c cVar = (C76008c) obj;
        int i = C76005x.f210829a;
        int a = C76007b.m122569a(cVar.f210840c);
        if (a == 0 || a != 6) {
            return false;
        }
        if (cVar.f210838a == 4) {
            pVar = (C76021p) cVar.f210839b;
        } else {
            pVar = C76021p.f210860b;
        }
        C80517f a2 = C80517f.m128187a(pVar.f210862a);
        if (a2 == null) {
            a2 = C80517f.UNRECOGNIZED;
        }
        return a2 == fVar;
    }
}

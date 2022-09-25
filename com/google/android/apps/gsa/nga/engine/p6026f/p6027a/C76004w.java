package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76007b;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76019n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.w */
/* compiled from: PG */
public final /* synthetic */ class C76004w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80515d f210828a;

    public /* synthetic */ C76004w(C80515d dVar) {
        this.f210828a = dVar;
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
        C76019n nVar;
        C80515d dVar = this.f210828a;
        C76008c cVar = (C76008c) obj;
        int i = C76005x.f210829a;
        int a = C76007b.m122569a(cVar.f210840c);
        if (a == 0 || a != 5) {
            return false;
        }
        if (cVar.f210838a == 3) {
            nVar = (C76019n) cVar.f210839b;
        } else {
            nVar = C76019n.f210857b;
        }
        C80515d a2 = C80515d.m128185a(nVar.f210859a);
        if (a2 == null) {
            a2 = C80515d.UNRECOGNIZED;
        }
        return a2 == dVar;
    }
}

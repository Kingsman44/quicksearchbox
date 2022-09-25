package com.google.android.apps.gsa.staticplugins.chime.p7660e;

import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56986v;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.e.g */
/* compiled from: PG */
public final /* synthetic */ class C97689g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C7708h f272784a;

    public /* synthetic */ C97689g(C7708h hVar) {
        this.f272784a = hVar;
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
        C7708h hVar = this.f272784a;
        C56986v vVar = (C56986v) obj;
        int i = C97692j.f272787a;
        int i2 = vVar.f152123a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            return false;
        }
        C7681g a = C7681g.m22802a(vVar.f152124b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        C7681g a2 = C7681g.m22802a(hVar.f26897b);
        if (a2 == null) {
            a2 = C7681g.INVALID;
        }
        return a == a2;
    }
}

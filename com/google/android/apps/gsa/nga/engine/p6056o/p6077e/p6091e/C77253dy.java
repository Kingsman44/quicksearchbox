package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dy */
/* compiled from: PG */
public final /* synthetic */ class C77253dy implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f213102a;

    /* renamed from: b */
    public final /* synthetic */ Optional f213103b;

    public /* synthetic */ C77253dy(Optional optional, Optional optional2) {
        this.f213102a = optional;
        this.f213103b = optional2;
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
        Optional optional = this.f213102a;
        Optional optional2 = this.f213103b;
        C51592nk nkVar = (C51592nk) obj;
        boolean z = (nkVar.f134464a & 4) != 0 && optional.isPresent() && nkVar.f134469f == ((Long) optional.get()).longValue();
        boolean z2 = (nkVar.f134464a & 4) != 0 && optional2.isPresent() && nkVar.f134469f == ((Long) optional2.get()).longValue();
        if ((optional.isPresent() || optional2.isPresent()) && !z && !z2) {
            return false;
        }
        return true;
    }
}

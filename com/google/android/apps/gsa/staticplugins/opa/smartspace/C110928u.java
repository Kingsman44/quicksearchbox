package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.accounts.Account;
import com.google.android.apps.gsa.sidekick.main.p7201d.C91284a;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57014f;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.u */
/* compiled from: PG */
public final /* synthetic */ class C110928u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C57017i f309020a;

    public /* synthetic */ C110928u(C57017i iVar) {
        this.f309020a = iVar;
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
        C57017i iVar = this.f309020a;
        String a = C91284a.m149219a((Account) obj);
        C57014f fVar = iVar.f152219n;
        if (fVar == null) {
            fVar = C57014f.f152189c;
        }
        return a.equals(fVar.f152192b);
    }
}

package com.google.android.apps.gsa.nga.shared.p6407v;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82888ed;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.C83045a;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.C83134b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.C83161c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.C83167d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.k */
/* compiled from: PG */
public final /* synthetic */ class C83322k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83331t f227137a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f227138b;

    public /* synthetic */ C83322k(C83331t tVar, C91006f fVar) {
        this.f227137a = tVar;
        this.f227138b = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83134b bVar;
        C83331t tVar = this.f227137a;
        C82889ee eeVar = (C82889ee) obj;
        if (this.f227138b.mo85298x() || !tVar.f227148a.mo75570a(eeVar)) {
            return eeVar;
        }
        C83045a aVar = tVar.f227149b;
        C82887ec a = C82887ec.m132416a(eeVar.f226097b);
        if (a == null) {
            a = C82887ec.UNKNOWN;
        }
        C82885ea eaVar = eeVar.f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C83167d dVar = aVar.f226657a;
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            bVar = ordinal != 2 ? ordinal != 4 ? ordinal != 11 ? ordinal != 20 ? ordinal != 26 ? ordinal != 29 ? ordinal != 48 ? C83161c.f226772a : dVar.f226783h : dVar.f226777b : dVar.f226781f : dVar.f226779d : dVar.f226782g : dVar.f226778c : dVar.f226780e;
        } else {
            bVar = dVar.f226776a;
        }
        bVar.mo76647a(eaVar, dzVar);
        C82885ea eaVar2 = (C82885ea) dzVar.build();
        C82888ed edVar = (C82888ed) eeVar.toBuilder();
        edVar.copyOnWrite();
        C82889ee eeVar2 = (C82889ee) edVar.instance;
        eaVar2.getClass();
        eeVar2.f226099d = eaVar2;
        eeVar2.f226096a |= 4;
        return (C82889ee) edVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

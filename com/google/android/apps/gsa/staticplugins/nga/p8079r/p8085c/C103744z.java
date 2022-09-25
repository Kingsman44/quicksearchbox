package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80087ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.z */
/* compiled from: PG */
public final class C103744z implements C103651a {

    /* renamed from: a */
    private final C84874a f288907a;

    public C103744z(C84874a aVar) {
        this.f288907a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80087ab abVar;
        if (bnVar.f219917a == 14) {
            abVar = (C80087ab) bnVar.f219918b;
        } else {
            abVar = C80087ab.f219777e;
        }
        C84874a aVar = this.f288907a;
        C65753ak b = C65753ak.m96797b(abVar.f219780b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C65768az azVar = abVar.f219781c;
        if (azVar == null) {
            azVar = C65768az.f178793f;
        }
        return C60922j.m93044g(aVar.mo78556e(b, azVar, abVar.f219782d), C103743y.f288906a, C60826bg.f164896a);
    }
}

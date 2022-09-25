package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83065as;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83077bd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83083bj;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.s */
/* compiled from: PG */
public final class C83182s implements C83134b {

    /* renamed from: a */
    private final C83083bj f226798a;

    /* renamed from: b */
    private final C83065as f226799b;

    public C83182s(C83083bj bjVar, C83065as asVar) {
        this.f226798a = bjVar;
        this.f226799b = asVar;
    }

    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82823bt btVar;
        if (eaVar.f225979a == 29) {
            btVar = (C82823bt) eaVar.f225980b;
        } else {
            btVar = C82823bt.f225680i;
        }
        C82822bs bsVar = (C82822bs) C82823bt.f225680i.createBuilder();
        int i = btVar.f225682a;
        Objects.requireNonNull(btVar);
        C83168e eVar = new C83168e(btVar);
        Objects.requireNonNull(bsVar);
        boolean z = true;
        C83080bg.m132479c(1 == (i & 1), eVar, new C83177n(bsVar), this.f226798a);
        boolean z2 = (btVar.f225682a & 2) != 0;
        Objects.requireNonNull(btVar);
        C83178o oVar = new C83178o(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132479c(z2, oVar, new C83179p(bsVar), this.f226799b);
        boolean z3 = (btVar.f225682a & 4) != 0;
        Objects.requireNonNull(btVar);
        C83180q qVar = new C83180q(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132479c(z3, qVar, new C83181r(bsVar), C83077bd.f226687a);
        boolean z4 = (btVar.f225682a & 8) != 0;
        Objects.requireNonNull(btVar);
        C83169f fVar = new C83169f(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132479c(z4, fVar, new C83170g(bsVar), C83077bd.f226687a);
        boolean z5 = (btVar.f225682a & 16) != 0;
        Objects.requireNonNull(btVar);
        C83171h hVar = new C83171h(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132478b(z5, hVar, new C83172i(bsVar));
        boolean z6 = (btVar.f225682a & 32) != 0;
        Objects.requireNonNull(btVar);
        C83173j jVar = new C83173j(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132478b(z6, jVar, new C83174k(bsVar));
        if ((btVar.f225682a & 64) == 0) {
            z = false;
        }
        Objects.requireNonNull(btVar);
        C83175l lVar = new C83175l(btVar);
        Objects.requireNonNull(bsVar);
        C83080bg.m132478b(z, lVar, new C83176m(bsVar));
        C82823bt btVar2 = (C82823bt) bsVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        btVar2.getClass();
        eaVar2.f225980b = btVar2;
        eaVar2.f225979a = 29;
    }
}

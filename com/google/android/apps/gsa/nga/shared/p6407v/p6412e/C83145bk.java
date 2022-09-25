package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82846cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82847cq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83069aw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83103v;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bk */
/* compiled from: PG */
public final class C83145bk implements C83134b {

    /* renamed from: a */
    public final C83069aw f226755a;

    /* renamed from: b */
    public final C83103v f226756b;

    public C83145bk(C83069aw awVar, C83103v vVar) {
        this.f226755a = awVar;
        this.f226756b = vVar;
    }

    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82847cq cqVar;
        if (eaVar.f225979a == 11) {
            cqVar = (C82847cq) eaVar.f225980b;
        } else {
            cqVar = C82847cq.f225903d;
        }
        C82846cp cpVar = (C82846cp) C82847cq.f225903d.createBuilder();
        int i = cqVar.f225905a;
        Objects.requireNonNull(cqVar);
        C83108aa aaVar = new C83108aa(cqVar);
        Objects.requireNonNull(cpVar);
        boolean z = true;
        C83080bg.m132479c(1 == (i & 1), aaVar, new C83119al(cpVar), new C83130aw(this));
        if ((cqVar.f225905a & 2) == 0) {
            z = false;
        }
        Objects.requireNonNull(cqVar);
        C83138bd bdVar = new C83138bd(cqVar);
        Objects.requireNonNull(cpVar);
        C83080bg.m132479c(z, bdVar, new C83139be(cpVar), new C83140bf(this));
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        C82847cq cqVar2 = (C82847cq) cpVar.build();
        cqVar2.getClass();
        eaVar2.f225980b = cqVar2;
        eaVar2.f225979a = 11;
    }
}

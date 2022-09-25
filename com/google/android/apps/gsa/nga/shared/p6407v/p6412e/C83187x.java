package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.x */
/* compiled from: PG */
public final class C83187x implements C83134b {
    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82833cc ccVar;
        if (eaVar.f225979a == 35) {
            ccVar = (C82833cc) eaVar.f225980b;
        } else {
            ccVar = C82833cc.f225801h;
        }
        C82832cb cbVar = (C82832cb) C82833cc.f225801h.createBuilder();
        int i = ccVar.f225803a;
        Objects.requireNonNull(ccVar);
        C83183t tVar = new C83183t(ccVar);
        Objects.requireNonNull(cbVar);
        boolean z = true;
        C83080bg.m132478b(1 == (i & 1), tVar, new C83184u(cbVar));
        if ((ccVar.f225803a & 2) == 0) {
            z = false;
        }
        Objects.requireNonNull(ccVar);
        C83185v vVar = new C83185v(ccVar);
        Objects.requireNonNull(cbVar);
        C83080bg.m132478b(z, vVar, new C83186w(cbVar));
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        C82833cc ccVar2 = (C82833cc) cbVar.build();
        ccVar2.getClass();
        eaVar2.f225980b = ccVar2;
        eaVar2.f225979a = 35;
    }
}

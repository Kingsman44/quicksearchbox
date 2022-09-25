package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82936fy;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82937fz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82939ga;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82941gc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82942gd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82944gf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82945gg;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.n */
/* compiled from: PG */
public final class C106219n {

    /* renamed from: a */
    private static final C106218m f296414a = new C106218m();

    /* renamed from: b */
    private static final C106217l f296415b = new C106217l();

    /* renamed from: c */
    private static final C106216k f296416c = new C106216k();

    /* renamed from: a */
    public static C82885ea m176981a(C106204a aVar, Optional optional, Optional optional2, Optional optional3) {
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82937fz fzVar = (C82937fz) C82939ga.f226284f.createBuilder();
        C82936fy a = f296416c.apply(aVar);
        fzVar.copyOnWrite();
        C82939ga gaVar = (C82939ga) fzVar.instance;
        gaVar.f226287b = a.f226272h;
        gaVar.f226286a |= 1;
        if (optional.isPresent()) {
            C82941gc a2 = f296415b.apply((C107706q) optional.get());
            fzVar.copyOnWrite();
            C82939ga gaVar2 = (C82939ga) fzVar.instance;
            gaVar2.f226288c = a2.f226297e;
            gaVar2.f226286a |= 2;
        }
        if (optional2.isPresent()) {
            long longValue = ((Long) optional2.get()).longValue();
            fzVar.copyOnWrite();
            C82939ga gaVar3 = (C82939ga) fzVar.instance;
            gaVar3.f226286a |= 4;
            gaVar3.f226289d = longValue;
        }
        if (optional3.isPresent()) {
            boolean booleanValue = ((Boolean) optional3.get()).booleanValue();
            fzVar.copyOnWrite();
            C82939ga gaVar4 = (C82939ga) fzVar.instance;
            gaVar4.f226286a |= 8;
            gaVar4.f226290e = booleanValue;
        }
        C82939ga gaVar5 = (C82939ga) fzVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        gaVar5.getClass();
        eaVar.f225980b = gaVar5;
        eaVar.f225979a = 102;
        return (C82885ea) dzVar.build();
    }

    /* renamed from: b */
    public static C82885ea m176982b(C106204a aVar, C107708s sVar, C107706q qVar) {
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82942gd gdVar = (C82942gd) C82945gg.f226304e.createBuilder();
        C82936fy a = f296416c.apply(aVar);
        gdVar.copyOnWrite();
        C82945gg ggVar = (C82945gg) gdVar.instance;
        ggVar.f226307b = a.f226272h;
        ggVar.f226306a |= 1;
        C82944gf a2 = f296414a.apply(sVar);
        gdVar.copyOnWrite();
        C82945gg ggVar2 = (C82945gg) gdVar.instance;
        ggVar2.f226308c = a2.f226303d;
        ggVar2.f226306a |= 2;
        C82941gc a3 = f296415b.apply(qVar);
        gdVar.copyOnWrite();
        C82945gg ggVar3 = (C82945gg) gdVar.instance;
        ggVar3.f226309d = a3.f226297e;
        ggVar3.f226306a |= 4;
        C82945gg ggVar4 = (C82945gg) gdVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        ggVar4.getClass();
        eaVar.f225980b = ggVar4;
        eaVar.f225979a = 101;
        return (C82885ea) dzVar.build();
    }
}

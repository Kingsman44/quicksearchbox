package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80476a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80480e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80482g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80483h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ce */
/* compiled from: PG */
public final class C83166ce implements C83134b {
    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C80484i iVar;
        if (eaVar.f225979a == 1) {
            iVar = (C80484i) eaVar.f225980b;
        } else {
            iVar = C80484i.f220937h;
        }
        C80476a aVar = (C80476a) C80484i.f220937h.createBuilder();
        long j = iVar.f220940b;
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220940b = j;
        C80479d a = C80479d.m128175a(iVar.f220942d);
        if (a == null) {
            a = C80479d.UNRECOGNIZED;
        }
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220942d = a.getNumber();
        C80478c a2 = C80478c.m128173a(iVar.f220944f);
        if (a2 == null) {
            a2 = C80478c.UNRECOGNIZED;
        }
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220944f = a2.getNumber();
        String str = iVar.f220945g;
        aVar.copyOnWrite();
        str.getClass();
        ((C80484i) aVar.instance).f220945g = str;
        String a3 = C83080bg.m132477a(iVar.f220939a);
        aVar.copyOnWrite();
        a3.getClass();
        ((C80484i) aVar.instance).f220939a = a3;
        for (C80483h hVar : iVar.f220943e) {
            C80480e eVar = (C80480e) C80483h.f220932d.createBuilder();
            C80482g a4 = C80482g.m128176a(hVar.f220935b);
            if (a4 == null) {
                a4 = C80482g.UNRECOGNIZED;
            }
            eVar.copyOnWrite();
            ((C80483h) eVar.instance).f220935b = a4.getNumber();
            int i = hVar.f220936c;
            eVar.copyOnWrite();
            ((C80483h) eVar.instance).f220936c = i;
            String a5 = C83080bg.m132477a(hVar.f220934a);
            eVar.copyOnWrite();
            a5.getClass();
            ((C80483h) eVar.instance).f220934a = a5;
            C80483h hVar2 = (C80483h) eVar.build();
            aVar.copyOnWrite();
            C80484i iVar2 = (C80484i) aVar.instance;
            hVar2.getClass();
            iVar2.mo74341a();
            iVar2.f220943e.add(hVar2);
        }
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        C80484i iVar3 = (C80484i) aVar.build();
        iVar3.getClass();
        eaVar2.f225980b = iVar3;
        eaVar2.f225979a = 1;
    }
}

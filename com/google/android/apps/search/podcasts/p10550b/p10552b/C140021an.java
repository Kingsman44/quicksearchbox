package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97915e;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.podcasts.b.b.an */
/* compiled from: PG */
public final class C140021an {

    /* renamed from: a */
    public boolean f380556a = false;

    /* renamed from: b */
    public final C58331bb f380557b = new C58331bb();

    /* renamed from: e */
    public static void m227684e(C97874a aVar, String str, String str2) {
        C97918h hVar = ((C97914d) aVar.instance).f273397c;
        if (hVar == null) {
            hVar = C97918h.f273412m;
        }
        C97919i iVar = (C97919i) C97920j.f273426e.createBuilder();
        iVar.copyOnWrite();
        C97920j jVar = (C97920j) iVar.instance;
        str.getClass();
        jVar.f273428a |= 1;
        jVar.f273429b = str;
        iVar.copyOnWrite();
        C97920j jVar2 = (C97920j) iVar.instance;
        str2.getClass();
        jVar2.f273428a |= 2;
        jVar2.f273430c = str2;
        C97920j jVar3 = hVar.f273423j;
        if (jVar3 == null) {
            jVar3 = C97920j.f273426e;
        }
        String str3 = jVar3.f273431d;
        iVar.copyOnWrite();
        C97920j jVar4 = (C97920j) iVar.instance;
        str3.getClass();
        jVar4.f273428a |= 4;
        jVar4.f273431d = str3;
        C97920j jVar5 = (C97920j) iVar.build();
        C97915e eVar = (C97915e) hVar.toBuilder();
        eVar.copyOnWrite();
        C97918h hVar2 = (C97918h) eVar.instance;
        jVar5.getClass();
        hVar2.f273423j = jVar5;
        hVar2.f273414a |= 256;
        aVar.copyOnWrite();
        C97914d dVar = (C97914d) aVar.instance;
        C97918h hVar3 = (C97918h) eVar.build();
        hVar3.getClass();
        dVar.f273397c = hVar3;
        dVar.f273395a |= 2;
    }

    /* renamed from: a */
    public final C97874a mo115390a(C97920j jVar) {
        if (jVar == null) {
            return null;
        }
        for (C97874a aVar : this.f380557b.mo55277g(jVar.f273431d)) {
            C97918h hVar = ((C97914d) aVar.instance).f273397c;
            if (hVar == null) {
                hVar = C97918h.f273412m;
            }
            C97920j jVar2 = hVar.f273423j;
            if (jVar2 == null) {
                jVar2 = C97920j.f273426e;
            }
            if (C140968d.m228925c(jVar, jVar2)) {
                m227684e(aVar, jVar.f273429b, jVar.f273430c);
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C58485gu mo115391b() {
        return C58485gu.m89842j(this.f380557b.mo54949B());
    }

    /* renamed from: c */
    public final void mo115392c(C97920j jVar, C97874a aVar) {
        mo115393d(jVar);
        this.f380557b.mo54920x(jVar.f273431d, aVar);
    }

    /* renamed from: d */
    public final void mo115393d(C97920j jVar) {
        C97874a a = mo115390a(jVar);
        if (a != null) {
            this.f380557b.mo54956I(jVar.f273431d, a);
        }
    }

    /* renamed from: f */
    public final boolean mo115394f(C97920j jVar) {
        return mo115390a(jVar) != null;
    }
}

package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ad */
/* compiled from: PG */
final class C140011ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f380533a;

    /* renamed from: b */
    final /* synthetic */ String f380534b;

    /* renamed from: c */
    final /* synthetic */ Set f380535c;

    /* renamed from: d */
    final /* synthetic */ C140022ao f380536d;

    public C140011ad(C140022ao aoVar, String str, String str2, Set set) {
        this.f380536d = aoVar;
        this.f380533a = str;
        this.f380534b = str2;
        this.f380535c = set;
    }

    /* renamed from: c */
    public final void mo17911gm(C97920j jVar) {
        C140021an anVar = this.f380536d.f380560c;
        String str = this.f380533a;
        String str2 = this.f380534b;
        C97919i iVar = (C97919i) C97920j.f273426e.createBuilder();
        iVar.copyOnWrite();
        C97920j jVar2 = (C97920j) iVar.instance;
        str.getClass();
        jVar2.f273428a |= 1;
        jVar2.f273429b = str;
        iVar.copyOnWrite();
        C97920j jVar3 = (C97920j) iVar.instance;
        str2.getClass();
        jVar3.f273428a |= 2;
        jVar3.f273430c = str2;
        C97920j jVar4 = (C97920j) iVar.build();
        HashSet<C97874a> hashSet = new HashSet<>();
        C58485gu b = anVar.mo115391b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C97874a aVar = (C97874a) b.get(i);
            C97918h hVar = ((C97914d) aVar.instance).f273397c;
            if (hVar == null) {
                hVar = C97918h.f273412m;
            }
            C97920j jVar5 = hVar.f273423j;
            if (jVar5 == null) {
                jVar5 = C97920j.f273426e;
            }
            if (C140968d.m228925c(jVar4, jVar5)) {
                C140021an.m227684e(aVar, jVar4.f273429b, jVar4.f273430c);
                hashSet.add(aVar);
            }
        }
        for (C97874a aVar2 : hashSet) {
            C97918h hVar2 = ((C97914d) aVar2.instance).f273397c;
            if (hVar2 == null) {
                hVar2 = C97918h.f273412m;
            }
            C97920j jVar6 = hVar2.f273423j;
            if (jVar6 == null) {
                jVar6 = C97920j.f273426e;
            }
            if (!this.f380535c.contains(jVar6.f273431d) && (jVar == null || !C140968d.m228924b(jVar6, jVar))) {
                this.f380536d.mo115403k(jVar6, (Runnable) null);
            }
        }
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        mo17911gm((C97920j) null);
    }
}

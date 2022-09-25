package com.google.android.apps.gsa.staticplugins.bisto.p7520u;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142405ec;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60296ni;
import com.google.common.p4552o.C60297nj;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.h */
/* compiled from: PG */
public final class C96058h implements AutoCloseable, C89495cg {

    /* renamed from: a */
    private final C89496ch f268949a;

    /* renamed from: b */
    private final C68214a f268950b;

    /* renamed from: c */
    private final Map f268951c = new HashMap();

    public C96058h(C89496ch chVar, C68214a aVar, C95850a aVar2) {
        this.f268949a = chVar;
        this.f268950b = aVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar2.f268408a.add(this);
        chVar.mo83360B(C58528ij.m90011K(0, 1), this);
    }

    public final synchronized void close() {
        this.f268949a.mo83379U(this);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        C124548d dVar2 = (C124548d) this.f268951c.get(str);
        if (dVar.mo106489ac()) {
            if (dVar2 != null && dVar2.mo106511i().equals(dVar.mo106511i())) {
                if (!dVar.mo106468I().isPresent()) {
                    return;
                }
                if (dVar2.mo106468I().isPresent() && Math.abs(((Integer) dVar.mo106468I().get()).intValue() - ((Integer) dVar2.mo106468I().get()).intValue()) < 5) {
                    return;
                }
            }
            C60296ni niVar = (C60296ni) C60297nj.f163132d.createBuilder();
            int a = C142405ec.m231076a(dVar.mo106511i().f344071g);
            niVar.copyOnWrite();
            C60297nj njVar = (C60297nj) niVar.instance;
            int i = a - 1;
            if (a != 0) {
                njVar.f163135b = i;
                njVar.f163134a |= 1;
                if (dVar.mo106468I().isPresent()) {
                    int intValue = ((Integer) dVar.mo106468I().get()).intValue();
                    niVar.copyOnWrite();
                    C60297nj njVar2 = (C60297nj) niVar.instance;
                    njVar2.f163134a |= 2;
                    njVar2.f163136c = intValue;
                }
                C58976aa aaVar = C58975e.f156826a;
                C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                nkVar.copyOnWrite();
                C60300nm nmVar = (C60300nm) nkVar.instance;
                C60297nj njVar3 = (C60297nj) niVar.build();
                njVar3.getClass();
                nmVar.f163161o = njVar3;
                nmVar.f163147a |= 33554432;
                ((C95307m) this.f268950b.mo27525b()).mo83545c(nkVar);
                this.f268951c.put(str, dVar);
                return;
            }
            throw null;
        }
    }
}

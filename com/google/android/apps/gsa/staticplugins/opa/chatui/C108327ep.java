package com.google.android.apps.gsa.staticplugins.opa.chatui;

import androidx.annotation.C0826b;
import com.google.android.libraries.gsa.conversation.p1855h.C22717u;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ep */
/* compiled from: PG */
public final class C108327ep {

    /* renamed from: a */
    private final C28292j f301336a = new C28292j(27415);

    /* renamed from: b */
    private final ArrayList f301337b = new ArrayList();

    /* renamed from: a */
    public final C60321oe mo96785a(C58833ax axVar) {
        C60321oe oeVar;
        C22872h.m42743c(C0826b.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f301337b;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            C108232bc bcVar = (C108232bc) arrayList3.get(i);
            C28293k i2 = bcVar.mo95831i();
            if (i2 != null) {
                arrayList.add(i2);
                arrayList2.add(bcVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C28293k d = C28293k.m52907d(this.f301336a, arrayList);
        if (axVar.mo56113h()) {
            oeVar = C28285c.m52875b(d, 0);
        } else {
            oeVar = C28285c.m52875b(d, 77345);
        }
        if (oeVar == null) {
            return null;
        }
        C60320od odVar = (C60320od) oeVar.toBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C28292j a = ((C28293k) arrayList.get(i3)).mo33745a();
            if (!(a == null || (1 & a.mo33788b().f162916a) == 0)) {
                int i4 = a.mo33788b().f162917b;
                C108232bc bcVar2 = (C108232bc) arrayList2.get(i3);
                odVar.mo57081a(i4);
            }
        }
        if (axVar.mo56113h()) {
            C22717u uVar = (C22717u) axVar.mo56107c();
            C58833ax axVar2 = C58836b.f156633a;
            if (uVar.mo27832b() == 1) {
                try {
                    C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                    C60220t b = C28294l.m52912b(uVar.mo27836c());
                    qVar.copyOnWrite();
                    C60218r rVar = (C60218r) qVar.instance;
                    b.getClass();
                    rVar.f162928b = b;
                    rVar.f162927a |= 1;
                    axVar2 = C58833ax.m90834k((C60218r) qVar.build());
                } catch (IOException unused) {
                }
            } else if (uVar.mo27832b() == 2) {
                axVar2 = C58833ax.m90834k(uVar.mo27831a());
            }
            if (axVar2.mo56113h()) {
                C60218r rVar2 = (C60218r) axVar2.mo56107c();
                odVar.copyOnWrite();
                C60321oe oeVar2 = (C60321oe) odVar.instance;
                rVar2.getClass();
                oeVar2.f163229d = rVar2;
                oeVar2.f163226a |= 2;
                aql aql = (aql) aqm.f159760n.createBuilder();
                aql.copyOnWrite();
                aqm aqm = (aqm) aql.instance;
                aqm.f159762a |= 8;
                aqm.f159766e = 0;
                aql.copyOnWrite();
                aqm aqm2 = (aqm) aql.instance;
                aqm2.f159762a |= 4;
                aqm2.f159765d = 23263;
                odVar.copyOnWrite();
                C60321oe oeVar3 = (C60321oe) odVar.instance;
                aqm aqm3 = (aqm) aql.build();
                aqm3.getClass();
                oeVar3.f163230e = aqm3;
                oeVar3.f163226a |= 16;
                odVar.copyOnWrite();
                C60321oe oeVar4 = (C60321oe) odVar.instance;
                oeVar4.f163231f = 3;
                oeVar4.f163226a |= 32;
            }
        }
        return (C60321oe) odVar.build();
    }

    /* renamed from: b */
    public final void mo96786b(C108232bc bcVar) {
        C22872h.m42743c(C0826b.class);
        this.f301337b.add(bcVar);
    }

    /* renamed from: c */
    public final void mo96787c() {
        C22872h.m42743c(C0826b.class);
        this.f301337b.clear();
    }
}

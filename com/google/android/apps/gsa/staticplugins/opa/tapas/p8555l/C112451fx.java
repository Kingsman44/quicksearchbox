package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112147n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f.C112427h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113403en;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fx */
/* compiled from: PG */
public final class C112451fx extends C112147n {

    /* renamed from: a */
    public static final C59071e f311966a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.fx");

    /* renamed from: b */
    public final C86124t f311967b;

    /* renamed from: c */
    public final C112427h f311968c;

    public C112451fx(C86124t tVar, C112427h hVar, C112698f fVar) {
        super(fVar);
        this.f311967b = tVar;
        this.f311968c = hVar;
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.LOW_SCORE_SUPPRESSOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Map mo99418l(C113405ep epVar, Map map) {
        int i;
        double d;
        C113415ez ezVar;
        if (map.isEmpty()) {
            return new HashMap();
        }
        C112450fw fwVar = new C112450fw(this, epVar.mo100024h(), map);
        C58485gu guVar = fwVar.f311959d;
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C58835az azVar = (C58835az) guVar.get(i2);
            if (fwVar.mo99527c()) {
                return fwVar.f311956a;
            }
            C113415ez ezVar2 = (C113415ez) azVar.f156631a;
            if (ezVar2.mo100201a() < this.f311967b.mo79747m(C90063do.f249476eJ) || ezVar2.mo100201a() / fwVar.f311962g.mo100201a() < this.f311967b.mo79747m(C90063do.f249474eH)) {
                fwVar.mo99525a(C113371dl.m187573c(ezVar2.mo100204d()), ((Integer) azVar.f156632b).intValue());
            }
        }
        int size2 = fwVar.f311957b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                long a = this.f311967b.mo79743a(C90063do.f249478eL);
                C58485gu guVar2 = fwVar.f311957b;
                int size3 = guVar2.size();
                double d2 = 1.0d;
                double d3 = 1.0d;
                int i3 = 0;
                while (i3 < size3) {
                    C113403en enVar = (C113403en) guVar2.get(i3);
                    int i4 = 0;
                    while (true) {
                        i = i3 + 1;
                        if (i4 >= enVar.mo100086d().size()) {
                            break;
                        }
                        C113415ez ezVar3 = (C113415ez) enVar.mo100086d().get(i4);
                        double d4 = d2 - d3;
                        if (a > 0 || d4 < this.f311967b.mo79747m(C90063do.f249473eG) || d4 <= this.f311967b.mo79747m(C90063do.f249573gA)) {
                            d = 1.0d;
                            d3 *= 1.0d - ezVar3.mo100201a();
                            a--;
                            C58976aa aaVar = C58975e.f156826a;
                        } else {
                            C58976aa aaVar2 = C58975e.f156826a;
                            fwVar.mo99525a(C113371dl.m187573c(ezVar3.mo100204d()), i4);
                            d = 1.0d;
                        }
                        i4++;
                        d2 = d;
                    }
                    i3 = i;
                }
                return fwVar.f311956a;
            } else if (fwVar.mo99527c()) {
                return fwVar.f311956a;
            } else {
                C113403en enVar2 = (C113403en) fwVar.f311957b.get(size2);
                int size4 = enVar2.mo100086d().size();
                while (true) {
                    size4--;
                    if (size4 >= 0) {
                        if (fwVar.mo99527c()) {
                            return fwVar.f311956a;
                        }
                        if (!fwVar.mo99526b(enVar2.mo100085c(), size4)) {
                            C113415ez ezVar4 = (C113415ez) enVar2.mo100086d().get(size4);
                            if (size4 > 0) {
                                ezVar = (C113415ez) enVar2.mo100086d().get(size4 - 1);
                            } else {
                                ezVar = size2 > 0 ? (C113415ez) C58557jl.m90131l(((C113403en) fwVar.f311957b.get(size2 - 1)).mo100086d()) : null;
                            }
                            if (ezVar != null && ezVar4.mo100201a() / ezVar.mo100201a() < this.f311967b.mo79747m(C90063do.f249475eI)) {
                                fwVar.mo99525a(C113371dl.m187573c(ezVar4.mo100204d()), size4);
                                C58976aa aaVar3 = C58975e.f156826a;
                            }
                        }
                    }
                }
            }
        }
    }
}

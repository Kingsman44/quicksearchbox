package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83687f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.common.base.C58833ax;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.l */
/* compiled from: PG */
public final /* synthetic */ class C107413l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107419r f298929a;

    /* renamed from: b */
    public final /* synthetic */ List f298930b;

    /* renamed from: c */
    public final /* synthetic */ Set f298931c;

    public /* synthetic */ C107413l(C107419r rVar, List list, Set set) {
        this.f298929a = rVar;
        this.f298930b = list;
        this.f298931c = set;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107419r rVar = this.f298929a;
        List list = this.f298930b;
        Set set = this.f298931c;
        ArrayList arrayList = new ArrayList();
        for (C83683b bVar : (List) obj) {
            C48851br brVar = bVar.f228110d;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            C63088z byteString = brVar.toByteString();
            if (C107431k.m178347e(C58833ax.m90834k(bVar))) {
                list.add(byteString);
            } else {
                int a = C83687f.m133251a(bVar.f228108b);
                if (a != 0 && a == 1) {
                    list.add(byteString);
                    C48851br brVar2 = bVar.f228110d;
                    if (brVar2 == null) {
                        brVar2 = C48851br.f126412f;
                    }
                    if (!set.contains(brVar2.toByteString())) {
                        C83682a aVar = (C83682a) bVar.toBuilder();
                        aVar.copyOnWrite();
                        C83683b bVar2 = (C83683b) aVar.instance;
                        bVar2.f228108b = 3;
                        bVar2.f228107a = 1 | bVar2.f228107a;
                        C83683b bVar3 = (C83683b) aVar.build();
                        C108013bm bmVar = rVar.f298946c;
                        C48851br brVar3 = bVar.f228110d;
                        if (brVar3 == null) {
                            brVar3 = C48851br.f126412f;
                        }
                        arrayList.add(bmVar.mo96356G(brVar3.toByteString(), bVar3, C107419r.f298944a));
                    }
                }
                if ((bVar.f228107a & 2) != 0) {
                    C48871n nVar = bVar.f228109c;
                    if (nVar == null) {
                        nVar = C48871n.f126470e;
                    }
                    rVar.mo96002g(nVar);
                }
                rVar.mo96003h(bVar);
            }
        }
        return rVar.f298947d.mo28210j(C118826c.m197212b(arrayList), "successfulDeletes", new C107414m(list));
    }
}

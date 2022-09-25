package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.k */
/* compiled from: PG */
public final /* synthetic */ class C107412k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107419r f298928a;

    public /* synthetic */ C107412k(C107419r rVar) {
        this.f298928a = rVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107419r rVar = this.f298928a;
        ArrayList arrayList = new ArrayList();
        for (C83683b bVar : (List) obj) {
            C83682a aVar = (C83682a) bVar.toBuilder();
            aVar.copyOnWrite();
            C83683b bVar2 = (C83683b) aVar.instance;
            bVar2.f228108b = 3;
            bVar2.f228107a |= 1;
            C83683b bVar3 = (C83683b) aVar.build();
            C108013bm bmVar = rVar.f298946c;
            C48851br brVar = bVar.f228110d;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            C60870cx G = bmVar.mo96356G(brVar.toByteString(), bVar3, C107419r.f298944a);
            if ((bVar.f228107a & 2) != 0) {
                C48871n nVar = bVar.f228109c;
                if (nVar == null) {
                    nVar = C48871n.f126470e;
                }
                rVar.mo96002g(nVar);
            }
            rVar.mo96003h(bVar);
            arrayList.add(G);
        }
        return C118826c.m197212b(arrayList);
    }
}

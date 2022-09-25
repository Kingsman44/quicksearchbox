package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42255ah;
import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.storage.C42674cu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import java.util.List;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;

/* renamed from: com.google.android.libraries.social.populous.d.a */
/* compiled from: PG */
public final /* synthetic */ class C42367a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42372f f111098a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfigInternal f111099b;

    /* renamed from: c */
    public final /* synthetic */ List f111100c;

    public /* synthetic */ C42367a(C42372f fVar, ClientConfigInternal clientConfigInternal, List list) {
        this.f111098a = fVar;
        this.f111099b = clientConfigInternal;
        this.f111100c = list;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C42372f fVar = this.f111098a;
        ClientConfigInternal clientConfigInternal = this.f111099b;
        List list = this.f111100c;
        long b = fVar.f111110a.mo26870b() - clientConfigInternal.f110728n;
        C42374h hVar = new C42374h();
        hVar.f111117c = 9;
        hVar.f111118d = 2;
        hVar.mo45361d(list);
        C58490gz gzVar = new C58490gz(4);
        for (List<C42674cu> it : (List) obj) {
            for (C42674cu cuVar : it) {
                C42255ah ahVar = new C42255ah();
                ahVar.mo45202c(C42320cs.m74536a(cuVar.f111874a));
                ahVar.f110840a = cuVar.f111875b;
                C42321ct a = ahVar.mo45200a();
                C63088z zVar = cuVar.f111877d;
                if (zVar == null) {
                    hVar.mo45359b(a);
                } else {
                    C42404aa aaVar = new C42404aa();
                    aaVar.mo45398e(zVar);
                    aaVar.f111220c.add(C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID);
                    C42405ab a2 = aaVar.mo45394a();
                    if (!C69280a.m100466c() || !fVar.f111114e.mo56113h() || !a2.mo45411m()) {
                        cxVar = C60856cj.m92900i(a2);
                    } else {
                        cxVar = ((C42146a) fVar.f111114e.mo56107c()).mo44845a();
                    }
                    gzVar.mo55429h(a, cxVar);
                }
                if (cuVar.f111876c <= b) {
                    hVar.f111116b.mo55373c(a);
                }
            }
        }
        C58495hd f = gzVar.mo55427f(true);
        return C60856cj.m92894c(f.values()).mo57334a(new C42369c(f, hVar), C60826bg.f164896a);
    }
}

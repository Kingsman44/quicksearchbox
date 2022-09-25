package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42221a;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42243k;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42244l;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42246n;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42227f;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42229h;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4181bi.C55798ah;
import com.google.p4181bi.C55799ai;
import com.google.p4181bi.C55800aj;
import com.google.p4181bi.C55801ak;
import com.google.p4181bi.C55802al;
import com.google.p4181bi.C55808ar;
import com.google.p4181bi.C55812av;
import com.google.p4181bi.C55813aw;
import com.google.p4181bi.C55848j;
import com.google.p4181bi.C55849k;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.social.populous.d.n */
/* compiled from: PG */
public final /* synthetic */ class C42380n implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42383q f111137a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfigInternal f111138b;

    /* renamed from: c */
    public final /* synthetic */ List f111139c;

    public /* synthetic */ C42380n(C42383q qVar, ClientConfigInternal clientConfigInternal, List list) {
        this.f111137a = qVar;
        this.f111138b = clientConfigInternal;
        this.f111139c = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C55800aj ajVar;
        C42383q qVar = this.f111137a;
        ClientConfigInternal clientConfigInternal = this.f111138b;
        List<C42321ct> list = this.f111139c;
        C42246n nVar = qVar.f111150f.f110536a;
        C55801ak akVar = (C55801ak) C55802al.f147247e.createBuilder();
        C57877c cVar = clientConfigInternal.f110722h;
        akVar.copyOnWrite();
        C55802al alVar = (C55802al) akVar.instance;
        alVar.f147250b = cVar.f154831dp;
        alVar.f147249a |= 1;
        C55848j jVar = (C55848j) C55849k.f147363c.createBuilder();
        jVar.copyOnWrite();
        C55849k kVar = (C55849k) jVar.instance;
        kVar.f147366b = 2;
        kVar.f147365a |= 1;
        akVar.copyOnWrite();
        C55802al alVar2 = (C55802al) akVar.instance;
        C55849k kVar2 = (C55849k) jVar.build();
        kVar2.getClass();
        alVar2.f147251c = kVar2;
        alVar2.f147249a |= 2;
        for (C42321ct ctVar : list) {
            C42320cs csVar = C42320cs.EMAIL;
            C55799ai aiVar = C55799ai.EMAIL;
            int ordinal = ctVar.mo45203a().ordinal();
            if (ordinal == 0) {
                C55798ah ahVar = (C55798ah) C55800aj.f147243c.createBuilder();
                String b = ctVar.mo45204b();
                ahVar.copyOnWrite();
                C55800aj ajVar2 = (C55800aj) ahVar.instance;
                b.getClass();
                ajVar2.f147245a = 1;
                ajVar2.f147246b = b;
                ajVar = (C55800aj) ahVar.build();
            } else if (ordinal == 1) {
                C55798ah ahVar2 = (C55798ah) C55800aj.f147243c.createBuilder();
                String b2 = ctVar.mo45204b();
                ahVar2.copyOnWrite();
                C55800aj ajVar3 = (C55800aj) ahVar2.instance;
                b2.getClass();
                ajVar3.f147245a = 2;
                ajVar3.f147246b = b2;
                ajVar = (C55800aj) ahVar2.build();
            } else if (ordinal != 2) {
                ajVar = C55800aj.f147243c;
            } else {
                C55798ah ahVar3 = (C55798ah) C55800aj.f147243c.createBuilder();
                String b3 = ctVar.mo45204b();
                ahVar3.copyOnWrite();
                C55800aj ajVar4 = (C55800aj) ahVar3.instance;
                b3.getClass();
                ajVar4.f147245a = 3;
                ajVar4.f147246b = b3;
                ajVar = (C55800aj) ahVar3.build();
            }
            akVar.copyOnWrite();
            C55802al alVar3 = (C55802al) akVar.instance;
            ajVar.getClass();
            C62971cq cqVar = alVar3.f147252d;
            if (!cqVar.mo58948c()) {
                alVar3.f147252d = C62942bv.mutableCopy(cqVar);
            }
            alVar3.f147252d.add(ajVar);
        }
        C55802al alVar4 = (C55802al) akVar.build();
        C42221a aVar = new C42221a();
        aVar.f110554c = qVar.f111150f.f110541f;
        aVar.mo44913b(qVar.f111146b);
        aVar.f110553b = clientConfigInternal;
        aVar.mo44914c(qVar.f111145a);
        C42243k a = aVar.mo44912a();
        C42244l lVar = new C42244l();
        C55812av avVar = (C55812av) ((C42229h) nVar).mo44917c(a).mo62577p(C42244l.f110592a, lVar);
        C70888j jVar2 = avVar.f189039a;
        C70338di diVar = C55813aw.f147274c;
        if (diVar == null) {
            synchronized (C55813aw.class) {
                diVar = C55813aw.f147274c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("peoplestack.PeopleStackAutocompleteService", "Lookup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C55802al.f147247e);
                    d.f187486b = C70850d.m103697c(C55808ar.f147261b);
                    diVar = d.mo62040a();
                    C55813aw.f147274c = diVar;
                }
            }
        }
        return C60922j.m93044g(C42229h.m74187b(C70876o.m103760a(jVar2.mo39510a(diVar, avVar.f189040b), alVar4)), new C42227f(lVar), C60826bg.f164896a);
    }
}

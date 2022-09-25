package com.google.android.libraries.social.populous.p3296e.p3300d;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42221a;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42244l;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42246n;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42229h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4181bi.C55812av;
import com.google.p4181bi.C55813aw;
import com.google.p4181bi.C55837bj;
import com.google.p4181bi.C55838bk;
import com.google.p4181bi.C55840bm;
import com.google.p4181bi.C55848j;
import com.google.p4181bi.C55849k;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.social.populous.e.d.c */
/* compiled from: PG */
public final /* synthetic */ class C42503c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42510j f111461a;

    public /* synthetic */ C42503c(C42510j jVar) {
        this.f111461a = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42510j jVar = this.f111461a;
        C42246n nVar = jVar.f111480g.f110536a;
        C55837bj bjVar = (C55837bj) C55838bk.f147339d.createBuilder();
        C57877c e = C42510j.m74940e(jVar.f111474a);
        bjVar.copyOnWrite();
        C55838bk bkVar = (C55838bk) bjVar.instance;
        bkVar.f147342b = e.f154831dp;
        bkVar.f147341a |= 1;
        C55848j jVar2 = (C55848j) C55849k.f147363c.createBuilder();
        jVar2.copyOnWrite();
        C55849k kVar = (C55849k) jVar2.instance;
        kVar.f147366b = 2;
        kVar.f147365a |= 1;
        C55849k kVar2 = (C55849k) jVar2.build();
        bjVar.copyOnWrite();
        C55838bk bkVar2 = (C55838bk) bjVar.instance;
        kVar2.getClass();
        bkVar2.f147343c = kVar2;
        bkVar2.f147341a |= 2;
        C55838bk bkVar3 = (C55838bk) bjVar.build();
        C42221a aVar = new C42221a();
        aVar.mo44913b(jVar.f111475b);
        aVar.f110554c = jVar.f111480g.f110541f;
        aVar.f110553b = jVar.f111474a;
        aVar.mo44914c(jVar.f111476c);
        C55812av avVar = (C55812av) ((C42229h) nVar).mo44917c(aVar.mo44912a()).mo62577p(C42244l.f110592a, new C42244l());
        C70888j jVar3 = avVar.f189039a;
        C70338di diVar = C55813aw.f147273b;
        if (diVar == null) {
            synchronized (C55813aw.class) {
                diVar = C55813aw.f147273b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("peoplestack.PeopleStackAutocompleteService", "Warmup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C55838bk.f147339d);
                    d.f187486b = C70850d.m103697c(C55840bm.f147344a);
                    diVar = d.mo62040a();
                    C55813aw.f147273b = diVar;
                }
            }
        }
        return C42229h.m74187b(C70876o.m103760a(jVar3.mo39510a(diVar, avVar.f189040b), bkVar3));
    }
}

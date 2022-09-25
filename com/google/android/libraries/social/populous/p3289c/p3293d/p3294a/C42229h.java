package com.google.android.libraries.social.populous.p3289c.p3293d.p3294a;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42243k;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42244l;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42246n;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61374ap;
import com.google.frameworks.client.data.android.C61512j;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4644k.C61525c;
import com.google.p4181bi.C55811au;
import com.google.p4181bi.C55812av;
import com.google.p4181bi.C55813aw;
import com.google.p4181bi.C55842d;
import com.google.p4181bi.C55844f;
import com.google.p4181bi.p4183b.C55827j;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69305m;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69317y;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.social.populous.c.d.a.h */
/* compiled from: PG */
public final class C42229h implements C42246n {

    /* renamed from: a */
    static final C70297cz f110565a = new C70290cs("X-Server-Token", C70334de.f187481c);

    /* renamed from: b */
    public static final /* synthetic */ int f110566b = 0;

    /* renamed from: c */
    private final C61512j f110567c;

    static {
        TimeUnit.MINUTES.toMillis(60);
        new C70290cs("Accept-Language", C70334de.f187481c);
    }

    public C42229h(C61512j jVar) {
        this.f110567c = jVar;
    }

    /* renamed from: b */
    public static C60870cx m74187b(C60870cx cxVar) {
        return C60846c.m92879h(cxVar, Throwable.class, C42226e.f110562a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo44916a(C55842d dVar, C42243k kVar) {
        C42244l lVar = new C42244l();
        C55812av avVar = (C55812av) mo44917c(kVar).mo62577p(C42244l.f110592a, lVar);
        C70888j jVar = avVar.f189039a;
        C70338di diVar = C55813aw.f147272a;
        if (diVar == null) {
            synchronized (C55813aw.class) {
                diVar = C55813aw.f147272a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("peoplestack.PeopleStackAutocompleteService", "Autocomplete");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C55842d.f147346e);
                    d.f187486b = C70850d.m103697c(C55844f.f147352c);
                    diVar = d.mo62040a();
                    C55813aw.f147272a = diVar;
                }
            }
        }
        return C60922j.m93044g(m74187b(C70876o.m103760a(jVar.mo39510a(diVar, avVar.f189040b), dVar)), new C42228g(lVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C55812av mo44917c(C42243k kVar) {
        C70866e eVar = (C55812av) ((C55812av) ((C55812av) C70864c.m103731e(new C55811au(), this.f110567c.mo58044a(C55827j.f147316k), C70851i.f189015a)).mo62575n(C69305m.f185448a.mo6453a().mo60985a(), TimeUnit.MILLISECONDS)).mo62577p(C61333a.f165865a, C61333a.m93820a(kVar.mo44919a().f111089a));
        if (!C69305m.m100572c().isEmpty()) {
            eVar = (C55812av) eVar.mo62577p(C61374ap.f165954a, C69305m.m100572c());
        }
        if (C69317y.f185472a.mo6453a().mo60936b() && !C58837ba.m90859h(C69317y.m100619c())) {
            C70334de deVar = new C70334de();
            deVar.mo62033h(f110565a, C69317y.m100619c());
            eVar = eVar.mo62576o(new C70879r(deVar));
        }
        C70866e eVar2 = (C55812av) eVar;
        if (C69305m.f185448a.mo6453a().mo60987c()) {
            eVar2 = eVar2.mo62576o(new C61525c());
        }
        return (C55812av) eVar2;
    }
}

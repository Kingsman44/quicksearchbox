package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52815ae;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import com.google.assistant.p3931f.p3940d.p3941a.C52864an;
import com.google.assistant.p3931f.p3940d.p3941a.C52872av;
import com.google.assistant.p3931f.p3940d.p3941a.C52873aw;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71629cb;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.k */
/* compiled from: PG */
public final class C32452k implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C32458q f86951a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f86952b;

    public C32452k(C32458q qVar, C71361ao aoVar) {
        this.f86951a = qVar;
        this.f86952b = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f86951a.f86986o.mo62909P(C32460s.SUCCESS);
        this.f86952b.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        this.f86951a.f86986o.mo62909P(C32460s.FAILED);
        C71423ax.m104198c(this.f86952b, C71629cb.m104602a("requestFulfillment stream ended by server", th));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C52849z zVar;
        C52864an anVar = (C52864an) obj;
        C69664n.m101061g(anVar, "value");
        String str = anVar.f138701d;
        C69664n.m101060f(str, "value.responseText");
        if (str.length() > 0) {
            this.f86951a.f86977f.mo62807f(anVar.f138701d);
        }
        C52813ac acVar = anVar.f138698a;
        if (acVar == null) {
            acVar = C52813ac.f138569c;
        }
        if (acVar.f138572b != null) {
            C71548cy cyVar = this.f86951a.f86976e;
            C52813ac acVar2 = anVar.f138698a;
            if (acVar2 == null) {
                acVar2 = C52813ac.f138569c;
            }
            C52849z zVar2 = acVar2.f138572b;
            if (zVar2 == null) {
                zVar2 = C52849z.f138656d;
            }
            cyVar.mo62807f(zVar2);
        }
        C52813ac acVar3 = anVar.f138698a;
        if ((acVar3 == null ? C52813ac.f138569c : acVar3).f138571a == 3) {
            AtomicReference atomicReference = this.f86951a.f86983l;
            if (acVar3 == null) {
                acVar3 = C52813ac.f138569c;
            }
            atomicReference.set(acVar3);
        }
        C52829f fVar = anVar.f138699b;
        if (fVar != null) {
            this.f86951a.f86978g.mo62807f(fVar);
        }
        C52815ae aeVar = anVar.f138703f;
        boolean z = false;
        if (aeVar != null) {
            C71548cy cyVar2 = this.f86951a.f86979h;
            C52813ac acVar4 = anVar.f138698a;
            if (acVar4 == null) {
                acVar4 = C52813ac.f138569c;
            }
            if (anVar.f138702e != null) {
                z = true;
            }
            cyVar2.mo62807f(new C32465x(acVar4, aeVar, z));
        } else {
            C52813ac acVar5 = anVar.f138698a;
            if (acVar5 != null) {
                C71548cy cyVar3 = this.f86951a.f86980i;
                if (anVar.f138702e != null) {
                    z = true;
                }
                cyVar3.mo62807f(new C32461t(acVar5, z));
            }
        }
        C52813ac acVar6 = anVar.f138698a;
        if (!((acVar6 == null ? C52813ac.f138569c : acVar6).f138572b == null && anVar.f138699b == null)) {
            C71548cy cyVar4 = this.f86951a.f86981j;
            C52829f fVar2 = null;
            if ((acVar6 == null ? C52813ac.f138569c : acVar6).f138572b != null) {
                if (acVar6 == null) {
                    acVar6 = C52813ac.f138569c;
                }
                zVar = acVar6.f138572b;
                if (zVar == null) {
                    zVar = C52849z.f138656d;
                }
            } else {
                zVar = null;
            }
            C52829f fVar3 = anVar.f138699b;
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
            cyVar4.mo62807f(new C32442ai(zVar, fVar2));
        }
        this.f86952b.mo62730w(new C32435ab(anVar));
        C52873aw awVar = anVar.f138702e;
        if (awVar != null) {
            int a = C52872av.m86722a(awVar.f138717a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 2;
            if (i == 1) {
                this.f86951a.f86986o.mo62909P(C32460s.SUCCESS);
            } else if (i == 2) {
                this.f86951a.f86986o.mo62909P(C32460s.CANCELED);
            } else if (i != 3) {
                this.f86951a.f86986o.mo62909P(C32460s.UNKNOWN);
            } else {
                this.f86951a.f86986o.mo62909P(C32460s.FAILED);
            }
        }
    }
}

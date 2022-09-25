package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.assistant.p3931f.p3939c.C52813ac;
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

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ag */
/* compiled from: PG */
public final class C120911ag implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C120917am f336159a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f336160b;

    public C120911ag(C120917am amVar, C71361ao aoVar) {
        this.f336159a = amVar;
        this.f336160b = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f336159a.f336196q.mo62909P(C120918an.SUCCESS);
        this.f336160b.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        this.f336159a.f336196q.mo62909P(C120918an.FAILED);
        C71423ax.m104198c(this.f336160b, C71629cb.m104602a("requestFulfillment stream ended by server", th));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C52849z zVar;
        C52864an anVar = (C52864an) obj;
        C69664n.m101061g(anVar, "value");
        String str = anVar.f138701d;
        C69664n.m101060f(str, "value.responseText");
        if (str.length() > 0) {
            this.f336159a.f336188i.mo62807f(anVar.f138701d);
        }
        C52813ac acVar = anVar.f138698a;
        if (acVar == null) {
            acVar = C52813ac.f138569c;
        }
        if (acVar.f138572b != null) {
            C71548cy cyVar = this.f336159a.f336187h;
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
            AtomicReference atomicReference = this.f336159a.f336190k;
            if (acVar3 == null) {
                acVar3 = C52813ac.f138569c;
            }
            atomicReference.set(acVar3);
        }
        C52829f fVar = anVar.f138699b;
        if (fVar != null) {
            this.f336159a.f336189j.mo62807f(fVar);
        }
        C52813ac acVar4 = anVar.f138698a;
        if (!((acVar4 == null ? C52813ac.f138569c : acVar4).f138572b == null && anVar.f138699b == null)) {
            C71548cy cyVar2 = this.f336159a.f336191l;
            C52829f fVar2 = null;
            if ((acVar4 == null ? C52813ac.f138569c : acVar4).f138572b != null) {
                if (acVar4 == null) {
                    acVar4 = C52813ac.f138569c;
                }
                zVar = acVar4.f138572b;
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
            cyVar2.mo62807f(new C120945bn(zVar, fVar2));
        }
        this.f336160b.mo62730w(new C120938bg(anVar));
        C52873aw awVar = anVar.f138702e;
        if (awVar != null) {
            int a = C52872av.m86722a(awVar.f138717a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 2;
            if (i == 1) {
                this.f336159a.f336196q.mo62909P(C120918an.SUCCESS);
            } else if (i == 2) {
                this.f336159a.f336196q.mo62909P(C120918an.CANCELED);
            } else if (i != 3) {
                this.f336159a.f336196q.mo62909P(C120918an.UNKNOWN);
            } else {
                this.f336159a.f336196q.mo62909P(C120918an.FAILED);
            }
        }
    }
}

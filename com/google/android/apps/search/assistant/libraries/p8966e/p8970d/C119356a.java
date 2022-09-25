package com.google.android.apps.search.assistant.libraries.p8966e.p8970d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119730d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C63088z;
import com.google.speech.p5224k.p5225a.C67186ad;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.d.a */
/* compiled from: PG */
public final class C119356a implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C71361ao f332778a;

    public C119356a(C71361ao aoVar) {
        this.f332778a = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59071e eVar = C119363f.f332795a;
        this.f332778a.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C119363f.f332795a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(34395));
        cVar.mo56386p("Closing Connection with Error");
        this.f332778a.mo62727D(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C119730d dVar = (C119730d) obj;
        C69664n.m101061g(dVar, "value");
        C67186ad adVar = dVar.f333557a;
        if (adVar == null) {
            adVar = C67186ad.f182610e;
        }
        if (!adVar.f182615c) {
            C67186ad adVar2 = dVar.f333557a;
            if (adVar2 == null) {
                adVar2 = C67186ad.f182610e;
            }
            if ((adVar2.f182613a & 1) != 0) {
                C59071e eVar = C119363f.f332795a;
                C67186ad adVar3 = dVar.f333557a;
                if (adVar3 == null) {
                    adVar3 = C67186ad.f182610e;
                }
                adVar3.f182614b.mo59031d();
                C71361ao aoVar = this.f332778a;
                C67186ad adVar4 = dVar.f333557a;
                if (adVar4 == null) {
                    adVar4 = C67186ad.f182610e;
                }
                C63088z zVar = adVar4.f182614b;
                C69664n.m101060f(zVar, "value.ttsServiceEvent.audio");
                C71348ab.m103986d(aoVar.mo62730w(zVar));
                return;
            }
            return;
        }
        C59071e eVar2 = C119363f.f332795a;
    }
}

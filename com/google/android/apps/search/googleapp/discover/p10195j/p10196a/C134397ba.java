package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133934a;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57084az;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57237as;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57239au;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57240av;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57243ay;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57244az;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import com.google.p4648g.p4650b.C61641d;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64207bb;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C134397ba implements C61641d {

    /* renamed from: a */
    public final /* synthetic */ C134398bb f366105a;

    /* renamed from: b */
    public final /* synthetic */ C64207bb f366106b;

    public /* synthetic */ C134397ba(C134398bb bbVar, C64207bb bbVar2) {
        this.f366105a = bbVar;
        this.f366106b = bbVar2;
    }

    public final Object get() {
        C134398bb bbVar = this.f366105a;
        C64207bb bbVar2 = this.f366106b;
        C133939b bVar = bbVar.f366107a;
        C57084az azVar = bbVar2.f173610a;
        if (azVar == null) {
            azVar = C57084az.f152390b;
        }
        C69664n.m101061g(azVar, "thereAndBackAgainData");
        C57240av avVar = (C57240av) C57246ba.f152819d.createBuilder();
        C69664n.m101060f(avVar, "newBuilder()");
        C57239au a = C69664n.m101061g(avVar, "builder");
        C57299d dVar = azVar.f152392a;
        if (dVar == null) {
            dVar = C57299d.f152949a;
        }
        C69664n.m101060f(dVar, "thereAndBackAgainData.actionPayload");
        a.mo54452c(dVar);
        C57243ay ayVar = (C57243ay) C57244az.f152807g.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C57237as a2 = C69664n.m101061g(ayVar, "builder");
        long epochSecond = bVar.f364802k.mo57444a().getEpochSecond();
        C57243ay ayVar2 = a2.f152799a;
        ayVar2.copyOnWrite();
        C57244az azVar2 = (C57244az) ayVar2.instance;
        azVar2.f152809a |= 1;
        azVar2.f152810b = epochSecond;
        a2.mo54449b(bVar.f364809r.f366955d);
        a.mo54453d(a2.mo54448a());
        return C135209c.m219302a(C71663i.m104692e(bVar.f364812u, (C71424ay) null, new C133934a(bVar, a.mo54451b(), (C69577g) null), 3));
    }
}

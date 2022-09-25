package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66442v;
import com.google.speech.p5195a.p5196a.C66443w;
import com.google.speech.p5195a.p5196a.C66444x;
import com.google.speech.p5195a.p5196a.C66445y;
import com.google.speech.p5195a.p5196a.C66446z;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.c */
/* compiled from: PG */
public final class C94045c implements C94055m {

    /* renamed from: a */
    private final C94051i f262696a;

    public C94045c(C94051i iVar) {
        this.f262696a = iVar;
    }

    /* renamed from: a */
    public final C66422b mo88310a(String str) {
        List<C94049g> a = this.f262696a.mo88316a();
        C58976aa aaVar = C58975e.f156826a;
        a.size();
        C94047e eVar = new C94047e();
        for (C94049g add : a) {
            eVar.f262697a.add(add);
        }
        Collection<C94052j> a2 = eVar.mo88313a();
        C66444x xVar = (C66444x) C66445y.f180660b.createBuilder();
        for (C94052j jVar : a2) {
            C66442v vVar = (C66442v) C66443w.f180655d.createBuilder();
            String str2 = jVar.f262714c;
            vVar.copyOnWrite();
            C66443w wVar = (C66443w) vVar.instance;
            str2.getClass();
            wVar.f180657a |= 1;
            wVar.f180658b = str2;
            double d = jVar.f262715d;
            vVar.copyOnWrite();
            C66443w wVar2 = (C66443w) vVar.instance;
            wVar2.f180657a = 2 | wVar2.f180657a;
            wVar2.f180659c = (float) d;
            C66443w wVar3 = (C66443w) vVar.build();
            xVar.copyOnWrite();
            C66445y yVar = (C66445y) xVar.instance;
            wVar3.getClass();
            yVar.mo59631a();
            yVar.f180662a.add(wVar3);
            String str3 = jVar.f262714c;
            double d2 = jVar.f262715d;
        }
        C66421a aVar = (C66421a) C66422b.f180605k.createBuilder();
        C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
        cVar.copyOnWrite();
        C66446z zVar = (C66446z) cVar.instance;
        zVar.f180666b = 2;
        zVar.f180665a |= 1;
        cVar.copyOnWrite();
        C66446z zVar2 = (C66446z) cVar.instance;
        C66445y yVar2 = (C66445y) xVar.build();
        yVar2.getClass();
        zVar2.f180670f = yVar2;
        zVar2.f180665a |= 64;
        aVar.mo59623b(cVar);
        return (C66422b) aVar.build();
    }
}

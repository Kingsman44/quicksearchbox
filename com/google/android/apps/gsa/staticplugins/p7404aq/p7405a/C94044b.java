package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.google.android.apps.gsa.search.core.google.C85852aj;
import com.google.android.apps.gsa.search.core.google.C86066h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66425e;
import com.google.speech.p5195a.p5196a.C66427g;
import com.google.speech.p5195a.p5196a.C66428h;
import com.google.speech.p5195a.p5196a.C66429i;
import com.google.speech.p5195a.p5196a.C66446z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.b */
/* compiled from: PG */
public final class C94044b implements C94055m {

    /* renamed from: a */
    private final C85852aj f262695a;

    public C94044b(C85852aj ajVar) {
        this.f262695a = ajVar;
    }

    /* renamed from: a */
    public final C66422b mo88310a(String str) {
        List<C86066h> a = this.f262695a.mo79487a();
        C58976aa aaVar = C58975e.f156826a;
        a.size();
        ArrayList arrayList = new ArrayList(a.size() + 1);
        C66428h hVar = (C66428h) C66429i.f180626d.createBuilder();
        hVar.copyOnWrite();
        C66429i iVar = (C66429i) hVar.instance;
        iVar.f180628a |= 1;
        iVar.f180629b = "Google";
        arrayList.add((C66429i) hVar.build());
        int i = 1;
        for (C86066h hVar2 : a) {
            if (hVar2.f232649a != null) {
                C66428h hVar3 = (C66428h) C66429i.f180626d.createBuilder();
                String str2 = hVar2.f232649a;
                hVar3.copyOnWrite();
                C66429i iVar2 = (C66429i) hVar3.instance;
                str2.getClass();
                iVar2.f180628a |= 1;
                iVar2.f180629b = str2;
                arrayList.add((C66429i) hVar3.build());
                i++;
                if (i >= 200) {
                    break;
                }
            }
        }
        C66425e eVar = (C66425e) C66427g.f180621d.createBuilder();
        eVar.copyOnWrite();
        C66427g gVar = (C66427g) eVar.instance;
        gVar.f180624b = 2;
        gVar.f180623a |= 1;
        eVar.mo59626a(arrayList);
        C66427g gVar2 = (C66427g) eVar.build();
        C66421a aVar = (C66421a) C66422b.f180605k.createBuilder();
        C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
        cVar.copyOnWrite();
        C66446z zVar = (C66446z) cVar.instance;
        zVar.f180666b = 7;
        zVar.f180665a = 1 | zVar.f180665a;
        cVar.copyOnWrite();
        C66446z zVar2 = (C66446z) cVar.instance;
        gVar2.getClass();
        zVar2.f180673i = gVar2;
        zVar2.f180665a |= 1024;
        aVar.mo59623b(cVar);
        return (C66422b) aVar.build();
    }
}

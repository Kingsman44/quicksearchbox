package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64630a;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65925c;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5149b.p5157c.C65952b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.m */
/* compiled from: PG */
final class C102274m implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C102276o f285384a;

    public C102274m(C102276o oVar) {
        this.f285384a = oVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f285384a.f285387c = false;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C65952b bVar = (C65952b) obj;
        this.f285384a.f285387c = false;
        if (bVar.f179383a.size() > 0) {
            C102276o oVar = this.f285384a;
            C65926d dVar = oVar.mo93053e().f175200b;
            if (dVar == null) {
                dVar = C65926d.f179289b;
            }
            C65925c cVar = (C65925c) dVar.toBuilder();
            cVar.mo59439a(bVar.f179383a);
            C65926d dVar2 = (C65926d) cVar.build();
            C65926d dVar3 = oVar.mo93053e().f175200b;
            if (dVar3 == null) {
                dVar3 = C65926d.f179289b;
            }
            int size = dVar3.f179291a.size();
            if (dVar2.f179291a.size() > size && dVar2.f179291a.subList(0, size).equals(dVar3.f179291a)) {
                C64630a aVar = (C64630a) oVar.mo93053e().toBuilder();
                aVar.copyOnWrite();
                C64631b bVar2 = (C64631b) aVar.instance;
                dVar2.getClass();
                bVar2.f175200b = dVar2;
                bVar2.f175199a |= 1;
                ((C102263b) oVar.f285385a).f285334a.mo28730f((C64631b) aVar.build(), false);
                int intValue = ((Integer) ((C102263b) oVar.f285385a).f285336c.f63720e).intValue();
                for (int i = intValue + 1; i <= intValue + 2; i++) {
                    oVar.mo93054f(i);
                }
            }
        }
    }
}

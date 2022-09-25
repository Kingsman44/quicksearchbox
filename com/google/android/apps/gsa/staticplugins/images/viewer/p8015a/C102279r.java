package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.libraries.gsa.p1880l.C22873a;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.r */
/* compiled from: PG */
public final /* synthetic */ class C102279r implements C102283v {

    /* renamed from: a */
    public final /* synthetic */ C102286y f285393a;

    public /* synthetic */ C102279r(C102286y yVar) {
        this.f285393a = yVar;
    }

    /* renamed from: a */
    public final void mo93056a(C65930h hVar, boolean z) {
        C102286y yVar = this.f285393a;
        yVar.mo93061i();
        C22873a aVar = (C22873a) C22876d.f62944x.createBuilder();
        aVar.copyOnWrite();
        C22876d dVar = (C22876d) aVar.instance;
        dVar.f62946a |= 1;
        dVar.f62947b = z;
        aVar.copyOnWrite();
        C22876d dVar2 = (C22876d) aVar.instance;
        dVar2.f62950e = hVar;
        dVar2.f62946a |= 8;
        C22875c cVar = C22875c.IMAGE;
        aVar.copyOnWrite();
        C22876d dVar3 = (C22876d) aVar.instance;
        dVar3.f62951f = cVar.f62943e;
        dVar3.f62946a |= 16;
        aVar.copyOnWrite();
        C22876d dVar4 = (C22876d) aVar.instance;
        dVar4.f62946a |= 1024;
        dVar4.f62955j = false;
        yVar.f285398b.mo28211k(yVar.f285399c.mo78733b((C22876d) aVar.build()), "Save response callback", new C102282u(yVar));
    }
}

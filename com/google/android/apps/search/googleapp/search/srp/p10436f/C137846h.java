package com.google.android.apps.search.googleapp.search.srp.p10436f;

import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.silk.p3205a.p3233v.C41736a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4318w.C56831b;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.h */
/* compiled from: PG */
final class C137846h implements C41736a {

    /* renamed from: a */
    final /* synthetic */ C137843g f375054a;

    public C137846h(C137843g gVar) {
        this.f375054a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo44330a(C56831b bVar) {
        String str = bVar.f151634a;
        C137541c cVar = (C137541c) this.f375054a.mo113999c().toBuilder();
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        cVar.copyOnWrite();
        C137542d dVar = (C137542d) cVar.instance;
        C137418g gVar2 = (C137418g) eVar.build();
        gVar2.getClass();
        dVar.f374092f = gVar2;
        dVar.f374087a |= 16;
        C137542d dVar2 = (C137542d) cVar.build();
        C137843g gVar3 = this.f375054a;
        if (gVar3.f375047v) {
            ((C137543b) gVar3.f375048w.mo5768a()).mo113805b(dVar2);
        } else {
            gVar3.f375038m.mo50381d(C62912at.f169862a, dVar2);
        }
        this.f375054a.mo114001f(str);
        return C60866ct.f164955a;
    }
}

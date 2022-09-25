package com.google.android.apps.search.googleapp.search.srp;

import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.C137546e;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.error.C137822u;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58851bo;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ar */
/* compiled from: PG */
final class C137719ar implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137711an f374616a;

    public C137719ar(C137711an anVar) {
        this.f374616a = anVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137822u uVar = (C137822u) bVar;
        C137711an anVar = this.f374616a;
        C137542d a = anVar.mo113913a();
        C137418g gVar = a.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String str = gVar.f373770b;
        if (anVar.mo113922l()) {
            return C47392e.f123116b;
        }
        C137546e eVar = anVar.f374600s;
        C137541c cVar = (C137541c) a.toBuilder();
        C137418g gVar2 = a.f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        C137416e eVar2 = (C137416e) gVar2.toBuilder();
        eVar2.copyOnWrite();
        ((C137418g) eVar2.instance).mo113715a().clear();
        String b = C39191a.m68623b(C58851bo.f156649a.nextLong());
        eVar2.copyOnWrite();
        C137418g gVar3 = (C137418g) eVar2.instance;
        b.getClass();
        gVar3.f373769a |= 8192;
        gVar3.f373783o = b;
        cVar.copyOnWrite();
        C137542d dVar = (C137542d) cVar.instance;
        C137418g gVar4 = (C137418g) eVar2.build();
        gVar4.getClass();
        dVar.f374092f = gVar4;
        dVar.f374087a |= 16;
        long b2 = eVar.f374099a.mo26870b();
        cVar.copyOnWrite();
        C137542d dVar2 = (C137542d) cVar.instance;
        dVar2.f374087a |= 2;
        dVar2.f374089c = b2;
        cVar.copyOnWrite();
        C137542d dVar3 = (C137542d) cVar.instance;
        dVar3.f374088b = 5;
        dVar3.f374087a |= 1;
        anVar.mo113921k((C137542d) cVar.build());
        return C47392e.f123115a;
    }
}

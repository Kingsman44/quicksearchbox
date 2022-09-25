package com.google.assistant.p3957l.p3964c.p3965a.p3966a;

import com.google.assistant.p3821al.p3822a.C49220c;
import com.google.assistant.p3821al.p3822a.C49221d;
import com.google.assistant.p3821al.p3822a.C49222e;
import com.google.assistant.p3821al.p3822a.C49223f;
import com.google.assistant.p3821al.p3822a.C49228k;
import com.google.assistant.p3821al.p3822a.C49229l;
import com.google.assistant.p3821al.p3822a.C49230m;
import com.google.assistant.p3821al.p3822a.C49233p;
import com.google.common.p4541l.C59326i;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.l.c.a.a.b */
/* compiled from: PG */
public final class C52974b {
    /* renamed from: a */
    public static final String m86764a(String str, Optional optional) {
        C49221d dVar = (C49221d) C49230m.f127277e.createBuilder();
        C49222e eVar = (C49222e) C49223f.f127265c.createBuilder();
        C49228k kVar = (C49228k) C49229l.f127273c.createBuilder();
        kVar.copyOnWrite();
        C49229l lVar = (C49229l) kVar.instance;
        str.getClass();
        lVar.f127275a = 1;
        lVar.f127276b = str;
        eVar.copyOnWrite();
        C49223f fVar = (C49223f) eVar.instance;
        C49229l lVar2 = (C49229l) kVar.build();
        lVar2.getClass();
        fVar.f127268b = lVar2;
        fVar.f127267a |= 1;
        dVar.copyOnWrite();
        C49230m mVar = (C49230m) dVar.instance;
        C49223f fVar2 = (C49223f) eVar.build();
        fVar2.getClass();
        mVar.f127281c = fVar2;
        mVar.f127280b = 1;
        Objects.requireNonNull(dVar);
        optional.ifPresent(new C52973a(dVar));
        C49220c cVar = (C49220c) C49233p.f127285c.createBuilder();
        cVar.copyOnWrite();
        C49233p pVar = (C49233p) cVar.instance;
        C49230m mVar2 = (C49230m) dVar.build();
        mVar2.getClass();
        pVar.f127288b = mVar2;
        pVar.f127287a = 1;
        C59326i f = C59326i.f157517e.mo56826f();
        byte[] byteArray = ((C49233p) cVar.build()).toByteArray();
        return f.mo56837l(byteArray, byteArray.length);
    }
}

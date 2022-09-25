package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.ab.aw */
/* compiled from: PG */
public final /* synthetic */ class C32381aw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f86804a;

    public /* synthetic */ C32381aw(Instant instant) {
        this.f86804a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f86804a;
        C59071e eVar = C32389bd.f86813a;
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long a = C60945d.m93096a(instant);
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = a;
        C65139d dVar2 = (C65139d) cVar.build();
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        dVar2.getClass();
        azVar.f178796b = dVar2;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/com.google.android.libraries.search.assistant.topcontacts.TopContactResponse";
        C63088z byteString = ((C32376ar) obj).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        return (C65768az) ayVar.build();
    }
}

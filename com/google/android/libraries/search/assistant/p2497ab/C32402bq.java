package com.google.android.libraries.search.assistant.p2497ab;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64692bs;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.ab.bq */
/* compiled from: PG */
public final /* synthetic */ class C32402bq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32407bv f86852a;

    /* renamed from: b */
    public final /* synthetic */ Instant f86853b;

    public /* synthetic */ C32402bq(C32407bv bvVar, Instant instant) {
        this.f86852a = bvVar;
        this.f86853b = instant;
    }

    public final C60870cx apply(Object obj) {
        C32407bv bvVar = this.f86852a;
        Instant instant = this.f86853b;
        C64692bs bsVar = (C64692bs) obj;
        if (bsVar.equals(C64692bs.f175353d)) {
            return C60866ct.f164955a;
        }
        C38469m mVar = bvVar.f86858b;
        C65753ak akVar = C65753ak.ASSISTANT_CONTACT_AFFINITY;
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
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.action_user_model.TopContacts";
        C63088z byteString = bsVar.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        return mVar.mo41434e(akVar, (C65768az) ayVar.build());
    }
}

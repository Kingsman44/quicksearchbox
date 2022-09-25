package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65848q;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.a */
/* compiled from: PG */
public final /* synthetic */ class C12806a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12814h f40000a;

    /* renamed from: b */
    public final /* synthetic */ boolean f40001b;

    public /* synthetic */ C12806a(C12814h hVar, boolean z) {
        this.f40000a = hVar;
        this.f40001b = z;
    }

    public final Object apply(Object obj) {
        C12814h hVar = this.f40000a;
        boolean z = this.f40001b;
        C52685ar arVar = (C52685ar) obj;
        if (z && !((C52686as) arVar.instance).f138300h) {
            arVar.copyOnWrite();
            C52686as asVar = (C52686as) arVar.instance;
            asVar.f138293a |= 2048;
            asVar.f138300h = true;
        }
        ((Optional) hVar.f40015c.mo17428b()).ifPresent(new C12813g(arVar, z));
        arVar.copyOnWrite();
        C52686as asVar2 = (C52686as) arVar.instance;
        C52686as asVar3 = C52686as.f138291q;
        asVar2.f138293a |= 4096;
        asVar2.f138301i = z;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        azVar.f178795a |= 4;
        azVar.f178798d = "driving_settings";
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(hVar.f40014b.mo26870b());
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar2 = (C65139d) cVar.build();
        dVar2.getClass();
        azVar2.f178796b = dVar2;
        azVar2.f178795a = 1 | azVar2.f178795a;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantSettingsElement";
        C65848q qVar = (C65848q) C65849r.f179002c.createBuilder();
        qVar.copyOnWrite();
        C65849r rVar = (C65849r) qVar.instance;
        C52686as asVar4 = (C52686as) arVar.build();
        asVar4.getClass();
        rVar.f179005b = asVar4;
        rVar.f179004a = 10;
        C63088z byteString = ((C65849r) qVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar2 = (C63070h) gVar.build();
        hVar2.getClass();
        azVar3.f178799e = hVar2;
        azVar3.f178795a |= 8;
        return (C65768az) ayVar.build();
    }
}

package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65848q;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.a */
/* compiled from: PG */
public final /* synthetic */ class C93121a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93164c f259753a;

    /* renamed from: b */
    public final /* synthetic */ boolean f259754b;

    /* renamed from: c */
    public final /* synthetic */ String f259755c;

    public /* synthetic */ C93121a(C93164c cVar, boolean z, String str) {
        this.f259753a = cVar;
        this.f259754b = z;
        this.f259755c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C52685ar arVar;
        C52686as asVar;
        C93164c cVar = this.f259753a;
        boolean z = this.f259754b;
        String str = this.f259755c;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).findFirst();
        if (!findFirst.isPresent() || ((C65849r) findFirst.get()).f179004a != 10) {
            arVar = (C52685ar) C52686as.f138291q.createBuilder();
        } else {
            C65849r rVar = (C65849r) findFirst.get();
            if (rVar.f179004a == 10) {
                asVar = (C52686as) rVar.f179005b;
            } else {
                asVar = C52686as.f138291q;
            }
            arVar = (C52685ar) asVar.toBuilder();
        }
        if (z && !((C52686as) arVar.instance).f138300h) {
            arVar.copyOnWrite();
            C52686as asVar2 = (C52686as) arVar.instance;
            asVar2.f138293a |= 2048;
            asVar2.f138300h = true;
        }
        if (cVar.f259846c.mo79746e(C90051dc.f248827ai)) {
            int i = true != z ? 5 : 6;
            arVar.copyOnWrite();
            C52686as asVar3 = (C52686as) arVar.instance;
            asVar3.f138302j = i - 1;
            asVar3.f138293a |= 8192;
        }
        arVar.copyOnWrite();
        C52686as asVar4 = (C52686as) arVar.instance;
        asVar4.f138293a |= 4096;
        asVar4.f138301i = z;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        azVar.f178795a |= 4;
        azVar.f178798d = "driving_settings";
        C65138c cVar2 = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(cVar.f259845b.mo26870b());
        cVar2.copyOnWrite();
        C65139d dVar = (C65139d) cVar2.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar2 = (C65139d) cVar2.build();
        dVar2.getClass();
        azVar2.f178796b = dVar2;
        azVar2.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantSettingsElement";
        C65848q qVar = (C65848q) C65849r.f179002c.createBuilder();
        qVar.copyOnWrite();
        C65849r rVar2 = (C65849r) qVar.instance;
        C52686as asVar5 = (C52686as) arVar.build();
        asVar5.getClass();
        rVar2.f179005b = asVar5;
        rVar2.f179004a = 10;
        C63088z byteString = ((C65849r) qVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        return cVar.f259844a.d(str, C65753ak.ASSISTANT_SETTINGS, (C65768az) ayVar.build(), true);
    }
}

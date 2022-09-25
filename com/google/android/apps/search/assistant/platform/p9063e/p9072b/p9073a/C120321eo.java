package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66629d;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.eo */
/* compiled from: PG */
public final /* synthetic */ class C120321eo implements C17235c {

    /* renamed from: a */
    public final /* synthetic */ C120322ep f334753a;

    /* renamed from: b */
    public final /* synthetic */ C51189d f334754b;

    public /* synthetic */ C120321eo(C120322ep epVar, C51189d dVar) {
        this.f334753a = epVar;
        this.f334754b = dVar;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        C52081en enVar;
        C120322ep epVar = this.f334753a;
        C51189d dVar = this.f334754b;
        cdVar.copyOnWrite();
        C66607ce ceVar = (C66607ce) cdVar.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        ceVar.f181193a |= 1;
        ceVar.f181194b = "assistant-voiceless";
        C62940bt btVar = C66629d.f181274a;
        C51188c cVar = (C51188c) dVar.toBuilder();
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        elVar.mo53784a(epVar.f334755a.f335971a);
        C52081en enVar2 = (C52081en) elVar.build();
        cVar.copyOnWrite();
        C51189d dVar2 = (C51189d) cVar.instance;
        enVar2.getClass();
        C52081en enVar3 = dVar2.f133255g;
        if (enVar3 == null || enVar3 == (enVar = C52081en.f136679i)) {
            dVar2.f133255g = enVar2;
        } else {
            C52079el elVar2 = (C52079el) enVar.createBuilder(enVar3);
            elVar2.mergeFrom(enVar2);
            dVar2.f133255g = (C52081en) elVar2.buildPartial();
        }
        dVar2.f133249a |= 64;
        cdVar.mo58885m(btVar, (C51189d) cVar.build());
    }
}

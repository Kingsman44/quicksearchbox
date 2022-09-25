package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66587bm;
import com.google.speech.p5208h.C66588bn;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66629d;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C120211ba implements C17235c {

    /* renamed from: a */
    public final /* synthetic */ C120212bb f334530a;

    /* renamed from: b */
    public final /* synthetic */ C51189d f334531b;

    /* renamed from: c */
    public final /* synthetic */ int f334532c;

    public /* synthetic */ C120211ba(C120212bb bbVar, C51189d dVar, int i) {
        this.f334530a = bbVar;
        this.f334531b = dVar;
        this.f334532c = i;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        C120212bb bbVar = this.f334530a;
        C51189d dVar = this.f334531b;
        int i = this.f334532c;
        cdVar.copyOnWrite();
        C66607ce ceVar = (C66607ce) cdVar.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        ceVar.f181193a |= 1;
        ceVar.f181194b = "assistant-legacy-nexus";
        cdVar.mo58885m(C66629d.f181274a, dVar);
        C62940bt btVar = C67227e.f182707d;
        C67226d dVar2 = (C67226d) C67227e.f182706c.createBuilder();
        dVar2.copyOnWrite();
        C67227e eVar = (C67227e) dVar2.instance;
        eVar.f182710b = i - 1;
        eVar.f182709a |= 1;
        cdVar.mo58885m(btVar, (C67227e) dVar2.build());
        C62940bt btVar2 = C66588bn.f181128e;
        C66587bm bmVar = (C66587bm) C66588bn.f181127d.createBuilder();
        boolean z = bbVar.f334533a;
        bmVar.copyOnWrite();
        C66588bn bnVar = (C66588bn) bmVar.instance;
        bnVar.f181130a |= 1;
        bnVar.f181131b = z;
        cdVar.mo58885m(btVar2, (C66588bn) bmVar.build());
    }
}

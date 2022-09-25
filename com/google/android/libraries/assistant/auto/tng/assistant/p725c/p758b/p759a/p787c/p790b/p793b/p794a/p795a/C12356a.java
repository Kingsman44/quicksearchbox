package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.p4449cd.p4456g.C57974a;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66629d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.a */
/* compiled from: PG */
final class C12356a implements C60845bz {

    /* renamed from: a */
    private final C57974a f39177a;

    public C12356a(C57974a aVar) {
        this.f39177a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12380f.f39216a.mo56226d()).mo56382g(th)).mo56372aa(44212)).mo56386p("CdcUpdateHandler failed to populate data");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C61818k kVar = (C61818k) obj;
        ((C59052c) ((C59052c) C12380f.f39216a.mo56224b()).mo56372aa(44213)).mo56386p("Sending CDC update to sink");
        C57974a aVar = this.f39177a;
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.copyOnWrite();
        C54188e eVar = (C54188e) bVar.instance;
        kVar.getClass();
        eVar.f142207c = kVar;
        eVar.f142205a |= 2;
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        C54188e eVar2 = (C54188e) bVar.build();
        eVar2.getClass();
        dVar.f133251c = eVar2;
        dVar.f133249a |= 2;
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar.mo58885m(C66629d.f181274a, (C51189d) cVar.build());
        aVar.mo20337c((C66607ce) cdVar.build());
    }
}

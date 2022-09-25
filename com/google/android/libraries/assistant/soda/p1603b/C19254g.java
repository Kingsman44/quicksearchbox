package com.google.android.libraries.assistant.soda.p1603b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.context.p5201a.C66480c;
import com.google.speech.context.p5201a.C66481d;
import com.google.speech.context.p5201a.C66485h;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66703ag;
import com.google.speech.p5218j.p5219a.C66704ah;
import com.google.speech.p5218j.p5219a.C66705ai;
import com.google.speech.p5218j.p5219a.C66706aj;
import com.google.speech.p5218j.p5219a.C66707ak;

/* renamed from: com.google.android.libraries.assistant.soda.b.g */
/* compiled from: PG */
public final class C19254g implements C19249b {

    /* renamed from: a */
    private static final C58974d f53961a = C58974d.m91136j();

    /* renamed from: b */
    private final C86124t f53962b;

    public C19254g(C86124t tVar) {
        this.f53962b = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58495hd mo24426a() {
        return C58729pv.f156485a;
    }

    /* renamed from: b */
    public final C66707ak mo24427b() {
        C66485h hVar = (C66485h) this.f53962b.mo79754t(C90082eg.f250034cr, C66485h.f180782d.getParserForType());
        if (hVar == null) {
            ((C58970a) ((C58970a) f53961a.mo56226d()).mo56372aa(47679)).mo56386p("Biasing params bytes is null, returned default ContextInput");
            C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
            abVar.copyOnWrite();
            C66707ak akVar = (C66707ak) abVar.instance;
            akVar.f181460a |= 1;
            akVar.f181463d = "emergency-fix";
            return (C66707ak) abVar.build();
        }
        C66705ai aiVar = (C66705ai) C66706aj.f181455b.createBuilder();
        C66481d dVar = hVar.f180785b;
        if (dVar == null) {
            dVar = C66481d.f180773b;
        }
        for (C66480c cVar : dVar.f180775a) {
            C66703ag agVar = (C66703ag) C66704ah.f181450d.createBuilder();
            String str = cVar.f180770a;
            agVar.copyOnWrite();
            C66704ah ahVar = (C66704ah) agVar.instance;
            str.getClass();
            ahVar.f181452a |= 1;
            ahVar.f181453b = str;
            float f = cVar.f180771b;
            agVar.copyOnWrite();
            C66704ah ahVar2 = (C66704ah) agVar.instance;
            ahVar2.f181452a = 2 | ahVar2.f181452a;
            ahVar2.f181454c = f;
            aiVar.mo59710a((C66704ah) agVar.build());
        }
        C66698ab abVar2 = (C66698ab) C66707ak.f181458e.createBuilder();
        abVar2.copyOnWrite();
        C66707ak akVar2 = (C66707ak) abVar2.instance;
        akVar2.f181460a |= 1;
        akVar2.f181463d = "emergency-fix";
        abVar2.copyOnWrite();
        C66707ak akVar3 = (C66707ak) abVar2.instance;
        C66706aj ajVar = (C66706aj) aiVar.build();
        ajVar.getClass();
        akVar3.f181462c = ajVar;
        akVar3.f181461b = 2;
        return (C66707ak) abVar2.build();
    }
}

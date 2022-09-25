package com.google.android.libraries.assistant.soda.p1603b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.p7404aq.p7405a.C94049g;
import com.google.android.apps.gsa.staticplugins.p7404aq.p7405a.C94051i;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66701ae;
import com.google.speech.p5218j.p5219a.C66702af;
import com.google.speech.p5218j.p5219a.C66707ak;

/* renamed from: com.google.android.libraries.assistant.soda.b.f */
/* compiled from: PG */
public final class C19253f implements C19249b {

    /* renamed from: a */
    private final C94051i f53959a;

    /* renamed from: b */
    private final C19252e f53960b;

    public C19253f(C94051i iVar, C19252e eVar) {
        this.f53959a = iVar;
        this.f53960b = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58495hd mo24426a() {
        return C58729pv.f156485a;
    }

    /* renamed from: b */
    public final C66707ak mo24427b() {
        C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
        acVar.copyOnWrite();
        C66700ad adVar = (C66700ad) acVar.instance;
        adVar.f181441a |= 1;
        adVar.f181442b = "$CONTACTS";
        C19252e eVar = this.f53960b;
        if (!eVar.mo24428a() || !((C86124t) eVar.f53955a.mo27525b()).mo79746e(C90082eg.f249927aq)) {
            C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
            abVar.copyOnWrite();
            C66707ak akVar = (C66707ak) abVar.instance;
            akVar.f181460a |= 1;
            akVar.f181463d = "device-contacts";
            abVar.copyOnWrite();
            C66707ak akVar2 = (C66707ak) abVar.instance;
            C66700ad adVar2 = (C66700ad) acVar.build();
            adVar2.getClass();
            akVar2.f181462c = adVar2;
            akVar2.f181461b = 3;
            return (C66707ak) abVar.build();
        }
        for (C94049g gVar : this.f53959a.mo88316a()) {
            if (gVar != null && !C58837ba.m90859h(gVar.f262700b)) {
                String str = gVar.f262700b;
                C66701ae aeVar = (C66701ae) C66702af.f181445c.createBuilder();
                aeVar.copyOnWrite();
                C66702af afVar = (C66702af) aeVar.instance;
                afVar.f181447a |= 1;
                afVar.f181448b = str;
                acVar.mo59708b((C66702af) aeVar.build());
            }
        }
        C66698ab abVar2 = (C66698ab) C66707ak.f181458e.createBuilder();
        abVar2.copyOnWrite();
        C66707ak akVar3 = (C66707ak) abVar2.instance;
        akVar3.f181460a |= 1;
        akVar3.f181463d = "device-contacts";
        abVar2.copyOnWrite();
        C66707ak akVar4 = (C66707ak) abVar2.instance;
        C66700ad adVar3 = (C66700ad) acVar.build();
        adVar3.getClass();
        akVar4.f181462c = adVar3;
        akVar4.f181461b = 3;
        return (C66707ak) abVar2.build();
    }
}

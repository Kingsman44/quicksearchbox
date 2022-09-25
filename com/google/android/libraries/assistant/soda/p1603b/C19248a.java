package com.google.android.libraries.assistant.soda.p1603b;

import com.google.android.apps.gsa.search.core.google.C85852aj;
import com.google.android.apps.gsa.search.core.google.C86066h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66701ae;
import com.google.speech.p5218j.p5219a.C66702af;
import com.google.speech.p5218j.p5219a.C66707ak;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.soda.b.a */
/* compiled from: PG */
public final class C19248a implements C19249b {

    /* renamed from: a */
    private final C85852aj f53951a;

    /* renamed from: b */
    private final C19252e f53952b;

    public C19248a(C85852aj ajVar, C19252e eVar) {
        this.f53951a = ajVar;
        this.f53952b = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58495hd mo24426a() {
        return C58729pv.f156485a;
    }

    /* renamed from: b */
    public final C66707ak mo24427b() {
        List<C86066h> a = this.f53951a.mo79487a();
        a.size();
        C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
        acVar.copyOnWrite();
        C66700ad adVar = (C66700ad) acVar.instance;
        adVar.f181441a |= 1;
        adVar.f181442b = "$APP";
        C19252e eVar = this.f53952b;
        if (!eVar.mo24428a() || !((C86124t) eVar.f53955a.mo27525b()).mo79746e(C90082eg.f249926ap)) {
            C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
            abVar.copyOnWrite();
            C66707ak akVar = (C66707ak) abVar.instance;
            akVar.f181460a |= 1;
            akVar.f181463d = "app-names";
            abVar.copyOnWrite();
            C66707ak akVar2 = (C66707ak) abVar.instance;
            C66700ad adVar2 = (C66700ad) acVar.build();
            adVar2.getClass();
            akVar2.f181462c = adVar2;
            akVar2.f181461b = 3;
            return (C66707ak) abVar.build();
        }
        for (C86066h hVar : a) {
            String str = hVar.f232649a;
            if (!C58837ba.m90859h(str)) {
                C66701ae aeVar = (C66701ae) C66702af.f181445c.createBuilder();
                aeVar.copyOnWrite();
                C66702af afVar = (C66702af) aeVar.instance;
                str.getClass();
                afVar.f181447a |= 1;
                afVar.f181448b = str;
                acVar.mo59708b((C66702af) aeVar.build());
            }
        }
        C66698ab abVar2 = (C66698ab) C66707ak.f181458e.createBuilder();
        abVar2.copyOnWrite();
        C66707ak akVar3 = (C66707ak) abVar2.instance;
        akVar3.f181460a |= 1;
        akVar3.f181463d = "app-names";
        abVar2.copyOnWrite();
        C66707ak akVar4 = (C66707ak) abVar2.instance;
        C66700ad adVar3 = (C66700ad) acVar.build();
        adVar3.getClass();
        akVar4.f181462c = adVar3;
        akVar4.f181461b = 3;
        return (C66707ak) abVar2.build();
    }
}

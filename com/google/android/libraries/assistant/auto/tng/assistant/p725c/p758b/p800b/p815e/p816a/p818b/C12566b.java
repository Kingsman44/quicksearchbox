package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p818b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12425a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12431e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12582a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12611d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13019ag;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13515b;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13511d;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C12566b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15481g f39509a;

    /* renamed from: b */
    public final /* synthetic */ C12431e f39510b;

    public /* synthetic */ C12566b(C15481g gVar, C12431e eVar) {
        this.f39509a = gVar;
        this.f39510b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C15481g gVar = this.f39509a;
        C12431e eVar = this.f39510b;
        C13512e eVar2 = (C13512e) obj;
        if (eVar2.mo21153k() != 8) {
            C59104x d = C12567c.f39511a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SAFulfillment");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(44312);
            int k = eVar2.mo21153k();
            String a = C13511d.m29781a(k);
            if (k != 0) {
                cVar.mo56389s("Generate user static location message status: %s", a);
                gVar.mo22352b(C37179a.f97558cX);
                return C60856cj.m92899h(new Exception("Failed to generate user static location message"));
            }
            throw null;
        }
        gVar.mo22352b(C37179a.f97558cX);
        String i = eVar2.mo21151i();
        i.getClass();
        C51805du b = C13515b.m29797b(i, C13529e.SHARE_LOCATION);
        C12611d e = C12612e.m28814e();
        C12425a aVar = (C12425a) eVar;
        ((C12582a) e).f39538a = aVar.f39286a;
        C12991i iVar = aVar.f39287b.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        e.mo20665b(iVar);
        C13018af afVar = (C13018af) C13023ak.f40447c.createBuilder();
        C13019ag agVar = (C13019ag) C13020ah.f40439c.createBuilder();
        agVar.copyOnWrite();
        C13020ah ahVar = (C13020ah) agVar.instance;
        b.getClass();
        ahVar.f40442b = b;
        ahVar.f40441a |= 1;
        C13020ah ahVar2 = (C13020ah) agVar.build();
        afVar.copyOnWrite();
        C13023ak akVar = (C13023ak) afVar.instance;
        ahVar2.getClass();
        akVar.f40450b = ahVar2;
        akVar.f40449a = 2;
        e.mo20666c((C13023ak) afVar.build());
        return C60856cj.m92900i(e.mo20664a());
    }
}

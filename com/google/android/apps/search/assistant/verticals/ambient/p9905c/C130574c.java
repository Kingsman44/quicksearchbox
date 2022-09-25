package com.google.android.apps.search.assistant.verticals.ambient.p9905c;

import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c.C130582h;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c */
/* compiled from: PG */
public final /* synthetic */ class C130574c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130583d f357640a;

    public /* synthetic */ C130574c(C130583d dVar) {
        this.f357640a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C50819dp dpVar;
        C130583d dVar = this.f357640a;
        List<C50818do> list = (List) obj;
        ((C58970a) ((C58970a) dVar.f357672a.mo56224b()).mo56372aa(38917)).mo56387q("Sending update to AiAi (%d card(s))", list.size());
        int i = 0;
        for (C50818do doVar : list) {
            C58970a aVar = (C58970a) ((C58970a) dVar.f357672a.mo56224b()).mo56372aa(38919);
            int i2 = i + 1;
            Integer valueOf = Integer.valueOf(i);
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            String name = a.name();
            C50802cz czVar = doVar.f132309f;
            if (czVar == null) {
                czVar = C50802cz.f132236g;
            }
            C50723h hVar = czVar.f132239b;
            if (hVar == null) {
                hVar = C50723h.f131999e;
            }
            String str = hVar.f132002b;
            C50802cz czVar2 = doVar.f132309f;
            if (czVar2 == null) {
                czVar2 = C50802cz.f132236g;
            }
            C50723h hVar2 = czVar2.f132241d;
            if (hVar2 == null) {
                hVar2 = C50723h.f131999e;
            }
            aVar.mo56360M("Card %d: type: %s, title: %s, subtitle: %s", valueOf, name, str, hVar2.f132002b);
            i = i2;
        }
        if (list.isEmpty()) {
            C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
            C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132304a |= 1;
            doVar2.f132305b = true;
            C50792cp cpVar = C50792cp.PRIMARY;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            doVar3.f132306c = cpVar.f132174e;
            doVar3.f132304a |= 2;
            ciVar.mo53458c((C50818do) cnVar.build());
            dpVar = (C50819dp) ciVar.build();
        } else {
            C50785ci ciVar2 = (C50785ci) C50819dp.f132330b.createBuilder();
            ciVar2.mo53456a(list);
            dpVar = (C50819dp) ciVar2.build();
        }
        return ((C130582h) dVar.f357675d).mo109732b(dpVar, "aa_tng_update");
    }
}

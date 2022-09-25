package com.google.android.apps.gsa.assistant.settings.features.p529a.p530a;

import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.assistant.settings.p526e.C9764p;
import com.google.android.apps.gsa.assistant.settings.p526e.C9765q;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.a.a.a */
/* compiled from: PG */
public final class C9775a {
    /* renamed from: a */
    public static C9765q m24527a() {
        C9764p pVar = (C9764p) C9765q.f33712d.createBuilder();
        pVar.copyOnWrite();
        C9765q qVar = (C9765q) pVar.instance;
        qVar.f33714a |= 1;
        qVar.f33715b = 116378;
        C89849ae aeVar = C89849ae.OPA_SETTINGS_PAGE_ACCESSIBILITY;
        pVar.copyOnWrite();
        C9765q qVar2 = (C9765q) pVar.instance;
        qVar2.f33716c = aeVar.f245884YW;
        qVar2.f33714a |= 2;
        return (C9765q) pVar.build();
    }

    /* renamed from: b */
    public static C72856b m24528b(C86124t tVar, C9763o oVar) {
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String x = tVar.mo79758x(C90059dk.f249090b);
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        x.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = x;
        return oVar.mo18024a((C9753e) dVar.build());
    }
}

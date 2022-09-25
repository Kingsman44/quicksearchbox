package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3861at.C49840ay;
import com.google.assistant.p3861at.C50463y;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.r */
/* compiled from: PG */
public final /* synthetic */ class C107294r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C107295s f298603a;

    /* renamed from: b */
    public final /* synthetic */ C50463y f298604b;

    public /* synthetic */ C107294r(C107295s sVar, C50463y yVar) {
        this.f298603a = sVar;
        this.f298604b = yVar;
    }

    public final Object apply(Object obj) {
        C49830ao aoVar;
        C107295s sVar = this.f298603a;
        C50463y yVar = this.f298604b;
        C49814aa aaVar = (C49814aa) obj;
        if (aaVar.f128671a) {
            int i = yVar.f131330a;
            if (i != 1) {
                if (i == 2) {
                    i = 2;
                }
            }
            if (i == 1) {
                aoVar = (C49830ao) yVar.f131331b;
            } else {
                aoVar = (C49830ao) yVar.f131331b;
            }
            f fVar = sVar.f298605a;
            C51058ev evVar = aoVar.f129488e;
            if (evVar == null) {
                evVar = C51058ev.f132941o;
            }
            String str = evVar.f132944b;
            C49840ay ayVar = aoVar.f129492i;
            if (ayVar == null) {
                ayVar = C49840ay.f129512f;
            }
            int b = C49279ay.m85402b(ayVar.f129518e);
            int i2 = b == 0 ? 2 : b;
            C49840ay ayVar2 = aoVar.f129492i;
            int b2 = C49277aw.m85400b((ayVar2 == null ? C49840ay.f129512f : ayVar2).f129517d);
            int i3 = b2 == 0 ? 2 : b2;
            if (ayVar2 == null) {
                ayVar2 = C49840ay.f129512f;
            }
            fVar.a(str, i2, i3, ayVar2.f129516c, aaVar.f128674d);
        }
        return aaVar;
    }
}

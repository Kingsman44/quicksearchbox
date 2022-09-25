package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16626a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.p */
/* compiled from: PG */
public final /* synthetic */ class C12822p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12830x f40030a;

    public /* synthetic */ C12822p(C12830x xVar) {
        this.f40030a = xVar;
    }

    public final Object apply(Object obj) {
        C12830x xVar = this.f40030a;
        C58485gu guVar = (C58485gu) obj;
        guVar.size();
        C15481g gVar = xVar.f40045f;
        C37259h d = C37179a.f97482bA.mo40806d();
        C62722b bVar = C62722b.OK;
        C13007y yVar = xVar.f40046g.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        gVar.mo22354d(d, bVar, Optional.m71637of(Long.valueOf(yVar.f40416b)));
        if (guVar.isEmpty()) {
            return new C16626a().mo22941a();
        }
        C16626a aVar = new C16626a();
        aVar.f48715a = Optional.m71637of(guVar);
        return aVar.mo22941a();
    }
}

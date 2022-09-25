package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92110f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.C107082a;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.c */
/* compiled from: PG */
public final class C107100c implements C107082a {

    /* renamed from: a */
    public final C58974d f298167a;

    /* renamed from: b */
    private final C92110f f298168b;

    /* renamed from: c */
    private final C60887da f298169c;

    public C107100c(C92110f fVar, C60887da daVar, C83564a aVar) {
        this.f298168b = fVar;
        this.f298169c = daVar;
        this.f298167a = aVar.mo76900a("AA.UpdateSurface");
    }

    /* renamed from: a */
    public final C60870cx mo95785a(C106596h hVar, C58485gu guVar) {
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        ((C58970a) ((C58970a) this.f298167a.mo56224b()).mo56372aa(23492)).mo56387q("Sending %d updates directly to AiAi", guVar.size());
        C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
        ciVar.mo53456a((Iterable) Collection.EL.stream(guVar).flatMap(C107083a.f298138a).collect(C58370cn.f155946a));
        C60870cx a = this.f298168b.mo86729a((C50819dp) ciVar.build());
        C60856cj.m92911t(a, new C107099b(this), this.f298169c);
        return a;
    }
}

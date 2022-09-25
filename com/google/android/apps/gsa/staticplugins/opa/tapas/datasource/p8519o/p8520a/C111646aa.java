package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a.C111572e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.aa */
/* compiled from: PG */
public final class C111646aa implements C111674k {

    /* renamed from: a */
    private final C112037ao f310412a;

    /* renamed from: b */
    private final C111572e f310413b;

    public C111646aa(C112037ao aoVar, C111572e eVar) {
        this.f310412a = aoVar;
        this.f310413b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        C58485gu guVar;
        if (alVar.f125509c.size() == 0) {
            guVar = C58485gu.m89845m();
        } else {
            Optional c = C113148bf.m187156c(alVar);
            if (c.isEmpty()) {
                guVar = C58485gu.m89845m();
            } else if (!this.f310412a.mo99348a((C48570ad) c.get()).mo99346j()) {
                guVar = C58485gu.m89845m();
            } else {
                guVar = (C58485gu) this.f310413b.mo99175a(alVar).mo99174a(alVar).map(new C111689z(alVar)).orElse(C58485gu.m89845m());
            }
        }
        return C60856cj.m92900i(guVar);
    }
}

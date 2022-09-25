package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9909d;

import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130551a;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b.C130573s;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.d.b */
/* compiled from: PG */
public final class C130585b implements C130551a {

    /* renamed from: a */
    public final C58974d f357679a;

    /* renamed from: b */
    private final C130573s f357680b;

    /* renamed from: c */
    private final C60887da f357681c;

    public C130585b(C130573s sVar, C60887da daVar, C130603a aVar) {
        this.f357680b = sVar;
        this.f357681c = daVar;
        this.f357679a = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final C60870cx mo109724a(C83739ak akVar) {
        C83738aj ajVar = akVar.f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (ajVar.f228228a != 10) {
            C83730ab abVar = (C83730ab) akVar.toBuilder();
            C50794cr crVar = C50794cr.LOYALTY_CARD_ONBOARDING;
            abVar.copyOnWrite();
            C83739ak akVar2 = (C83739ak) abVar.instance;
            akVar2.f228239h = crVar.f132222T;
            akVar2.f228232a |= 64;
            akVar = (C83739ak) abVar.build();
        }
        return C60922j.m93044g(this.f357680b.mo109724a(akVar), C47810es.m84963c(new C130584a(this, akVar)), this.f357681c);
    }
}

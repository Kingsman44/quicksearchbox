package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bd */
/* compiled from: PG */
public final /* synthetic */ class C124076bd implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342701a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f342702b;

    /* renamed from: c */
    public final /* synthetic */ C58528ij f342703c;

    /* renamed from: d */
    public final /* synthetic */ Optional f342704d;

    /* renamed from: e */
    public final /* synthetic */ C123777f f342705e;

    public /* synthetic */ C124076bd(C124081bi biVar, C53306j jVar, C58528ij ijVar, Optional optional, C123777f fVar) {
        this.f342701a = biVar;
        this.f342702b = jVar;
        this.f342703c = ijVar;
        this.f342704d = optional;
        this.f342705e = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124081bi biVar = this.f342701a;
        C53306j jVar = this.f342702b;
        C58528ij ijVar = this.f342703c;
        Optional optional = this.f342704d;
        C123777f fVar = this.f342705e;
        ArrayList arrayList = new ArrayList();
        C58485gu c = biVar.f342712d.mo106250c(jVar, C58597ky.m90211b(ijVar), true);
        C58485gu c2 = biVar.f342712d.mo106250c(jVar, C58597ky.m90211b(ijVar), false);
        if (!c.isEmpty()) {
            arrayList.add(biVar.mo106276g(optional, jVar, fVar, c));
        }
        if (!c2.isEmpty()) {
            arrayList.add(biVar.mo106274e(optional, jVar, fVar, c2));
        }
        return C47638k.m84750a(arrayList).mo51520a(new C124073ba(arrayList), biVar.f342713e);
    }
}

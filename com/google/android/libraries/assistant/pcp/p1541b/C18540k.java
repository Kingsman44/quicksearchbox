package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.b.k */
/* compiled from: PG */
public final /* synthetic */ class C18540k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52533a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52534b;

    /* renamed from: c */
    public final /* synthetic */ C18777i f52535c;

    /* renamed from: d */
    public final /* synthetic */ C18718c f52536d;

    public /* synthetic */ C18540k(C18551v vVar, C53306j jVar, C18777i iVar, C18718c cVar) {
        this.f52533a = vVar;
        this.f52534b = jVar;
        this.f52535c = iVar;
        this.f52536d = cVar;
    }

    public final C60870cx apply(Object obj) {
        C18551v vVar = this.f52533a;
        C53306j jVar = this.f52534b;
        C18777i iVar = this.f52535c;
        C18718c cVar = this.f52536d;
        Set set = (C58528ij) obj;
        jVar.name();
        if (!iVar.mo24042a().isEmpty()) {
            Set hashSet = new HashSet(set);
            hashSet.retainAll(iVar.mo24042a());
            set = hashSet;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(set).map(new C18538i(vVar)).collect(C58370cn.f155946a);
        return C47638k.m84750a(guVar).mo51521b(new C18539j(vVar, guVar, jVar, cVar, iVar), vVar.f52560d);
    }
}

package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.b.q */
/* compiled from: PG */
public final /* synthetic */ class C18546q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52547a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52548b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52549c;

    /* renamed from: d */
    public final /* synthetic */ int f52550d;

    public /* synthetic */ C18546q(C18551v vVar, C53306j jVar, int i, C18718c cVar) {
        this.f52547a = vVar;
        this.f52548b = jVar;
        this.f52550d = i;
        this.f52549c = cVar;
    }

    public final C60870cx apply(Object obj) {
        C18551v vVar = this.f52547a;
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) obj).map(new C18534e(vVar, this.f52548b, this.f52550d, this.f52549c)).collect(C58370cn.f155946a);
        return C47638k.m84750a(guVar).mo51520a(new C18535f(guVar), vVar.f52560d);
    }
}

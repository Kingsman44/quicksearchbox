package com.google.android.libraries.search.assistant.invocation.p2641k.p2642a;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.inject.C47245e;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71091ej;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71095en;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71096eo;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71097ep;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71098eq;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71099er;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71104ew;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71120g;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.a.c */
/* compiled from: PG */
public final class C33917c {

    /* renamed from: a */
    public final C21370a f90465a;

    /* renamed from: b */
    public final C71104ew f90466b;

    /* renamed from: c */
    private final Context f90467c;

    /* renamed from: d */
    private final C34119a f90468d;

    /* renamed from: e */
    private final C34053bp f90469e;

    /* renamed from: f */
    private final C37215b f90470f;

    /* renamed from: com.google.android.libraries.search.assistant.invocation.k.a.c$a */
    /* compiled from: PG */
    public interface C33918a {
        /* renamed from: eR */
        C37215b mo39129eR();
    }

    public C33917c(Context context, C21370a aVar, C34119a aVar2, C34053bp bpVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(aVar2, "client");
        C69664n.m101061g(bpVar, "token");
        this.f90467c = context;
        this.f90465a = aVar;
        this.f90468d = aVar2;
        this.f90469e = bpVar;
        this.f90470f = ((C33918a) C47245e.m84045a(context, C33918a.class, aVar2.f90870b)).mo39129eR();
        C71091ej ejVar = (C71091ej) C71104ew.f189639f.createBuilder();
        String name = aVar2.f90869a.name();
        ejVar.copyOnWrite();
        C71104ew ewVar = (C71104ew) ejVar.instance;
        name.getClass();
        ewVar.f189642a |= 1;
        ewVar.f189643b = name;
        C62942bv build = ejVar.build();
        C69664n.m101060f(build, "newBuilder().setClientNa…t.apaClient.name).build()");
        this.f90466b = (C71104ew) build;
    }

    /* renamed from: b */
    public static final C71104ew m62571b(C71104ew ewVar, C71095en enVar) {
        C62934bn builder = ewVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C71120g a = C69664n.m101061g((C71091ej) builder, "builder");
        C71098eq eqVar = (C71098eq) C71099er.f189622c.createBuilder();
        C69664n.m101060f(eqVar, "newBuilder()");
        C69664n.m101061g(eqVar, "builder");
        C71096eo eoVar = (C71096eo) C71097ep.f189618c.createBuilder();
        C69664n.m101060f(eoVar, "newBuilder()");
        C69664n.m101061g(eoVar, "builder");
        C69664n.m101061g(enVar, "value");
        eoVar.copyOnWrite();
        C71097ep epVar = (C71097ep) eoVar.instance;
        epVar.f189621b = enVar.f189617h;
        epVar.f189620a |= 2;
        C62942bv build = eoVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C71097ep epVar2 = (C71097ep) build;
        C69664n.m101061g(epVar2, "value");
        eqVar.copyOnWrite();
        C71099er erVar = (C71099er) eqVar.instance;
        epVar2.getClass();
        erVar.f189625b = epVar2;
        erVar.f189624a = 1;
        C62942bv build2 = eqVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C71099er erVar2 = (C71099er) build2;
        C69664n.m101061g(erVar2, "value");
        C71091ej ejVar = a.f189726a;
        ejVar.copyOnWrite();
        C71104ew ewVar2 = (C71104ew) ejVar.instance;
        erVar2.getClass();
        ewVar2.f189645d = erVar2;
        ewVar2.f189642a |= 4;
        return a.mo62621a();
    }

    /* renamed from: a */
    public final void mo39128a(C37252a aVar, C71104ew ewVar) {
        C37215b bVar = this.f90470f;
        C37253b bVar2 = (C37253b) aVar;
        bVar2.mo40795s("apa_invocation", C34711b.m63446b(this.f90469e));
        bVar2.mo40792p(C71104ew.f189640g, ewVar);
        bVar.mo19974a(aVar);
    }
}

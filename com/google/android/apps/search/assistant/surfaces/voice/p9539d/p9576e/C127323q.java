package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32795aq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.q */
/* compiled from: PG */
public final class C127323q {

    /* renamed from: a */
    public static final C32836cd f350651a;

    /* renamed from: b */
    public static final C32836cd f350652b;

    /* renamed from: c */
    public final C60887da f350653c;

    /* renamed from: d */
    public final C127327u f350654d;

    /* renamed from: e */
    public final C127307ak f350655e;

    /* renamed from: f */
    public final C127307ak f350656f;

    /* renamed from: g */
    public final C128426a f350657g;

    /* renamed from: h */
    private final AtomicReference f350658h = new AtomicReference();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "asst.gws.params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f350651a = (C32836cd) ccVar.build();
        C32835cc ccVar2 = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar2.copyOnWrite();
        C32836cd cdVar3 = (C32836cd) ccVar2.instance;
        cdVar3.f88042a |= 2;
        cdVar3.f88044c = true;
        C32788aj ajVar2 = (C32788aj) C32796ar.f87973c.createBuilder();
        C32795aq aqVar = C32795aq.f87971a;
        ajVar2.copyOnWrite();
        C32796ar arVar3 = (C32796ar) ajVar2.instance;
        aqVar.getClass();
        arVar3.f87976b = aqVar;
        arVar3.f87975a = 4;
        ccVar2.copyOnWrite();
        C32836cd cdVar4 = (C32836cd) ccVar2.instance;
        C32796ar arVar4 = (C32796ar) ajVar2.build();
        arVar4.getClass();
        cdVar4.f88043b = arVar4;
        cdVar4.f88042a |= 1;
        f350652b = (C32836cd) ccVar2.build();
    }

    public C127323q(C60887da daVar, C127327u uVar, C127307ak akVar, C127307ak akVar2, C128426a aVar) {
        this.f350653c = daVar;
        this.f350654d = uVar;
        this.f350655e = akVar;
        this.f350656f = akVar2;
        this.f350657g = aVar;
    }

    /* renamed from: a */
    public final C127325s mo108015a(C127289i iVar) {
        C127308b bVar = (C127308b) DesugarAtomicReference.updateAndGet(this.f350658h, new C127320n(this, iVar));
        bVar.getClass();
        return bVar.f350606b;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo108016b(C127289i iVar) {
        C60870cx j = C60856cj.m92901j(mo108015a(iVar).mo108022b());
        C127319m mVar = C127319m.f350647a;
        return C60922j.m93044g(j, C47810es.m84963c(mVar), this.f350653c);
    }
}

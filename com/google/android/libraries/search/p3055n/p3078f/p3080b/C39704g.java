package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.search.p3055n.C39275ay;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39654ch;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.p3058b.p3060b.C39280aa;
import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66950fm;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.p5219a.C66722az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.f.b.g */
/* compiled from: PG */
public final /* synthetic */ class C39704g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39711n f104481a;

    /* renamed from: b */
    public final /* synthetic */ C66950fm f104482b;

    /* renamed from: c */
    public final /* synthetic */ C19347o f104483c;

    public /* synthetic */ C39704g(C39711n nVar, C66950fm fmVar, C19347o oVar) {
        this.f104481a = nVar;
        this.f104482b = fmVar;
        this.f104483c = oVar;
    }

    public final C60870cx apply(Object obj) {
        C39711n nVar = this.f104481a;
        C66950fm fmVar = this.f104482b;
        C19347o oVar = this.f104483c;
        nVar.f104497f = Optional.m71637of(nVar.f104504m.a(C60856cj.m92900i(Optional.m71637of((C39775h) obj)), Optional.empty(), Optional.empty(), false));
        C66722az b = nVar.mo41997b(fmVar);
        C39654ch chVar = (C39654ch) C39655ci.f104377j.createBuilder();
        C39275ay ayVar = (C39275ay) C39276az.f103456b.createBuilder();
        ayVar.mo41753a(fmVar.f181995c);
        chVar.copyOnWrite();
        C39655ci ciVar = (C39655ci) chVar.instance;
        C39276az azVar = (C39276az) ayVar.build();
        azVar.getClass();
        ciVar.f104382c = azVar;
        ciVar.f104380a |= 2;
        C66964g gVar = C66964g.AMBIENT_ONESHOT;
        chVar.copyOnWrite();
        C39655ci ciVar2 = (C39655ci) chVar.instance;
        ciVar2.f104386g = gVar.f182026k;
        ciVar2.f104380a |= 32;
        chVar.copyOnWrite();
        C39655ci ciVar3 = (C39655ci) chVar.instance;
        b.getClass();
        ciVar3.f104385f = b;
        ciVar3.f104380a |= 16;
        return ((C39280aa) nVar.f104497f.get()).mo41759e((C39655ci) chVar.build(), oVar, nVar.f104498g, true, false);
    }
}

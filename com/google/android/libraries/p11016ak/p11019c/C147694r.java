package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.C147702d;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147644h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p5285d.p5290b.p5291a.p5292a.C68149al;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68157at;
import p5285d.p5290b.p5291a.p5292a.C68158au;
import p5285d.p5290b.p5291a.p5292a.C68196i;
import p5285d.p5290b.p5291a.p5292a.C68200m;

/* renamed from: com.google.android.libraries.ak.c.r */
/* compiled from: PG */
public final /* synthetic */ class C147694r implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C147697u f398592a;

    /* renamed from: b */
    public final /* synthetic */ C147702d f398593b;

    public /* synthetic */ C147694r(C147697u uVar, C147702d dVar) {
        this.f398592a = uVar;
        this.f398593b = dVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C68200m mVar;
        C68150am amVar;
        C60870cx cxVar;
        C147697u uVar = this.f398592a;
        C147702d dVar = this.f398593b;
        int i = dVar.f398616b;
        boolean b = uVar.mo124422b(dVar);
        if (b) {
            C68196i a = uVar.f398597b.mo124383a();
            C68157at atVar = (C68157at) C68158au.f184441d.createBuilder();
            C68149al alVar = (C68149al) C68150am.f184434c.createBuilder();
            alVar.copyOnWrite();
            ((C68150am) alVar.instance).f184437b = 0;
            atVar.copyOnWrite();
            C68158au auVar = (C68158au) atVar.instance;
            C68150am amVar2 = (C68150am) alVar.build();
            amVar2.getClass();
            auVar.f184444b = amVar2;
            auVar.f184443a = 1;
            a.copyOnWrite();
            C68158au auVar2 = (C68158au) atVar.build();
            C68200m mVar2 = C68200m.f184542g;
            auVar2.getClass();
            ((C68200m) a.instance).f184548e = auVar2;
            mVar = (C68200m) a.build();
        } else {
            mVar = uVar.f398597b.mo124384b(i);
        }
        String[] strArr = uVar.mo124422b(dVar) ? new String[]{"metadata", "text", "image"} : new String[]{"metadata", "text", "audio", "image"};
        C68158au auVar3 = mVar.f184548e;
        if (auVar3 == null) {
            auVar3 = C68158au.f184441d;
        }
        if (auVar3.f184443a == 1) {
            amVar = (C68150am) auVar3.f184444b;
        } else {
            amVar = C68150am.f184434c;
        }
        C147645b bVar = (C147645b) C147679c.f398547d.createBuilder();
        C68149al alVar2 = (C68149al) C68150am.f184434c.createBuilder();
        int i2 = amVar.f184436a;
        alVar2.copyOnWrite();
        ((C68150am) alVar2.instance).f184436a = i2;
        int i3 = amVar.f184437b;
        alVar2.copyOnWrite();
        ((C68150am) alVar2.instance).f184437b = i3;
        bVar.copyOnWrite();
        C68150am amVar3 = (C68150am) alVar2.build();
        amVar3.getClass();
        ((C147679c) bVar.instance).f398549a = amVar3;
        bVar.copyOnWrite();
        ((C147679c) bVar.instance).f398550b = true;
        C147691o oVar = new C147691o((C147679c) bVar.build());
        C68158au auVar4 = mVar.f184548e;
        uVar.f398598c.mo124382c(mVar, oVar, strArr);
        if (!b) {
            C147644h hVar = uVar.f398599d;
            Objects.requireNonNull(oVar);
            hVar.mo124391b(i, new C147695s(oVar));
        }
        if (!oVar.f398587d) {
            cxVar = C60856cj.m92899h(new IllegalStateException("Metadata wasn't requested."));
        } else {
            cxVar = oVar.f398585b;
        }
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C147696t(uVar)), C60826bg.f164896a);
        return cxVar;
    }
}

package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119080e;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119088m;
import p5285d.p5290b.p5291a.p5292a.C68149al;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68157at;
import p5285d.p5290b.p5291a.p5292a.C68158au;
import p5285d.p5290b.p5291a.p5292a.C68196i;
import p5285d.p5290b.p5291a.p5292a.C68200m;

/* renamed from: com.google.android.apps.h.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C119116c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119126h f332255a;

    /* renamed from: b */
    public final /* synthetic */ C119088m f332256b;

    public /* synthetic */ C119116c(C119126h hVar, C119088m mVar) {
        this.f332255a = hVar;
        this.f332256b = mVar;
    }

    public final void run() {
        C68200m mVar;
        C119126h hVar = this.f332255a;
        C119088m mVar2 = this.f332256b;
        C119080e eVar = (C119080e) mVar2;
        if (eVar.f332188b > 0) {
            hVar.mo104194t(mVar2);
            return;
        }
        C119108b bVar = new C119108b(true, hVar, mVar2, hVar.f332265n.f332280c);
        C119103al alVar = eVar.f332187a;
        if (alVar.f332229a == 1) {
            C68196i o = hVar.mo104192o(alVar);
            C68157at atVar = (C68157at) C68158au.f184441d.createBuilder();
            C68149al alVar2 = (C68149al) C68150am.f184434c.createBuilder();
            alVar2.copyOnWrite();
            ((C68150am) alVar2.instance).f184436a = 0;
            int i = hVar.f332265n.f332278a;
            alVar2.copyOnWrite();
            ((C68150am) alVar2.instance).f184437b = i;
            atVar.copyOnWrite();
            C68158au auVar = (C68158au) atVar.instance;
            C68150am amVar = (C68150am) alVar2.build();
            amVar.getClass();
            auVar.f184444b = amVar;
            auVar.f184443a = 1;
            o.copyOnWrite();
            C68158au auVar2 = (C68158au) atVar.build();
            C68200m mVar3 = C68200m.f184542g;
            auVar2.getClass();
            ((C68200m) o.instance).f184548e = auVar2;
            mVar = (C68200m) o.build();
        } else {
            mVar = (C68200m) hVar.mo104192o(alVar).build();
        }
        hVar.f332267p.put(mVar2, bVar);
        hVar.f332264m.mo104196b(mVar, bVar, "audio", "text");
    }
}

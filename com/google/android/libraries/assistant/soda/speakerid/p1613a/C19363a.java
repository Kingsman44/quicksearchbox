package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.speech.p5218j.C66974gj;
import com.google.speech.p5218j.C66975gk;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66986gv;
import com.google.speech.p5218j.C66987gw;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.a */
/* compiled from: PG */
public final /* synthetic */ class C19363a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19372j f54197a;

    /* renamed from: b */
    public final /* synthetic */ C19373k f54198b;

    public /* synthetic */ C19363a(C19372j jVar, C19373k kVar) {
        this.f54197a = jVar;
        this.f54198b = kVar;
    }

    public final Object call() {
        C19372j jVar = this.f54197a;
        C19373k kVar = this.f54198b;
        String absolutePath = jVar.f54210b.getDir("sid", 0).getAbsolutePath();
        C66974gj gjVar = (C66974gj) C66975gk.f182045f.createBuilder();
        boolean f = kVar.mo24521f();
        gjVar.copyOnWrite();
        C66975gk gkVar = (C66975gk) gjVar.instance;
        gkVar.f182047a |= 1;
        gkVar.f182048b = f;
        gjVar.copyOnWrite();
        C66975gk gkVar2 = (C66975gk) gjVar.instance;
        gkVar2.f182047a |= 4;
        gkVar2.f182050d = false;
        int a = kVar.mo24516a();
        gjVar.copyOnWrite();
        C66975gk gkVar3 = (C66975gk) gjVar.instance;
        gkVar3.f182047a |= 2;
        gkVar3.f182049c = a;
        int b = kVar.mo24517b();
        gjVar.copyOnWrite();
        C66975gk gkVar4 = (C66975gk) gjVar.instance;
        gkVar4.f182047a |= 8;
        gkVar4.f182051e = b;
        C66975gk gkVar5 = (C66975gk) gjVar.build();
        C66998hg g = C19245ah.m36699g((String) kVar.mo24519d().mo56109e(BuildConfig.FLAVOR), absolutePath, BuildConfig.FLAVOR);
        g.copyOnWrite();
        C66999hh hhVar = (C66999hh) g.instance;
        C66999hh hhVar2 = C66999hh.f182127p;
        gkVar5.getClass();
        hhVar.f182142n = gkVar5;
        hhVar.f182129a |= 32768;
        C66986gv gvVar = (C66986gv) C66987gw.f182085b.createBuilder();
        gvVar.mo59760a(kVar.mo24520e().toLanguageTag());
        g.copyOnWrite();
        C66999hh hhVar3 = (C66999hh) g.instance;
        C66987gw gwVar = (C66987gw) gvVar.build();
        gwVar.getClass();
        hhVar3.f182134f = gwVar;
        hhVar3.f182129a |= 32;
        if (kVar.mo24518c().mo56113h()) {
            C66985gu guVar = (C66985gu) kVar.mo24518c().mo56107c();
            g.copyOnWrite();
            C66999hh hhVar4 = (C66999hh) g.instance;
            guVar.getClass();
            hhVar4.f182131c = guVar;
            hhVar4.f182129a |= 2;
        }
        return (C66999hh) g.build();
    }
}

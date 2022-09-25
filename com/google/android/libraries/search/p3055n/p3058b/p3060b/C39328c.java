package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C66979go;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C39328c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C66998hg f103589a;

    public /* synthetic */ C39328c(C66998hg hgVar) {
        this.f103589a = hgVar;
    }

    public final void accept(Object obj) {
        C66998hg hgVar = this.f103589a;
        C66979go goVar = (C66979go) obj;
        C59071e eVar = C39280aa.f103467a;
        C66984gt gtVar = (C66984gt) C66985gu.f182075h.createBuilder();
        gtVar.copyOnWrite();
        C66985gu guVar = (C66985gu) gtVar.instance;
        goVar.getClass();
        guVar.f182082f = goVar;
        guVar.f182077a |= 1024;
        hgVar.copyOnWrite();
        C66999hh hhVar = (C66999hh) hgVar.instance;
        C66985gu guVar2 = (C66985gu) gtVar.build();
        C66999hh hhVar2 = C66999hh.f182127p;
        guVar2.getClass();
        hhVar.f182131c = guVar2;
        hhVar.f182129a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

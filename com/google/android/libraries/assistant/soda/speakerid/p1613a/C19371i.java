package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import com.google.speech.p5218j.C66780au;
import com.google.speech.p5218j.C66826bd;
import com.google.speech.p5218j.C66827be;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.i */
/* compiled from: PG */
public final /* synthetic */ class C19371i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C66826bd f54208a;

    public /* synthetic */ C19371i(C66826bd bdVar) {
        this.f54208a = bdVar;
    }

    public final void accept(Object obj) {
        C66826bd bdVar = this.f54208a;
        C66780au auVar = (C66780au) obj;
        bdVar.copyOnWrite();
        C66827be beVar = (C66827be) bdVar.instance;
        C66827be beVar2 = C66827be.f181719f;
        auVar.getClass();
        beVar.f181725e = auVar;
        beVar.f181721a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

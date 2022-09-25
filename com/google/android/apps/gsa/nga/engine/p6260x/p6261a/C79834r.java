package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.libraries.assistant.trainingcache.agsa.C19428f;
import com.google.speech.p5228m.C67338co;
import com.google.speech.p5228m.C67339cp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.r */
/* compiled from: PG */
public final /* synthetic */ class C79834r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f218905a;

    public /* synthetic */ C79834r(String str) {
        this.f218905a = str;
    }

    public final void accept(Object obj) {
        String str = this.f218905a;
        C67338co coVar = (C67338co) C67339cp.f183030c.createBuilder();
        coVar.copyOnWrite();
        C67339cp cpVar = (C67339cp) coVar.instance;
        str.getClass();
        cpVar.f183032a |= 1;
        cpVar.f183033b = str;
        ((C19428f) obj).mo24617c(7004, ((C67339cp) coVar.build()).toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

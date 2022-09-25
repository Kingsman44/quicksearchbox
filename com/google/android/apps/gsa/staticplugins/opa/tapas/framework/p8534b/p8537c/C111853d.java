package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.assistant.p3781ad.p3789d.p3790a.C48555h;
import com.google.assistant.p3781ad.p3789d.p3790a.C48556i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C111853d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48555h f310837a;

    public /* synthetic */ C111853d(C48555h hVar) {
        this.f310837a = hVar;
    }

    public final void accept(Object obj) {
        C48555h hVar = this.f310837a;
        String obj2 = ((CharSequence) obj).toString();
        hVar.copyOnWrite();
        C48556i iVar = (C48556i) hVar.instance;
        C48556i iVar2 = C48556i.f125438f;
        obj2.getClass();
        iVar.f125440a |= 1;
        iVar.f125441b = obj2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

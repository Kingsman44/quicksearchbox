package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.assistant.p3781ad.p3789d.p3790a.C48558k;
import com.google.assistant.p3781ad.p3789d.p3790a.C48565r;
import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.l */
/* compiled from: PG */
public final /* synthetic */ class C111861l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48565r f310845a;

    public /* synthetic */ C111861l(C48565r rVar) {
        this.f310845a = rVar;
    }

    public final void accept(Object obj) {
        C48565r rVar = this.f310845a;
        C48558k kVar = (C48558k) obj;
        rVar.copyOnWrite();
        C48566s sVar = (C48566s) rVar.instance;
        C48566s sVar2 = C48566s.f125467i;
        kVar.getClass();
        sVar.f125476h = kVar;
        sVar.f125469a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

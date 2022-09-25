package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.assistant.p3781ad.p3789d.p3790a.C48565r;
import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.j */
/* compiled from: PG */
public final /* synthetic */ class C111859j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48565r f310843a;

    public /* synthetic */ C111859j(C48565r rVar) {
        this.f310843a = rVar;
    }

    public final void accept(Object obj) {
        C48565r rVar = this.f310843a;
        C48553f fVar = (C48553f) obj;
        rVar.copyOnWrite();
        C48566s sVar = (C48566s) rVar.instance;
        C48566s sVar2 = C48566s.f125467i;
        fVar.getClass();
        sVar.f125472d = fVar;
        sVar.f125469a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

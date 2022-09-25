package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.assistant.p3781ad.p3789d.p3790a.C48550c;
import com.google.assistant.p3781ad.p3789d.p3790a.C48551d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.e */
/* compiled from: PG */
public final /* synthetic */ class C111854e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48550c f310838a;

    public /* synthetic */ C111854e(C48550c cVar) {
        this.f310838a = cVar;
    }

    public final void accept(Object obj) {
        C48550c cVar = this.f310838a;
        String str = (String) obj;
        cVar.copyOnWrite();
        C48551d dVar = (C48551d) cVar.instance;
        C48551d dVar2 = C48551d.f125425e;
        str.getClass();
        dVar.f125427a |= 1;
        dVar.f125428b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

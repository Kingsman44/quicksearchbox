package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10527u.C139774o;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.ah */
/* compiled from: PG */
public final /* synthetic */ class C133384ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C139774o f363447a;

    public /* synthetic */ C133384ah(C139774o oVar) {
        this.f363447a = oVar;
    }

    public final void accept(Object obj) {
        C139774o oVar = this.f363447a;
        C135462h hVar = (C135462h) obj;
        oVar.copyOnWrite();
        C139775p pVar = (C139775p) oVar.instance;
        C139775p pVar2 = C139775p.f379888c;
        hVar.getClass();
        pVar.f379891b = hVar;
        pVar.f379890a = 6;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

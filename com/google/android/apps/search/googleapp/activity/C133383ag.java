package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.collections.p10142a.C133493b;
import com.google.android.apps.search.googleapp.p10527u.C139774o;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.ag */
/* compiled from: PG */
public final /* synthetic */ class C133383ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C139774o f363446a;

    public /* synthetic */ C133383ag(C139774o oVar) {
        this.f363446a = oVar;
    }

    public final void accept(Object obj) {
        C139774o oVar = this.f363446a;
        C133493b bVar = (C133493b) obj;
        oVar.copyOnWrite();
        C139775p pVar = (C139775p) oVar.instance;
        C139775p pVar2 = C139775p.f379888c;
        bVar.getClass();
        pVar.f379891b = bVar;
        pVar.f379890a = 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

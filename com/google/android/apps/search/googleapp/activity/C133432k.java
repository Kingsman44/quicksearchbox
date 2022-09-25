package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.k */
/* compiled from: PG */
public final /* synthetic */ class C133432k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C133444w f363578a;

    public /* synthetic */ C133432k(C133444w wVar) {
        this.f363578a = wVar;
    }

    public final void accept(Object obj) {
        C139761b bVar = (C139761b) obj;
        C139775p pVar = this.f363578a.f363621f.f363482c;
        if (pVar == null) {
            pVar = C139775p.f379888c;
        }
        bVar.mo111220c(pVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

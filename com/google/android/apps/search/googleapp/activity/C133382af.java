package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10310h.C136137r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.af */
/* compiled from: PG */
public final /* synthetic */ class C133382af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C133394ar f363445a;

    public /* synthetic */ C133382af(C133394ar arVar) {
        this.f363445a = arVar;
    }

    public final void accept(Object obj) {
        C133394ar arVar = this.f363445a;
        C136137r rVar = (C136137r) obj;
        arVar.copyOnWrite();
        C133395as asVar = (C133395as) arVar.instance;
        C133395as asVar2 = C133395as.f363478e;
        rVar.getClass();
        asVar.f363483d = rVar;
        asVar.f363480a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

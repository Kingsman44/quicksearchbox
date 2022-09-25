package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.ak */
/* compiled from: PG */
public final /* synthetic */ class C101300ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282711a;

    public /* synthetic */ C101300ak(C101325be beVar) {
        this.f282711a = beVar;
    }

    public final void accept(Object obj) {
        C101325be beVar = this.f282711a;
        C90875ai.m148465b(C101303an.f282715a, beVar.f282788r.mo28209i(beVar.f282773c.mo20151d(), "#Fetch isVoiceStopRequested", new C101302am(beVar, (Boolean) obj)), beVar.f282788r, "#Log sessionEnd event callback").mo85223a(C101304ao.f282716a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

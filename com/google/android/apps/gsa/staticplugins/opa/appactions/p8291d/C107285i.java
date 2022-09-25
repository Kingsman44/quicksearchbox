package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49819ae;
import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.i */
/* compiled from: PG */
public final /* synthetic */ class C107285i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49829an f298594a;

    public /* synthetic */ C107285i(C49829an anVar) {
        this.f298594a = anVar;
    }

    public final void accept(Object obj) {
        C49829an anVar = this.f298594a;
        C49819ae aeVar = (C49819ae) obj;
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        C49830ao aoVar2 = C49830ao.f129482j;
        aeVar.getClass();
        aoVar.f129486c = aeVar;
        aoVar.f129485b = 6;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

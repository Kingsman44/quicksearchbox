package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.j */
/* compiled from: PG */
public final /* synthetic */ class C107286j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49829an f298595a;

    public /* synthetic */ C107286j(C49829an anVar) {
        this.f298595a = anVar;
    }

    public final void accept(Object obj) {
        C49829an anVar = this.f298595a;
        C51058ev evVar = (C51058ev) obj;
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        C49830ao aoVar2 = C49830ao.f129482j;
        evVar.getClass();
        aoVar.f129488e = evVar;
        aoVar.f129484a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

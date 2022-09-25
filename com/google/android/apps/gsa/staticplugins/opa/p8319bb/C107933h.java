package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import com.google.android.apps.gsa.staticplugins.opa.p8186ai.p8187a.C106178b;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.h */
/* compiled from: PG */
public final /* synthetic */ class C107933h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ boolean f300313a;

    public /* synthetic */ C107933h(boolean z) {
        this.f300313a = z;
    }

    public final void accept(Object obj) {
        boolean z = this.f300313a;
        C106178b bVar = (C106178b) obj;
        C59071e eVar = C107945t.f300328a;
        String a = bVar.mo95345a();
        Boolean valueOf = Boolean.valueOf(z);
        C39141kp kpVar = bVar.f296323a;
        ((C19567d) kpVar.f102796G.mo6453a()).mo24822a(1, bVar.f296324b, bVar.f296325c, a, valueOf);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

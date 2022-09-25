package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49861bs;
import com.google.assistant.p3861at.C49862bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.d */
/* compiled from: PG */
public final /* synthetic */ class C107280d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49861bs f298589a;

    public /* synthetic */ C107280d(C49861bs bsVar) {
        this.f298589a = bsVar;
    }

    public final void accept(Object obj) {
        C49861bs bsVar = this.f298589a;
        String str = (String) obj;
        bsVar.copyOnWrite();
        C49862bt btVar = (C49862bt) bsVar.instance;
        C49862bt btVar2 = C49862bt.f129566e;
        str.getClass();
        btVar.f129568a |= 1;
        btVar.f129569b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

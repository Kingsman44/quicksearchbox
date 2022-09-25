package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49819ae;
import com.google.assistant.p3861at.C49861bs;
import com.google.assistant.p3861at.C49862bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.f */
/* compiled from: PG */
public final /* synthetic */ class C107282f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49861bs f298591a;

    public /* synthetic */ C107282f(C49861bs bsVar) {
        this.f298591a = bsVar;
    }

    public final void accept(Object obj) {
        C49861bs bsVar = this.f298591a;
        C49819ae aeVar = (C49819ae) obj;
        bsVar.copyOnWrite();
        C49862bt btVar = (C49862bt) bsVar.instance;
        C49862bt btVar2 = C49862bt.f129566e;
        aeVar.getClass();
        btVar.f129571d = aeVar;
        btVar.f129568a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import com.google.android.apps.search.googleapp.p10310h.C136122c;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.d */
/* compiled from: PG */
public final /* synthetic */ class C97673d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136122c f272763a;

    public /* synthetic */ C97673d(C136122c cVar) {
        this.f272763a = cVar;
    }

    public final void accept(Object obj) {
        C136122c cVar = this.f272763a;
        C57315dp dpVar = (C57315dp) obj;
        cVar.copyOnWrite();
        C136123d dVar = (C136123d) cVar.instance;
        C136123d dVar2 = C136123d.f370743d;
        dpVar.getClass();
        dVar.f370746b = dpVar;
        dVar.f370745a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.nlp.p4735b.p4736a.C62840g;
import com.google.nlp.p4735b.p4736a.C62841h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.af */
/* compiled from: PG */
public final /* synthetic */ class C83052af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C62840g f226664a;

    public /* synthetic */ C83052af(C62840g gVar) {
        this.f226664a = gVar;
    }

    public final void accept(Object obj) {
        C62840g gVar = this.f226664a;
        int intValue = ((Integer) obj).intValue();
        gVar.copyOnWrite();
        C62841h hVar = (C62841h) gVar.instance;
        C62841h hVar2 = C62841h.f169700j;
        hVar.f169702a |= 32;
        hVar.f169709h = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

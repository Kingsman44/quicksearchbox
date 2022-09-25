package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80119g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C106234ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80119g f296424a;

    public /* synthetic */ C106234ae(C80119g gVar) {
        this.f296424a = gVar;
    }

    public final void accept(Object obj) {
        C80119g gVar = this.f296424a;
        String str = (String) obj;
        gVar.copyOnWrite();
        C80120h hVar = (C80120h) gVar.instance;
        C80120h hVar2 = C80120h.f219843o;
        str.getClass();
        hVar.f219845a |= 16;
        hVar.f219850f = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

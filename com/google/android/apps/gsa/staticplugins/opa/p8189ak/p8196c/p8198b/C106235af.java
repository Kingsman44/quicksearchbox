package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80119g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.af */
/* compiled from: PG */
public final /* synthetic */ class C106235af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80119g f296425a;

    public /* synthetic */ C106235af(C80119g gVar) {
        this.f296425a = gVar;
    }

    public final void accept(Object obj) {
        C80119g gVar = this.f296425a;
        C81048f fVar = (C81048f) obj;
        gVar.copyOnWrite();
        C80120h hVar = (C80120h) gVar.instance;
        C80120h hVar2 = C80120h.f219843o;
        fVar.getClass();
        hVar.f219852h = fVar;
        hVar.f219845a |= 128;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

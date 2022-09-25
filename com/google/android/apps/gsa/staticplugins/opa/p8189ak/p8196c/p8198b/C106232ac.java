package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80119g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import com.google.assistant.p3897e.p3917i.p3918a.C51350el;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C106232ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80119g f296422a;

    public /* synthetic */ C106232ac(C80119g gVar) {
        this.f296422a = gVar;
    }

    public final void accept(Object obj) {
        C80119g gVar = this.f296422a;
        C51350el elVar = (C51350el) obj;
        gVar.copyOnWrite();
        C80120h hVar = (C80120h) gVar.instance;
        C80120h hVar2 = C80120h.f219843o;
        elVar.getClass();
        hVar.f219857m = elVar;
        hVar.f219845a |= 4096;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

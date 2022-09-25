package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80119g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C106233ad implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80119g f296423a;

    public /* synthetic */ C106233ad(C80119g gVar) {
        this.f296423a = gVar;
    }

    public final void accept(Object obj) {
        C80119g gVar = this.f296423a;
        C51336dy dyVar = (C51336dy) obj;
        gVar.copyOnWrite();
        C80120h hVar = (C80120h) gVar.instance;
        C80120h hVar2 = C80120h.f219843o;
        dyVar.getClass();
        hVar.f219858n = dyVar;
        hVar.f219845a |= 8192;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

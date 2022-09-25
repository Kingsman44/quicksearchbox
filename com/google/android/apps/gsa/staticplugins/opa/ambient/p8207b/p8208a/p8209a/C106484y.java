package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.assistant.p3886c.p3887a.C50675k;
import com.google.assistant.p3886c.p3887a.C50676l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.y */
/* compiled from: PG */
public final /* synthetic */ class C106484y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50675k f296975a;

    public /* synthetic */ C106484y(C50675k kVar) {
        this.f296975a = kVar;
    }

    public final void accept(Object obj) {
        C50675k kVar = this.f296975a;
        float floatValue = ((Float) obj).floatValue();
        kVar.copyOnWrite();
        C50676l lVar = (C50676l) kVar.instance;
        C50676l lVar2 = C50676l.f131826h;
        lVar.f131828a |= 8;
        lVar.f131832e = floatValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

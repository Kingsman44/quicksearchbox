package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3886c.p3887a.C50675k;
import com.google.assistant.p3886c.p3887a.C50676l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C106482w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50675k f296972a;

    public /* synthetic */ C106482w(C50675k kVar) {
        this.f296972a = kVar;
    }

    public final void accept(Object obj) {
        C50675k kVar = this.f296972a;
        kVar.copyOnWrite();
        C50676l lVar = (C50676l) kVar.instance;
        C50676l lVar2 = C50676l.f131826h;
        lVar.f131831d = ((C49794h) obj).f128629T;
        lVar.f131828a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

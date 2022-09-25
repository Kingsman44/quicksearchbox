package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r */
/* compiled from: PG */
public final /* synthetic */ class C110914r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50728m f308970a;

    public /* synthetic */ C110914r(C50728m mVar) {
        this.f308970a = mVar;
    }

    public final void accept(Object obj) {
        C50728m mVar = this.f308970a;
        String str = (String) obj;
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        C50729n nVar2 = C50729n.f132007g;
        str.getClass();
        nVar.f132009a |= 4;
        nVar.f132011c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

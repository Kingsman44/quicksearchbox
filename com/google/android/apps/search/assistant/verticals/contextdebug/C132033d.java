package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.google.android.libraries.web.base.C43259j;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.d */
/* compiled from: PG */
public final /* synthetic */ class C132033d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43259j f360394a;

    public /* synthetic */ C132033d(C43259j jVar) {
        this.f360394a = jVar;
    }

    public final void accept(Object obj) {
        C43259j jVar = this.f360394a;
        C50540h hVar = (C50540h) obj;
        if ((hVar.f131537a & 4) != 0) {
            jVar.mo46375e(hVar.f131543g);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

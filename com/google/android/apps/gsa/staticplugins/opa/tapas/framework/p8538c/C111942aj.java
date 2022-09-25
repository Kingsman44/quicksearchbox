package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a.C111914h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C111942aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f310982a;

    /* renamed from: b */
    public final /* synthetic */ String f310983b;

    /* renamed from: c */
    public final /* synthetic */ String f310984c;

    public /* synthetic */ C111942aj(String str, String str2, String str3) {
        this.f310982a = str;
        this.f310983b = str2;
        this.f310984c = str3;
    }

    public final void accept(Object obj) {
        String str = this.f310982a;
        String str2 = this.f310983b;
        String str3 = this.f310984c;
        C111914h hVar = (C111914h) obj;
        C121537f fVar = C111943ak.f310986b;
        fVar.mo105239h("model_" + str + str2 + "_" + str3 + "_rank", (long) hVar.mo99283a());
        C121537f fVar2 = C111943ak.f310986b;
        int a = hVar.mo99283a();
        fVar2.mo105240i("model_" + str + str2 + "_" + str3 + "_rank_" + a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.gms.googlehelp.internal.common;

import com.google.android.apps.gsa.staticplugins.accl.performers.C92982ce;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.alr;
import com.google.assistant.p3897e.p3921j.als;

/* renamed from: com.google.android.gms.googlehelp.internal.common.n */
/* compiled from: PG */
final class C144319n extends C144305ak {

    /* renamed from: a */
    final /* synthetic */ C144320o f390866a;

    public C144319n(C144320o oVar) {
        this.f390866a = oVar;
    }

    /* renamed from: c */
    public final void mo119826c() {
        this.f390866a.f390868d.f59975a.mo87497a();
        this.f390866a.mo119110m(C144296ab.f390830a);
    }

    /* renamed from: d */
    public final void mo119827d(int i) {
        C92982ce ceVar = this.f390866a.f390868d.f59975a;
        alr alr = (alr) als.f135346c.createBuilder();
        alr.copyOnWrite();
        als als = (als) alr.instance;
        als.f135348a |= 1;
        als.f135349b = i;
        ceVar.f259375a.mo57356n(C22402a.m41821a("direct_support_request_result", "assistant.api.client_op.DirectSupportRequestResult", (als) alr.build()));
        this.f390866a.mo119112p(Status.f389615a);
    }
}

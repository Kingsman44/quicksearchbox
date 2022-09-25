package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.assistant.p3858ar.p3859a.C49736z;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.o */
/* compiled from: PG */
public final /* synthetic */ class C113462o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49736z f314168a;

    public /* synthetic */ C113462o(C49736z zVar) {
        this.f314168a = zVar;
    }

    public final void accept(Object obj) {
        ((C113388b) ((C68214a) obj).mo27525b()).mo99675j(this.f314168a.f128423b, C89849ae.TAPAS_STREAMING_SINK_S3_RESPONSE_NEXT);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

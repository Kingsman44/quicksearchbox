package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C113433b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ long f314097a;

    public /* synthetic */ C113433b(long j) {
        this.f314097a = j;
    }

    public final void accept(Object obj) {
        ((C113388b) ((C68214a) obj).mo27525b()).mo99675j(this.f314097a, C89849ae.TAPAS_STREAMING_CONNECT_S3_FAILED);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

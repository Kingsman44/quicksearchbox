package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b.c */
/* compiled from: PG */
public final /* synthetic */ class C107883c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ long f300185a;

    public /* synthetic */ C107883c(long j) {
        this.f300185a = j;
    }

    public final void accept(Object obj) {
        ((C113388b) ((C68214a) obj).mo27525b()).mo99675j(this.f300185a, C89849ae.TAPAS_STREAMING_CONNECT_S3_FAILED);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

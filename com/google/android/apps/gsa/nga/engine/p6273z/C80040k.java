package com.google.android.apps.gsa.nga.engine.p6273z;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.k */
/* compiled from: PG */
public final /* synthetic */ class C80040k implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C80040k f219633a = new C80040k();

    private /* synthetic */ C80040k() {
    }

    public final void accept(Object obj) {
        ((C60870cx) obj).cancel(true);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

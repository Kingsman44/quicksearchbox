package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.g.e */
/* compiled from: PG */
public final /* synthetic */ class C76894e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f212341a;

    public /* synthetic */ C76894e(Intent intent) {
        this.f212341a = intent;
    }

    public final void accept(Object obj) {
        this.f212341a.putExtra("title", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

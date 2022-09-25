package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.n */
/* compiled from: PG */
public final /* synthetic */ class C76970n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f212488a;

    public /* synthetic */ C76970n(Intent intent) {
        this.f212488a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f212488a;
        int intValue = ((Integer) obj).intValue();
        intent.putExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", intValue).putExtra("android.intent.extra.TIMER_DURATION_SECONDS", intValue);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

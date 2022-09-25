package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;
import android.os.Binder;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.i */
/* compiled from: PG */
final class C80953i extends Binder implements Consumer {

    /* renamed from: a */
    private final Consumer f221948a;

    public C80953i(Consumer consumer) {
        this.f221948a = consumer;
    }

    /* renamed from: a */
    public final void accept(Intent intent) {
        this.f221948a.accept(intent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

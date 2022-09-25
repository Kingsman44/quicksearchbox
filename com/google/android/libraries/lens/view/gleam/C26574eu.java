package com.google.android.libraries.lens.view.gleam;

import android.graphics.RectF;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.gleam.eu */
/* compiled from: PG */
public final /* synthetic */ class C26574eu implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ RectF f72434a;

    public /* synthetic */ C26574eu(RectF rectF) {
        this.f72434a = rectF;
    }

    public final void accept(Object obj) {
        this.f72434a.union((RectF) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

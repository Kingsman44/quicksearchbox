package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.p562ao.C10180d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.cf */
/* compiled from: PG */
public final /* synthetic */ class C9950cf implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34088a;

    public /* synthetic */ C9950cf(C9958cn cnVar) {
        this.f34088a = cnVar;
    }

    public final void accept(Object obj) {
        View view = (View) obj;
        this.f34088a.f34101a.addView(view);
        C10180d.m25050b(view);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

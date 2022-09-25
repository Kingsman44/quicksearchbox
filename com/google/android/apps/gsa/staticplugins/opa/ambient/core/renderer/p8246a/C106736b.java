package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8246a;

import android.view.View;
import android.widget.LinearLayout;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.a.b */
/* compiled from: PG */
public final /* synthetic */ class C106736b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f297458a;

    public /* synthetic */ C106736b(LinearLayout linearLayout) {
        this.f297458a = linearLayout;
    }

    public final void accept(Object obj) {
        this.f297458a.addView((View) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

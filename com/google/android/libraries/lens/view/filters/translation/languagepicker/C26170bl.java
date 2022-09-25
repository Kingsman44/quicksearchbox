package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.View;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bl */
/* compiled from: PG */
public final /* synthetic */ class C26170bl implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Consumer f71085a;

    /* renamed from: b */
    public final /* synthetic */ C26172bn f71086b;

    public /* synthetic */ C26170bl(Consumer consumer, C26172bn bnVar) {
        this.f71085a = consumer;
        this.f71086b = bnVar;
    }

    public final void onClick(View view) {
        this.f71085a.accept(this.f71086b);
    }
}

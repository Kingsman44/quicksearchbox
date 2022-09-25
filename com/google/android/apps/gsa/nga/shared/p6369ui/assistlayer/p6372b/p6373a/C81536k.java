package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.graphics.Typeface;
import android.widget.TextView;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C81536k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TextView f222982a;

    public /* synthetic */ C81536k(TextView textView) {
        this.f222982a = textView;
    }

    public final void accept(Object obj) {
        this.f222982a.setTypeface((Typeface) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.widget.TextView;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.v */
/* compiled from: PG */
public final /* synthetic */ class C81547v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Optional f222995a;

    public /* synthetic */ C81547v(Optional optional) {
        this.f222995a = optional;
    }

    public final void accept(Object obj) {
        Optional optional = this.f222995a;
        TextView textView = (TextView) obj;
        Objects.requireNonNull(textView);
        optional.ifPresent(new C81536k(textView));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.widget.LinearLayout;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.y */
/* compiled from: PG */
public final /* synthetic */ class C81550y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81525ae f223000a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f223001b;

    /* renamed from: c */
    public final /* synthetic */ int f223002c;

    public /* synthetic */ C81550y(C81525ae aeVar, int i, Supplier supplier) {
        this.f223000a = aeVar;
        this.f223002c = i;
        this.f223001b = supplier;
    }

    public final void accept(Object obj) {
        int i;
        C81525ae aeVar = this.f223000a;
        int i2 = this.f223002c;
        Supplier supplier = this.f223001b;
        LinearLayout linearLayout = (LinearLayout) obj;
        if (linearLayout.isEnabled()) {
            if (i2 == 0) {
                throw null;
            } else if (i2 != 5) {
                int i3 = i2 - 1;
                if (i3 == 0 || i3 == 1) {
                    i = 115813;
                } else if (i3 != 2) {
                    i = 145192;
                } else {
                    i = 121513;
                }
                Optional.ofNullable(i).ifPresent(new C81545t(aeVar, linearLayout, supplier));
                return;
            }
        }
        aeVar.f222951h.mo75434e(linearLayout);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.widget.LinearLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl.C82068aw;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.t */
/* compiled from: PG */
public final /* synthetic */ class C81545t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81525ae f222991a;

    /* renamed from: b */
    public final /* synthetic */ LinearLayout f222992b;

    /* renamed from: c */
    public final /* synthetic */ Supplier f222993c;

    public /* synthetic */ C81545t(C81525ae aeVar, LinearLayout linearLayout, Supplier supplier) {
        this.f222991a = aeVar;
        this.f222992b = linearLayout;
        this.f222993c = supplier;
    }

    public final void accept(Object obj) {
        C81525ae aeVar = this.f222991a;
        LinearLayout linearLayout = this.f222992b;
        Supplier supplier = this.f222993c;
        aeVar.f222951h.mo75435f(linearLayout, ((Integer) obj).intValue(), false);
        aeVar.f222951h.mo75431b(((C82068aw) supplier).f224303a.mo75492a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

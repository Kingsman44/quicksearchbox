package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a.C133978c;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ac */
/* compiled from: PG */
final class C134809ac implements Consumer {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f367052a;

    public C134809ac(ViewGroup viewGroup) {
        this.f367052a = viewGroup;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C133978c cVar = (C133978c) obj;
        C69664n.m101061g(cVar, "it");
        this.f367052a.addView(cVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

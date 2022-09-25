package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ab */
/* compiled from: PG */
final class C134808ab implements Consumer {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f367051a;

    public C134808ab(ViewGroup viewGroup) {
        this.f367051a = viewGroup;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C19622a aVar = (C19622a) obj;
        C69664n.m101061g(aVar, "it");
        this.f367051a.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

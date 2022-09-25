package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util;

import android.view.View;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.util.a */
/* compiled from: PG */
final class C129338a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ List f355225a;

    /* renamed from: b */
    final /* synthetic */ View.OnLayoutChangeListener f355226b;

    public C129338a(List list, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f355225a = list;
        this.f355226b = onLayoutChangeListener;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "v");
        view.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.f355225a.get(0));
        this.f355226b.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
    }
}

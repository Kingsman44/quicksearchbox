package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.shelf.b */
/* compiled from: PG */
final class C128641b extends FrameLayout {

    /* renamed from: a */
    private final int f353657a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128641b(Context context, int i) {
        super(context);
        C69664n.m101061g(context, "context");
        this.f353657a = i;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f353657a;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}

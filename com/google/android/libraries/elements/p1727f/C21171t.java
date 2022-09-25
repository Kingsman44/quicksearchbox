package com.google.android.libraries.elements.p1727f;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import com.facebook.litho.LithoView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.f.t */
/* compiled from: PG */
public final class C21171t implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final List f59388a = new ArrayList();

    /* renamed from: a */
    public static Paint m39760a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: b */
    public final void mo26202b() {
        for (Pair pair : this.f59388a) {
            LithoView lithoView = (LithoView) pair.first;
            lithoView.getOverlay().remove((Drawable) pair.second);
            lithoView.invalidate();
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        mo26202b();
    }
}

package com.google.android.libraries.lens.view.p2065ai;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.lens.view.ai.f */
/* compiled from: PG */
public final /* synthetic */ class C25168f implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f68567a;

    public /* synthetic */ C25168f(ImageView imageView) {
        this.f68567a = imageView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ImageView imageView = this.f68567a;
        int applyDimension = (int) TypedValue.applyDimension(1, 48.0f, imageView.getResources().getDisplayMetrics());
        Rect rect = new Rect();
        imageView.getHitRect(rect);
        if (rect.width() < applyDimension || rect.height() < applyDimension) {
            if (rect.width() < applyDimension) {
                rect.left = rect.centerX() - (applyDimension / 2);
                rect.right = rect.left + applyDimension;
            }
            if (rect.height() < applyDimension) {
                rect.top = rect.centerY() - (applyDimension / 2);
                rect.bottom = rect.top + applyDimension;
            }
            if (imageView.getParent() instanceof View) {
                ((View) imageView.getParent()).setTouchDelegate(new TouchDelegate(rect, imageView));
            }
        }
    }
}

package com.google.android.apps.search.googleapp.launcher.minusone;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.c */
/* compiled from: PG */
final class C136621c {
    /* renamed from: a */
    static void m222081a(View view, View view2) {
        Drawable background = view.getBackground();
        if (background != null) {
            Rect bounds = background.getBounds();
            int paddingLeft = view.getPaddingLeft() + view2.getLeft();
            int max = Math.max(-view.getContext().getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_feed_background_corner_radius), ((int) view2.getTranslationY()) + view2.getHeight());
            int width = view2.getWidth() + paddingLeft;
            int bottom = view.getBottom();
            if (bounds.left != paddingLeft || bounds.top != max || bounds.right != width || bounds.bottom != bottom) {
                background.setBounds(paddingLeft, max, width, bottom);
            }
        }
    }
}

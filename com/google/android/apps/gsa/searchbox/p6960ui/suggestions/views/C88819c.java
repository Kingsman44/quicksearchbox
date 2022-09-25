package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.c */
/* compiled from: PG */
public final class C88819c {
    /* renamed from: a */
    public static void m144204a(Context context, ImageView imageView, HorizontalScrollView horizontalScrollView, boolean z) {
        if (imageView != null) {
            imageView.animate().scaleY(1.0f).setDuration(300).start();
            imageView.setContentDescription(context.getResources().getString(R.string.accessibility_expand));
        }
        if (horizontalScrollView == null) {
            return;
        }
        if (z) {
            horizontalScrollView.animate().alpha(0.0f).setDuration(300).withEndAction(new C88789a(horizontalScrollView)).start();
        } else {
            horizontalScrollView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m144205b(Context context, ImageView imageView, HorizontalScrollView horizontalScrollView, boolean z) {
        if (imageView != null) {
            imageView.animate().scaleY(-1.0f).setDuration(300).start();
            imageView.setContentDescription(context.getResources().getString(R.string.accessibility_collapse));
        }
        if (horizontalScrollView == null) {
            return;
        }
        if (z) {
            horizontalScrollView.setAlpha(0.0f);
            horizontalScrollView.animate().alpha(1.0f).setDuration(300).withStartAction(new C88816b(horizontalScrollView)).start();
            return;
        }
        horizontalScrollView.setAlpha(1.0f);
        horizontalScrollView.setVisibility(0);
    }
}

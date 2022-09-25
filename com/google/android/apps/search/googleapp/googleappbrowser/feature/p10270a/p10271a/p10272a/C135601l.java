package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.l */
/* compiled from: PG */
final class C135601l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ NestedScrollView f369356a;

    /* renamed from: b */
    final /* synthetic */ TextView f369357b;

    /* renamed from: c */
    final /* synthetic */ Bitmap f369358c;

    public C135601l(NestedScrollView nestedScrollView, TextView textView, Bitmap bitmap) {
        this.f369356a = nestedScrollView;
        this.f369357b = textView;
        this.f369358c = bitmap;
    }

    public final void onGlobalLayout() {
        if (this.f369356a.canScrollVertically(1) || this.f369356a.canScrollVertically(-1)) {
            this.f369357b.setText(R.string.googleapp_browser_contextmenu_previewimage_scrolllabel);
            this.f369357b.setVisibility(0);
            return;
        }
        Bitmap bitmap = this.f369358c;
        NestedScrollView nestedScrollView = this.f369356a;
        double width = (double) nestedScrollView.getWidth();
        Double.isNaN(width);
        if (((double) bitmap.getWidth()) >= width * 0.7d) {
            double height = (double) bitmap.getHeight();
            double height2 = (double) nestedScrollView.getHeight();
            Double.isNaN(height2);
            if (height >= height2 * 0.7d) {
                this.f369357b.setVisibility(8);
                return;
            }
        }
        this.f369357b.setText(R.string.googleapp_browser_contextmenu_previewimage_smalllabel);
        this.f369357b.setVisibility(0);
    }
}

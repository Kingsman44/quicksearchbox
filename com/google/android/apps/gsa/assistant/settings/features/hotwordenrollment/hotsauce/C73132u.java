package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.hotsauce;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.hotsauce.u */
/* compiled from: PG */
final class C73132u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ TextView f193893a;

    /* renamed from: b */
    final /* synthetic */ TextView f193894b;

    /* renamed from: c */
    final /* synthetic */ v f193895c;

    public C73132u(v vVar, TextView textView, TextView textView2) {
        this.f193895c = vVar;
        this.f193893a = textView;
        this.f193894b = textView2;
    }

    public final void onGlobalLayout() {
        if (this.f193895c.i.getVisibility() == 0) {
            this.f193895c.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int dimensionPixelOffset = this.f193895c.getResources().getDimensionPixelOffset(R.dimen.hotsauce_seek_bar_padding_horizontal);
            int measuredWidth = dimensionPixelOffset - (this.f193893a.getMeasuredWidth() / 2);
            int measuredWidth2 = dimensionPixelOffset - (this.f193894b.getMeasuredWidth() / 2);
            if (this.f193895c.g.getLayoutDirection() == 1) {
                measuredWidth = -measuredWidth;
                measuredWidth2 = -measuredWidth2;
            }
            this.f193893a.setTranslationX((float) measuredWidth);
            this.f193894b.setTranslationX((float) (-measuredWidth2));
        }
    }
}

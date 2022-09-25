package com.google.android.apps.search.podcasts.widgets.thumbnail;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FontFitTextView extends AppCompatTextView {

    /* renamed from: a */
    public View f383557a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FontFitTextView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FontFitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: b */
    private final int m229313b(int i, int i2) {
        return (int) ((((float) i) * getContext().getResources().getDimension(i2)) / getContext().getResources().getDimension(R.dimen.podcasts_thumbnail_view_size));
    }

    /* renamed from: a */
    public final void mo116302a(int i) {
        int b = m229313b(i, R.dimen.podcasts_thumbnail_view_padding);
        setPadding(b, 0, b, 0);
        setTextSize(0, (float) m229313b(i, R.dimen.podcasts_thumbnail_title_text_size));
        View view = this.f383557a;
        if (view != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m229313b(i, R.dimen.podcasts_thumbnail_line_width), m229313b(i, R.dimen.podcasts_thumbnail_line_height));
            layoutParams.setMargins(b, b, b, 0);
            view.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        mo116302a(size);
        super.onMeasure(i, i2);
        setMeasuredDimension(size, getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo116302a(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C69664n.m101061g(charSequence, "text");
        mo116302a(getWidth());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFitTextView(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842884 : i);
    }
}

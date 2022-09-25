package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.FontFitTextView */
/* compiled from: PG */
public class FontFitTextView extends AppCompatTextView {

    /* renamed from: a */
    public View f320707a;

    public FontFitTextView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final int m191743b(int i, int i2) {
        return (int) ((((float) i) * getContext().getResources().getDimension(i2)) / getContext().getResources().getDimension(R.dimen.omp_thumbnail_view_size));
    }

    /* renamed from: a */
    public final void mo102124a(int i) {
        int b = m191743b(i, R.dimen.omp_thumbnail_view_padding);
        setPadding(b, 0, b, 0);
        setTextSize(0, (float) m191743b(i, R.dimen.omp_thumbnail_title_text_size));
        if (this.f320707a != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m191743b(i, R.dimen.omp_thumbnail_line_width), m191743b(i, R.dimen.omp_thumbnail_line_height));
            layoutParams.setMargins(b, b, b, 0);
            this.f320707a.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        mo102124a(size);
        super.onMeasure(i, i2);
        setMeasuredDimension(size, getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo102124a(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mo102124a(getWidth());
    }

    public FontFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

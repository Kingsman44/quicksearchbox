package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;

/* compiled from: PG */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f117107a;

    /* renamed from: b */
    public Button f117108b;

    /* renamed from: c */
    public final TimeInterpolator f117109c;

    /* renamed from: d */
    public int f117110d;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final boolean m79666a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f117107a.getPaddingTop() == i2 && this.f117107a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f117107a;
        if (C2043bi.m5572az(textView)) {
            C2043bi.m5556aj(textView, C2043bi.m5583l(textView), i2, C2043bi.m5582k(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f117107a = (TextView) findViewById(R.id.snackbar_text);
        this.f117108b = (Button) findViewById(R.id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f117107a.getLayout();
            boolean z = layout != null && layout.getLineCount() > 1;
            if (!z || this.f117110d <= 0 || this.f117108b.getMeasuredWidth() <= this.f117110d) {
                if (true != z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!m79666a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!m79666a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117109c = C44688a.m79217a(context, R.attr.motionEasingEmphasizedInterpolator, C44497b.f115651b);
    }
}

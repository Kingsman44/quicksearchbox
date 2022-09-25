package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.text.Layout;
import android.util.AttributeSet;

/* renamed from: android.support.v7.widget.DialogTitle */
/* compiled from: PG */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0338a.f1089y, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

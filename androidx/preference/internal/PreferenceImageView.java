package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.C3999ay;

/* compiled from: PG */
public class PreferenceImageView extends ImageView {

    /* renamed from: a */
    private int f12874a;

    /* renamed from: b */
    private int f12875b;

    public PreferenceImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int getMaxHeight() {
        return this.f12875b;
    }

    public final int getMaxWidth() {
        return this.f12874a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 == 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto L_0x000f
            if (r0 != 0) goto L_0x001f
            r0 = 0
        L_0x000f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r5 = r6.f12874a
            if (r5 == r2) goto L_0x001f
            if (r5 < r4) goto L_0x001b
            if (r0 != 0) goto L_0x001f
        L_0x001b:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
        L_0x001f:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == r3) goto L_0x0028
            if (r0 != 0) goto L_0x0039
            goto L_0x0029
        L_0x0028:
            r1 = r0
        L_0x0029:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r4 = r6.f12875b
            if (r4 == r2) goto L_0x0039
            if (r4 < r0) goto L_0x0035
            if (r1 != 0) goto L_0x0039
        L_0x0035:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
        L_0x0039:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.internal.PreferenceImageView.onMeasure(int, int):void");
    }

    public final void setMaxHeight(int i) {
        this.f12875b = i;
        super.setMaxHeight(i);
    }

    public final void setMaxWidth(int i) {
        this.f12874a = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12874a = Integer.MAX_VALUE;
        this.f12875b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12858j, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE);
        this.f12874a = dimensionPixelSize;
        super.setMaxWidth(dimensionPixelSize);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE);
        this.f12875b = dimensionPixelSize2;
        super.setMaxHeight(dimensionPixelSize2);
        obtainStyledAttributes.recycle();
    }
}

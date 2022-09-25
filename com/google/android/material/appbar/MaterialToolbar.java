package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44735bg;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.theme.p3518a.C44965a;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class MaterialToolbar extends Toolbar {

    /* renamed from: C */
    private static final ImageView.ScaleType[] f115725C = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: B */
    public Integer f115726B;

    /* renamed from: D */
    private boolean f115727D;

    /* renamed from: E */
    private boolean f115728E;

    /* renamed from: F */
    private ImageView.ScaleType f115729F;

    /* renamed from: G */
    private Boolean f115730G;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: F */
    private final Drawable m78678F(Drawable drawable) {
        if (drawable == null || this.f115726B == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C1929b.m5225f(mutate, this.f115726B.intValue());
        return mutate;
    }

    /* renamed from: G */
    private final void m78679G(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f115727D || this.f115728E) {
            List c = C44735bg.m79304c(this, this.f1957q);
            TextView textView2 = c.isEmpty() ? null : (TextView) Collections.min(c, C44735bg.f116598a);
            List c2 = C44735bg.m79304c(this, this.f1958r);
            if (c2.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.max(c2, C44735bg.f116598a);
            }
            if (!(textView2 == null && textView == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView2 || childAt == textView)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f115727D && textView2 != null) {
                    m78679G(textView2, pair);
                }
                if (this.f115728E && textView != null) {
                    m78679G(textView, pair);
                }
            }
        }
        ImageView imageView3 = this.f1943c;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f115730G;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f115729F;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    /* renamed from: s */
    public final void mo2418s(Drawable drawable) {
        super.mo2418s(m78678F(drawable));
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44780k.m79411b(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151839), attributeSet, i);
        Context context2 = getContext();
        int i2 = 0;
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44528x.f115776e, i, 2132151839, new int[0]);
        if (a.hasValue(2)) {
            this.f115726B = Integer.valueOf(a.getColor(2, -1));
            Drawable e = mo2391e();
            if (e != null) {
                super.mo2418s(m78678F(e));
            }
        }
        this.f115727D = a.getBoolean(4, false);
        this.f115728E = a.getBoolean(3, false);
        int i3 = a.getInt(1, -1);
        if (i3 >= 0 && i3 < 8) {
            this.f115729F = f115725C[i3];
        }
        if (a.hasValue(0)) {
            this.f115730G = Boolean.valueOf(a.getBoolean(0, false));
        }
        a.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C44779j jVar = new C44779j();
            jVar.mo48124V(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i2));
            jVar.mo48121S(context2);
            jVar.mo48123U(C2043bi.m5533a(this));
            C2043bi.m5530X(this, jVar);
        }
    }
}

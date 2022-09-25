package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.material.internal.C44741bm;

/* renamed from: com.google.android.material.tabs.k */
/* compiled from: PG */
final class C44908k extends LinearLayout {

    /* renamed from: a */
    ValueAnimator f117218a;

    /* renamed from: b */
    final /* synthetic */ TabLayout f117219b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44908k(TabLayout tabLayout, Context context) {
        super(context);
        this.f117219b = tabLayout;
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void mo48434a() {
        View childAt = getChildAt(this.f117219b.mo48401a());
        TabLayout tabLayout = this.f117219b;
        Drawable drawable = tabLayout.f117193k;
        RectF b = C44901d.m79712b(tabLayout, childAt);
        drawable.setBounds((int) b.left, drawable.getBounds().top, (int) b.right, drawable.getBounds().bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48435b(int i) {
        Rect bounds = this.f117219b.f117193k.getBounds();
        this.f117219b.f117193k.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* renamed from: c */
    public final void mo48436c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = this.f117219b.f117193k;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.f117219b.f117193k.getBounds().bottom);
        } else {
            TabLayout tabLayout = this.f117219b;
            tabLayout.f117207y.mo48429a(tabLayout, view, view2, f, tabLayout.f117193k);
        }
        C2043bi.m5519M(this);
    }

    /* renamed from: d */
    public final void mo48437d(boolean z, int i, int i2) {
        View childAt = getChildAt(this.f117219b.mo48401a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            mo48434a();
            return;
        }
        C44907j jVar = new C44907j(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f117218a = valueAnimator;
            valueAnimator.setInterpolator(this.f117219b.f117208z);
            valueAnimator.setDuration((long) i2);
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.addUpdateListener(jVar);
            valueAnimator.start();
            return;
        }
        this.f117218a.removeAllUpdateListeners();
        this.f117218a.addUpdateListener(jVar);
    }

    public final void draw(Canvas canvas) {
        int i;
        int height = this.f117219b.f117193k.getBounds().height();
        if (height < 0) {
            height = this.f117219b.f117193k.getIntrinsicHeight();
        }
        int i2 = this.f117219b.f117201s;
        if (i2 == 0) {
            i = getHeight() - height;
            height = getHeight();
        } else if (i2 != 1) {
            i = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
        } else {
            i = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        }
        if (this.f117219b.f117193k.getBounds().width() > 0) {
            Rect bounds = this.f117219b.f117193k.getBounds();
            this.f117219b.f117193k.setBounds(bounds.left, i, bounds.right, height);
            this.f117219b.f117193k.draw(canvas);
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f117218a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            mo48434a();
        } else {
            mo48437d(false, this.f117219b.mo48401a(), -1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.f117219b;
            if (tabLayout.f117199q == 1 || tabLayout.f117202t == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    int a = (int) C44741bm.m79308a(getContext(), 16);
                    if (i3 * childCount <= getMeasuredWidth() - (a + a)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        TabLayout tabLayout2 = this.f117219b;
                        tabLayout2.f117199q = 0;
                        tabLayout2.mo48417l(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}

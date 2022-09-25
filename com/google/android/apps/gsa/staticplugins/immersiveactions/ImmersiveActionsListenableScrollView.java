package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImmersiveActionsListenableScrollView extends ScrollView {

    /* renamed from: a */
    public boolean f285746a;

    /* renamed from: b */
    public C102455z f285747b;

    /* renamed from: c */
    private boolean f285748c;

    /* renamed from: d */
    private VelocityTracker f285749d;

    /* renamed from: e */
    private ImmersiveActionsMinHeightLayout f285750e;

    public ImmersiveActionsListenableScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo93192a() {
        return getResources().getDimensionPixelSize(R.dimen.gsa_immersive_actions_header_height) - getResources().getDimensionPixelSize(R.dimen.immersive_actions_collapsing_header_height);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ImmersiveActionsMinHeightLayout immersiveActionsMinHeightLayout = (ImmersiveActionsMinHeightLayout) findViewById(R.id.immersive_actions_arguments_layout);
        immersiveActionsMinHeightLayout.getClass();
        this.f285750e = immersiveActionsMinHeightLayout;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f285746a) {
            setScrollY(0);
            this.f285746a = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if ((getScrollY() == 0 || i2 >= mo93192a()) && i2 >= getScrollY()) {
            int a = this.f285750e.mo93199a() - getScrollY();
            int height = getHeight();
            if (a < height) {
                i2 = getScrollY();
            } else if (a - height < i2 - getScrollY()) {
                i2 = (getScrollY() + a) - height;
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f285748c = true;
        C102395ab abVar = this.f285747b.f285931a;
        int i5 = abVar.f285786i;
        if (i5 == 1 || i5 == 9) {
            abVar.f285782e.mo93189h(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f285749d == null) {
            this.f285749d = VelocityTracker.obtain();
        }
        this.f285749d.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f285748c) {
            this.f285748c = false;
            VelocityTracker velocityTracker = this.f285749d;
            velocityTracker.getClass();
            velocityTracker.computeCurrentVelocity(1000);
            float yVelocity = velocityTracker.getYVelocity();
            velocityTracker.recycle();
            this.f285749d = null;
            C102455z zVar = this.f285747b;
            C102395ab abVar = zVar.f285931a;
            if (!abVar.f285782e.f285736h && ((i = abVar.f285786i) == 1 || i == 9)) {
                int scaledMinimumFlingVelocity = ViewConfiguration.get(abVar.f285785h).getScaledMinimumFlingVelocity();
                int i2 = zVar.f285931a.f285782e.getLayoutParams().height;
                if (yVelocity > ((float) scaledMinimumFlingVelocity)) {
                    ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView = zVar.f285931a.f285780c;
                    immersiveActionsListenableScrollView.smoothScrollTo(immersiveActionsListenableScrollView.getScrollX(), 0);
                } else if (yVelocity < ((float) (-scaledMinimumFlingVelocity))) {
                    C102395ab abVar2 = zVar.f285931a;
                    if (i2 > abVar2.f285778a) {
                        ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView2 = abVar2.f285780c;
                        int scrollX = immersiveActionsListenableScrollView2.getScrollX();
                        C102395ab abVar3 = zVar.f285931a;
                        immersiveActionsListenableScrollView2.smoothScrollTo(scrollX, abVar3.f285779b - abVar3.f285778a);
                    }
                } else {
                    C102395ab abVar4 = zVar.f285931a;
                    int i3 = abVar4.f285778a;
                    if (i2 - i3 > abVar4.f285779b - i2) {
                        ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView3 = abVar4.f285780c;
                        immersiveActionsListenableScrollView3.smoothScrollTo(immersiveActionsListenableScrollView3.getScrollX(), 0);
                    } else if (i2 > i3) {
                        ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView4 = abVar4.f285780c;
                        int scrollX2 = immersiveActionsListenableScrollView4.getScrollX();
                        C102395ab abVar5 = zVar.f285931a;
                        immersiveActionsListenableScrollView4.smoothScrollTo(scrollX2, abVar5.f285779b - abVar5.f285778a);
                    }
                }
            }
        }
        return onTouchEvent;
    }

    public final void scrollTo(int i, int i2) {
        int a = mo93192a();
        if (i2 <= 0 || i2 >= a || C102416f.m169821g()) {
            super.scrollTo(i, i2);
        } else {
            super.scrollTo(i, a);
        }
    }

    public ImmersiveActionsListenableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImmersiveActionsListenableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

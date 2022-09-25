package com.google.android.libraries.lens.view.gallery;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.view.gallery.C26299ac;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* compiled from: PG */
public final class GalleryFrameLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f71455a = true;

    /* renamed from: b */
    public boolean f71456b;

    /* renamed from: c */
    public RecyclerView f71457c;

    /* renamed from: d */
    public C26312am f71458d;

    /* renamed from: e */
    private final ValueAnimator f71459e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: f */
    private VelocityTracker f71460f;

    /* renamed from: g */
    private float f71461g;

    /* renamed from: h */
    private float f71462h;

    public GalleryFrameLayout(Context context) {
        super(context);
    }

    public GalleryFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!(!this.f71455a || this.f71457c == null || this.f71458d == null)) {
            if (!this.f71459e.isStarted()) {
                if (this.f71460f == null) {
                    this.f71460f = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.f71460f;
                velocityTracker.getClass();
                if (motionEvent.getActionMasked() == 0) {
                    velocityTracker.clear();
                }
                velocityTracker.addMovement(motionEvent);
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                int actionMasked = motionEvent.getActionMasked();
                float y = motionEvent.getY();
                if (actionMasked == 0) {
                    this.f71461g = y;
                } else if (actionMasked == 1) {
                    VelocityTracker velocityTracker2 = this.f71460f;
                    if (velocityTracker2 == null) {
                        f = 0.0f;
                    } else {
                        velocityTracker2.computeCurrentVelocity(1000);
                        f = velocityTracker2.getYVelocity();
                        velocityTracker2.recycle();
                        this.f71460f = null;
                    }
                    boolean z = this.f71456b;
                    this.f71456b = false;
                    if (z) {
                        float f2 = y - this.f71462h;
                        if (f >= ((float) viewConfiguration.getScaledMinimumFlingVelocity())) {
                            C26312am amVar = this.f71458d;
                            amVar.getClass();
                            C26299ac acVar = (C26299ac) amVar;
                            C28443m mVar = acVar.f71498f;
                            C28442l a = C28442l.m53138d().mo33894a();
                            View view = acVar.f71472D;
                            view.getClass();
                            mVar.mo33853c(a, C28485y.m53234a(view));
                            C47393f.m84236g(new C26299ac.C26302c(f), acVar.f71495c);
                        } else if (f2 > ((float) getHeight()) * 0.2f) {
                            C26312am amVar2 = this.f71458d;
                            amVar2.getClass();
                            C26299ac acVar2 = (C26299ac) amVar2;
                            C28443m mVar2 = acVar2.f71498f;
                            C28442l a2 = C28442l.m53138d().mo33894a();
                            View view2 = acVar2.f71472D;
                            view2.getClass();
                            mVar2.mo33853c(a2, C28485y.m53234a(view2));
                            C47393f.m84236g(new C26299ac.C26302c(0.0f), acVar2.f71495c);
                        } else {
                            this.f71459e.setDuration(300);
                            this.f71459e.addUpdateListener(new C26311al(this, f2));
                            this.f71459e.start();
                        }
                    }
                } else if (actionMasked == 2) {
                    if (!this.f71456b) {
                        int computeVerticalScrollOffset = this.f71457c.computeVerticalScrollOffset();
                        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        if (computeVerticalScrollOffset <= 0 && y >= this.f71461g + ((float) scaledTouchSlop)) {
                            this.f71456b = true;
                            this.f71462h = y;
                        }
                    } else {
                        float f3 = y - this.f71462h;
                        if (f3 >= 0.0f) {
                            C26299ac acVar3 = (C26299ac) this.f71458d;
                            acVar3.mo31507g(f3, (float) acVar3.mo31501a());
                        }
                    }
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}

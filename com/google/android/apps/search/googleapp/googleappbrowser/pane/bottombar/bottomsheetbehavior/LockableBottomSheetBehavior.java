package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* compiled from: PG */
public final class LockableBottomSheetBehavior extends BottomSheetBehavior {

    /* renamed from: O */
    private static final Duration f370621O = Duration.ofMillis(400);

    /* renamed from: P */
    private final GestureDetector f370622P;

    /* renamed from: a */
    public boolean f370623a;

    /* renamed from: b */
    public boolean f370624b;

    /* renamed from: c */
    public int f370625c;

    /* renamed from: d */
    public boolean f370626d;

    public LockableBottomSheetBehavior(Context context, Function function) {
        super(context, (AttributeSet) null);
        this.f370622P = new GestureDetector(context, new C136084b(this, function));
    }

    /* renamed from: P */
    private static boolean m221088P(float f) {
        return f > 0.0f && f < 1.0f;
    }

    /* renamed from: s */
    public static LockableBottomSheetBehavior m221089s(Context context, boolean z, boolean z2, Function function) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottomBarHeight);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottomBarDragHandleHeight);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottomBarElevation);
        LockableBottomSheetBehavior lockableBottomSheetBehavior = new LockableBottomSheetBehavior(context, function);
        lockableBottomSheetBehavior.mo47516N(dimensionPixelOffset + dimensionPixelOffset2 + dimensionPixelOffset3);
        lockableBottomSheetBehavior.f115859B = z;
        lockableBottomSheetBehavior.mo47510H(false);
        lockableBottomSheetBehavior.mo47509G(context.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottomBarExpandedOffset));
        lockableBottomSheetBehavior.mo47519v(true != z ? 4 : 5);
        lockableBottomSheetBehavior.f370623a = z2;
        return lockableBottomSheetBehavior;
    }

    /* renamed from: f */
    public final boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f370623a || this.f370624b) {
            return false;
        }
        if (this.f370622P.onTouchEvent(motionEvent) || super.mo4958f(coordinatorLayout, view, motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getHeight() > 0) {
            int i2 = this.f370625c;
            float height = (float) coordinatorLayout.getHeight();
            boolean z = false;
            C58838bb.m90869d(i2 >= 0, "halfExpandedPixelHeight < 0");
            if (height > 0.0f) {
                z = true;
            }
            C58838bb.m90869d(z, "availablePixelHeight <= 0");
            this.f370625c = i2;
            float z2 = (height - ((float) mo47523z())) / height;
            float f = 0.8f;
            if (m221088P(z2)) {
                f = Math.min(z2, 0.8f);
            }
            float A = ((float) mo47504A()) / height;
            float f2 = 0.1f;
            if (m221088P(A)) {
                f2 = Math.max(A, 0.1f);
            }
            mo47511I(Math.max(f2, Math.min(((float) i2) / height, f)));
            super.mo4959g(coordinatorLayout, view, i);
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo4960h(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (this.f370623a || this.f370624b) {
            return false;
        }
        return super.mo4960h(coordinatorLayout, view, view2, f, f2);
    }

    /* renamed from: j */
    public final boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (this.f370623a || this.f370624b) {
            return false;
        }
        return super.mo4962j(coordinatorLayout, view, view2, view3, i, i2);
    }

    /* renamed from: k */
    public final boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f370623a || this.f370624b) {
            return false;
        }
        return super.mo4963k(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo112745t(int i) {
        if (i != this.f115862E) {
            if (i == 5) {
                this.f115859B = true;
                i = 5;
            }
            super.mo47519v(i);
        }
    }

    /* renamed from: u */
    public final void mo47518u(boolean z) {
        this.f115859B = z;
    }

    /* renamed from: v */
    public final void mo47519v(int i) {
        C19559g.m37302a().post(C47810es.m84977q(new C136083a(this, i)));
    }

    /* renamed from: w */
    public final boolean mo47520w(long j, float f) {
        return Duration.ofMillis(j).compareTo(f370621O) > 0 || f < 0.55f;
    }

    /* renamed from: x */
    public final boolean mo47521x() {
        return this.f115863F != 6;
    }

    /* renamed from: y */
    public final boolean mo47522y() {
        return false;
    }
}

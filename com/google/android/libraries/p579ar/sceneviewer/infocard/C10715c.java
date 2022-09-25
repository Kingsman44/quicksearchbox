package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.c */
/* compiled from: PG */
final class C10715c implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ BottomViewGroup f35638a;

    /* renamed from: b */
    private float f35639b;

    /* renamed from: c */
    private float f35640c;

    /* renamed from: d */
    private float f35641d;

    /* renamed from: e */
    private float f35642e;

    /* renamed from: f */
    private float f35643f;

    /* renamed from: g */
    private float f35644g;

    public C10715c(BottomViewGroup bottomViewGroup) {
        this.f35638a = bottomViewGroup;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimator;
        if (!this.f35638a.cardWebViewEnabled || !this.f35638a.draggingEnabled) {
            return false;
        }
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            this.f35639b = this.f35638a.getY() - motionEvent.getRawY();
            this.f35640c = (float) this.f35638a.getTop();
            this.f35641d = (float) this.f35638a.getCollapsedYValue();
            float y = this.f35638a.getY();
            this.f35642e = y;
            this.f35643f = y;
            this.f35644g = y;
            this.f35638a.isDragging = true;
        } else if (action != 1) {
            if (action == 2) {
                this.f35644g = this.f35643f;
                this.f35643f = this.f35642e;
                this.f35642e = this.f35638a.getY();
                this.f35638a.setY(Math.min(Math.max(this.f35639b + motionEvent.getRawY(), this.f35640c), this.f35641d));
            }
        } else if (this.f35638a.isDragging) {
            int dpToPx = ViewUtilities.dpToPx(this.f35638a.getContext(), 70);
            float y2 = this.f35638a.getY();
            this.f35642e = y2;
            float f = y2 - this.f35644g;
            if (f > 150.0f) {
                viewPropertyAnimator = this.f35638a.animate().y(this.f35641d).setDuration((long) Math.abs(((this.f35641d - this.f35642e) / f) * 33.33f));
                this.f35638a.visibilityState = Types.Visibility.COLLAPSED;
            } else if (f < -150.0f) {
                viewPropertyAnimator = this.f35638a.animate().y(this.f35640c).setDuration((long) Math.abs(((this.f35640c - this.f35642e) / f) * 33.33f));
                this.f35638a.visibilityState = Types.Visibility.EXPANDED;
            } else {
                float f2 = (float) dpToPx;
                if (y2 - this.f35640c < f2) {
                    viewPropertyAnimator = this.f35638a.animate().y(this.f35640c).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(300);
                    this.f35638a.visibilityState = Types.Visibility.EXPANDED;
                } else if (this.f35641d - y2 < f2) {
                    viewPropertyAnimator = this.f35638a.animate().y(this.f35641d).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(300);
                    this.f35638a.visibilityState = Types.Visibility.COLLAPSED;
                } else {
                    BottomViewGroup bottomViewGroup = this.f35638a;
                    bottomViewGroup.visibilityState = bottomViewGroup.getStateFromYPos(bottomViewGroup.getY());
                    viewPropertyAnimator = null;
                }
            }
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.setUpdateListener(this.f35638a.animatorUpdateListener).start();
            }
            if (this.f35638a.stateChangeListener != null) {
                this.f35638a.stateChangeListener.onVisibilityStateChanged(this.f35638a.visibilityState);
            }
            this.f35638a.isDragging = false;
        }
        this.f35638a.onUpdatePosition();
        return true;
    }
}

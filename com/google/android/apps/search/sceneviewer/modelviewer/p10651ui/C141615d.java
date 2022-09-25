package com.google.android.apps.search.sceneviewer.modelviewer.p10651ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ui.d */
/* compiled from: PG */
final class C141615d implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ PlacementHelpOverlay f384410a;

    /* renamed from: b */
    private float f384411b;

    /* renamed from: c */
    private float f384412c;

    /* renamed from: d */
    private float f384413d;

    /* renamed from: e */
    private float f384414e;

    /* renamed from: f */
    private float f384415f;

    /* renamed from: g */
    private float f384416g;

    public C141615d(PlacementHelpOverlay placementHelpOverlay) {
        this.f384410a = placementHelpOverlay;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimator;
        PlacementHelpOverlay placementHelpOverlay;
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            this.f384411b = this.f384410a.getY() - motionEvent.getRawY();
            float top = (float) this.f384410a.getTop();
            this.f384412c = top;
            this.f384413d = top + ((float) this.f384410a.getHeight());
            float y = this.f384410a.getY();
            this.f384414e = y;
            this.f384415f = y;
            this.f384416g = y;
            this.f384410a.f384405e = true;
        } else if (action == 1) {
            PlacementHelpOverlay placementHelpOverlay2 = this.f384410a;
            if (placementHelpOverlay2.f384405e) {
                int dpToPx = ViewUtilities.dpToPx(placementHelpOverlay2.getContext(), 50);
                float y2 = this.f384410a.getY();
                this.f384414e = y2;
                float f = y2 - this.f384416g;
                if (f > 150.0f) {
                    PlacementHelpOverlay placementHelpOverlay3 = this.f384410a;
                    placementHelpOverlay3.f384403c = placementHelpOverlay3.animate().y(this.f384413d).setDuration((long) Math.abs(((this.f384413d - this.f384414e) / f) * ((float) PlacementHelpOverlay.f384402b.toMillis())));
                } else if (f < -150.0f) {
                    PlacementHelpOverlay placementHelpOverlay4 = this.f384410a;
                    placementHelpOverlay4.f384403c = placementHelpOverlay4.animate().y(this.f384412c).setDuration((long) Math.abs(((this.f384412c - this.f384414e) / f) * ((float) PlacementHelpOverlay.f384402b.toMillis())));
                } else {
                    float f2 = (float) dpToPx;
                    if (y2 - this.f384412c < f2) {
                        PlacementHelpOverlay placementHelpOverlay5 = this.f384410a;
                        placementHelpOverlay5.f384403c = placementHelpOverlay5.animate().y(this.f384412c).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(PlacementHelpOverlay.f384401a.toMillis());
                    } else {
                        if (this.f384413d - y2 < f2) {
                            placementHelpOverlay = this.f384410a;
                            viewPropertyAnimator = placementHelpOverlay.animate().y(this.f384413d).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(PlacementHelpOverlay.f384401a.toMillis());
                        } else {
                            placementHelpOverlay = this.f384410a;
                            viewPropertyAnimator = null;
                        }
                        placementHelpOverlay.f384403c = viewPropertyAnimator;
                    }
                }
                this.f384410a.f384405e = false;
            }
        } else if (action == 2) {
            this.f384416g = this.f384415f;
            this.f384415f = this.f384414e;
            this.f384414e = this.f384410a.getY();
            this.f384410a.setY(Math.min(Math.max(this.f384411b + motionEvent.getRawY(), this.f384412c), this.f384413d));
        }
        return true;
    }
}

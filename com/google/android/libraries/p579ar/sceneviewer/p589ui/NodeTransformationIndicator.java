package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.NodeTransformationIndicator */
/* compiled from: PG */
public final class NodeTransformationIndicator extends AppCompatTextView {
    private static final int HIDE_INDICATOR_TIMEOUT_MS = 1000;
    private static final double ROTATION_DELTA_THRESHOLD = 0.005d;
    private static final double SCALE_DELTA_THRESHOLD = 0.005d;
    private Runnable fadeRunnable;
    private Handler foregroundHandler;
    private double nodeRotation;
    private boolean nodeRotationInitialized;
    private double nodeScale;
    private boolean nodeScaleInitialized;
    private Point screenLimits;
    private boolean showRotationTransformations;
    private boolean showScaleTransformations;

    public NodeTransformationIndicator(Context context) {
        super(context);
        initialize();
    }

    private float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f2, f), f3);
    }

    private void initialize() {
        this.foregroundHandler = new Handler(Looper.getMainLooper());
        this.fadeRunnable = new NodeTransformationIndicator$$ExternalSyntheticLambda0(this);
        this.showScaleTransformations = true;
        this.showRotationTransformations = true;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            this.screenLimits = new Point();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = this.screenLimits;
            point.getClass();
            defaultDisplay.getSize(point);
        }
    }

    private void updateText(String str) {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        setText(str);
        this.foregroundHandler.removeCallbacks(this.fadeRunnable);
        this.foregroundHandler.postDelayed(this.fadeRunnable, 1000);
    }

    /* renamed from: lambda$initialize$0$com-google-android-libraries-ar-sceneviewer-ui-NodeTransformationIndicator */
    public /* synthetic */ void mo19196x795647() {
        setVisibility(8);
    }

    public void showRotationTransformations(boolean z) {
        this.showRotationTransformations = z;
    }

    public void showScaleTransformations(boolean z) {
        this.showScaleTransformations = z;
    }

    public void update(float f, float f2, float f3, double d) {
        Point point = this.screenLimits;
        if (point != null) {
            float width = ((float) getWidth()) / 2.0f;
            float height = ((float) getHeight()) / 2.0f;
            f = clamp(f, width, ((float) point.x) - width);
            f2 = clamp(f2, height, ((float) point.y) - height);
        }
        setX(f - (((float) getWidth()) / 2.0f));
        setY(f2 - (((float) getHeight()) / 2.0f));
        if (this.showScaleTransformations) {
            double d2 = (double) f3;
            double d3 = this.nodeScale;
            Double.isNaN(d2);
            if (Math.abs(d2 - d3) > 0.005d) {
                this.nodeScale = d2;
                if (this.nodeScaleInitialized) {
                    Double.isNaN(d2);
                    double rint = Math.rint(d2 * 100.0d);
                    updateText(((int) rint) + "%");
                    return;
                }
                this.nodeScaleInitialized = true;
                return;
            }
        }
        if (this.showRotationTransformations && Math.abs(d - this.nodeRotation) > 0.005d) {
            this.nodeRotation = d;
            if (this.nodeRotationInitialized) {
                updateText(((int) (d * 100.0d)) + "%");
                return;
            }
            this.nodeRotationInitialized = true;
        }
    }

    public NodeTransformationIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public NodeTransformationIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize();
    }
}

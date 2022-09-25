package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.ShutterButton */
/* compiled from: PG */
public final class ShutterButton extends AppCompatImageButton {
    private static final int VIDEO_PROGRESS_STROKE_COLOR = -65536;
    private static final int VIDEO_PROGRESS_STROKE_WIDTH_DP = 6;
    private boolean hasSeenPopupOrRecordedVideo = false;
    private Paint paint;
    private boolean popupEnabled = true;
    private View shutterButtonPopup;
    private int strokeWidthPx = 0;
    private float videoRecordingProgress = 0.0f;

    public ShutterButton(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        int i = (int) (context.getResources().getDisplayMetrics().density * 6.0f);
        this.strokeWidthPx = i;
        this.paint.setStrokeWidth((float) i);
        this.paint.setColor(VIDEO_PROGRESS_STROKE_COLOR);
    }

    public boolean isPopupVisible() {
        View view = this.shutterButtonPopup;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: lambda$setPopup$0$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButton */
    public /* synthetic */ void mo18933x57e0d28d(View view) {
        hidePopup();
    }

    /* renamed from: lambda$shrinkAndExpand$1$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButton */
    public /* synthetic */ void mo18934x96a41f52(Duration duration) {
        animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(duration.toMillis()).start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.videoRecordingProgress > 0.0f) {
            float f = (float) (this.strokeWidthPx / 2);
            canvas.drawArc(new RectF(f, f, (float) (getWidth() - (this.strokeWidthPx / 2)), (float) (getHeight() - (this.strokeWidthPx / 2))), -90.0f, this.videoRecordingProgress * 360.0f, false, this.paint);
        }
    }

    public void scale(float f, long j) {
        animate().cancel();
        animate().scaleX(f).scaleY(f).setDuration(j).start();
    }

    public void setPopup(View view) {
        view.setOnClickListener(new ShutterButton$$ExternalSyntheticLambda0(this));
        this.shutterButtonPopup = view;
    }

    public void setPopupEnabled(boolean z) {
        this.popupEnabled = z;
        if (!z && this.shutterButtonPopup.getVisibility() == 0) {
            hidePopup();
        }
    }

    public void setVisibility(int i) {
        View view;
        super.setVisibility(i);
        if (i != 0 && (view = this.shutterButtonPopup) != null) {
            view.setVisibility(4);
        }
    }

    public void shrinkAndExpand(float f, Duration duration, Duration duration2) {
        animate().cancel();
        animate().scaleX(f).scaleY(f).setDuration(duration.toMillis()).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new ShutterButton$$ExternalSyntheticLambda1(this, duration2)).start();
    }

    public void updateVideoRecordingProgress(float f) {
        this.videoRecordingProgress = f;
        invalidate();
    }

    public void hidePopup() {
        View view = this.shutterButtonPopup;
        view.getClass();
        view.setVisibility(8);
        this.hasSeenPopupOrRecordedVideo = true;
    }

    public void maybeShowPopup() {
        if (!this.hasSeenPopupOrRecordedVideo && this.popupEnabled) {
            View view = this.shutterButtonPopup;
            view.getClass();
            view.setVisibility(0);
        }
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public ShutterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }
}

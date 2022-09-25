package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.GalleryButtonController;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.lang.ref.WeakReference;
import org.chromium.net.PrivateKeyType;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.ShutterButtonController */
/* compiled from: PG */
public final class ShutterButtonController {
    private static final long ANIMATION_DURATION_MS = 100;
    private static final float EXPANDED_SCALE = 1.125f;
    private static final long MAX_VIDEO_DURATION_MILLISECONDS = 30000;
    private static final int SNAPSHOT_FLASH_FADE_IN_DURATION_MS = 250;
    private static final int SNAPSHOT_FLASH_FADE_OUT_DURATION_MS = 50;
    private static final Duration SNAPSHOT_FLASH_SCALE_DOWN_DURATION = Duration.ofMillis(50);
    private static final Duration SNAPSHOT_FLASH_SCALE_UP_DURATION = Duration.ofMillis(150);
    private static final float SNAPSHOT_FLASH_TARGET_ALPHA = 0.8f;
    private static final float SNAPSHOT_FLASH_TARGET_SCALE = 0.75f;
    private static final float VIDEO_CAPTURE_SCALE = 1.5625f;
    /* access modifiers changed from: private */
    public static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.capture.ShutterButtonController");
    private final C10725b captureFinishedListener;
    private final ContentResolver contentResolver;
    private final Context context;
    private boolean isRecordingVideo = false;
    private boolean isShutterButtonVisible;
    private final ModelViewer modelViewer;
    private final ShutterButton shutterButton;
    private final View shutterButtonPopup;
    private final ImageView snapshotOverlay;
    private final ValueAnimator videoProgressAnimator;
    private final VideoRecorder videoRecorder;
    private final Listener videoRecordingListener;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.ShutterButtonController$Listener */
    /* compiled from: PG */
    public interface Listener {
        void onStartVideoRecording();

        void onStopVideoRecording();
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.ShutterButtonController$RecordingListener */
    /* compiled from: PG */
    public interface RecordingListener {
        boolean isRecording();

        boolean startRecording();

        void stopRecording();
    }

    public ShutterButtonController(Activity activity, ModelViewer modelViewer2, SurfaceMirrorer surfaceMirrorer, ViewGroup viewGroup, GalleryButtonController galleryButtonController, Listener listener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.videoProgressAnimator = ofFloat;
        this.contentResolver = activity.getContentResolver();
        this.context = viewGroup.getContext();
        this.modelViewer = modelViewer2;
        this.videoRecordingListener = listener;
        LayoutInflater.from(activity).inflate(C10721R.layout.shutter_button, viewGroup);
        ShutterButton shutterButton2 = (ShutterButton) viewGroup.findViewById(C10721R.C10723id.photo_shutter_button);
        this.shutterButton = shutterButton2;
        shutterButton2.setOnClickListener(new ShutterButtonController$$ExternalSyntheticLambda2(this));
        shutterButton2.setOnLongClickListener(new ShutterButtonController$$ExternalSyntheticLambda3(this));
        shutterButton2.setOnTouchListener(new ShutterButtonController$$ExternalSyntheticLambda4(this));
        LayoutInflater.from(activity).inflate(C10721R.layout.shutter_button_popup, viewGroup);
        View findViewById = viewGroup.findViewById(C10721R.C10723id.photo_shutter_button_popup);
        this.shutterButtonPopup = findViewById;
        shutterButton2.setPopup(findViewById);
        alignPopupToButton();
        LayoutInflater.from(activity).inflate(C10721R.layout.snapshot_overlay, viewGroup);
        this.snapshotOverlay = (ImageView) viewGroup.findViewById(C10721R.C10723id.snapshot_overlay);
        C10725b bVar = new C10725b(new WeakReference(activity), galleryButtonController);
        this.captureFinishedListener = bVar;
        VideoRecorder videoRecorder2 = new VideoRecorder(activity.getApplicationContext(), bVar);
        this.videoRecorder = videoRecorder2;
        videoRecorder2.setVideoQuality(6, activity.getResources().getConfiguration().orientation);
        videoRecorder2.setMirrorer(surfaceMirrorer);
        ofFloat.setDuration(MAX_VIDEO_DURATION_MILLISECONDS);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ShutterButtonController$$ExternalSyntheticLambda5(this));
        ofFloat.addListener(new C10724a(this));
    }

    private void alignPopupToButton() {
        if (this.shutterButtonPopup.getVisibility() == 0) {
            this.shutterButtonPopup.setX((this.shutterButton.getX() + (((float) this.shutterButton.getWidth()) / 2.0f)) - (((float) this.shutterButtonPopup.getWidth()) / 2.0f));
            this.shutterButtonPopup.setY(this.shutterButton.getY() - ((float) this.shutterButtonPopup.getHeight()));
            if (!ViewUtilities.getBoundingRect(this.shutterButtonPopup.getRootView()).contains(ViewUtilities.getBoundingRect(this.shutterButtonPopup))) {
                this.shutterButton.hidePopup();
            }
        }
    }

    private boolean isRecording() {
        return this.videoRecorder.isRecording();
    }

    private void onShutterButtonClicked() {
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42353)).mo56386p("shutter button clicked");
        this.modelViewer.sendCaptureImageRequest();
        this.shutterButton.shrinkAndExpand(SNAPSHOT_FLASH_TARGET_SCALE, SNAPSHOT_FLASH_SCALE_DOWN_DURATION, SNAPSHOT_FLASH_SCALE_UP_DURATION);
        runSnapshotOverlayAnimation();
        if (canRecordVideo()) {
            this.shutterButton.maybeShowPopup();
        }
        alignPopupToButton();
    }

    private void runSnapshotOverlayAnimation() {
        this.snapshotOverlay.animate().alpha(SNAPSHOT_FLASH_TARGET_ALPHA).setDuration(50).withStartAction(new ShutterButtonController$$ExternalSyntheticLambda6(this)).withEndAction(new ShutterButtonController$$ExternalSyntheticLambda7(this)).start();
    }

    private boolean startRecording() {
        if (!this.isRecordingVideo) {
            boolean startRecordingVideo = this.videoRecorder.startRecordingVideo();
            this.isRecordingVideo = startRecordingVideo;
            if (startRecordingVideo) {
                this.videoProgressAnimator.start();
            }
        }
        if (this.isRecordingVideo) {
            this.shutterButton.post(new ShutterButtonController$$ExternalSyntheticLambda8(this));
        }
        return this.isRecordingVideo;
    }

    /* access modifiers changed from: private */
    public void stopRecording() {
        if (this.isRecordingVideo) {
            this.isRecordingVideo = false;
            this.videoRecorder.stopRecordingVideo();
            this.videoProgressAnimator.cancel();
        }
        this.shutterButton.updateVideoRecordingProgress(0.0f);
        this.shutterButton.post(new ShutterButtonController$$ExternalSyntheticLambda10(this));
    }

    public boolean canRecordVideo() {
        return PermissionUtilities.checkPermission(this.context, "android.permission.RECORD_AUDIO") && canUseStorage();
    }

    public boolean canUseStorage() {
        return PermissionUtilities.checkPermission(this.context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public int getShutterButtonHeight() {
        return this.shutterButton.getHeight();
    }

    public boolean getShutterButtonVisible() {
        return this.isShutterButtonVisible;
    }

    public void hideShutterButtonPopup() {
        this.shutterButton.hidePopup();
    }

    public boolean isShutterButtonPopupVisible() {
        return this.shutterButton.isPopupVisible();
    }

    /* renamed from: lambda$new$0$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18951x1f7895a5(View view) {
        onShutterButtonClicked();
    }

    /* renamed from: lambda$new$1$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ boolean mo18952xc6f46f66(View view) {
        if (isRecording()) {
            return true;
        }
        if (!canRecordVideo()) {
            onShutterButtonClicked();
            if (canUseStorage()) {
                PermissionUtilities.showMediaAndMicrophonePermissionsRationaleDialog(this.context);
            }
            return true;
        }
        this.shutterButton.hidePopup();
        this.shutterButton.scale(VIDEO_CAPTURE_SCALE, ANIMATION_DURATION_MS);
        startRecording();
        return true;
    }

    /* renamed from: lambda$new$2$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ boolean mo18953x6e704927(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            this.shutterButton.scale(EXPANDED_SCALE, ANIMATION_DURATION_MS);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            if (isRecording()) {
                stopRecording();
            }
            this.shutterButton.scale(1.0f, ANIMATION_DURATION_MS);
            return false;
        }
    }

    /* renamed from: lambda$new$3$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18954x15ec22e8(ValueAnimator valueAnimator) {
        this.shutterButton.updateVideoRecordingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: lambda$runSnapshotOverlayAnimation$10$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18955x213ac953() {
        this.snapshotOverlay.animate().alpha(0.0f).setDuration(250).withEndAction(new ShutterButtonController$$ExternalSyntheticLambda9(this)).start();
    }

    /* renamed from: lambda$runSnapshotOverlayAnimation$8$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18956xd1819a30() {
        this.snapshotOverlay.setVisibility(0);
    }

    /* renamed from: lambda$runSnapshotOverlayAnimation$9$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18957x78fd73f1() {
        this.snapshotOverlay.setVisibility(8);
    }

    /* renamed from: lambda$setShutterButtonVisible$6$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18958x109ec400(boolean z) {
        if (z) {
            this.shutterButton.setVisibility(0);
        }
    }

    /* renamed from: lambda$setShutterButtonVisible$7$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18959xb81a9dc1(boolean z) {
        if (!z) {
            this.shutterButton.setVisibility(4);
        }
    }

    /* renamed from: lambda$startRecording$4$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18960x8bf4e512() {
        Listener listener = this.videoRecordingListener;
        if (listener != null) {
            listener.onStartVideoRecording();
        }
    }

    /* renamed from: lambda$stopRecording$5$com-google-android-libraries-ar-sceneviewer-media-capture-ShutterButtonController */
    public /* synthetic */ void mo18961x5560f99() {
        Listener listener = this.videoRecordingListener;
        if (listener != null) {
            listener.onStopVideoRecording();
        }
    }

    public void onGetRenderedImage(Bitmap bitmap) {
        ContentResolver contentResolver2 = this.contentResolver;
        View sceneView = this.modelViewer.getSceneView();
        sceneView.getClass();
        SnapshotCapture.create(contentResolver2, sceneView, this.captureFinishedListener).onGetRenderedImage(bitmap);
    }

    public void pause() {
        stopRecording();
    }

    public void setAlpha(float f) {
        this.shutterButton.setAlpha(f);
        this.shutterButtonPopup.setAlpha(f);
    }

    public void setButtonPosition(float f, float f2) {
        ShutterButton shutterButton2 = this.shutterButton;
        shutterButton2.setY(f2 - (((float) shutterButton2.getHeight()) / 2.0f));
        ShutterButton shutterButton3 = this.shutterButton;
        shutterButton3.setX(f - (((float) shutterButton3.getWidth()) / 2.0f));
        if (isShutterButtonPopupVisible()) {
            alignPopupToButton();
        }
    }

    public void setShutterButtonPopupEnabled(boolean z) {
        this.shutterButton.setPopupEnabled(z);
        alignPopupToButton();
    }

    public void setShutterButtonVisible(boolean z, int i) {
        this.isShutterButtonVisible = z;
        float f = true != z ? 0.0f : 1.0f;
        this.shutterButton.setAlpha(1.0f - f);
        this.shutterButton.animate().setDuration((long) i).alpha(f).setInterpolator(new AccelerateDecelerateInterpolator()).withStartAction(new ShutterButtonController$$ExternalSyntheticLambda0(this, z)).withEndAction(new ShutterButtonController$$ExternalSyntheticLambda1(this, z)).start();
    }

    public void updateCaptureOrientation() {
        this.videoRecorder.setVideoQuality(6, this.context.getResources().getConfiguration().orientation);
    }
}

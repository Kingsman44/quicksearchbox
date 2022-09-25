package com.google.android.libraries.p579ar.sceneviewer.media.gallery;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.media.C10720a;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaFileInfo;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.gallery.GalleryButtonController */
/* compiled from: PG */
public final class GalleryButtonController {
    private static final int GALLERY_BUTTON_ANIMATE_TIME = 300;
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.gallery.GalleryButtonController");
    private final Activity activity;
    private ThumbnailResult currentThumbnail;
    private final GalleryButton galleryButton;
    private boolean setToVisible = false;

    public GalleryButtonController(GalleryButton galleryButton2, Activity activity2) {
        this.activity = activity2;
        this.galleryButton = galleryButton2;
    }

    public static GalleryButtonController create(Activity activity2, ViewGroup viewGroup) {
        LayoutInflater.from(activity2).inflate(C10730R.layout.gallery_button, viewGroup);
        GalleryButtonController galleryButtonController = new GalleryButtonController((GalleryButton) viewGroup.findViewById(C10730R.C10732id.gallery_button), activity2);
        galleryButtonController.updateGalleryButtonThumbnail();
        return galleryButtonController;
    }

    /* access modifiers changed from: private */
    public void getLatestCameraFileAsThumbnail() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            onEmptyCameraFileCallback();
            return;
        }
        MediaFileInfo latestCameraFileInfo = MediaUtilities.getLatestCameraFileInfo(activity2.getContentResolver());
        if (latestCameraFileInfo == null) {
            onEmptyCameraFileCallback();
            return;
        }
        C10720a aVar = (C10720a) latestCameraFileInfo;
        Bitmap bitmapWithUri = MediaUtilities.getBitmapWithUri(this.activity.getContentResolver(), aVar.f35657b, aVar.f35656a);
        if (bitmapWithUri == null) {
            onEmptyCameraFileCallback();
        } else {
            onNonEmptyCameraFileCallback(latestCameraFileInfo, bitmapWithUri);
        }
    }

    private int getThumbnailSizePixels() {
        int width = this.galleryButton.getWidth();
        if (width > 0) {
            return width;
        }
        ViewGroup.LayoutParams layoutParams = this.galleryButton.getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            return 0;
        }
        return layoutParams.width;
    }

    static /* synthetic */ void lambda$updateGalleryButtonThumbnail$0(View view) {
    }

    private void onEmptyCameraFileCallback() {
        new Handler(Looper.getMainLooper()).post(new GalleryButtonController$$ExternalSyntheticLambda4(this));
    }

    private void onGalleryButtonClicked() {
        if (this.currentThumbnail == null) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42367)).mo56386p("Current thumbnail is null.");
            return;
        }
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.OPEN_GALLERY);
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW", this.currentThumbnail.uri()));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56226d()).mo56382g(e)).mo56372aa(42366)).mo56386p("Failed in starting activity for thumbnail view intent.");
        }
    }

    private void onNonEmptyCameraFileCallback(MediaFileInfo mediaFileInfo, Bitmap bitmap) {
        new Handler(Looper.getMainLooper()).post(new GalleryButtonController$$ExternalSyntheticLambda5(this, mediaFileInfo, bitmap));
    }

    private void setGalleryButtonVisibleImpl(boolean z, int i) {
        if (this.setToVisible || !z) {
            boolean hasMediaPermissions = z & PermissionUtilities.hasMediaPermissions(this.activity);
            if (hasMediaPermissions && this.currentThumbnail == null) {
                updateGalleryButtonThumbnail();
            }
            AnimationUtilities.animateVisibility(this.galleryButton, hasMediaPermissions & (this.currentThumbnail != null), i);
        }
    }

    public void clearThumbnail() {
        MediaUtilities.clearPreference(this.activity);
        this.currentThumbnail = null;
        setGalleryButtonVisibleImpl(false, GALLERY_BUTTON_ANIMATE_TIME);
    }

    public int getButtonWidth() {
        return this.galleryButton.getWidth();
    }

    /* access modifiers changed from: package-private */
    public Bitmap getGalleryButtonImageBitmap() {
        return this.galleryButton.getThumbnail();
    }

    public boolean isGalleryButtonVisible() {
        return this.galleryButton.getVisibility() == 0;
    }

    /* renamed from: lambda$onNonEmptyCameraFileCallback$2$com-google-android-libraries-ar-sceneviewer-media-gallery-GalleryButtonController */
    public /* synthetic */ void mo19010x2f81db17(View view) {
        onGalleryButtonClicked();
    }

    /* renamed from: lambda$onNonEmptyCameraFileCallback$3$com-google-android-libraries-ar-sceneviewer-media-gallery-GalleryButtonController */
    public /* synthetic */ void mo19011xd6fdb4d8(MediaFileInfo mediaFileInfo, Bitmap bitmap) {
        MediaUtilities.setPreference(this.activity, mediaFileInfo.uri(), mediaFileInfo.type());
        setGalleryButtonThumbnail(bitmap, mediaFileInfo.uri());
        this.galleryButton.setOnClickListener(new GalleryButtonController$$ExternalSyntheticLambda0(this));
        setGalleryButtonVisibleImpl(true, GALLERY_BUTTON_ANIMATE_TIME);
    }

    /* renamed from: lambda$updateGalleryButtonThumbnail$1$com-google-android-libraries-ar-sceneviewer-media-gallery-GalleryButtonController */
    public /* synthetic */ void mo19012x212caa22(View view) {
        onGalleryButtonClicked();
    }

    public void setButtonAlpha(float f) {
        this.galleryButton.setAlpha(f);
    }

    public void setGalleryButtonThumbnail(Bitmap bitmap, Uri uri) {
        this.currentThumbnail = ThumbnailResult.create(bitmap, uri);
        this.galleryButton.setThumbnail(bitmap);
    }

    public void setGalleryButtonVisible(boolean z, int i) {
        this.setToVisible = z;
        setGalleryButtonVisibleImpl(z, i);
    }

    public void updateGalleryButtonThumbnail() {
        ThumbnailResult retrieveRecentThumbnail = MediaUtilities.retrieveRecentThumbnail(this.activity, getThumbnailSizePixels());
        if (retrieveRecentThumbnail == null) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42368)).mo56386p("No stored last thumbnail info in sharedPreference.");
            return;
        }
        C10733a aVar = (C10733a) retrieveRecentThumbnail;
        if (aVar.f35669a == null) {
            new Thread(new GalleryButtonController$$ExternalSyntheticLambda1(this)).start();
            this.galleryButton.setOnClickListener(GalleryButtonController$$ExternalSyntheticLambda2.INSTANCE);
            return;
        }
        if (!retrieveRecentThumbnail.equals(this.currentThumbnail)) {
            setGalleryButtonThumbnail(aVar.f35669a, aVar.f35670b);
        }
        this.galleryButton.setOnClickListener(new GalleryButtonController$$ExternalSyntheticLambda3(this));
        setGalleryButtonVisibleImpl(true, GALLERY_BUTTON_ANIMATE_TIME);
    }
}

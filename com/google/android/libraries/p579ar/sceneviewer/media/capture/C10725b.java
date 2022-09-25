package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.app.Activity;
import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaType;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.GalleryButtonController;
import com.google.common.p4526f.C59052c;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.b */
/* compiled from: PG */
final class C10725b implements CaptureListener {

    /* renamed from: a */
    private final WeakReference f35660a;

    /* renamed from: b */
    private final GalleryButtonController f35661b;

    public C10725b(WeakReference weakReference, GalleryButtonController galleryButtonController) {
        this.f35660a = weakReference;
        this.f35661b = galleryButtonController;
    }

    public final void onCaptureError(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) ShutterButtonController.logger.mo56225c()).mo56382g(th)).mo56372aa(42352)).mo56386p("Unable to save snapshot.");
    }

    public final void onCaptureFinished(Uri uri, MediaType mediaType) {
        Activity activity = (Activity) this.f35660a.get();
        if (activity != null) {
            MediaUtilities.setPreference(activity, uri, mediaType);
            this.f35661b.updateGalleryButtonThumbnail();
        }
    }
}

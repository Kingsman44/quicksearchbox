package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaType;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.CaptureListener */
/* compiled from: PG */
public interface CaptureListener {
    void onCaptureError(Throwable th);

    void onCaptureFinished(Uri uri, MediaType mediaType);
}

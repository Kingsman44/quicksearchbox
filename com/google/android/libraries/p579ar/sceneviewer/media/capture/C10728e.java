package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaType;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.e */
/* compiled from: PG */
final class C10728e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Uri f35666a;

    /* renamed from: b */
    final /* synthetic */ C10729f f35667b;

    public C10728e(C10729f fVar, Uri uri) {
        this.f35667b = fVar;
        this.f35666a = uri;
    }

    public final void run() {
        if (this.f35666a == null) {
            this.f35667b.f35668a.recordingFinishedListener.onCaptureError(new Exception("Null uri when inserting into contentResolver."));
        } else {
            this.f35667b.f35668a.recordingFinishedListener.onCaptureFinished(this.f35666a, MediaType.VIDEO);
        }
    }
}

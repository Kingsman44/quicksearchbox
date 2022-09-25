package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaType;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.c */
/* compiled from: PG */
final class C10726c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Throwable f35662a;

    /* renamed from: b */
    final /* synthetic */ Uri f35663b;

    /* renamed from: c */
    final /* synthetic */ SnapshotCapture f35664c;

    public C10726c(SnapshotCapture snapshotCapture, Throwable th, Uri uri) {
        this.f35664c = snapshotCapture;
        this.f35662a = th;
        this.f35663b = uri;
    }

    public final void run() {
        if (this.f35662a != null || this.f35663b == null) {
            this.f35664c.listener.onCaptureError(this.f35662a);
        } else {
            this.f35664c.listener.onCaptureFinished(this.f35663b, MediaType.IMAGE);
        }
    }
}

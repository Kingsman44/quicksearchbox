package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.SnapshotCapture$$ExternalSyntheticLambda1 */
/* compiled from: PG */
public final /* synthetic */ class SnapshotCapture$$ExternalSyntheticLambda1 implements MediaScannerConnection.OnScanCompletedListener {
    public /* synthetic */ File f$0;
    public /* synthetic */ SettableFuture f$1;

    public /* synthetic */ SnapshotCapture$$ExternalSyntheticLambda1(File file, SettableFuture settableFuture) {
        this.f$0 = file;
        this.f$1 = settableFuture;
    }

    public final void onScanCompleted(String str, Uri uri) {
        SnapshotCapture.lambda$scanMedia$0(this.f$0, this.f$1, str, uri);
    }
}

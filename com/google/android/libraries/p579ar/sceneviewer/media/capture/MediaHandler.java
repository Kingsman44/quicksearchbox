package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.media.MediaRecorder;
import android.net.Uri;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.MediaHandler */
/* compiled from: PG */
public interface MediaHandler {
    void buildFileName();

    void setOutputFile(MediaRecorder mediaRecorder);

    Uri stopRecording();
}

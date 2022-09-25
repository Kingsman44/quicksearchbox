package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.f */
/* compiled from: PG */
final class C10729f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ VideoRecorder f35668a;

    public C10729f(VideoRecorder videoRecorder) {
        this.f35668a = videoRecorder;
    }

    public final void run() {
        Uri uri = null;
        try {
            MediaRecorder r2 = this.f35668a.mediaRecorder;
            r2.getClass();
            r2.stop();
            try {
                MediaRecorder r22 = this.f35668a.mediaRecorder;
                r22.getClass();
                r22.release();
                this.f35668a.mediaRecorder = null;
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) VideoRecorder.logger.mo56225c()).mo56382g(e)).mo56372aa(42358)).mo56386p("Error resetting media recorder.");
            }
            long timeDurationInMilliseconds = this.f35668a.frameStatsTracker.getTimeDurationInMilliseconds();
            if (timeDurationInMilliseconds <= 0) {
                ((C59052c) ((C59052c) VideoRecorder.logger.mo56225c()).mo56372aa(42357)).mo56388r("Invalid video length %d.", timeDurationInMilliseconds);
            } else {
                ViewerLogger.getInstance().logVideoCaptureMetadata(timeDurationInMilliseconds);
            }
            uri = this.f35668a.mediaHandler.stopRecording();
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) VideoRecorder.logger.mo56225c()).mo56382g(e2)).mo56372aa(42359)).mo56386p("Exception stopping capture");
            try {
                MediaRecorder r23 = this.f35668a.mediaRecorder;
                r23.getClass();
                r23.release();
                this.f35668a.mediaRecorder = null;
            } catch (Exception e3) {
                ((C59052c) ((C59052c) ((C59052c) VideoRecorder.logger.mo56225c()).mo56382g(e3)).mo56372aa(42360)).mo56386p("Error resetting media recorder.");
            }
        } catch (Throwable th) {
            try {
                MediaRecorder r3 = this.f35668a.mediaRecorder;
                r3.getClass();
                r3.release();
                this.f35668a.mediaRecorder = null;
            } catch (Exception e4) {
                ((C59052c) ((C59052c) ((C59052c) VideoRecorder.logger.mo56225c()).mo56382g(e4)).mo56372aa(42361)).mo56386p("Error resetting media recorder.");
            }
            throw th;
        }
        if (this.f35668a.recordingFinishedListener != null) {
            new Handler(Looper.getMainLooper()).post(new C10728e(this, uri));
        }
    }
}

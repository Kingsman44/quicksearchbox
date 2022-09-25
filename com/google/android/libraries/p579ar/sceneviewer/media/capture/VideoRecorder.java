package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.content.Context;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.utilities.FrameStatsTracker;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import java.io.IOException;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.VideoRecorder */
/* compiled from: PG */
public final class VideoRecorder {
    private static final int AUDIO_CHANNEL_COUNT = 1;
    private static final int AUDIO_ENCODING_BITRATE = 128000;
    private static final int AUDIO_SAMPLING_RATE = 48000;
    private static final int DEFAULT_VIDEO_BITRATE = 6000000;
    private static final int DEFAULT_VIDEO_FRAMERATE = 30;
    private static final int[] FALLBACK_QUALITY_LEVELS = {1, 8, 6, 5, 4};
    /* access modifiers changed from: private */
    public static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.media.capture.VideoRecorder");
    private Surface encoderSurface;
    final FrameStatsTracker frameStatsTracker = new FrameStatsTracker();
    /* access modifiers changed from: private */
    public final MediaHandler mediaHandler;
    /* access modifiers changed from: private */
    public MediaRecorder mediaRecorder;
    private SurfaceMirrorer mirrorer;
    /* access modifiers changed from: private */
    public final CaptureListener recordingFinishedListener;
    private int videoBitRate = DEFAULT_VIDEO_BITRATE;
    private int videoCodec;
    private int videoFrameRate = 30;
    private Size videoSize;

    public VideoRecorder(Context context, CaptureListener captureListener) {
        this.recordingFinishedListener = captureListener;
        this.mediaHandler = new AndroidQAndAboveMediaHandler(context);
    }

    private boolean setUpMediaRecorder(MediaRecorder mediaRecorder2) {
        mediaRecorder2.setVideoSource(2);
        mediaRecorder2.setAudioSource(6);
        mediaRecorder2.setOutputFormat(2);
        mediaRecorder2.setVideoEncodingBitRate(this.videoBitRate);
        mediaRecorder2.setVideoFrameRate(this.videoFrameRate);
        mediaRecorder2.setVideoSize(this.videoSize.getWidth(), this.videoSize.getHeight());
        mediaRecorder2.setVideoEncoder(this.videoCodec);
        mediaRecorder2.setAudioSamplingRate(AUDIO_SAMPLING_RATE);
        mediaRecorder2.setAudioChannels(1);
        mediaRecorder2.setAudioEncodingBitRate(AUDIO_ENCODING_BITRATE);
        mediaRecorder2.setAudioEncoder(3);
        this.mediaHandler.setOutputFile(mediaRecorder2);
        try {
            mediaRecorder2.prepare();
            mediaRecorder2.start();
            return true;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42363)).mo56386p("Media Recording start failed.");
            try {
                mediaRecorder2.reset();
                return false;
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e2)).mo56372aa(42364)).mo56386p("Error resetting media recorder.");
                return false;
            }
        }
    }

    private void setVideoSize(int i, int i2) {
        this.videoSize = new Size(i, i2);
    }

    public boolean isRecording() {
        return this.mediaRecorder != null;
    }

    public void setMirrorer(SurfaceMirrorer surfaceMirrorer) {
        this.mirrorer = surfaceMirrorer;
    }

    public void setVideoQuality(int i, int i2) {
        CamcorderProfile camcorderProfile = CamcorderProfile.hasProfile(i) ? CamcorderProfile.get(i) : null;
        if (camcorderProfile == null) {
            int[] iArr = FALLBACK_QUALITY_LEVELS;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                int i4 = iArr[i3];
                if (CamcorderProfile.hasProfile(i4)) {
                    camcorderProfile = CamcorderProfile.get(i4);
                    break;
                }
                i3++;
            }
        }
        if (camcorderProfile == null) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42362)).mo56386p("No valid video profiles.  Trying default.");
            return;
        }
        if (i2 == 2) {
            setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        } else {
            setVideoSize(camcorderProfile.videoFrameHeight, camcorderProfile.videoFrameWidth);
        }
        this.videoCodec = camcorderProfile.videoCodec;
        this.videoBitRate = camcorderProfile.videoBitRate;
        this.videoFrameRate = camcorderProfile.videoFrameRate;
    }

    public boolean startRecordingVideo() {
        if (this.mediaRecorder != null) {
            return false;
        }
        MediaRecorder mediaRecorder2 = new MediaRecorder();
        try {
            this.mediaHandler.buildFileName();
            if (!setUpMediaRecorder(mediaRecorder2)) {
                return false;
            }
            this.encoderSurface = mediaRecorder2.getSurface();
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.RECORD_VIDEO);
            this.frameStatsTracker.reset();
            SurfaceMirrorer surfaceMirrorer = this.mirrorer;
            Surface surface = this.encoderSurface;
            surface.getClass();
            surfaceMirrorer.startMirroringToSurface(surface, 0, 0, this.videoSize.getWidth(), this.videoSize.getHeight());
            this.mediaRecorder = mediaRecorder2;
            return true;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42365)).mo56386p("Exception setting up recorder");
            return false;
        }
    }

    public void stopRecordingVideo() {
        Surface surface = this.encoderSurface;
        if (surface != null) {
            this.mirrorer.stopMirroringToSurface(surface);
            this.encoderSurface = null;
        }
        new Thread(new C10729f(this)).start();
    }
}

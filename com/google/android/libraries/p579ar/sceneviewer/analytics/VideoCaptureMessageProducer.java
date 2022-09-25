package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.VideoCaptureMessageProducer */
/* compiled from: PG */
public final class VideoCaptureMessageProducer implements ViewerMessageProducer {
    private final long videoLengthMs;

    public VideoCaptureMessageProducer(long j) {
        this.videoLengthMs = j;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.VideoCaptureMetadata.Builder newBuilder = ArViewerLogOuterClass.VideoCaptureMetadata.newBuilder();
        newBuilder.setVideoLengthMs(this.videoLengthMs);
        builder.setVideoCaptureMetadata((ArViewerLogOuterClass.VideoCaptureMetadata) newBuilder.build());
    }
}

package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.SessionPausedMessageProducer */
/* compiled from: PG */
public final class SessionPausedMessageProducer implements ViewerMessageProducer {
    private final long durationMs;
    private final boolean isInPermissionsFlow;

    public SessionPausedMessageProducer(long j, boolean z) {
        this.durationMs = j;
        this.isInPermissionsFlow = z;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.SessionPaused.Builder newBuilder = ArViewerLogOuterClass.SessionPaused.newBuilder();
        newBuilder.setDurationMs(this.durationMs);
        newBuilder.setIsInPermissionFlow(this.isInPermissionsFlow);
        builder.setSessionPaused((ArViewerLogOuterClass.SessionPaused) newBuilder.build());
    }
}

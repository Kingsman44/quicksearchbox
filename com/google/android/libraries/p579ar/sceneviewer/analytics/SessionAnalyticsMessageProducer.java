package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.SessionAnalyticsMessageProducer */
/* compiled from: PG */
public final class SessionAnalyticsMessageProducer implements ViewerMessageProducer {
    private final Duration landscapeModeDuration;
    private final Duration portraitModeDuration;

    public SessionAnalyticsMessageProducer(Duration duration, Duration duration2) {
        this.landscapeModeDuration = duration;
        this.portraitModeDuration = duration2;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.SessionAnalytics.Builder newBuilder = ArViewerLogOuterClass.SessionAnalytics.newBuilder();
        newBuilder.setLandscapeModeDurationMs(this.landscapeModeDuration.toMillis());
        newBuilder.setPortraitModeDurationMs(this.portraitModeDuration.toMillis());
        builder.setSessionAnalytics((ArViewerLogOuterClass.SessionAnalytics) newBuilder.build());
    }
}

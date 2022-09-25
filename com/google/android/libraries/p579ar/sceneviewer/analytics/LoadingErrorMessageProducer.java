package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.LoadingErrorMessageProducer */
/* compiled from: PG */
public final class LoadingErrorMessageProducer implements ViewerMessageProducer {
    private final long errorTimeMs;
    private final String exception;
    private final ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason loadErrorReason;

    public LoadingErrorMessageProducer(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason loadErrorReason2, String str, long j) {
        this.loadErrorReason = loadErrorReason2;
        this.exception = str;
        this.errorTimeMs = System.currentTimeMillis() - j;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.LoadingError.Builder newBuilder = ArViewerLogOuterClass.LoadingError.newBuilder();
        newBuilder.setErrorReason(this.loadErrorReason);
        newBuilder.setException(this.exception);
        newBuilder.setErrorTimeMs(this.errorTimeMs);
        builder.setLoadingError((ArViewerLogOuterClass.LoadingError) newBuilder.build());
    }
}

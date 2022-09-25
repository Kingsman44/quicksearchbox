package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.UserExitedMessageProducer */
/* compiled from: PG */
public final class UserExitedMessageProducer implements ViewerMessageProducer {
    private final ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason exitReason;

    public UserExitedMessageProducer(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason exitReason2) {
        this.exitReason = exitReason2;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.UserExited.Builder newBuilder = ArViewerLogOuterClass.UserExited.newBuilder();
        newBuilder.setExitReason(this.exitReason);
        builder.setUserExited((ArViewerLogOuterClass.UserExited) newBuilder.build());
    }
}

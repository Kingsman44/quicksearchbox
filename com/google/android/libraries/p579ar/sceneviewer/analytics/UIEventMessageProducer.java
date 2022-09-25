package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.UIEventMessageProducer */
/* compiled from: PG */
public final class UIEventMessageProducer implements ViewerMessageProducer {
    private final ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uiEvent;

    public UIEventMessageProducer(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent) {
        this.uiEvent = uIEvent;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.UIEvent.Builder newBuilder = ArViewerLogOuterClass.UIEvent.newBuilder();
        newBuilder.setUiEvent(this.uiEvent);
        builder.setUiEvent((ArViewerLogOuterClass.UIEvent) newBuilder.build());
    }
}

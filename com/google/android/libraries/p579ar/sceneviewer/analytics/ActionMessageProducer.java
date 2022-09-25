package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.ActionMessageProducer */
/* compiled from: PG */
public final class ActionMessageProducer implements ViewerMessageProducer {
    private final ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action;

    public ActionMessageProducer(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action2) {
        this.action = action2;
    }

    public void buildEvent(ArViewerLogOuterClass.ArViewerLog.Builder builder) {
        ArViewerLogOuterClass.Action.Builder newBuilder = ArViewerLogOuterClass.Action.newBuilder();
        newBuilder.setAction(this.action);
        builder.setAction((ArViewerLogOuterClass.Action) newBuilder.build());
    }
}

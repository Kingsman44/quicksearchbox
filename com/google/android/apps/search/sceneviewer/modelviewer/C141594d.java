package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.View;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.d */
/* compiled from: PG */
public final /* synthetic */ class C141594d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384380a;

    public /* synthetic */ C141594d(C141584am amVar) {
        this.f384380a = amVar;
    }

    public final void onClick(View view) {
        C141584am amVar = this.f384380a;
        if (amVar.mo116568b() == Types.ViewerMode.AR) {
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SWITCH_TO_THREE_D);
        } else {
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SWITCH_TO_AR);
        }
        amVar.mo116583p();
    }
}

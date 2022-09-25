package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.View;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.e */
/* compiled from: PG */
public final /* synthetic */ class C141595e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384381a;

    public /* synthetic */ C141595e(C141584am amVar) {
        this.f384381a = amVar;
    }

    public final void onClick(View view) {
        C141584am amVar = this.f384381a;
        if (amVar.mo116568b() == Types.ViewerMode.AR) {
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SWITCH_TO_THREE_D);
            amVar.mo116583p();
        }
    }
}

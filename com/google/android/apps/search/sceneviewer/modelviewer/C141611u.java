package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.u */
/* compiled from: PG */
public final /* synthetic */ class C141611u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384400a;

    public /* synthetic */ C141611u(C141584am amVar) {
        this.f384400a = amVar;
    }

    public final void onClick(View view) {
        C141584am amVar = this.f384400a;
        amVar.mo116575i();
        ViewerLogger.getInstance().logUserExited(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.EXIT_BUTTON);
        ViewerLogger.getInstance().logSessionAnalytics(amVar.f384313ae, amVar.f384314af);
        amVar.f384337f.getActivity().finish();
        amVar.f384337f.getActivity().overridePendingTransition(R.animator.transition_enter, R.animator.transition_exit);
    }
}

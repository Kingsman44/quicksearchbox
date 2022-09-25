package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.dialog.ArSessionErrorDialogFragment;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ac */
/* compiled from: PG */
public final /* synthetic */ class C141574ac implements ArSessionErrorDialogFragment.OnCloseCallback {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384256a;

    public /* synthetic */ C141574ac(C141584am amVar) {
        this.f384256a = amVar;
    }

    public final void onClose() {
        C141584am amVar = this.f384256a;
        if (amVar.f384309aa.equals(Types.SceneViewerParams.ModePreference.AR_ONLY)) {
            amVar.mo116575i();
            ViewerLogger.getInstance().logSessionAnalytics(amVar.f384313ae, amVar.f384314af);
            amVar.f384337f.getActivity().finish();
            return;
        }
        amVar.mo116579m(Types.SceneViewerParams.ModePreference.THREED_ONLY);
    }
}

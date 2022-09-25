package com.google.android.apps.search.sceneviewer.modelviewer;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141553b;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AppUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.UriUtilities;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.p */
/* compiled from: PG */
public final /* synthetic */ class C141606p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384393a;

    public /* synthetic */ C141606p(C141584am amVar) {
        this.f384393a = amVar;
    }

    public final void run() {
        C141584am amVar = this.f384393a;
        if (amVar.f384319ak != null) {
            C141553b.m229767a(amVar.f384337f.getChildFragmentManager(), amVar.f384319ak);
        } else if (AppUtilities.hasInternetConnectivity(amVar.f384337f.getContext())) {
            for (CompletableFuture cancel : amVar.f384288P) {
                cancel.cancel(true);
            }
            amVar.f384288P.clear();
            Uri data = amVar.f384337f.getActivity().getIntent().getData();
            if (data != null) {
                amVar.mo116574h(UriUtilities.upsertQueryParameter(data, "streaming_mode", "disabled"), true);
            }
        } else {
            ViewerLogger.getInstance().logLoadingError(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.NO_INTERNET, BuildConfig.FLAVOR, amVar.f384294V);
            amVar.mo116581o();
        }
    }
}

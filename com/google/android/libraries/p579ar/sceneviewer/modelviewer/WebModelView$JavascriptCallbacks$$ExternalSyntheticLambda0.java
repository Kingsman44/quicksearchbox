package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.WebModelView$JavascriptCallbacks$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class WebModelView$JavascriptCallbacks$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ C10736c f$0;

    public /* synthetic */ WebModelView$JavascriptCallbacks$$ExternalSyntheticLambda0(C10736c cVar) {
        this.f$0 = cVar;
    }

    public final void run() {
        C10736c cVar = this.f$0;
        WebModelView webModelView = cVar.f35673a;
        webModelView.viewPropertyAnimator = webModelView.coverView.animate().alpha(0.0f).setDuration(300).setListener(new C10735b(cVar));
        cVar.f35673a.viewPropertyAnimator.start();
        cVar.f35673a.isLoadComplete = true;
        cVar.f35673a.isLoading = false;
        ModelViewer.Host r0 = cVar.f35673a.host;
        r0.getClass();
        r0.onModelVisibilityChanged();
    }
}

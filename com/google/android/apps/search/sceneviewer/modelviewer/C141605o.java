package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.media.capture.ShutterButtonController;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.ActualScaleButton;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.o */
/* compiled from: PG */
public final /* synthetic */ class C141605o implements ActualScaleButton.OnVisibilityChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384392a;

    public /* synthetic */ C141605o(C141584am amVar) {
        this.f384392a = amVar;
    }

    public final void onVisibilityChanged(boolean z) {
        C141584am amVar = this.f384392a;
        ShutterButtonController shutterButtonController = amVar.f384289Q;
        if (shutterButtonController != null) {
            shutterButtonController.setShutterButtonPopupEnabled(!z);
        }
        if (z) {
            amVar.mo116570d();
        }
    }
}

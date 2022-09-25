package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.media.capture.ShutterButtonController;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.al */
/* compiled from: PG */
final class C141583al implements ShutterButtonController.Listener {

    /* renamed from: a */
    final /* synthetic */ C141584am f384268a;

    /* renamed from: b */
    private boolean f384269b;

    public C141583al(C141584am amVar) {
        this.f384268a = amVar;
    }

    public final void onStartVideoRecording() {
        C141584am amVar = this.f384268a;
        amVar.f384295W = true;
        boolean z = amVar.f384296X;
        this.f384269b = z;
        if (z) {
            amVar.mo116580n(false, 300);
        }
    }

    public final void onStopVideoRecording() {
        if (this.f384269b) {
            this.f384268a.mo116580n(true, 300);
        }
    }
}

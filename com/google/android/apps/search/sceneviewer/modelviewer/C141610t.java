package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.debug.DebugInfoView;
import com.google.android.libraries.p579ar.sceneviewer.header.TopViewGroup;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.t */
/* compiled from: PG */
public final /* synthetic */ class C141610t implements TopViewGroup.DebugModeListener {

    /* renamed from: a */
    public final /* synthetic */ DebugInfoView f384399a;

    public /* synthetic */ C141610t(DebugInfoView debugInfoView) {
        this.f384399a = debugInfoView;
    }

    public final void debugModeEnabled(boolean z) {
        this.f384399a.setDebugEnabled(z);
    }
}

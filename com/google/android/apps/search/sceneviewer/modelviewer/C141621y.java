package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.y */
/* compiled from: PG */
public final /* synthetic */ class C141621y implements BottomViewGroup.StateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ModelViewer f384424a;

    public /* synthetic */ C141621y(ModelViewer modelViewer) {
        this.f384424a = modelViewer;
    }

    public final void onVisibilityStateChanged(Types.Visibility visibility) {
        this.f384424a.onBottomViewGroupStateChange(visibility);
    }
}

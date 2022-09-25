package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.View;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.FloatingButton;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.q */
/* compiled from: PG */
public final /* synthetic */ class C141607q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384394a;

    /* renamed from: b */
    public final /* synthetic */ FloatingButton f384395b;

    /* renamed from: c */
    public final /* synthetic */ int f384396c;

    public /* synthetic */ C141607q(C141584am amVar, FloatingButton floatingButton, int i) {
        this.f384394a = amVar;
        this.f384395b = floatingButton;
        this.f384396c = i;
    }

    public final void onClick(View view) {
        C141584am amVar = this.f384394a;
        FloatingButton floatingButton = this.f384395b;
        int i = this.f384396c;
        if (Types.Visibility.VISIBLE.equals(floatingButton.getVisibilityState())) {
            amVar.f384353v.onButtonPressed(i);
        }
    }
}

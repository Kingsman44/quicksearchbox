package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.search.sceneviewer.modelviewer.p10651ui.PlacementHelpOverlay;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.aa */
/* compiled from: PG */
public final /* synthetic */ class C141572aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384253a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f384254b;

    public /* synthetic */ C141572aa(C141584am amVar, LayoutInflater layoutInflater) {
        this.f384253a = amVar;
        this.f384254b = layoutInflater;
    }

    public final void onClick(View view) {
        C141584am amVar = this.f384253a;
        LayoutInflater layoutInflater = this.f384254b;
        PlacementHelpOverlay placementHelpOverlay = (PlacementHelpOverlay) amVar.f384354w.findViewById(R.id.sceneviewer_placement_help_overlay);
        if (placementHelpOverlay == null) {
            layoutInflater.inflate(R.layout.sceneviewer_placement_help_overlay, amVar.f384354w);
            PlacementHelpOverlay placementHelpOverlay2 = (PlacementHelpOverlay) amVar.f384354w.findViewById(R.id.sceneviewer_placement_help_overlay);
            return;
        }
        placementHelpOverlay.mo116605c();
    }
}

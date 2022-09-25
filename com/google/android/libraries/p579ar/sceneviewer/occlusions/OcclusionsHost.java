package com.google.android.libraries.p579ar.sceneviewer.occlusions;

/* renamed from: com.google.android.libraries.ar.sceneviewer.occlusions.OcclusionsHost */
/* compiled from: PG */
public interface OcclusionsHost {
    boolean areOcclusionsActive();

    boolean areOcclusionsAvailable();

    boolean areOcclusionsRendered();

    void setOcclusionRanges(float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    void setOcclusionsActive(boolean z);
}

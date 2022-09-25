package com.google.android.libraries.p579ar.sceneviewer.analytics;

import com.google.android.libraries.p1975k.C23979b;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.SceneViewerCollectionBasisHelper */
/* compiled from: PG */
public final class SceneViewerCollectionBasisHelper {

    /* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.SceneViewerCollectionBasisHelper$ArViewerLog */
    /* compiled from: PG */
    public final class ArViewerLog extends C23979b {
        private ArViewerLog(Features features) {
            super(features.getFeatureHash(), -718025465, C10676R.raw.f35602x80fc6dc1);
        }

        public static ArViewerLog forFeature(Features features) {
            return new ArViewerLog(features);
        }

        public static ArViewerLog getInstance() {
            return forFeature(Features.DEFAULT);
        }
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.SceneViewerCollectionBasisHelper$Features */
    /* compiled from: PG */
    public enum Features {
        DEFAULT(-2032180703);
        
        private final int featureHash;

        private Features(int i) {
            this.featureHash = i;
        }

        public int getFeatureHash() {
            return this.featureHash;
        }
    }
}

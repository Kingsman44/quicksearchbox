package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.view.Surface;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda24 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda24 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda24 INSTANCE = new ImpModelView$$ExternalSyntheticLambda24();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda24() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nStopMirroringToNativeWindow(((Long) obj).longValue(), (Surface) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

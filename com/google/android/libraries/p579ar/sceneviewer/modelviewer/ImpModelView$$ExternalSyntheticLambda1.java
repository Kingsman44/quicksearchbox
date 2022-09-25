package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.view.Surface;
import com.google.android.libraries.p579ar.sceneviewer.common.function.HexaConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda1 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda1 implements HexaConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda1 INSTANCE = new ImpModelView$$ExternalSyntheticLambda1();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda1() {
    }

    public final void accept(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ImpModelView.nStartMirroringToNativeWindow(((Long) obj).longValue(), (Surface) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue(), ((Integer) obj6).intValue());
    }
}

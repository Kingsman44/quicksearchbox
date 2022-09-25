package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda19 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda19 implements Consumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda19 INSTANCE = new ImpModelView$$ExternalSyntheticLambda19();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda19() {
    }

    public final void accept(Object obj) {
        ImpModelView.nFlushRendering(((Long) obj).longValue());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

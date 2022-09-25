package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda4 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda4 implements Consumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda4 INSTANCE = new ImpModelView$$ExternalSyntheticLambda4();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda4() {
    }

    public final void accept(Object obj) {
        ImpModelView.nPause(((Long) obj).longValue());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

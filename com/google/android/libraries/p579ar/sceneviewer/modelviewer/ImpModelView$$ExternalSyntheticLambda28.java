package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda28 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda28 implements Consumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda28 INSTANCE = new ImpModelView$$ExternalSyntheticLambda28();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda28() {
    }

    public final void accept(Object obj) {
        ImpModelView.nUnloadModel(((Long) obj).longValue());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

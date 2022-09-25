package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda35 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda35 implements Consumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda35 INSTANCE = new ImpModelView$$ExternalSyntheticLambda35();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda35() {
    }

    public final void accept(Object obj) {
        ImpModelView.nSendCaptureImageRequest(((Long) obj).longValue());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

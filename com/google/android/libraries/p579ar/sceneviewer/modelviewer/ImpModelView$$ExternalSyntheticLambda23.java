package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda23 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda23 implements Consumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda23 INSTANCE = new ImpModelView$$ExternalSyntheticLambda23();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda23() {
    }

    public final void accept(Object obj) {
        ImpModelView.nLoadScriptingAPI(((Long) obj).longValue());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

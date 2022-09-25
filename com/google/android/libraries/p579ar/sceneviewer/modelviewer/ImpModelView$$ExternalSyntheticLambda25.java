package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda25 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda25 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda25 INSTANCE = new ImpModelView$$ExternalSyntheticLambda25();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda25() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nSetOcclusionsActive(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

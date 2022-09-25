package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda10 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda10 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda10 INSTANCE = new ImpModelView$$ExternalSyntheticLambda10();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda10() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nSetDarkMode(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

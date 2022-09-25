package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda32 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda32 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda32 INSTANCE = new ImpModelView$$ExternalSyntheticLambda32();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda32() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nSetBottomViewGroup(((Long) obj).longValue(), (BottomViewGroup) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

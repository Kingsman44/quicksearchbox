package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda9 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda9 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda9 INSTANCE = new ImpModelView$$ExternalSyntheticLambda9();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda9() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nSetSideChannelEventHandler(((Long) obj).longValue(), (SideChannelEventManager) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

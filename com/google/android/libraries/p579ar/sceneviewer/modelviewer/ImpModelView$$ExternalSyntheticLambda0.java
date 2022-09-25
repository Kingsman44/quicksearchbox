package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda0 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda0 INSTANCE = new ImpModelView$$ExternalSyntheticLambda0();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda0() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nOnBottomViewGroupStateChange(((Long) obj).longValue(), (Types.Visibility) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.infocard.CardWebView;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda31 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda31 implements BiConsumer {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda31 INSTANCE = new ImpModelView$$ExternalSyntheticLambda31();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda31() {
    }

    public final void accept(Object obj, Object obj2) {
        ImpModelView.nSetWebView(((Long) obj).longValue(), (CardWebView) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}

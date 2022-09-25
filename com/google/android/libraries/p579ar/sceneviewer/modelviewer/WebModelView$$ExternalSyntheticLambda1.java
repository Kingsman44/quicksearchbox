package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.WebModelView$$ExternalSyntheticLambda1 */
/* compiled from: PG */
public final /* synthetic */ class WebModelView$$ExternalSyntheticLambda1 implements Consumer {
    public /* synthetic */ WebModelView f$0;
    public /* synthetic */ Map f$1;
    public /* synthetic */ String f$2;

    public /* synthetic */ WebModelView$$ExternalSyntheticLambda1(WebModelView webModelView, Map map, String str) {
        this.f$0 = webModelView;
        this.f$1 = map;
        this.f$2 = str;
    }

    public final void accept(Object obj) {
        this.f$0.mo19122xaa8ec55a(this.f$1, this.f$2, (String) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

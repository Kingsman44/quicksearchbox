package com.google.android.libraries.p579ar.sceneviewer.utilities;

import java.io.InputStream;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.WebUtilities$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class WebUtilities$$ExternalSyntheticLambda0 implements Function {
    public static final /* synthetic */ WebUtilities$$ExternalSyntheticLambda0 INSTANCE = new WebUtilities$$ExternalSyntheticLambda0();

    private /* synthetic */ WebUtilities$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return WebUtilities.lambda$downloadDrawable$0((InputStream) obj);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

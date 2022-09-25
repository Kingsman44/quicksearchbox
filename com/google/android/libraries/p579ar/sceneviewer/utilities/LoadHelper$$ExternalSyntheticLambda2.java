package com.google.android.libraries.p579ar.sceneviewer.utilities;

import java.net.URLConnection;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper$$ExternalSyntheticLambda2 */
/* compiled from: PG */
public final /* synthetic */ class LoadHelper$$ExternalSyntheticLambda2 implements Callable {
    public /* synthetic */ URLConnection f$0;

    public /* synthetic */ LoadHelper$$ExternalSyntheticLambda2(URLConnection uRLConnection) {
        this.f$0 = uRLConnection;
    }

    public final Object call() {
        return this.f$0.getInputStream();
    }
}

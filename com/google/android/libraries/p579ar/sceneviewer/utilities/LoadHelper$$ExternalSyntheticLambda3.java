package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class LoadHelper$$ExternalSyntheticLambda3 implements Callable {
    public /* synthetic */ Context f$0;
    public /* synthetic */ int f$1;

    public /* synthetic */ LoadHelper$$ExternalSyntheticLambda3(Context context, int i) {
        this.f$0 = context;
        this.f$1 = i;
    }

    public final Object call() {
        return this.f$0.getResources().openRawResource(this.f$1);
    }
}

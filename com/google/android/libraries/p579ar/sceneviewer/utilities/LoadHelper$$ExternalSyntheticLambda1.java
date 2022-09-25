package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper$$ExternalSyntheticLambda1 */
/* compiled from: PG */
public final /* synthetic */ class LoadHelper$$ExternalSyntheticLambda1 implements Callable {
    public /* synthetic */ Context f$0;
    public /* synthetic */ Uri f$1;

    public /* synthetic */ LoadHelper$$ExternalSyntheticLambda1(Context context, Uri uri) {
        this.f$0 = context;
        this.f$1 = uri;
    }

    public final Object call() {
        return this.f$0.getContentResolver().openInputStream(this.f$1);
    }
}

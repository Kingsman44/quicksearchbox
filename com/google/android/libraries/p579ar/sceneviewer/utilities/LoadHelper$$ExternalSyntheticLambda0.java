package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.res.AssetManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class LoadHelper$$ExternalSyntheticLambda0 implements Callable {
    public /* synthetic */ AssetManager f$0;
    public /* synthetic */ String f$1;
    public /* synthetic */ String f$2;

    public /* synthetic */ LoadHelper$$ExternalSyntheticLambda0(AssetManager assetManager, String str, String str2) {
        this.f$0 = assetManager;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object call() {
        return LoadHelper.lambda$fileUriToInputStreamCreator$1(this.f$0, this.f$1, this.f$2);
    }
}

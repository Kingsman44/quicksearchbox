package com.google.android.apps.search.sceneviewer.modelviewer;

import android.content.Context;
import com.google.android.libraries.p579ar.sceneviewer.utilities.LoadHelper;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.an */
/* compiled from: PG */
public final /* synthetic */ class C141587an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f384360a;

    public /* synthetic */ C141587an(Context context) {
        this.f384360a = context;
    }

    public final void run() {
        LoadHelper.enableCaching(this.f384360a);
    }
}

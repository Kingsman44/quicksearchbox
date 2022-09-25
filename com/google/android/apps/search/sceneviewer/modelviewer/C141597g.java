package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.g */
/* compiled from: PG */
public final /* synthetic */ class C141597g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f384383a;

    public /* synthetic */ C141597g(byte[] bArr) {
        this.f384383a = bArr;
    }

    public final void run() {
        byte[] bArr = this.f384383a;
        String str = C141584am.f384270a;
        ViewerLogger.getInstance().logFromSerializedMessage(bArr);
    }
}

package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.net.Uri;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.d */
/* compiled from: PG */
final class C10727d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ SnapshotCapture f35665a;

    public C10727d(SnapshotCapture snapshotCapture) {
        this.f35665a = snapshotCapture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35665a.triggerListenerInMainThread((Uri) null, th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        this.f35665a.triggerListenerInMainThread((Uri) obj, (Throwable) null);
    }
}

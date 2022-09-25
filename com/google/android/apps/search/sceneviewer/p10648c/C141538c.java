package com.google.android.apps.search.sceneviewer.p10648c;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.apps.search.sceneviewer.c.c */
/* compiled from: PG */
public final /* synthetic */ class C141538c implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C2164c f384172a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f384173b;

    public /* synthetic */ C141538c(C2164c cVar, Bitmap bitmap) {
        this.f384172a = cVar;
        this.f384173b = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        C2164c cVar = this.f384172a;
        Bitmap bitmap = this.f384173b;
        if (i == 0) {
            cVar.mo5437b(bitmap);
        } else {
            cVar.mo5439d(new RuntimeException("Failed to create screenshot from SurfaceView"));
        }
    }
}

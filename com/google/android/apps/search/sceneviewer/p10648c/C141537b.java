package com.google.android.apps.search.sceneviewer.p10648c;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.SurfaceView;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.apps.search.sceneviewer.c.b */
/* compiled from: PG */
public final /* synthetic */ class C141537b implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C141539d f384169a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceView f384170b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f384171c;

    public /* synthetic */ C141537b(C141539d dVar, SurfaceView surfaceView, Bitmap bitmap) {
        this.f384169a = dVar;
        this.f384170b = surfaceView;
        this.f384171c = bitmap;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C141539d dVar = this.f384169a;
        SurfaceView surfaceView = this.f384170b;
        Bitmap bitmap = this.f384171c;
        PixelCopy.request(surfaceView, bitmap, new C141538c(cVar, bitmap), dVar.f384174a);
        return "PixelCopy-request";
    }
}

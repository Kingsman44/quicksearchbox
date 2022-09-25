package com.google.android.libraries.p579ar.faceviewer.p587b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.C1505ci;
import androidx.camera.core.C1547dx;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.ar.faceviewer.b.c */
/* compiled from: PG */
public final /* synthetic */ class C10638c implements C1505ci {

    /* renamed from: a */
    public final /* synthetic */ C10642g f35525a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f35526b;

    public /* synthetic */ C10638c(C10642g gVar, C2164c cVar) {
        this.f35525a = gVar;
        this.f35526b = cVar;
    }

    /* renamed from: a */
    public final void mo4335a(C1547dx dxVar) {
        C10642g gVar = this.f35525a;
        C2164c cVar = this.f35526b;
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(dxVar.f4251b.getWidth(), dxVar.f4251b.getHeight());
        Surface surface = new Surface(surfaceTexture);
        dxVar.mo4409a(surface, gVar.f35534c, new C10640e(surface));
        cVar.mo5437b(surfaceTexture);
    }
}

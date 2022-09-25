package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.common.base.C58817ah;
import com.google.mediapipe.p4722a.C62702d;
import com.google.mediapipe.p4722a.C62707i;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.h */
/* compiled from: PG */
public final /* synthetic */ class C10607h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10610k f35454a;

    public /* synthetic */ C10607h(C10610k kVar) {
        this.f35454a = kVar;
    }

    public final Object apply(Object obj) {
        C10610k kVar = this.f35454a;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        if (surfaceTexture == null) {
            return null;
        }
        C62707i iVar = kVar.f35463h;
        if (iVar != null) {
            int width = kVar.f35464i.getWidth();
            int height = kVar.f35464i.getHeight();
            if (width == 0 || height == 0) {
                throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
            }
            iVar.f169304a.f169348q.post(new C62702d(iVar, surfaceTexture, width, height));
            C10653d dVar = ((C10600au) kVar.f35459d).f35441k;
            if (dVar == null) {
                return null;
            }
            ((C10650a) dVar).f35549e.f35542a.mo18637f(C10654e.CAMERA_INIT);
            return null;
        }
        surfaceTexture.release();
        return null;
    }
}

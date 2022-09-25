package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;

/* renamed from: com.google.android.libraries.lens.view.h.d.aq */
/* compiled from: PG */
public final class C26748aq {

    /* renamed from: a */
    public Size f72873a;

    /* renamed from: b */
    public C26746ao f72874b;

    /* renamed from: c */
    public final Surface f72875c;

    /* renamed from: d */
    private final SurfaceTexture f72876d;

    public C26748aq(SurfaceTexture surfaceTexture) {
        this.f72876d = surfaceTexture;
        this.f72875c = new Surface(surfaceTexture);
    }

    /* renamed from: a */
    public final void mo32080a() {
        Size size;
        C26746ao aoVar = this.f72874b;
        if (aoVar != null && (size = this.f72873a) != null) {
            SurfaceTexture surfaceTexture = this.f72876d;
            if (surfaceTexture instanceof C26747ap) {
                ((C26747ap) surfaceTexture).mo32058a(size, aoVar);
                return;
            }
            Size a = aoVar.mo32077a(size);
            this.f72876d.setDefaultBufferSize(a.getWidth(), a.getHeight());
        }
    }
}

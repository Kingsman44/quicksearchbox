package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.common.p4526f.C59071e;
import com.google.mediapipe.p4722a.C62708j;
import com.google.mediapipe.p4722a.C62709k;
import com.google.mediapipe.p4723b.C62711b;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ah */
/* compiled from: PG */
public final class C10587ah {

    /* renamed from: a */
    public static final C59071e f35407a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.e.ah");

    /* renamed from: b */
    public final GLSurfaceView f35408b;

    /* renamed from: c */
    public final C62708j f35409c;

    /* renamed from: d */
    public final C62709k f35410d;

    /* renamed from: e */
    public final C10586ag f35411e;

    /* renamed from: f */
    final SurfaceHolder.Callback f35412f;

    /* renamed from: g */
    public C10653d f35413g;

    public C10587ah(Context context, C62711b bVar, C10586ag agVar) {
        this.f35411e = agVar;
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.f35408b = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(bVar.f169322d);
        gLSurfaceView.setEGLContextFactory(new C10583ad(bVar));
        C62708j jVar = new C62708j();
        this.f35409c = jVar;
        if (jVar.f169308c == 0) {
            jVar.f169309d = 3553;
            gLSurfaceView.setRenderer(jVar);
            gLSurfaceView.setRenderMode(0);
            C10585af afVar = new C10585af(this);
            this.f35412f = afVar;
            gLSurfaceView.getHolder().addCallback(afVar);
            this.f35410d = new C10582ac(this);
            return;
        }
        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
    }
}

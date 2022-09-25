package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.opengl.EGL14;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10644i;
import com.google.common.base.C58817ah;
import com.google.mediapipe.framework.Compat;
import com.google.mediapipe.p4722a.C62709k;
import com.google.mediapipe.p4723b.C62711b;
import com.google.research.xeno.effect.C66398a;
import com.google.research.xeno.effect.C66399b;
import com.google.research.xeno.effect.C66408k;
import com.google.research.xeno.effect.C66412o;
import com.google.research.xeno.effect.InputFrameSource;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.am */
/* compiled from: PG */
public final /* synthetic */ class C10592am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10600au f35420a;

    public /* synthetic */ C10592am(C10600au auVar) {
        this.f35420a = auVar;
    }

    public final Object apply(Object obj) {
        EGLSurface eGLSurface;
        C10600au auVar = this.f35420a;
        Boolean bool = (Boolean) obj;
        C66398a aVar = new C66398a();
        aVar.mo59613a(0);
        C62711b bVar = auVar.f35436f;
        if (bVar.f169323e == 0) {
            EGLContext eglGetCurrentContext = bVar.f169319a.eglGetCurrentContext();
            EGLDisplay eglGetCurrentDisplay = bVar.f169319a.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = bVar.f169319a.eglGetCurrentSurface(12377);
            EGLSurface eglGetCurrentSurface2 = bVar.f169319a.eglGetCurrentSurface(12378);
            if (eglGetCurrentContext != bVar.f169321c) {
                eGLSurface = bVar.mo58597d();
                bVar.mo58594a(eGLSurface, eGLSurface);
            } else {
                eGLSurface = null;
            }
            bVar.f169323e = Compat.getCurrentNativeEGLContext();
            EGL14.eglGetCurrentContext();
            if (eglGetCurrentContext != bVar.f169321c) {
                bVar.f169319a.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                bVar.mo58596c(eGLSurface);
            }
        }
        aVar.mo59613a(bVar.f169323e);
        if (aVar.f180572b == 1) {
            C10644i iVar = new C10644i(new C66399b(aVar.f180571a));
            C62709k kVar = auVar.f35437g.f35410d;
            iVar.f180568h.clear();
            iVar.f180568h.add(kVar);
            iVar.mo59608c(new C66408k(InputFrameSource.FRONT_CAMERA_NONMIRRORED, C66412o.f180593b));
            C10610k kVar2 = auVar.f35438h;
            kVar2.f35460e.mo18712b(new C10579a(kVar2, iVar));
            return iVar;
        }
        throw new IllegalStateException("Missing required properties: parentGlContextHandle");
    }
}

package com.google.mediapipe.p4723b;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.mediapipe.b.b */
/* compiled from: PG */
public final class C62711b {

    /* renamed from: a */
    public final EGL10 f169319a;

    /* renamed from: b */
    public EGLDisplay f169320b = EGL10.EGL_NO_DISPLAY;

    /* renamed from: c */
    public EGLContext f169321c = EGL10.EGL_NO_CONTEXT;

    /* renamed from: d */
    public int f169322d;

    /* renamed from: e */
    public long f169323e = 0;

    /* renamed from: f */
    private EGLConfig f169324f = null;

    /* renamed from: g */
    private final int[] f169325g = new int[1];

    public C62711b(Object obj) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f169319a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f169320b = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (egl10.eglInitialize(this.f169320b, new int[2])) {
                obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
                try {
                    m94913e((EGLContext) obj, 3);
                    this.f169322d = 3;
                } catch (RuntimeException e) {
                    Log.w("EglManager", "could not create GLES 3 context: ".concat(e.toString()));
                    m94913e((EGLContext) obj, 2);
                    this.f169322d = 2;
                }
            } else {
                throw new RuntimeException("eglInitialize failed");
            }
        } else {
            throw new RuntimeException("eglGetDisplay failed");
        }
    }

    /* renamed from: e */
    private final void m94913e(EGLContext eGLContext, int i) {
        EGLConfig eGLConfig;
        int i2 = i;
        int[] iArr = new int[15];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        int i3 = 4;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12325;
        iArr[9] = 16;
        iArr[10] = 12352;
        if (i2 == 3) {
            i3 = 64;
        }
        iArr[11] = i3;
        iArr[12] = 12339;
        iArr[13] = 5;
        iArr[14] = 12344;
        int[] iArr2 = this.f169325g;
        if (this.f169319a.eglChooseConfig(this.f169320b, iArr, (EGLConfig[]) null, 0, iArr2)) {
            int i4 = iArr2[0];
            if (i4 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                int i5 = i4;
                if (this.f169319a.eglChooseConfig(this.f169320b, iArr, eGLConfigArr, i4, iArr2)) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            eGLConfig = null;
                            break;
                        }
                        eGLConfig = eGLConfigArr2[i6];
                        int f = m94914f(eGLConfig, 12324);
                        int f2 = m94914f(eGLConfig, 12323);
                        int f3 = m94914f(eGLConfig, 12322);
                        int f4 = m94914f(eGLConfig, 12321);
                        if (f == 8 && f2 == 8 && f3 == 8 && f4 == 8) {
                            break;
                        }
                        i6++;
                    }
                    if (eGLConfig == null) {
                        eGLConfig = eGLConfigArr2[0];
                    }
                    this.f169324f = eGLConfig;
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = this.f169319a.eglCreateContext(this.f169320b, eGLConfig, eGLContext, new int[]{12440, i2, 12344});
                        this.f169321c = eglCreateContext;
                        if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                            int eglGetError = this.f169319a.eglGetError();
                            String hexString = Integer.toHexString(eglGetError);
                            String str = eglGetError == 12294 ? ": parent context uses a different version of OpenGL" : BuildConfig.FLAVOR;
                            throw new RuntimeException("Could not create GL context: EGL error: 0x" + hexString + str);
                        }
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    /* renamed from: f */
    private final int m94914f(EGLConfig eGLConfig, int i) {
        if (this.f169319a.eglGetConfigAttrib(this.f169320b, eGLConfig, i, this.f169325g)) {
            return this.f169325g[0];
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo58594a(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (!this.f169319a.eglMakeCurrent(this.f169320b, eGLSurface, eGLSurface2, this.f169321c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: b */
    public final void mo58595b() {
        if (this.f169320b != EGL10.EGL_NO_DISPLAY) {
            this.f169319a.eglMakeCurrent(this.f169320b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.f169319a.eglDestroyContext(this.f169320b, this.f169321c);
            this.f169319a.eglTerminate(this.f169320b);
        }
        this.f169320b = EGL10.EGL_NO_DISPLAY;
        this.f169321c = EGL10.EGL_NO_CONTEXT;
        this.f169324f = null;
    }

    /* renamed from: c */
    public final void mo58596c(EGLSurface eGLSurface) {
        this.f169319a.eglDestroySurface(this.f169320b, eGLSurface);
    }

    /* renamed from: d */
    public final EGLSurface mo58597d() {
        EGLSurface eglCreatePbufferSurface = this.f169319a.eglCreatePbufferSurface(this.f169320b, this.f169324f, new int[]{12375, 1, 12374, 1, 12344});
        int eglGetError = this.f169319a.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException("eglCreatePbufferSurface: EGL error: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))));
        } else if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        } else {
            throw new RuntimeException("surface was null");
        }
    }
}

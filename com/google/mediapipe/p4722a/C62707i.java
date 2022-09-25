package com.google.mediapipe.p4722a;

import android.util.Log;
import java.lang.Thread;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.google.mediapipe.a.i */
/* compiled from: PG */
public final class C62707i {

    /* renamed from: a */
    public C62706h f169304a;

    /* renamed from: b */
    public Throwable f169305b = null;

    public C62707i(EGLContext eGLContext) {
        C62706h hVar = new C62706h(eGLContext);
        this.f169304a = hVar;
        hVar.setName("ExternalTextureConverter");
        Object obj = new Object();
        this.f169304a.setUncaughtExceptionHandler(new C62701c(this, obj));
        this.f169304a.start();
        try {
            C62706h hVar2 = this.f169304a;
            synchronized (hVar2.f169345n) {
                while (!hVar2.f169343l) {
                    hVar2.f169345n.wait();
                }
            }
            if (!hVar2.f169344m) {
                synchronized (obj) {
                    while (this.f169305b == null) {
                        obj.wait();
                    }
                }
            }
            this.f169304a.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
            if (this.f169305b != null) {
                this.f169304a.mo58599j();
                throw new RuntimeException(this.f169305b);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }
}

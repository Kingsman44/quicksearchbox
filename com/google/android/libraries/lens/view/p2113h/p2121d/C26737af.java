package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.Size;

/* renamed from: com.google.android.libraries.lens.view.h.d.af */
/* compiled from: PG */
public final class C26737af {
    /* renamed from: a */
    public static C26736ae m49428a(Size size, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        C26736ae aeVar = new C26736ae();
        aeVar.detachFromGLContext();
        aeVar.setDefaultBufferSize(size.getWidth(), size.getHeight());
        aeVar.setOnFrameAvailableListener(onFrameAvailableListener, handler);
        return aeVar;
    }
}

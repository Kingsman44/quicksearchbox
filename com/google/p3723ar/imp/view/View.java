package com.google.p3723ar.imp.view;

import android.content.Context;
import com.google.common.base.C58837ba;
import com.google.p3723ar.imp.view.input.InputManager;
import com.google.p3723ar.imp.view.ipc.LoaderClient;

/* renamed from: com.google.ar.imp.view.View */
/* compiled from: PG */
public class View {

    /* renamed from: a */
    protected long f124179a;

    /* renamed from: b */
    public final InputManager f124180b;

    /* renamed from: c */
    public Long f124181c = null;

    /* renamed from: d */
    public int f124182d = 0;

    public View(long j, String str) {
        this.f124179a = j;
        this.f124180b = new InputManager(j);
        LoaderClient.f124213b = str;
    }

    /* renamed from: b */
    public static View m85151b(String str, String str2, Context context) {
        if (true == C58837ba.m90859h(str)) {
            str = "imp_view_jni";
        }
        if (str2 == null) {
            str2 = "default";
        }
        try {
            System.loadLibrary(str);
            return new View(nCreateView(context, str2, (Object) null), str);
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException("Could not load native library \"" + str + "\"", e);
        }
    }

    protected static native void nCreateSwapChain(long j, Object obj, long j2);

    protected static native long nCreateView(Object obj, String str, Object obj2);

    protected static native void nDestroySwapChain(long j);

    protected static native void nDestroyView(long j);

    private static native void nDrainAllExecutorsForTest(long j);

    protected static native void nFlushAndWait(long j);

    protected static native long nGetViewHandle(long j);

    protected static native boolean nHasSwapChain(long j);

    protected static native void nIsolatedPostRender(long j);

    protected static native void nIsolatedPreRender(long j, long j2, long j3);

    private static native void nOnDrag(long j, float f, float f2, float f3, float f4);

    private static native void nOnDragBegin(long j);

    private static native void nOnDragEnd(long j);

    private static native void nOnScroll(long j, float f, float f2);

    protected static native long nRenderNextFrame(long j, long j2, long j3);

    protected static native void nResize(long j, int i, int i2, float f, float f2);

    protected static native void nSetDisplayRotation(long j, int i);

    private static native void nSetScriptEndpoint(long j, Object obj);

    protected static native void nSetup(long j, long j2);

    protected static native void nSetupShared(long j, long j2, long j3, long j4, long j5);

    private static native void nSetupSurfaceRenderer(long j, Object obj, String str, String str2);

    private static native void nStaticRenderForTest(long j);

    /* renamed from: a */
    public final long mo53086a() {
        long j = this.f124179a;
        if (j != 0) {
            return nGetViewHandle(j);
        }
        throw new IllegalStateException("Calling method on destroyed ".concat(String.valueOf(getClass().getSimpleName())));
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        long j = this.f124179a;
        if (j != 0) {
            return simpleName + "@" + j;
        }
        throw new IllegalStateException("Calling method on destroyed ".concat(String.valueOf(getClass().getSimpleName())));
    }
}

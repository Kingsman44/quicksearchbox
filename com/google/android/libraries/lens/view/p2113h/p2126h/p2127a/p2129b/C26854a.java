package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.b.a */
/* compiled from: PG */
public final class C26854a extends C26855b {

    /* renamed from: a */
    public final EGLContext f73166a;

    /* renamed from: b */
    public final EGLDisplay f73167b;

    /* renamed from: c */
    public final C58485gu f73168c;

    /* renamed from: d */
    public final boolean f73169d;

    /* renamed from: e */
    public final AtomicInteger f73170e;

    /* renamed from: f */
    private final EGLConfig f73171f;

    public C26854a(EGLConfig eGLConfig, EGLContext eGLContext, EGLDisplay eGLDisplay, C58485gu guVar, boolean z, AtomicInteger atomicInteger) {
        this.f73171f = eGLConfig;
        this.f73166a = eGLContext;
        this.f73167b = eGLDisplay;
        this.f73168c = guVar;
        this.f73169d = z;
        this.f73170e = atomicInteger;
    }

    /* renamed from: a */
    public final EGLConfig mo32221a() {
        return this.f73171f;
    }

    /* renamed from: b */
    public final EGLContext mo32222b() {
        return this.f73166a;
    }

    /* renamed from: c */
    public final EGLDisplay mo32223c() {
        return this.f73167b;
    }

    /* renamed from: d */
    public final C58485gu mo32224d() {
        return this.f73168c;
    }

    /* renamed from: e */
    public final AtomicInteger mo32225e() {
        return this.f73170e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26855b) {
            C26855b bVar = (C26855b) obj;
            return this.f73171f.equals(bVar.mo32221a()) && this.f73166a.equals(bVar.mo32222b()) && this.f73167b.equals(bVar.mo32223c()) && C58597ky.m90218i(this.f73168c, bVar.mo32224d()) && this.f73169d == bVar.mo32227f() && this.f73170e.equals(bVar.mo32225e());
        }
    }

    /* renamed from: f */
    public final boolean mo32227f() {
        return this.f73169d;
    }

    public final int hashCode() {
        return ((((((((((this.f73171f.hashCode() ^ 1000003) * 1000003) ^ this.f73166a.hashCode()) * 1000003) ^ this.f73167b.hashCode()) * 1000003) ^ this.f73168c.hashCode()) * 1000003) ^ (true != this.f73169d ? 1237 : 1231)) * 1000003) ^ this.f73170e.hashCode();
    }

    public final String toString() {
        String obj = this.f73171f.toString();
        String obj2 = this.f73166a.toString();
        String obj3 = this.f73167b.toString();
        String obj4 = this.f73168c.toString();
        boolean z = this.f73169d;
        String obj5 = this.f73170e.toString();
        return "ImagePumpGlContext{eglConfig=" + obj + ", eglContext=" + obj2 + ", eglDisplay=" + obj3 + ", cameraTextures=" + obj4 + ", gles3Supported=" + z + ", cameraTextureIndex=" + obj5 + "}";
    }
}

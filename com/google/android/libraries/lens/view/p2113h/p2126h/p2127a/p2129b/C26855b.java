package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26842c;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.b.b */
/* compiled from: PG */
public abstract class C26855b {
    /* renamed from: a */
    public abstract EGLConfig mo32221a();

    /* renamed from: b */
    public abstract EGLContext mo32222b();

    /* renamed from: c */
    public abstract EGLDisplay mo32223c();

    /* renamed from: d */
    public abstract C58485gu mo32224d();

    /* renamed from: e */
    public abstract AtomicInteger mo32225e();

    /* renamed from: f */
    public abstract boolean mo32227f();

    /* renamed from: g */
    public final EGLSurface mo32230g() {
        return ((C26842c) mo32224d().get(mo32225e().get())).f73146b;
    }
}

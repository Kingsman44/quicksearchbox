package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26842c;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26855b;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.ae */
/* compiled from: PG */
public final class C26849ae {

    /* renamed from: b */
    private static final C58974d f73157b = C58974d.m91135i("RunGlOperationHelper");

    /* renamed from: a */
    public final AtomicBoolean f73158a = new AtomicBoolean();

    /* renamed from: c */
    private final boolean f73159c;

    /* renamed from: d */
    private final C26851ag f73160d;

    /* renamed from: e */
    private final C26855b f73161e;

    public C26849ae(C25799b bVar, C26851ag agVar, C26855b bVar2) {
        boolean z = true;
        if (!bVar.mo30941b() && !bVar.mo30940a()) {
            z = false;
        }
        this.f73159c = z;
        this.f73160d = agVar;
        this.f73161e = bVar2;
    }

    /* renamed from: a */
    public final void mo32218a(Runnable runnable) {
        if (!this.f73158a.get()) {
            C26855b bVar = this.f73161e;
            if (!((C26842c) bVar.mo32224d().get(bVar.mo32225e().get())).f73145a.isValid()) {
                ((C58970a) ((C58970a) f73157b.mo56226d()).mo56372aa(49258)).mo56387q("Output of index %d is no longer valid", this.f73161e.mo32225e().get());
                return;
            }
            this.f73160d.mo32219a("runGlOperation");
            C26855b bVar2 = this.f73161e;
            EGL14.eglMakeCurrent(bVar2.mo32223c(), bVar2.mo32230g(), this.f73161e.mo32230g(), this.f73161e.mo32222b());
            if (EGL14.eglGetError() != 12288) {
                ((C58970a) ((C58970a) f73157b.mo56225c()).mo56372aa(49257)).mo56386p("Failed to set EGL context");
                this.f73160d.mo32220b();
                return;
            }
            try {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    ((C58970a) ((C58970a) f73157b.mo56226d()).mo56372aa(49256)).mo56389s("Cleared GL error: %s", GLU.gluErrorString(glGetError));
                    C26860b.m49758c(this.f73159c);
                }
                runnable.run();
                C26860b.m49758c(this.f73159c);
            } finally {
                EGL14.eglMakeCurrent(this.f73161e.mo32223c(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                this.f73160d.mo32220b();
            }
        }
    }
}

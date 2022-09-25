package com.google.android.libraries.lens.view.render;

import com.google.android.libraries.lens.view.livingsurfaces.C27250i;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.lens.p4708k.C62602j;

/* renamed from: com.google.android.libraries.lens.view.render.g */
/* compiled from: PG */
final class C27665g implements C27250i {

    /* renamed from: a */
    final /* synthetic */ C27251j f75527a;

    /* renamed from: b */
    final /* synthetic */ C27666h f75528b;

    public C27665g(C27666h hVar, C27251j jVar) {
        this.f75528b = hVar;
        this.f75527a = jVar;
    }

    /* renamed from: a */
    public final String mo32757a() {
        C62602j jVar = this.f75528b.f75533d;
        if (jVar != null) {
            return jVar.f169020b;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo32758b() {
        C62602j jVar = this.f75528b.f75533d;
        if (jVar != null) {
            return jVar.f169021c;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo32759c() {
        C27666h.m51479g(this.f75528b.f75531b, false);
        this.f75527a.mo32780e(this);
        this.f75528b.f75536g = false;
    }

    /* renamed from: d */
    public final void mo32760d(boolean z) {
        LensRenderer lensRenderer = this.f75528b.f75532c;
        if (lensRenderer != null) {
            lensRenderer.nSetMuted(lensRenderer.f75522b, z);
        }
    }

    /* renamed from: e */
    public final boolean mo32761e() {
        return this.f75528b.f75535f;
    }
}

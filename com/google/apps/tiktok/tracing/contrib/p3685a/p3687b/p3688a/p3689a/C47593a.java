package com.google.apps.tiktok.tracing.contrib.p3685a.p3687b.p3688a.p3689a;

import android.view.View;
import com.google.android.material.bottomsheet.C44555f;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.b.a.a.a */
/* compiled from: PG */
public final class C47593a extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C44555f f123513a;

    /* renamed from: b */
    final /* synthetic */ C47594b f123514b;

    public C47593a(C47594b bVar, C44555f fVar) {
        this.f123514b = bVar;
        this.f123513a = fVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        C47538ax c;
        if (!C47831fm.m85027v() && (c = this.f123514b.f123515a.mo51613c("onSlide")) != null) {
            c.close();
        }
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        if (C47831fm.m85027v()) {
            this.f123513a.mo32312b(view, i);
            return;
        }
        C47538ax c = this.f123514b.f123515a.mo51613c("onStateChanged");
        try {
            this.f123513a.mo32312b(view, i);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

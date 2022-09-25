package com.google.apps.tiktok.tracing.contrib.p3708i.p3711b;

import android.view.View;
import com.google.android.material.bottomsheet.C44555f;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.b.d */
/* compiled from: PG */
public final class C47696d extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C44555f f123651a;

    /* renamed from: b */
    final /* synthetic */ String f123652b = "StandaloneBottomSheetCallbackWrapper";

    /* renamed from: c */
    final /* synthetic */ C47697e f123653c;

    public C47696d(C47697e eVar, C44555f fVar) {
        this.f123653c = eVar;
        this.f123651a = fVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        C47538ax c = this.f123653c.f123654a.mo51613c(this.f123652b);
        try {
            this.f123651a.mo32311a(view, f);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47695c.m84834a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        if (C47831fm.m85027v()) {
            this.f123651a.mo32312b(view, i);
            return;
        }
        C47538ax c = this.f123653c.f123654a.mo51613c(this.f123652b);
        try {
            this.f123651a.mo32312b(view, i);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47695c.m84834a(th, th);
        }
        throw th;
    }
}

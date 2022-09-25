package com.google.android.libraries.silk.p3240c.p3252l;

import android.view.View;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.libraries.silk.c.l.d */
/* compiled from: PG */
public final /* synthetic */ class C41843d implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C41845f f109224a;

    /* renamed from: b */
    public final /* synthetic */ View f109225b;

    public /* synthetic */ C41843d(C41845f fVar, View view) {
        this.f109224a = fVar;
        this.f109225b = view;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C41845f fVar = this.f109224a;
        View view = this.f109225b;
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new C41844e(fVar));
        } else {
            fVar.f109228b.f109229a.mo44353b();
        }
    }
}

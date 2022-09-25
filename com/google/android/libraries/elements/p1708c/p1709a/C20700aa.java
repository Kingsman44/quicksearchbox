package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.View;
import com.google.protos.youtube.elements.p5165a.C66030r;

/* renamed from: com.google.android.libraries.elements.c.a.aa */
/* compiled from: PG */
final class C20700aa implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C66030r f57995a;

    /* renamed from: b */
    final /* synthetic */ C20702ac f57996b;

    public C20700aa(C20702ac acVar, C66030r rVar) {
        this.f57996b = acVar;
        this.f57995a = rVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        synchronized (this.f57996b.f58004d) {
            this.f57996b.mo25801d(this.f57995a.f179577b);
            this.f57996b.f58001a.remove(this.f57995a.f179577b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}

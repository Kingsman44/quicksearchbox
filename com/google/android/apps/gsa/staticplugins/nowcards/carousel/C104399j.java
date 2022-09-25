package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.j */
/* compiled from: PG */
final class C104399j implements C90656ba {

    /* renamed from: a */
    final /* synthetic */ C104404o f290492a;

    public C104399j(C104404o oVar) {
        this.f290492a = oVar;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        if (!this.f290492a.f290506D || motionEvent.getActionMasked() != 1 || !C104393d.m172602a(this.f290492a.f290505C, motionEvent)) {
            return false;
        }
        return true;
    }
}

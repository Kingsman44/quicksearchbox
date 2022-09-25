package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.f */
/* compiled from: PG */
final class C94120f implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C94124j f262944a;

    public C94120f(C94124j jVar) {
        this.f262944a = jVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f262944a.f63126Q.mo28316z() || motionEvent.getY() >= this.f262944a.f262961f.getY()) {
            return false;
        }
        this.f262944a.f262957b.mo88323e();
        return true;
    }
}

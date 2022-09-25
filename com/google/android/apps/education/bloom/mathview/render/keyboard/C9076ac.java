package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import java.util.TimerTask;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.ac */
/* compiled from: PG */
final class C9076ac extends TimerTask {

    /* renamed from: a */
    public final View f31315a;

    public C9076ac(View view) {
        C69664n.m101061g(view, "view");
        this.f31315a = view;
    }

    public final void run() {
        this.f31315a.post(new C9075ab(this));
    }
}

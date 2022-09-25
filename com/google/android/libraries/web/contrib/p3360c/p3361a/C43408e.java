package com.google.android.libraries.web.contrib.p3360c.p3361a;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.p3420k.C43855b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.c.a.e */
/* compiled from: PG */
final class C43408e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C43409f f113408a;

    public C43408e(C43409f fVar) {
        this.f113408a = fVar;
    }

    public final void run() {
        C43855b a;
        C43409f fVar = this.f113408a;
        if (fVar.f113413e.f113402a.f6612c.mo5788a(C2383n.STARTED) && (a = fVar.mo46508a()) != null) {
            FragmentManager childFragmentManager = fVar.f113413e.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(a);
            aVar.mo509f();
        }
    }
}

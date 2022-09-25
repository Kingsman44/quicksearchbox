package com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10181d.C134199ad;
import com.google.android.apps.search.googleapp.discover.p10181d.C134229r;
import com.google.android.apps.search.googleapp.discover.p10181d.C134234w;
import com.google.p4283bv.p4354e.C57528m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b.d */
/* compiled from: PG */
public final class C134837d implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C134839f f367081a;

    /* renamed from: b */
    final /* synthetic */ C57528m f367082b;

    public C134837d(C134839f fVar, C57528m mVar) {
        this.f367081a = fVar;
        this.f367082b = mVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C69664n.m101061g(view, "v");
        C134199ad adVar = this.f367081a.f367089d;
        C57528m mVar = this.f367082b;
        synchronized (adVar.f365549b) {
            adVar.mo111609c(mVar, new C134229r(adVar));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C69664n.m101061g(view, "v");
        C134199ad adVar = this.f367081a.f367089d;
        C57528m mVar = this.f367082b;
        synchronized (adVar.f365549b) {
            adVar.mo111609c(mVar, new C134234w(adVar));
        }
    }
}

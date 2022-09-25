package com.google.android.libraries.silk.event.p3259a;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40503c;
import com.google.android.libraries.silk.event.C41889a;
import com.google.android.libraries.silk.event.C41896d;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.silk.event.a.c */
/* compiled from: PG */
public final class C41892c implements C41889a {

    /* renamed from: a */
    public final C41893d f109290a;

    /* renamed from: b */
    private final Fragment f109291b;

    public C41892c(Fragment fragment, C41893d dVar) {
        this.f109291b = fragment;
        this.f109290a = dVar;
    }

    /* renamed from: a */
    public final C41896d mo44349a(Class cls) {
        return new C41891b(this, cls);
    }

    /* renamed from: b */
    public final void mo44350b(Class cls, C40503c cVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!this.f109291b.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "#registerSubscriptionObserver need to be called from within Fragment#OnCreate.");
        C41893d dVar = this.f109290a;
        C41890a aVar = new C41890a(this);
        dVar.mo44354a(cls).add(cVar);
        if (dVar.f109293b.containsKey(cls)) {
            cVar.mo42471a(aVar);
        }
    }
}

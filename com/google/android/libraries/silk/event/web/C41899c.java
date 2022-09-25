package com.google.android.libraries.silk.event.web;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40503c;
import com.google.android.libraries.silk.event.C41889a;
import com.google.android.libraries.silk.event.C41896d;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.silk.event.web.c */
/* compiled from: PG */
public final class C41899c implements C41889a {

    /* renamed from: a */
    private final WebModelProvider f109299a;

    /* renamed from: b */
    private final Fragment f109300b;

    /* renamed from: c */
    private boolean f109301c = false;

    public C41899c(WebModelProvider webModelProvider, Fragment fragment) {
        this.f109299a = webModelProvider;
        this.f109300b = fragment;
    }

    /* renamed from: a */
    public final C41896d mo44349a(Class cls) {
        return new C41898b(this, cls);
    }

    /* renamed from: b */
    public final void mo44350b(Class cls, C40503c cVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!this.f109300b.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "#registerSubscriptionObserver need to be called from within Fragment#OnCreate.");
        if (!this.f109301c) {
            this.f109300b.getLifecycle().mo5790b(new SilkEventCoordinatorWebImpl$3(mo44355c()));
            this.f109301c = true;
        }
        C41900d c = mo44355c();
        C41897a aVar = new C41897a(this);
        c.mo44357b(cls).add(cVar);
        if (c.f109303b.containsKey(cls)) {
            cVar.mo42471a(aVar);
        }
    }

    /* renamed from: c */
    public final C41900d mo44355c() {
        return (C41900d) this.f109299a.mo47072a(C41900d.class);
    }
}

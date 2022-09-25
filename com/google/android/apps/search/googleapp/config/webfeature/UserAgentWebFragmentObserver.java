package com.google.android.apps.search.googleapp.config.webfeature;

import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.config.C133664c;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.libraries.web.p3343a.C43227c;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* compiled from: PG */
public final class UserAgentWebFragmentObserver implements C43773b {

    /* renamed from: a */
    private final C43227c f364085a;

    /* renamed from: b */
    private final C133665d f364086b;

    public UserAgentWebFragmentObserver(C43227c cVar, C133665d dVar) {
        this.f364085a = cVar;
        this.f364086b = dVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C133665d dVar = this.f364086b;
        String a = this.f364085a.mo46278a();
        dVar.f364080c.mo46039a(new C133664c(a), C60826bg.f164896a);
        synchronized (dVar.f364078a) {
            dVar.f364081d = C60856cj.m92900i(dVar.mo111321b(a));
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}

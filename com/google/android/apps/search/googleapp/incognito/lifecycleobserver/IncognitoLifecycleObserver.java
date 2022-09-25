package com.google.android.apps.search.googleapp.incognito.lifecycleobserver;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136238h;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136240j;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136300ah;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136302aj;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136304al;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136336y;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136337z;
import com.google.apps.tiktok.account.data.p3613b.C46177b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* compiled from: PG */
public final class IncognitoLifecycleObserver implements C2376g {

    /* renamed from: a */
    private final Fragment f371279a;

    /* renamed from: b */
    private final C46177b f371280b;

    /* renamed from: c */
    private final C136337z f371281c;

    public IncognitoLifecycleObserver(Fragment fragment, C46177b bVar, C136337z zVar) {
        this.f371279a = fragment;
        this.f371280b = bVar;
        this.f371281c = zVar;
    }

    /* renamed from: g */
    public final void mo112948g() {
        if (this.f371280b.mo41484a()) {
            this.f371279a.getLifecycle().mo5790b(this);
        }
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        C136337z zVar = this.f371281c;
        C136304al alVar = zVar.f371212g;
        C60870cx b = alVar.f371127f.mo51512b(new C136300ah(alVar), alVar.f371126e);
        C136302aj ajVar = new C136302aj(alVar);
        C60856cj.m92911t(b, C47810es.m84974n(ajVar), alVar.f371126e);
        if (zVar.mo112925a() == null) {
            C60870cx cxVar = zVar.f371218m;
            if (cxVar != null && !cxVar.isDone()) {
                zVar.f371218m.cancel(true);
            }
            zVar.f371218m = null;
            C136240j jVar = zVar.f371211f;
            C46459k.m82829b(jVar.f371025a.mo46039a(new C136238h(jVar), C60826bg.f164896a), "Failed to set the last active time for Incognito session.", new Object[0]);
        }
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        C136337z zVar = this.f371281c;
        zVar.f371212g.mo112896a();
        if (zVar.f371218m == null) {
            C60870cx d = zVar.f371211f.f371025a.mo46042d();
            C136336y yVar = new C136336y(zVar);
            zVar.f371218m = C60922j.m93044g(d, C47810es.m84963c(yVar), zVar.f371210e);
        }
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}

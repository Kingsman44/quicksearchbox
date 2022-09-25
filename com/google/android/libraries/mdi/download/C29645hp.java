package com.google.android.libraries.mdi.download;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.mdi.download.hp */
/* compiled from: PG */
final class C29645hp implements C28742bt {

    /* renamed from: a */
    final /* synthetic */ C29422b f80286a;

    /* renamed from: b */
    final /* synthetic */ C28740br f80287b;

    /* renamed from: c */
    final /* synthetic */ C1839z f80288c;

    /* renamed from: d */
    final /* synthetic */ C1800aq f80289d;

    /* renamed from: e */
    final /* synthetic */ int f80290e;

    /* renamed from: f */
    final /* synthetic */ String f80291f;

    /* renamed from: g */
    final /* synthetic */ C29647hr f80292g;

    public C29645hp(C29647hr hrVar, C29422b bVar, C28740br brVar, C1839z zVar, C1800aq aqVar, int i, String str) {
        this.f80292g = hrVar;
        this.f80286a = bVar;
        this.f80287b = brVar;
        this.f80288c = zVar;
        this.f80289d = aqVar;
        this.f80290e = i;
        this.f80291f = str;
    }

    /* renamed from: a */
    public final void mo33124a(C29690f fVar) {
        C29643hn hnVar = new C29643hn(this, this.f80287b, fVar, this.f80288c, this.f80289d, this.f80290e, this.f80286a);
        C60856cj.m92905n(C47810es.m84965e(hnVar), this.f80292g.f80301g);
    }

    /* renamed from: b */
    public final void mo33125b(Throwable th) {
        C29644ho hoVar = new C29644ho(this, this.f80287b, this.f80288c, this.f80289d, this.f80290e, th, this.f80286a);
        C60856cj.m92905n(C47810es.m84965e(hoVar), this.f80292g.f80301g);
    }

    /* renamed from: c */
    public final void mo33126c(long j) {
        C60870cx c = this.f80292g.f80299e.mo34566c(((C29421a) this.f80286a).f79765a);
        C29641hl hlVar = new C29641hl(this.f80287b, this.f80288c, j, this.f80289d, this.f80290e);
        C60922j.m93045h(c, C47810es.m84966f(hlVar), this.f80292g.f80301g);
    }

    /* renamed from: d */
    public final void mo33127d() {
        C60870cx c = this.f80292g.f80299e.mo34566c(((C29421a) this.f80286a).f79765a);
        C29642hm hmVar = new C29642hm(this.f80287b, this.f80288c, this.f80291f, this.f80289d, this.f80290e);
        C60922j.m93045h(c, C47810es.m84966f(hmVar), this.f80292g.f80301g);
    }
}

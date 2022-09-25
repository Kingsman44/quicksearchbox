package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95838j;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.ab */
/* compiled from: PG */
final class C95031ab extends C95037ah {

    /* renamed from: a */
    final /* synthetic */ C95038ai f265870a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95031ab(C95038ai aiVar) {
        super(aiVar);
        this.f265870a = aiVar;
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        this.f265870a.mo88957j(bArr);
    }

    /* renamed from: c */
    public final C37336c mo88949c(boolean z) {
        if (z) {
            C95038ai aiVar = this.f265870a;
            if (aiVar.f265887j == null) {
                aiVar.f265881d.mo88999f();
            }
        }
        this.f265870a.mo88956i("ACTIVE");
        C37336c cVar = this.f265870a.f265886i;
        cVar.getClass();
        C37336c g = C95038ai.m156961g(((C37334a) cVar).f99173a);
        this.f265870a.f265886i = g;
        return g;
    }

    /* renamed from: d */
    public final C60870cx mo88950d(boolean z) {
        if (z) {
            this.f265870a.f265881d.mo88997c();
        }
        this.f265870a.mo88956i("CLOSING");
        return this.f265870a.f265885h.mo88950d(false);
    }

    /* renamed from: e */
    public final void mo88948e() {
        this.f265870a.mo88956i("CLOSED");
    }

    /* renamed from: f */
    public final String mo88951f() {
        return "CACHING";
    }

    /* renamed from: g */
    public final void mo88952g() {
        this.f265870a.f265881d.mo88997c();
        this.f265870a.mo88956i("CLOSING");
        if (this.f265870a.f265884g.isPresent()) {
            ((C95838j) this.f265870a.f265884g.get()).mo89803d();
        }
    }
}

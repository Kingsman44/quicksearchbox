package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.ah */
/* compiled from: PG */
abstract class C95037ah extends C95034ae {

    /* renamed from: b */
    C60870cx f265876b;

    /* renamed from: c */
    final /* synthetic */ C95038ai f265877c;

    public C95037ah(C95038ai aiVar) {
        this.f265877c = aiVar;
    }

    /* renamed from: g */
    public abstract void mo88952g();

    /* renamed from: h */
    public void mo88954h() {
        C60870cx cxVar = this.f265876b;
        if (cxVar != null && !cxVar.isDone()) {
            this.f265876b.cancel(false);
        }
        this.f265876b = null;
    }

    /* renamed from: iu */
    public void mo88953iu() {
        C60870cx cxVar = this.f265876b;
        if (cxVar != null && !cxVar.isDone()) {
            this.f265876b.cancel(false);
        }
        this.f265876b = this.f265877c.f265882e.mo28204d("onTimeout", C95038ai.f265879b, new C95036ag(this));
    }
}

package com.google.android.apps.gsa.staticplugins.p7443bd;

import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.gcoreclient.p1772j.p1773a.C21565a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bd.g */
/* compiled from: PG */
final class C94540g extends C90880an {

    /* renamed from: a */
    public C60870cx f264425a;

    /* renamed from: b */
    public volatile boolean f264426b = false;

    /* renamed from: c */
    final /* synthetic */ C94541h f264427c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94540g(C94541h hVar) {
        super("Hallmonitor auth", 1, 28);
        this.f264427c = hVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C60870cx b = this.f264427c.f264428a.mo85137b(new C94538e(this), 10000);
        C21565a aVar = (C21565a) this.f264427c.f264430c.mo17428b();
        b.cancel(true);
        if (!this.f264426b) {
            synchronized (this.f264427c) {
                C94541h hVar = this.f264427c;
                hVar.f264432e = aVar;
                hVar.f264431d = null;
            }
            this.f264427c.f264428a.mo85137b(new C94539f(this), 60000);
            return aVar;
        }
        synchronized (this.f264427c) {
            this.f264427c.f264431d = null;
        }
        aVar.mo27015a();
        throw new C94537d();
    }
}

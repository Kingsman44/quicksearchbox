package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dh */
/* compiled from: PG */
public final class C114865dh {

    /* renamed from: a */
    public final C21370a f318697a;

    /* renamed from: b */
    public long f318698b;

    /* renamed from: c */
    public C89062r f318699c = null;

    /* renamed from: d */
    private final C22871g f318700d;

    /* renamed from: e */
    private final C68214a f318701e;

    public C114865dh(C22871g gVar, C68214a aVar, C21370a aVar2) {
        this.f318700d = gVar;
        this.f318701e = aVar;
        this.f318697a = aVar2;
        this.f318698b = 0;
    }

    /* renamed from: a */
    public final void mo101662a(C114864dg dgVar) {
        if (this.f318699c == null || this.f318697a.mo26870b() - this.f318698b >= 500) {
            new C90873ag(((C89037bh) this.f318701e.mo27525b()).mo27378c(), this.f318700d, "Get connectivity info", new C114862de(this, dgVar)).mo85223a(new C114863df(dgVar));
            return;
        }
        C89062r rVar = this.f318699c;
        rVar.getClass();
        dgVar.mo101408a(rVar);
    }
}

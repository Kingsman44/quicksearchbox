package androidx.mediarouter.p175a;

import java.util.Collection;

/* renamed from: androidx.mediarouter.a.af */
/* compiled from: PG */
final class C3670af {

    /* renamed from: a */
    final /* synthetic */ C3679ao f11799a;

    public C3670af(C3679ao aoVar) {
        this.f11799a = aoVar;
    }

    /* renamed from: a */
    public final void mo7724a(C3745r rVar, C3739l lVar, Collection collection) {
        C3679ao aoVar = this.f11799a;
        if (rVar == aoVar.f11839u && lVar != null) {
            C3684at atVar = aoVar.f11838t.f11861a;
            String n = lVar.mo7895n();
            C3685au auVar = new C3685au(atVar, n, this.f11799a.mo7736f(atVar, n));
            auVar.mo7755b(lVar);
            C3679ao aoVar2 = this.f11799a;
            if (aoVar2.f11836r != auVar) {
                aoVar2.mo7739i(aoVar2, auVar, aoVar2.f11839u, 3, aoVar2.f11838t, collection);
                C3679ao aoVar3 = this.f11799a;
                aoVar3.f11838t = null;
                aoVar3.f11839u = null;
            }
        } else if (rVar == aoVar.f11837s) {
            if (lVar != null) {
                aoVar.mo7731a(aoVar.f11836r, lVar);
            }
            this.f11799a.f11836r.mo7759f(collection);
        }
    }
}

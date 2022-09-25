package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82567jz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.d */
/* compiled from: PG */
public final /* synthetic */ class C113900d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C113916t f315357a;

    public /* synthetic */ C113900d(C113916t tVar) {
        this.f315357a = tVar;
    }

    public final void run() {
        C58836b bVar;
        C113916t tVar = this.f315357a;
        C58976aa aaVar = C58975e.f156826a;
        C58833ax b = tVar.f315395e.mo56106b(C113901e.f315358a);
        C89849ae a = b.mo56113h() ? tVar.f315397g.mo100772a(((Long) b.mo56107c()).longValue()) : null;
        if (a != null) {
            bVar = C58836b.f156633a;
        } else if (tVar.f315394d.containsKey(C113913q.ACTIVITY_STOPPED)) {
            C89849ae aeVar = C89849ae.OPA_ENDSTATE_CANCEL_ACTIVITY_STOP;
            C58833ax k = C58833ax.m90834k((Long) ((C58833ax) tVar.f315394d.get(C113913q.ACTIVITY_STOPPED)).mo56109e(Long.valueOf(tVar.f315392b.mo26872d())));
            C58836b bVar2 = C58836b.f156633a;
            tVar.mo100764h(aeVar, k, bVar2, bVar2);
            C82567jz c = C82569ka.m131549c();
            ((C82338bm) c).f224930b = "timeout_activity";
            tVar.mo100768l(c.mo75772a());
        } else {
            a = C89849ae.OPA_ENDSTATE_TIMEOUT;
            bVar = C58836b.f156633a;
        }
        tVar.mo100764h(a, bVar, bVar, bVar);
        C82567jz c2 = C82569ka.m131549c();
        ((C82338bm) c2).f224930b = "timeout_activity";
        tVar.mo100768l(c2.mo75772a());
    }
}

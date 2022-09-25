package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C98173aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274141a;

    public /* synthetic */ C98173aa(C98211bl blVar) {
        this.f274141a = blVar;
    }

    public final C60870cx apply(Object obj) {
        C98211bl blVar = this.f274141a;
        C118314e eVar = (C118314e) obj;
        try {
            C58480gp e = C58485gu.m89837e();
            while (eVar.hasNext()) {
                e.mo55395g(((C118332u) eVar.next()).f328461b);
            }
            C58485gu f = e.mo55394f();
            C60870cx i = C60856cj.m92900i(false);
            if (!f.isEmpty()) {
                i = C60922j.m93045h(blVar.f274221k.mo91036a(blVar.f274223m.mo79659F(), ((C58724pq) f).f156474d), new C98185am(blVar, f), C60826bg.f164896a);
                new C90873ag(i, blVar.f274226p, "commitDeferredActions", new C98230u(blVar, f)).mo85223a(C98231v.f274266a);
            }
            C60870cx g = C60922j.m93044g(i, new C98232w(blVar, f), C60826bg.f164896a);
            if (eVar != null) {
                eVar.mo91755c().mo91751b();
            }
            return g;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.mo91755c().mo91751b();
            }
            throw th;
        }
    }
}

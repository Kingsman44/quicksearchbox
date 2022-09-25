package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91389a;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.r */
/* compiled from: PG */
public final /* synthetic */ class C105356r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C105360v f293956a;

    /* renamed from: b */
    public final /* synthetic */ C7642eo f293957b;

    public /* synthetic */ C105356r(C105360v vVar, C7642eo eoVar) {
        this.f293956a = vVar;
        this.f293957b = eoVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C105360v vVar = this.f293956a;
        C7642eo eoVar = this.f293957b;
        C90748e.m148224b();
        C91396h hVar = (C91396h) C90877ak.m148473g(vVar.f293963c.mo85730f(vVar.f293962b, false, eoVar, (C7669fo) null, 3), 20, TimeUnit.SECONDS);
        if (hVar != null) {
            return new C91389a(hVar.mo85711a(), hVar.mo85712b(), hVar.mo85713c(), true);
        }
        return null;
    }
}

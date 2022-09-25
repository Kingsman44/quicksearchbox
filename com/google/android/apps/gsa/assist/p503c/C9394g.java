package com.google.android.apps.gsa.assist.p503c;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.assist.c.g */
/* compiled from: PG */
public final class C9394g {

    /* renamed from: a */
    private final C86054o f32561a;

    /* renamed from: b */
    private final C86338r f32562b;

    /* renamed from: c */
    private final C9393f f32563c;

    public C9394g(C86054o oVar, C9393f fVar, C86338r rVar) {
        this.f32561a = oVar;
        this.f32563c = fVar;
        this.f32562b = rVar;
    }

    /* renamed from: c */
    private final String m23866c() {
        Account a = this.f32561a.mo79668a();
        if (a == null || TextUtils.isEmpty(a.name)) {
            return null;
        }
        return a.name;
    }

    /* renamed from: a */
    public final int mo17589a() {
        String c = m23866c();
        if (c == null) {
            return 0;
        }
        return this.f32562b.getInt(C90507o.f253020j.concat(c), 0);
    }

    /* renamed from: b */
    public final void mo17590b(int i) {
        String c = m23866c();
        if (c != null) {
            C86337q b = this.f32562b.mo80076b();
            b.mo80070e(C90507o.f253020j.concat(c), i);
            b.apply();
            C9393f fVar = this.f32563c;
            C60870cx b2 = fVar.f32559b.mo79697b();
            C9391d dVar = new C9391d(fVar, i);
            C60922j.m93045h(b2, C47810es.m84966f(dVar), fVar.f32560c);
        }
    }
}

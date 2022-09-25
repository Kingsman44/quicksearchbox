package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b.C133206a;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.g */
/* compiled from: PG */
public final class C133224g implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C133231n f363113a;

    public C133224g(C133231n nVar) {
        this.f363113a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C46691ai mo20330a() {
        return C133231n.f363124e;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C133231n nVar = this.f363113a;
        if (!nVar.f363134o || !nVar.f363135p.isPresent()) {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            cxVar = ((C133206a) this.f363113a.f363135p.get()).mo111023a();
        }
        C133231n nVar2 = this.f363113a;
        if (nVar2.f363134o) {
            C133241x xVar = nVar2.f363138s;
            cxVar2 = C47633f.m84733g(xVar.f363160a.mo46042d()).mo51515h(C133239v.f363158a, xVar.f363161b);
        } else {
            cxVar2 = C60856cj.m92900i(false);
        }
        return C47636i.m84746e(cxVar, cxVar2).mo51519b(new C133223f(this, cxVar, cxVar2), this.f363113a.f363127h);
    }
}

package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.k.k */
/* compiled from: PG */
public final /* synthetic */ class C89815k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C89826v f243103a;

    /* renamed from: b */
    public final /* synthetic */ C89809e f243104b;

    /* renamed from: c */
    public final /* synthetic */ C89825u f243105c;

    /* renamed from: d */
    public final /* synthetic */ int f243106d;

    public /* synthetic */ C89815k(C89826v vVar, C89809e eVar, C89825u uVar, int i) {
        this.f243103a = vVar;
        this.f243104b = eVar;
        this.f243105c = uVar;
        this.f243106d = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C89826v vVar = this.f243103a;
        C89809e eVar = this.f243104b;
        C89825u uVar = this.f243105c;
        int i = this.f243106d;
        C89794ab abVar = (C89794ab) obj;
        if (abVar == null) {
            ((C59052c) ((C59052c) C89826v.f243137a.mo56226d()).mo56372aa(10527)).mo56389s("Failed to get Eureka info for device: %s", eVar.mo83648d());
            vVar.mo83676d(eVar, uVar, i);
            return;
        }
        int i2 = abVar.f243048m;
        if (i2 >= 10) {
            vVar.f243140d.mo28213m("Retry HTTPS request after fallback", vVar.f243139c.mo79743a(C90082eg.f249996cF), new C89819o(vVar, eVar, i2, uVar));
        } else {
            vVar.mo83677e(abVar, eVar, uVar);
        }
    }
}

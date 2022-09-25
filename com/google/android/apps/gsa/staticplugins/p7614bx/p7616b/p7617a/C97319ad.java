package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.ad */
/* compiled from: PG */
public final class C97319ad {

    /* renamed from: a */
    final /* synthetic */ C97320ae f271779a;

    public C97319ad(C97320ae aeVar) {
        this.f271779a = aeVar;
    }

    /* renamed from: a */
    public final void mo90641a() {
        if (this.f271779a.mo90654p()) {
            this.f271779a.mo90649k();
        }
    }

    /* renamed from: b */
    public final void mo90642b() {
        C60870cx cxVar = this.f271779a.f271811u;
        if (cxVar != null && !cxVar.isDone()) {
            this.f271779a.f271811u.cancel(true);
        }
        C97320ae aeVar = this.f271779a;
        aeVar.f271811u = null;
        int i = aeVar.f271808r;
        if (i != -1) {
            aeVar.f271801k.mo79059k(i, 2);
            C97320ae aeVar2 = this.f271779a;
            aeVar2.f271808r = -1;
            aeVar2.f271812v = 1;
        }
    }

    /* renamed from: c */
    public final void mo90643c() {
        if (this.f271779a.mo90654p()) {
            C97320ae aeVar = this.f271779a;
            long j = aeVar.f271809s;
            if (j > 0) {
                aeVar.f271811u = aeVar.f271796f.mo28208h("Dismiss tooltip", j, new C97348z(this));
            }
            C97320ae aeVar2 = this.f271779a;
            if (aeVar2.f271812v == 2) {
                new C90873ag(aeVar2.f271800j.mo46039a(new C97316aa(this), C60826bg.f164896a), this.f271779a.f271796f, "maybeHighlightIncognitoSearchMenuItem", new C97317ab(this)).mo85223a(C97318ac.f271778a);
            }
            C97320ae aeVar3 = this.f271779a;
            int i = aeVar3.f271808r;
            if (i != -1) {
                aeVar3.f271801k.mo79055g(i);
            }
        }
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.e */
/* compiled from: PG */
final class C94987e extends C94991i {

    /* renamed from: a */
    final long f265728a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public C60870cx f265729b;

    /* renamed from: c */
    final /* synthetic */ C94995m f265730c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94987e(C94995m mVar) {
        super(mVar, "DONE");
        this.f265730c = mVar;
    }

    /* renamed from: a */
    public final void mo88895a() {
        C59071e eVar = C94995m.f265738a;
        C58976aa aaVar = C58975e.f156826a;
        C95007y yVar = this.f265730c.f265751n;
        if (yVar != null) {
            yVar.mo88814e();
        }
        this.f265730c.f265742e.mo88914c();
        this.f265730c.f265742e.f265815d.mo89057b();
        this.f265730c.mo88902f("IDLE");
    }

    /* renamed from: b */
    public final void mo88896b() {
        super.mo88896b();
        this.f265730c.f265750m.mo89374C();
        C94995m mVar = this.f265730c;
        mVar.f265742e.f265817f = 0;
        mVar.mo88901e();
        C94995m mVar2 = this.f265730c;
        if (mVar2.f265753p) {
            mVar2.f265752o = true;
            mVar2.f265757t = false;
            C58976aa aaVar = C58975e.f156826a;
            C95007y yVar = this.f265730c.f265751n;
            yVar.getClass();
            yVar.mo88826q();
            this.f265730c.f265760w = true;
            this.f265729b = this.f265730c.f265740c.mo28208h("TimeoutWaitingForFollowOnQueryStart", this.f265728a, new C94986d(this));
            return;
        }
        C95007y yVar2 = mVar2.f265751n;
        yVar2.getClass();
        yVar2.mo88815f(mVar2.f265754q);
        C95006x xVar = this.f265730c.f265742e;
        C58976aa aaVar2 = C58975e.f156826a;
        xVar.f265815d.mo89057b();
        this.f265730c.mo88902f("IDLE");
    }

    /* renamed from: c */
    public final void mo88897c() {
        super.mo88897c();
        C94995m mVar = this.f265730c;
        mVar.f265753p = false;
        mVar.f265754q = C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED;
        C60870cx cxVar = this.f265729b;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f265729b = null;
        }
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.au */
/* compiled from: PG */
final class C95084au extends C95095be {

    /* renamed from: a */
    final long f265994a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public C60870cx f265995b;

    /* renamed from: c */
    final /* synthetic */ C95097bg f265996c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95084au(C95097bg bgVar) {
        super(bgVar, "DONE");
        this.f265996c = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        this.f265996c.mo89015b();
        C95097bg bgVar = this.f265996c;
        if (bgVar.f266019C) {
            bgVar.f266018B = true;
            bgVar.f266053y = true;
            C58976aa aaVar = C58975e.f156826a;
            C95127t tVar = this.f265996c.f266026J;
            if (tVar != null) {
                tVar.mo89049c();
            }
            C95097bg bgVar2 = this.f265996c;
            bgVar2.f266021E = true;
            this.f265995b = bgVar2.f266032d.mo28208h("TimeoutWaitingForFollowOnQueryStart", this.f265994a, new C95083at(this));
            return;
        }
        C95133z zVar = bgVar.f266034f;
        C58976aa aaVar2 = C58975e.f156826a;
        zVar.f266164f.mo89057b();
        this.f265996c.mo89018e("IDLE");
    }

    /* renamed from: is */
    public final void mo89004is() {
        super.mo89004is();
        C95097bg bgVar = this.f265996c;
        if (bgVar.f266019C) {
            bgVar.f266019C = false;
        }
        C60870cx cxVar = this.f265995b;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f265995b = null;
        }
    }
}

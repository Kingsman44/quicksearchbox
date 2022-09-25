package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.v */
/* compiled from: PG */
final class C95758v extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268076a;

    /* renamed from: c */
    private Uri f268077c = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95758v(C95759w wVar) {
        super(wVar);
        this.f268076a = wVar;
    }

    /* renamed from: b */
    public final void mo89732b(byte[] bArr) {
        super.mo89732b(bArr);
        C59104x d = C95759w.f268078a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) d).mo56372aa(15405)).mo56386p("VOICE_DATA_DONE. Closing mic");
        C95759w wVar = this.f268076a;
        wVar.f268100k.mo89293f(wVar.f268093d);
        this.f268076a.mo89747m(C95748l.NONE);
    }

    /* renamed from: d */
    public final void mo89734d() {
        this.f268076a.mo89739e(C95748l.NONE).mo89734d();
    }

    /* renamed from: e */
    public final void mo89735e() {
        this.f268077c = this.f268076a.f268094e.mo89782b();
    }

    /* renamed from: f */
    public final void mo89736f(C95748l lVar) {
        if (this.f268076a.f268094e.mo89695r()) {
            this.f268076a.f268094e.f268275d = 0;
            this.f268076a.f268098i.mo88991g();
        }
        this.f268076a.f268094e.mo89784i(this.f268077c);
        this.f268077c = null;
    }

    /* renamed from: g */
    public final void mo89737g() {
        this.f268076a.f268094e.mo89788p();
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.p10712d.C142386dk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.u */
/* compiled from: PG */
final class C95757u extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268075a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95757u(C95759w wVar) {
        super(wVar);
        this.f268075a = wVar;
    }

    /* renamed from: c */
    public final void mo89733c(C142386dk dkVar) {
        C59104x c = C95759w.f268078a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) c).mo56372aa(15402)).mo56386p("Received unsolicited VoiceStop! Cleaning up CP");
        super.mo89733c(dkVar);
        this.f268075a.mo89747m(C95748l.NONE);
    }

    /* renamed from: e */
    public final void mo89735e() {
        this.f268075a.f268096g.mo28212l("bisto-hotword-start-input", new C95755s(this));
        this.f268075a.mo89746l();
    }

    /* renamed from: f */
    public final void mo89736f(C95748l lVar) {
        if (lVar != C95748l.VOICE_DATA_DONE) {
            this.f268075a.mo89740f();
        }
    }

    /* renamed from: g */
    public final void mo89737g() {
        this.f268075a.mo89747m(C95748l.VOICE_DATA_DONE);
    }
}

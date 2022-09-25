package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.az */
/* compiled from: PG */
final class C95089az extends C95091ba {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266003a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95089az(C95097bg bgVar) {
        super(bgVar, "NO_SPEECH_DETECTED");
        this.f266003a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        String str;
        super.mo89003a();
        this.f266003a.f266044p.mo89277r(7);
        this.f266003a.mo89021i(3);
        C95097bg bgVar = this.f266003a;
        if (bgVar.f266018B) {
            C59104x b = C95097bg.f266015a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18010)).mo56389s("expectedFollowOnResponseType %s", this.f266003a.f266020D);
            if (this.f266003a.f266020D == C86253h.ACTION_V2) {
                Integer g = this.f266003a.f266036h.mo89215g(13);
                if (g == null) {
                    str = null;
                } else {
                    str = this.f266003a.f266031c.getString(g.intValue());
                }
            } else {
                this.f266003a.mo89018e("RUNNING_ACTION");
                return;
            }
        } else {
            C95288a aVar = bgVar.f266050v;
            if (aVar == null || !aVar.mo89208d()) {
                C95097bg bgVar2 = this.f266003a;
                str = bgVar2.f266036h.mo89216i(bgVar2.f266031c, 23);
                this.f266003a.f266036h.mo89219l(23);
            } else {
                this.f266003a.f266050v.mo89207c();
                this.f266003a.mo89018e("DONE");
                return;
            }
        }
        mo89012h(str);
    }

    /* renamed from: f */
    public final void mo89008f() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
        this.f266003a.mo89018e("AUDIO_DELAY_COMPENSATION");
    }
}

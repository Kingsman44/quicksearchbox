package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95802ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142386dk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.r */
/* compiled from: PG */
class C95754r {

    /* renamed from: b */
    final /* synthetic */ C95759w f268072b;

    public C95754r(C95759w wVar) {
        this.f268072b = wVar;
    }

    /* renamed from: a */
    public void mo89731a(C142379dd ddVar) {
    }

    /* renamed from: b */
    public void mo89732b(byte[] bArr) {
        if (!this.f268072b.f268102m.mo56113h()) {
            C59104x b = C95759w.f268078a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) b).mo56372aa(15401)).mo56386p("ignored VoiceData (no audio Handler set)");
            return;
        }
        C95759w wVar = this.f268072b;
        wVar.f268115z += bArr.length;
        if (wVar.f268080A != null) {
            C58976aa aaVar = C58975e.f156826a;
            Arrays.hashCode(this.f268072b.f268080A);
            ((C95802ch) this.f268072b.f268102m.mo56107c()).mo89728a(this.f268072b.f268080A);
            C95759w wVar2 = this.f268072b;
            wVar2.f268109t += wVar2.f268080A.length;
            wVar2.f268080A = null;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        Arrays.hashCode(bArr);
        ((C95802ch) this.f268072b.f268102m.mo56107c()).mo89728a(bArr);
    }

    /* renamed from: c */
    public void mo89733c(C142386dk dkVar) {
        this.f268072b.f268097h.mo26870b();
        C95759w wVar = this.f268072b;
        C95832d dVar = wVar.f268106q;
        if (dVar != null) {
            dVar.f268363b = wVar.f268109t;
        }
    }

    /* renamed from: d */
    public void mo89734d() {
    }

    /* renamed from: e */
    public void mo89735e() {
    }

    /* renamed from: f */
    public void mo89736f(C95748l lVar) {
    }

    /* renamed from: g */
    public void mo89737g() {
    }
}

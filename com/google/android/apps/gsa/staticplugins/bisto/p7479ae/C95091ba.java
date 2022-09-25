package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ba */
/* compiled from: PG */
class C95091ba extends C95095be implements C95101bk, C95122o {

    /* renamed from: a */
    private C95103bm f266007a;

    /* renamed from: b */
    final /* synthetic */ C95097bg f266008b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95091ba(C95097bg bgVar, String str) {
        super(bgVar, str);
        this.f266008b = bgVar;
    }

    /* renamed from: a */
    public void mo89003a() {
        super.mo89003a();
        if (!this.f266008b.f266029M.f266012d.equals("NO_SPEECH_DETECTED")) {
            this.f266008b.f266045q.mo89128g(false);
        }
    }

    /* renamed from: b */
    public final void mo89009b(int i, boolean z) {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo89010c(C94648l lVar) {
        return this.f266007a == lVar;
    }

    /* renamed from: d */
    public final void mo89006d() {
        if (this.f266008b.f266042n.mo89153b() != null && this.f266007a == this.f266008b.f266042n.mo89153b()) {
            this.f266008b.f266042n.mo89159g((C95294af) null);
        }
        super.mo89006d();
    }

    /* renamed from: f */
    public void mo89008f() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public final void mo89011g(C95102bl blVar) {
        C95103bm bmVar = new C95103bm(blVar, this);
        this.f266007a = bmVar;
        if (!this.f266008b.f266042n.mo89170r(bmVar)) {
            C59104x c = C95097bg.f266015a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) c).mo56372aa(18014)).mo56386p("playQueryResultAnnouncement - fail");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo89012h(String str) {
        if (str == null) {
            mo89008f();
            return;
        }
        C95097bg bgVar = this.f266008b;
        mo89011g(new C95102bl(bgVar.f266031c, (CharSequence) str, (C95101bk) this, bgVar.f266041m, bgVar.f266033e));
    }

    /* renamed from: ir */
    public final void mo89013ir() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
    }
}

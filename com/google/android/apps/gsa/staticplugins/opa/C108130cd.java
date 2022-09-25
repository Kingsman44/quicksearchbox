package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cd */
/* compiled from: PG */
final class C108130cd extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C109040fj f300759a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108130cd(C109040fj fjVar) {
        super("Check device lock state", 2, 0);
        this.f300759a = fjVar;
    }

    public final void run() {
        if (!this.f300759a.mo97519bk()) {
            this.f300759a.f303448m.mo28212l("Update lock icon", new C108129cc(this, !this.f300759a.mo97524bq()));
            return;
        }
        C90888av avVar = (C90888av) this.f300759a.f303233S.get();
        if (avVar != null) {
            C109040fj fjVar = this.f300759a;
            fjVar.f303447l.mo85137b(avVar, fjVar.f303455t.mo79743a(C90014bt.f247426gt));
        }
    }
}

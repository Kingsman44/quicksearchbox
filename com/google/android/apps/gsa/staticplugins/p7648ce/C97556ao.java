package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91598e;
import com.google.android.apps.p489g.p495e.C9287d;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.ao */
/* compiled from: PG */
final class C97556ao extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C97565ax f272490a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97556ao(C97565ax axVar) {
        super("Dump Training Mode Data", 2, 0);
        this.f272490a = axVar;
    }

    public final void run() {
        C91598e eVar = (C91598e) this.f272490a.f272544e.mo27525b();
        C58838bb.m90883r(false);
        eVar.f255466d.b("training_mode_data.proto", ((C9287d) eVar.f255464b.a()).toByteArray());
        eVar.f255466d.b("training_mode_metadata.proto", eVar.mo85959a().toByteArray());
    }
}

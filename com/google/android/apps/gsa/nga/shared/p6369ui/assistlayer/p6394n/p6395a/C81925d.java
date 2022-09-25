package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6395a;

import com.google.android.apps.gsa.opa.p6447h.C83705k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.a.d */
/* compiled from: PG */
final class C81925d implements C90919bp {

    /* renamed from: a */
    final /* synthetic */ C81926e f223996a;

    public C81925d(C81926e eVar) {
        this.f223996a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17870a(Object obj) {
        if (((Boolean) ((Optional) obj).map(C81924c.f223995a).orElse(false)).booleanValue()) {
            ((C59052c) ((C59052c) C81930i.f224008a.mo56224b()).mo56372aa(6333)).mo56386p("show");
            ((C83705k) ((C81930i) this.f223996a.f223997a.mo27525b()).f224011d.mo6453a()).mo77029b();
            return;
        }
        C81930i iVar = (C81930i) this.f223996a.f223997a.mo27525b();
        if (((C83705k) iVar.f224011d.mo6453a()).mo77030c()) {
            ((C59052c) ((C59052c) C81930i.f224008a.mo56224b()).mo56372aa(6331)).mo56386p("dismiss");
            ((C83705k) iVar.f224011d.mo6453a()).mo77028a();
            return;
        }
        ((C59052c) ((C59052c) C81930i.f224008a.mo56224b()).mo56372aa(6330)).mo56386p("isShowing false, not dimissing.");
    }
}

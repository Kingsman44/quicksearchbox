package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.aj */
/* compiled from: PG */
public final class C90547aj implements C90997f {
    /* renamed from: a */
    public final void mo84666a(C91006f fVar, C91000i iVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C90555h.f253154a);
        iVar.mo58887l(r0);
        Object l = iVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C90554g gVar = (C90554g) obj;
        if (gVar != null) {
            fVar.mo85279c("Event").mo85276a(C90752i.m148229c(gVar.f253153d));
        }
    }
}

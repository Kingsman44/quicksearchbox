package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.p489g.C9293k;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.p */
/* compiled from: PG */
public final /* synthetic */ class C98134p implements C90997f {

    /* renamed from: a */
    public static final /* synthetic */ C98134p f274040a = new C98134p();

    private /* synthetic */ C98134p() {
    }

    /* renamed from: a */
    public final void mo84666a(C91006f fVar, C91000i iVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C9293k.f32260e);
        iVar.mo58887l(r0);
        if (iVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C9293k.f32260e);
            iVar.mo58887l(r02);
            Object l = iVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C9293k kVar = (C9293k) obj;
            if ((kVar.f32262a & 1) != 0) {
                C91005e c = fVar.mo85279c("contentId");
                C7669fo foVar = kVar.f32263b;
                if (foVar == null) {
                    foVar = C7669fo.f26633e;
                }
                c.mo85276a(C90752i.m148230d(Long.valueOf(foVar.f26638d)));
            }
            if ((kVar.f32262a & 2) != 0) {
                fVar.mo85279c("title").mo85276a(C90752i.m148233g(kVar.f32264c));
            }
        }
    }
}

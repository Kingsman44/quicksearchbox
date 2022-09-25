package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97079a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97206a;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C96997b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C96999d;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a */
/* compiled from: PG */
public final class C97149a implements C32058a {

    /* renamed from: a */
    private final C97079a f271457a;

    /* renamed from: b */
    private final C97206a f271458b;

    public C97149a(C97079a aVar, C97206a aVar2) {
        this.f271457a = aVar;
        this.f271458b = aVar2;
    }

    /* renamed from: a */
    public final void mo37841a(C57499g gVar, int i, C57438di diVar, View view, C57418cp cpVar) {
        Object obj;
        C96997b bVar;
        C62940bt r2 = C62942bv.checkIsLite(C96999d.f271077f);
        gVar.mo58887l(r2);
        if (gVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C96999d.f271077f);
            gVar.mo58887l(r22);
            Object l = gVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            C96999d dVar = (C96999d) obj;
            int i2 = 2;
            if ((dVar.f271079a & 2) != 0) {
                this.f271458b.mo90591a(dVar.f271082d);
            }
            int i3 = dVar.f271080b;
            if (i3 != 0) {
                i2 = i3 != 1 ? 0 : 1;
            }
            int i4 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i4 == 0) {
                C97079a aVar = this.f271457a;
                if (i3 == 1) {
                    bVar = (C96997b) dVar.f271081c;
                } else {
                    bVar = C96997b.f271067h;
                }
                aVar.mo90435h(bVar);
            }
        }
    }
}

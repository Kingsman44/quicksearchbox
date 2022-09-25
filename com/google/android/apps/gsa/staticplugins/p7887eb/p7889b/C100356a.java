package com.google.android.apps.gsa.staticplugins.p7887eb.p7889b;

import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88435bf;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88436bg;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5451f.p5452a.p5453a.p5454a.C69396ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.b.a */
/* compiled from: PG */
public final class C100356a implements C86686h {

    /* renamed from: a */
    private final C85536a f280636a;

    /* renamed from: c */
    private final C85225a f280637c;

    /* renamed from: d */
    private final C89859i f280638d;

    /* renamed from: e */
    private final C89257aa f280639e;

    public C100356a(C85536a aVar, C85225a aVar2, C89859i iVar, C89257aa aaVar) {
        this.f280636a = aVar;
        this.f280637c = aVar2;
        this.f280638d = iVar;
        this.f280639e = aaVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        C69396ar arVar;
        C58976aa aaVar = C58975e.f156826a;
        if (bbVar != null) {
            C62940bt r5 = C62942bv.checkIsLite(C88436bg.f239099a);
            bbVar.mo58887l(r5);
            if (bbVar.f169962ag.mo58857o(r5.f169971d)) {
                C62940bt r52 = C62942bv.checkIsLite(C88436bg.f239099a);
                bbVar.mo58887l(r52);
                Object l = bbVar.f169962ag.mo58854l(r52.f169971d);
                if (l == null) {
                    obj = r52.f169969b;
                } else {
                    obj = r52.mo58889c(l);
                }
                C88435bf bfVar = (C88435bf) obj;
                int i = bfVar.f239096a;
                int i2 = 0;
                int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 3 : 2 : 1 : 4;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                } else if (i4 == 0) {
                    C85536a aVar = this.f280636a;
                    if (i == 1) {
                        i2 = ((Integer) bfVar.f239097b).intValue();
                    }
                    aVar.mo79057i(i2);
                } else if (i4 == 1) {
                    C85536a aVar2 = this.f280636a;
                    if (i == 2) {
                        arVar = (C69396ar) bfVar.f239097b;
                    } else {
                        arVar = C69396ar.f185678d;
                    }
                    aVar2.mo79058j(arVar);
                } else if (i4 == 2 && i == 3 && ((Boolean) bfVar.f239097b).booleanValue()) {
                    this.f280638d.mo83702b(C89849ae.WIDGET_INSTALL_PROMO_START);
                    this.f280637c.mo78805c();
                    if (this.f280639e.mo83227t().length > 0) {
                        this.f280638d.mo83702b(C89849ae.WIDGET_INSTALL_PROMO_HAS_WIDGET_END);
                    } else {
                        this.f280638d.mo83702b(C89849ae.WIDGET_INSTALL_PROMO_NO_WIDGET_END);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}

package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6686d.C85273a;
import com.google.android.apps.gsa.search.core.p6774b.C85644b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88015m;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88069o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4518d.C58177a;
import com.google.p4500cm.p4518d.C58186c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ad */
/* compiled from: PG */
public final class C116566ad extends C116780ib implements C84773a {

    /* renamed from: f */
    private static final C59071e f323257f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.ad");

    /* renamed from: a */
    public boolean f323258a;

    /* renamed from: b */
    public long f323259b = 0;

    /* renamed from: c */
    public Long f323260c;

    /* renamed from: d */
    public final C85273a f323261d;

    /* renamed from: e */
    public final C85644b f323262e;

    /* renamed from: g */
    private final C22871g f323263g;

    public C116566ad(C68214a aVar, C85273a aVar2, C85644b bVar, C22871g gVar) {
        super(aVar, 167);
        this.f323261d = aVar2;
        this.f323262e = bVar;
        this.f323263g = gVar;
    }

    /* renamed from: a */
    public final void mo78472a(C58186c cVar, boolean z) {
        C116565ac acVar = new C116565ac(this, cVar, z);
        if (C22872h.m42744d(C86593a.class)) {
            acVar.run();
        } else {
            this.f323263g.mo28212l("notifyChanged on ActionCardLoggingEvent", acVar);
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.ACTION_VE_LOGGING_EVENT};
    }

    /* renamed from: e */
    public final boolean mo102769e() {
        return this.f323259b == 0;
    }

    /* renamed from: g */
    public final boolean mo102770g() {
        boolean z = !this.f323262e.mo79124d();
        if (this.f323258a == z) {
            return false;
        }
        this.f323258a = z;
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionVeLoggingSessionState");
        fVar.mo85279c("HasPendingWork").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323258a)));
        fVar.mo85279c("PendingAcles").mo85276a(C90752i.m148230d(Integer.valueOf(this.f323262e.mo79121a())));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.ACTION_VE_LOGGING_EVENT) {
            C62940bt btVar = C88015m.f238017a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt btVar2 = C88015m.f238017a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r22 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r22);
                Object l = bwVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C88069o oVar = (C88069o) obj;
                if ((oVar.f238122a & 2) != 0) {
                    C85644b bVar = this.f323262e;
                    C58186c cVar = oVar.f238124c;
                    if (cVar == null) {
                        cVar = C58186c.f155565i;
                    }
                    bVar.mo79122b((C58177a) cVar.toBuilder(), oVar.f238123b, mo102769e());
                    if (mo102770g()) {
                        mo80591ar();
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x c = f323257f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S_ActionVeLogSesnState");
            ((C59052c) ((C59052c) c).mo56372aa(31962)).mo56386p("ACTION_VE_LOGGING_EVENT didn't have the expected extension.");
        }
    }
}

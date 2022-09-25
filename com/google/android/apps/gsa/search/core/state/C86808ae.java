package com.google.android.apps.gsa.search.core.state;

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

/* renamed from: com.google.android.apps.gsa.search.core.state.ae */
/* compiled from: PG */
public final class C86808ae extends C86898ct implements C84773a {

    /* renamed from: g */
    private static final C59071e f234460g = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.ae");

    /* renamed from: a */
    public boolean f234461a;

    /* renamed from: b */
    public long f234462b = 0;

    /* renamed from: c */
    public Long f234463c;

    /* renamed from: d */
    public boolean f234464d = false;

    /* renamed from: e */
    public final C85273a f234465e;

    /* renamed from: f */
    public final C85644b f234466f;

    /* renamed from: h */
    private final C22871g f234467h;

    public C86808ae(C68214a aVar, C85273a aVar2, C85644b bVar, C22871g gVar) {
        super(aVar, 63);
        this.f234465e = aVar2;
        this.f234466f = bVar;
        this.f234467h = gVar;
    }

    /* renamed from: a */
    public final void mo78472a(C58186c cVar, boolean z) {
        C86807ad adVar = new C86807ad(this, cVar, z);
        if (C22872h.m42744d(C86593a.class)) {
            adVar.run();
        } else {
            this.f234467h.mo28212l("notifyChanged on ActionCardLoggingEvent", adVar);
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.ACTION_VE_LOGGING_EVENT};
    }

    /* renamed from: b */
    public final boolean mo80514b() {
        return this.f234464d || this.f234462b == 0;
    }

    /* renamed from: c */
    public final boolean mo80515c() {
        boolean z = !this.f234466f.mo79124d();
        if (this.f234461a == z) {
            return false;
        }
        this.f234461a = z;
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionVeLoggingSessionState");
        fVar.mo85279c("HasPendingWork").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234461a)));
        fVar.mo85279c("PendingAcles").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234466f.mo79121a())));
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
                    C85644b bVar = this.f234466f;
                    C58186c cVar = oVar.f238124c;
                    if (cVar == null) {
                        cVar = C58186c.f155565i;
                    }
                    bVar.mo79122b((C58177a) cVar.toBuilder(), oVar.f238123b, mo80514b());
                    if (mo80515c()) {
                        mo80591ar();
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x c = f234460g.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ActionVeLogSessionState");
            ((C59052c) ((C59052c) c).mo56372aa(8643)).mo56386p("ACTION_VE_LOGGING_EVENT didn't have the expected extension.");
        }
    }
}

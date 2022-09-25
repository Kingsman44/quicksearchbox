package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.state.p6875g.C87070e;
import com.google.android.apps.gsa.search.core.state.p6875g.C87071f;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88166rp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hx */
/* compiled from: PG */
public final class C116775hx extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323948a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.hx");

    /* renamed from: b */
    public final C85171a f323949b;

    /* renamed from: c */
    public final C68214a f323950c;

    /* renamed from: d */
    public final C22871g f323951d;

    /* renamed from: e */
    Bundle f323952e;

    /* renamed from: f */
    public int f323953f = 0;

    /* renamed from: g */
    long f323954g;

    /* renamed from: h */
    boolean f323955h;

    /* renamed from: i */
    public boolean f323956i;

    /* renamed from: j */
    public boolean f323957j;

    /* renamed from: k */
    public boolean f323958k;

    /* renamed from: l */
    public Query f323959l;

    /* renamed from: m */
    public long f323960m = 0;

    /* renamed from: n */
    public boolean f323961n;

    /* renamed from: o */
    public Query f323962o = null;

    /* renamed from: p */
    public Query f323963p = null;

    /* renamed from: q */
    public final C68214a f323964q;

    /* renamed from: r */
    private final C21370a f323965r;

    /* renamed from: s */
    private final List f323966s = new ArrayList();

    /* renamed from: t */
    private long f323967t = 0;

    public C116775hx(C68214a aVar, C21370a aVar2, C85171a aVar3, C68214a aVar4, C22871g gVar, C68214a aVar5) {
        super(aVar, 162);
        this.f323965r = aVar2;
        this.f323954g = aVar2.mo26874f();
        this.f323949b = aVar3;
        this.f323950c = aVar4;
        this.f323951d = gVar;
        this.f323964q = aVar5;
    }

    /* renamed from: k */
    private final void m193908k(Bundle bundle) {
        this.f323952e = bundle;
        this.f323949b.mo78784z(bundle);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.PIXEL_APPS};
    }

    /* renamed from: e */
    public final void mo102933e(int i) {
        this.f323953f = i;
        this.f323949b.mo78771l(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo102934g(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List r0 = r3.f323966s     // Catch:{ all -> 0x0018 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            long r0 = r3.f323967t     // Catch:{ all -> 0x0018 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0016
            java.util.List r4 = r3.f323966s     // Catch:{ all -> 0x0018 }
            r4.clear()     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)
            return
        L_0x0016:
            monitor-exit(r3)
            return
        L_0x0018:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116775hx.mo102934g(long):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchboxState");
        fVar.mo85279c("mWaitingForSuggestShown").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323957j)));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f323954g = this.f323965r.mo26874f();
        if (this.f323952e != null) {
            m193908k(new Bundle());
        }
        this.f323949b.mo78781w();
        mo80591ar();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87070e eVar = (C87070e) C87071f.f235263f.createBuilder();
        int i = this.f323953f;
        eVar.copyOnWrite();
        C87071f fVar = (C87071f) eVar.instance;
        fVar.f235266a |= 2;
        fVar.f235268c = i;
        boolean z = this.f323955h;
        eVar.copyOnWrite();
        C87071f fVar2 = (C87071f) eVar.instance;
        fVar2.f235266a |= 4;
        fVar2.f235269d = z;
        long j = this.f323954g;
        eVar.copyOnWrite();
        C87071f fVar3 = (C87071f) eVar.instance;
        fVar3.f235266a |= 8;
        fVar3.f235270e = j;
        Bundle bundle = this.f323952e;
        if (bundle != null) {
            C63088z m = C90772bp.m148305m(bundle);
            eVar.copyOnWrite();
            C87071f fVar4 = (C87071f) eVar.instance;
            m.getClass();
            fVar4.f235266a |= 1;
            fVar4.f235267b = m;
        }
        bcVar.mo58885m(C87071f.f235264g, (C87071f) eVar.build());
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{C90507o.f253011a};
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C87071f.f235264g);
        bdVar.mo58887l(r0);
        Object l = bdVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C87071f fVar = (C87071f) obj;
        boolean z = true;
        if (i != 1 || (fVar.f235266a & 1) == 0 || fVar.f235270e <= this.f323954g) {
            m193908k(new Bundle());
        } else {
            m193908k((Bundle) C90772bp.m148301i(fVar.f235267b, Bundle.CREATOR));
        }
        mo102933e(fVar.f235268c);
        mo80591ar();
        boolean z2 = fVar.f235269d;
        this.f323955h = z2;
        if (this.f323953f == 0 || !z2) {
            z = false;
        }
        this.f323957j = z;
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        if (!this.f323958k) {
            synchronized (this) {
                if (this.f323967t != j) {
                    this.f323966s.clear();
                }
                this.f323966s.add(clientEventData);
                this.f323967t = j;
            }
            return;
        }
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() != 101) {
            C59104x c = f323948a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S_SearchboxState");
            C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(32239);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar.mo56387q("Unexpected event id: %d", a2.f237476dL);
            return;
        }
        C62940bt btVar = C88166rp.f238340a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r4 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r4);
        if (bwVar.f169962ag.mo58857o(r4.f169971d)) {
            C62940bt btVar2 = C88166rp.f238340a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r42 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r42);
            Object l = bwVar2.f169962ag.mo58854l(r42.f169971d);
            if (l == null) {
                obj = r42.f169969b;
            } else {
                obj = r42.mo58889c(l);
            }
            this.f323949b.mo78779u((C88168rr) obj, (Bundle) clientEventData.mo81912b(Bundle.class));
            return;
        }
        C59104x c2 = f323948a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "S_SearchboxState");
        ((C59052c) ((C59052c) c2).mo56372aa(32240)).mo56386p("PIXEL_APPS event without expected extension.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        m193908k(new Bundle());
        mo102933e(0);
        this.f323955h = false;
        this.f323957j = false;
        mo80591ar();
    }

    /* renamed from: i */
    public final void mo102935i(C116569ag agVar, long j) {
        if (j != 0 && agVar.f323267a.mo81884b()) {
            if (this.f323952e == null) {
                C59104x d = f323948a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "S_SearchboxState");
                ((C59052c) ((C59052c) d).mo56372aa(32246)).mo56386p("Attempting to start searchbox component with uninitialized store.");
                int i = C90755l.f253831a;
            }
            C58976aa aaVar = C58975e.f156826a;
            C85171a aVar = this.f323949b;
            boolean j2 = mo102936j();
            Bundle bundle = this.f323952e;
            bundle.getClass();
            C90873ag agVar2 = new C90873ag(aVar.mo78768i(j, j2, bundle), this.f323951d, "SearchboxWork start callback", new C116772hu(this));
            agVar2.mo85225c(CancellationException.class, C116773hv.f323946a);
            agVar2.mo85223a(C116774hw.f323947a);
        }
    }

    /* renamed from: j */
    public final boolean mo102936j() {
        if (!this.f323955h) {
            return false;
        }
        this.f323955h = false;
        return true;
    }
}

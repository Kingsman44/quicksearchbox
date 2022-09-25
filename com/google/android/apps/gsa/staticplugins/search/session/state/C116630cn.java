package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.graphics.Point;
import com.google.android.apps.gsa.search.core.p6519al.p6580bc.C84816a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87899hs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87901hu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88250us;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88252uu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cn */
/* compiled from: PG */
public final class C116630cn extends C116780ib {

    /* renamed from: j */
    private static final C59071e f323461j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.cn");

    /* renamed from: a */
    public final C68214a f323462a;

    /* renamed from: b */
    public final BitFlags f323463b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public Query f323464c = Query.f252741b;

    /* renamed from: d */
    public long f323465d = 0;

    /* renamed from: e */
    public Object f323466e;

    /* renamed from: f */
    public long f323467f = -1;

    /* renamed from: g */
    public boolean f323468g = false;

    /* renamed from: h */
    public long f323469h = 0;

    /* renamed from: i */
    public long f323470i = -1;

    /* renamed from: k */
    private final C68214a f323471k;

    /* renamed from: l */
    private final AtomicReference f323472l;

    /* renamed from: m */
    private final C84816a f323473m;

    public C116630cn(C68214a aVar, C68214a aVar2, C68214a aVar3, AtomicReference atomicReference, C84816a aVar4) {
        super(aVar, 152);
        this.f323462a = aVar2;
        this.f323471k = aVar3;
        this.f323472l = atomicReference;
        this.f323473m = aVar4;
    }

    /* renamed from: m */
    private final void m193539m(C116735gk gkVar) {
        if (!mo102814j()) {
            return;
        }
        if (!BitFlags.m148144f(this.f323463b.f253762b, 8)) {
            this.f323473m.mo78511c();
        } else if (gkVar.mo102879U()) {
            this.f323473m.mo78509a();
        }
    }

    /* renamed from: n */
    private final void m193540n(Object obj) {
        if (obj.equals(this.f323466e)) {
            this.f323466e = null;
            mo102811e((C116735gk) this.f323462a.mo27525b());
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.ACQUIRE_KEYBOARD_FOCUS, C87739bu.ACTION_DRAG_BEGIN, C87739bu.RELEASE_KEYBOARD_FOCUS, C87739bu.SET_BROWSER_DIMENSION};
    }

    /* renamed from: e */
    public final void mo102811e(C116735gk gkVar) {
        boolean z = true;
        if (this.f323466e == null && !gkVar.mo102879U()) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f323463b.mo85055h(8, z)) {
            m193539m(gkVar);
        }
    }

    /* renamed from: g */
    public final void mo102812g() {
        this.f323473m.mo78510b(BitFlags.m148144f(this.f323463b.f253762b, 16), this.f323467f, ((C116735gk) this.f323462a.mo27525b()).f323784p);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("LegacyUiState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323463b.toString()));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        Object obj3;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 3) {
            Object obj4 = this.f323466e;
            if (obj4 != null) {
                m193540n(obj4);
            }
        } else if (ordinal == 39) {
            C62940bt btVar = C88250us.f238707a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r4 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r4);
            if (bwVar.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt btVar2 = C88250us.f238707a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r42 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r42);
                Object l = bwVar2.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                C88252uu uuVar = (C88252uu) obj;
                this.f323472l.set(C58833ax.m90834k(new Point(uuVar.f238711b, uuVar.f238712c)));
                C116735gk gkVar = (C116735gk) this.f323462a.mo27525b();
                if (!gkVar.f323792x) {
                    gkVar.f323792x = true;
                    gkVar.mo80591ar();
                    return;
                }
                return;
            }
            C59104x c = f323461j.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S_LegacyUiState");
            ((C59052c) ((C59052c) c).mo56372aa(32054)).mo56386p("SET_BROWSER_DIMENSION event without expected extension.");
        } else if (ordinal == 16) {
            C62940bt btVar3 = C87899hs.f237783a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r43 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r43);
            Object l2 = bwVar3.f169962ag.mo58854l(r43.f169971d);
            if (l2 == null) {
                obj2 = r43.f169969b;
            } else {
                obj2 = r43.mo58889c(l2);
            }
            C87901hu huVar = (C87901hu) obj2;
            if ((huVar.f237786a & 1) != 0) {
                Integer valueOf = Integer.valueOf(huVar.f237787b);
                if (!valueOf.equals(this.f323466e)) {
                    this.f323466e = valueOf;
                    mo102811e((C116735gk) this.f323462a.mo27525b());
                    return;
                }
                return;
            }
            C59104x d = f323461j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_LegacyUiState");
            ((C59052c) ((C59052c) d).mo56372aa(32052)).mo56386p("KeyboardFocusEventData should contain keyboardFocusOwner field.");
            int i = C90755l.f253831a;
        } else if (ordinal == 17) {
            C62940bt btVar4 = C87899hs.f237783a;
            C87741bw bwVar4 = clientEventData.f236955a;
            C62940bt r44 = C62942bv.checkIsLite(btVar4);
            bwVar4.mo58887l(r44);
            Object l3 = bwVar4.f169962ag.mo58854l(r44.f169971d);
            if (l3 == null) {
                obj3 = r44.f169969b;
            } else {
                obj3 = r44.mo58889c(l3);
            }
            C87901hu huVar2 = (C87901hu) obj3;
            if ((huVar2.f237786a & 1) != 0) {
                m193540n(Integer.valueOf(huVar2.f237787b));
                return;
            }
            C59104x d2 = f323461j.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "S_LegacyUiState");
            ((C59052c) ((C59052c) d2).mo56372aa(32053)).mo56386p("KeyboardFocusEventData should contain keyboardFocusOwner field.");
            int i2 = C90755l.f253831a;
        }
    }

    /* renamed from: i */
    public final void mo102813i(boolean z) {
        boolean z2 = false;
        if (this.f323468g && this.f323467f > 0) {
            C116735gk gkVar = (C116735gk) this.f323462a.mo27525b();
            boolean k = gkVar.f323791w.mo102860k(gkVar.f323784p);
            boolean z3 = !C58832aw.m90831a(gkVar.f323791w.mo102852a(gkVar.f323784p), ActionData.f235991b);
            if ((!k || !z3) && !((C116625ci) this.f323471k.mo27525b()).mo102804g()) {
                z2 = true;
            }
        }
        if (this.f323463b.mo85055h(16, z2) || z) {
            mo102812g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo102814j() {
        return BitFlags.m148144f(this.f323463b.f253762b, 4);
    }

    /* renamed from: k */
    public final boolean mo102815k(C116735gk gkVar, boolean z) {
        if (!this.f323463b.mo85055h(4, z)) {
            return false;
        }
        m193539m(gkVar);
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f323464c);
        String b = this.f323463b.mo85048b();
        return "LegacyUiState[query=" + valueOf + ", flags=" + b + "]";
    }
}

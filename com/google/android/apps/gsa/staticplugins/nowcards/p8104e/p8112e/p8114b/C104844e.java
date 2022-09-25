package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104443f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104466b;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104854c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104855d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105038s;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9267k;
import com.google.android.apps.p489g.p494d.C9268l;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22947l;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69399au;
import p5451f.p5452a.p5453a.p5454a.C69400av;
import p5451f.p5452a.p5453a.p5454a.C69421bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.e */
/* compiled from: PG */
public final class C104844e implements C22947l, C104854c {

    /* renamed from: b */
    private static final C59071e f292167b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.e");

    /* renamed from: a */
    C104855d f292168a;

    /* renamed from: c */
    private final View f292169c;

    /* renamed from: d */
    private final C22945j f292170d;

    /* renamed from: e */
    private final C104466b f292171e;

    /* renamed from: f */
    private final C104443f f292172f;

    /* renamed from: g */
    private final C104348l f292173g;

    /* renamed from: h */
    private final C58833ax f292174h;

    /* renamed from: i */
    private final C58833ax f292175i;

    /* renamed from: j */
    private final C58833ax f292176j;

    /* renamed from: k */
    private final C105038s f292177k;

    public C104844e(View view, C22945j jVar, C104466b bVar, C104443f fVar, C104348l lVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C105038s sVar) {
        this.f292169c = view;
        this.f292170d = jVar;
        this.f292171e = bVar;
        this.f292172f = fVar;
        this.f292173g = lVar;
        this.f292174h = axVar;
        this.f292175i = axVar2;
        this.f292176j = axVar3;
        this.f292177k = sVar;
        jVar.mo28312m(this);
    }

    /* renamed from: f */
    private final void m173802f(View view, int i) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[0] > 0 && iArr[1] > 0 && view.isShown()) {
                C104443f fVar = this.f292172f;
                C9267k kVar = (C9267k) C9268l.f32065f.createBuilder();
                int i2 = iArr[0];
                kVar.copyOnWrite();
                C9268l lVar = (C9268l) kVar.instance;
                lVar.f32067a |= 1;
                lVar.f32068b = i2;
                int i3 = iArr[1];
                kVar.copyOnWrite();
                C9268l lVar2 = (C9268l) kVar.instance;
                lVar2.f32067a = 2 | lVar2.f32067a;
                lVar2.f32069c = i3;
                int i4 = iArr[0];
                int width = view.getWidth();
                kVar.copyOnWrite();
                C9268l lVar3 = (C9268l) kVar.instance;
                lVar3.f32067a |= 4;
                lVar3.f32070d = i4 + width;
                int i5 = iArr[1];
                int height = view.getHeight();
                kVar.copyOnWrite();
                C9268l lVar4 = (C9268l) kVar.instance;
                lVar4.f32067a |= 8;
                lVar4.f32071e = i5 + height;
                fVar.mo94164h(i, (C9268l) kVar.build());
            }
        }
    }

    /* renamed from: b */
    public final void mo28288b() {
        C104855d dVar = this.f292168a;
        if (dVar != null) {
            if (dVar.f292198c) {
                dVar.mo94377j();
                dVar.f292197b.removeOnAttachStateChangeListener(dVar);
                dVar.f292198c = false;
                dVar.f292199d = false;
                dVar.f292200e = false;
                dVar.f292201f = false;
                dVar.f292202g = false;
            }
            this.f292168a = null;
        }
    }

    /* renamed from: c */
    public final void mo28289c() {
        if (!this.f292174h.mo56113h() || !this.f292175i.mo56113h() || !this.f292176j.mo56113h()) {
            ((C59052c) ((C59052c) f292167b.mo56225c()).mo56372aa(22050)).mo56386p("Failed to install MonetViewVisibilityMonitor. Absent field(s).");
            return;
        }
        View view = this.f292169c;
        C105419b bVar = (C105419b) this.f292174h.mo56107c();
        C91825b bVar2 = (C91825b) this.f292175i.mo56107c();
        C91820a aVar = (C91820a) this.f292176j.mo56107c();
        C59071e eVar = C104855d.f292196a;
        if (view.getVisibility() == 8) {
            C59104x d = C104855d.f292196a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MViewVisibilityMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22052)).mo56386p("Trying to add view visibility monitor to a view which is gone, this shouldn't happen.");
            int i = C90755l.f253831a;
        }
        C104855d dVar = new C104855d(view, this, bVar, bVar2, aVar, 1.0f);
        view.addOnAttachStateChangeListener(dVar);
        if (C2043bi.m5569aw(view)) {
            dVar.onViewAttachedToWindow(view);
        }
        boolean z = false;
        if (bVar2 != null && C104855d.m173817k(bVar2.f256089a)) {
            z = true;
        }
        dVar.mo94376i(z);
        dVar.f292198c = true;
        this.f292168a = dVar;
    }

    /* renamed from: d */
    public final void mo94368d(boolean z) {
        C69400av avVar;
        C58833ax axVar = (C58833ax) ((C23249a) this.f292171e.mo94188f()).mo28725a();
        if (axVar.mo56113h() && !z) {
            C69421bp bpVar = ((C69396ar) axVar.mo56107c()).f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            int i = bpVar.f185745b;
            View view = (View) this.f292173g.f290327v.get(i);
            if (view != null) {
                m173802f(view, i);
                return;
            }
            C69396ar arVar = (C69396ar) axVar.mo56107c();
            if (arVar.f185680a == 3) {
                avVar = (C69400av) arVar.f185681b;
            } else {
                avVar = C69400av.f185693h;
            }
            C69399au a = C69399au.m100748a(avVar.f185696b);
            if (a == null) {
                a = C69399au.UNKNOWN_FEED_TIP;
            }
            if (C104348l.f290298a.containsKey(a)) {
                if (a == C69399au.PLAY_VIDEO) {
                    C9278v vVar = this.f292173g.f290310e;
                    if (vVar != null) {
                        C9141ad adVar = vVar.f32169C;
                        if (adVar == null) {
                            adVar = C9141ad.f31521K;
                        }
                        if ((adVar.f31535a & 1048576) != 0) {
                            C105038s sVar = this.f292177k;
                            C9141ad adVar2 = this.f292173g.f290310e.f32169C;
                            if (adVar2 == null) {
                                adVar2 = C9141ad.f31521K;
                            }
                            C9215cx cxVar = adVar2.f31555u;
                            if (cxVar == null) {
                                cxVar = C9215cx.f31837o;
                            }
                            if (!sVar.mo94484a(cxVar)) {
                                return;
                            }
                        }
                    }
                    ((C59052c) ((C59052c) f292167b.mo56225c()).mo56372aa(22051)).mo56386p("No play video action");
                    return;
                }
                C104348l lVar = this.f292173g;
                HashSet<View> hashSet = new HashSet<>();
                for (C9140ac acVar : (Set) C104348l.f290298a.get(a)) {
                    if (lVar.f290328w.containsKey(acVar)) {
                        hashSet.addAll((Collection) lVar.f290328w.get(acVar));
                    }
                }
                for (View f : hashSet) {
                    m173802f(f, i);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo94369e(boolean z) {
        C69400av avVar;
        C58833ax axVar = (C58833ax) ((C23249a) this.f292171e.mo94188f()).mo28725a();
        if (axVar.mo56113h() && z) {
            C69396ar arVar = (C69396ar) axVar.mo56107c();
            if (arVar.f185680a == 3) {
                avVar = (C69400av) arVar.f185681b;
            } else {
                avVar = C69400av.f185693h;
            }
            if (avVar.f185701g) {
                mo94368d(((C91825b) this.f292175i.mo56107c()).f256089a != 0);
            }
        }
    }

    /* renamed from: h */
    public final void mo28290h() {
        this.f292170d.mo28313t(this);
    }
}

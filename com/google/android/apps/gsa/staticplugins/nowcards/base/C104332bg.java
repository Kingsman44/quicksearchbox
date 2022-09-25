package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.C91702q;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104424aa;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104429af;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104435al;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104441d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104456s;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104460w;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9222dd;
import com.google.android.apps.p489g.p494d.C9232dn;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7530ar;
import com.google.p375ai.p378b.C7562bp;
import com.google.p375ai.p378b.C7593ct;
import com.google.p375ai.p378b.C7621du;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7941pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bg */
/* compiled from: PG */
public final class C104332bg extends C104311am {

    /* renamed from: c */
    private static final C59071e f290250c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.bg");

    /* renamed from: d */
    private final C91702q f290251d;

    /* renamed from: e */
    private final C91857e f290252e;

    /* renamed from: f */
    private final C104456s f290253f;

    /* renamed from: g */
    private final C104429af f290254g;

    /* renamed from: h */
    private final C104435al f290255h;

    /* renamed from: i */
    private final C104441d f290256i;

    /* renamed from: j */
    private final C104460w f290257j;

    /* renamed from: k */
    private final C104424aa f290258k;

    /* renamed from: l */
    private final C104337bl f290259l;

    /* renamed from: m */
    private final View f290260m;

    /* renamed from: n */
    private final C7718hj f290261n;

    /* renamed from: o */
    private final String f290262o;

    public C104332bg(Context context, C91692g gVar, C104348l lVar, C91857e eVar, String str, C104456s sVar, C104429af afVar, C104435al alVar, C104441d dVar, C104460w wVar, C104424aa aaVar, C104337bl blVar, View view) {
        super(context, gVar, lVar);
        this.f290260m = view;
        C7718hj hjVar = lVar.f290310e.f32174H;
        hjVar = hjVar == null ? C7718hj.f26927af : hjVar;
        this.f290251d = new C91702q(context, hjVar, gVar);
        this.f290261n = hjVar;
        this.f290262o = str;
        this.f290252e = eVar;
        this.f290253f = sVar;
        this.f290254g = afVar;
        this.f290255h = alVar;
        this.f290256i = dVar;
        this.f290257j = wVar;
        this.f290258k = aaVar;
        this.f290259l = blVar;
    }

    /* renamed from: a */
    public final void mo86194a(Intent intent) {
        this.f290252e.mo86359a("EVENT_START_ACTIVITY_FOR_RESULT", "MPClientActionHandler", intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo86196c(C9141ad adVar) {
        C58833ax axVar;
        if (this.f290257j != null) {
            C59104x b = f290250c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
            ((C59052c) ((C59052c) b).mo56372aa(21960)).mo56386p("Opening url with genericBaseEvents");
            mo94070u(adVar);
            C104460w wVar = this.f290257j;
            ProtoParcelable a = C23245b.m43556a(adVar);
            C104337bl blVar = this.f290259l;
            long b2 = C91994m.m150995b(this.f290261n);
            Long l = (Long) blVar.f290282d.get(b2, -1L);
            Long l2 = (Long) blVar.f290281c.get(b2, -1L);
            if (l.longValue() == -1 || l2.longValue() == -1) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(Long.valueOf(l.longValue() - l2.longValue()));
            }
            wVar.mo94175r(a, axVar);
            return;
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21959)).mo56386p("genericBaseEvents is not set");
        super.mo86196c(adVar);
    }

    /* renamed from: d */
    public final void mo86197d(Intent intent) {
        this.f290252e.mo86359a("EVENT_START_ACTIVITY_FOR_RESULT", "MPClientActionHandler", intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo86198e(C9141ad adVar) {
        C104460w wVar = this.f290257j;
        if (wVar != null) {
            wVar.mo94169l(C23245b.m43556a(adVar));
        }
    }

    /* renamed from: g */
    public final boolean mo86200g(C9141ad adVar) {
        if ((adVar.f31535a & 268435456) != 0) {
            C7562bp bpVar = adVar.f31525C;
            if (bpVar == null) {
                bpVar = C7562bp.f26157c;
            }
            C58976aa aaVar = C58975e.f156826a;
            C104424aa aaVar2 = this.f290258k;
            if (aaVar2 != null && bpVar.f26159a) {
                aaVar2.mo94158j(bpVar.f26160b);
            }
        }
        return super.mo86200g(adVar) || this.f290251d.mo86200g(adVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo94057h(C9141ad adVar) {
        C7530ar arVar = adVar.f31526D;
        if (arVar == null) {
            arVar = C7530ar.f26069f;
        }
        C7708h c = C91978bb.m150937c(this.f290261n, C7681g.m22802a(adVar.f31538d), new C7681g[0]);
        String str = (c == null || (c.f26896a & 4) == 0) ? BuildConfig.FLAVOR : c.f26899d;
        C104441d dVar = this.f290256i;
        if (dVar != null) {
            dVar.mo94159c(arVar, str);
            return;
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21954)).mo56386p("AdsActionEvents is not set.");
        int i = C90755l.f253831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo94058i(C9141ad adVar) {
        C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
        int i = adVar.f31538d;
        yVar.copyOnWrite();
        C9141ad adVar2 = (C9141ad) yVar.instance;
        adVar2.f31535a |= 2;
        adVar2.f31538d = i;
        C9141ad adVar3 = (C9141ad) yVar.build();
        C104460w wVar = this.f290257j;
        if (wVar != null) {
            wVar.mo94166iX(adVar3);
            this.f255779b.mo86165e().mo86208b(C7642eo.BILINGUAL_OPT_OUT);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo94059j(C9141ad adVar) {
        C59104x c = f290250c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21955)).mo56386p("handleCollapseList not yet implemented.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo94060k(C9141ad adVar) {
        C59104x c = f290250c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21956)).mo56386p("handleExpandList not yet implemented.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo94061l() {
        this.f290252e.mo86359a("EVENT_DISPLAY_CARD_ACTION_DIALOG", "MPClientActionHandler", ProtoParcelable.f63423a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo94062m(C9141ad adVar) {
        if (!(this.f290254g == null || (adVar.f31535a & 32) == 0)) {
            View view = this.f290260m;
            if (view instanceof C104335bj) {
                C104335bj bjVar = (C104335bj) view;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                C58835az azVar = new C58835az(Integer.valueOf(iArr[0] + (this.f290260m.getWidth() / 2)), Integer.valueOf(iArr[1] + (this.f290260m.getHeight() / 2)));
                C104429af afVar = this.f290254g;
                int intValue = ((Integer) azVar.f156631a).intValue();
                int intValue2 = ((Integer) azVar.f156632b).intValue();
                C7941pq pqVar = adVar.f31542h;
                if (pqVar == null) {
                    pqVar = C7941pq.f27880i;
                }
                afVar.mo94170m(intValue, intValue2, C23245b.m43556a(pqVar), bjVar.f290267c);
                return;
            }
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21958)).mo56386p("ReactionWidgetEvents not set yet");
        int i = C90755l.f253831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo94063n(C9141ad adVar) {
        C7708h c = C91978bb.m150937c(this.f290261n, C7681g.m22802a(adVar.f31538d), new C7681g[0]);
        String str = (c == null || (c.f26896a & 4) == 0) ? BuildConfig.FLAVOR : c.f26899d;
        C7593ct ctVar = adVar.f31527E;
        if (ctVar == null) {
            ctVar = C7593ct.f26245g;
        }
        C104460w wVar = this.f290257j;
        if (wVar != null) {
            wVar.mo94171n(ctVar, str);
            return;
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21961)).mo56386p("GenericBaseEvents is not set.");
        int i = C90755l.f253831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo94065p(C9141ad adVar) {
        mo94066q(adVar, 0, false, this.f290262o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo94067r(C9141ad adVar) {
        C104460w wVar = this.f290257j;
        if (wVar != null) {
            C9232dn dnVar = adVar.f31531I;
            if (dnVar == null) {
                dnVar = C9232dn.f31910c;
            }
            wVar.mo94174q(dnVar.f31913b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo94068s() {
        C104429af afVar = this.f290254g;
        if (afVar != null) {
            View view = this.f290260m;
            if (view instanceof C104335bj) {
                afVar.mo94173p(((C104335bj) view).f290267c);
                return;
            }
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21965)).mo56386p("ReactionWidgetEvents not set yet");
        int i = C90755l.f253831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo94069t(C9141ad adVar) {
        C7621du duVar = adVar.f31523A;
        if (duVar == null) {
            duVar = C7621du.f26333f;
        }
        C104441d dVar = this.f290256i;
        if (dVar != null) {
            dVar.mo94160d(duVar);
            return;
        }
        C59104x d = f290250c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(21966)).mo56386p("AdsActionEvents is not set.");
        int i = C90755l.f253831a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo94071v(C9215cx cxVar) {
        C104435al alVar = this.f290255h;
        if (alVar != null) {
            alVar.mo94176s(C23245b.m43556a(cxVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo94072w() {
        C104435al alVar = this.f290255h;
        if (alVar != null) {
            alVar.mo94177t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo94064o(C9141ad adVar) {
        if (this.f290253f == null) {
            C59104x d = f290250c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
            ((C59052c) ((C59052c) d).mo56372aa(21964)).mo56386p("FeedSaveEvents not set yet");
            int i = C90755l.f253831a;
        } else if ((adVar.f31535a & 524288) != 0) {
            View view = this.f290260m;
            if (!(view instanceof C104335bj)) {
                C59104x d2 = f290250c.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
                ((C59052c) ((C59052c) d2).mo56372aa(21962)).mo56386p("View does not support multiple icon states");
                int i2 = C90755l.f253831a;
                return;
            }
            boolean z = (view.getWindowSystemUiVisibility() & 8192) != 0;
            boolean z2 = (this.f290260m.getWindowSystemUiVisibility() & 16) != 0;
            C104456s sVar = this.f290253f;
            C9222dd ddVar = adVar.f31554t;
            if (ddVar == null) {
                ddVar = C9222dd.f31875c;
            }
            sVar.mo94172o(ddVar, ((C104335bj) this.f290260m).f290267c, this.f255779b.mo86184u(), z, z2);
        } else {
            C59104x d3 = f290250c.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MPClientActionHandler");
            ((C59052c) ((C59052c) d3).mo56372aa(21963)).mo56386p("No SaveAction is available");
            int i3 = C90755l.f253831a;
        }
    }
}

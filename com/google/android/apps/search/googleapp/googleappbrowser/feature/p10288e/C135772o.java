package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.apps.search.googleapp.p10357n.p10359b.C136711a;
import com.google.android.apps.search.googleapp.p10357n.p10359b.C136712b;
import com.google.android.apps.search.googleapp.p10357n.p10359b.C136713c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28399t;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40059x;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60887da;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54122u;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.o */
/* compiled from: PG */
public final class C135772o implements C136039a {

    /* renamed from: a */
    public static final C59071e f369817a = C59071e.m91331h();

    /* renamed from: b */
    public final C135766i f369818b;

    /* renamed from: c */
    public final C46801dp f369819c;

    /* renamed from: d */
    public final C28463g f369820d;

    /* renamed from: e */
    public final Context f369821e;

    /* renamed from: f */
    public final C135771n f369822f = new C135771n(this);

    /* renamed from: g */
    public C135776s f369823g;

    /* renamed from: h */
    public boolean f369824h;

    /* renamed from: i */
    public boolean f369825i;

    /* renamed from: j */
    private final C135769l f369826j;

    /* renamed from: k */
    private final C40305b f369827k;

    /* renamed from: l */
    private final C136713c f369828l;

    /* renamed from: m */
    private final AccountId f369829m;

    /* renamed from: n */
    private final C136712b f369830n;

    /* renamed from: o */
    private C28439i f369831o;

    /* renamed from: p */
    private final C38553h f369832p;

    public C135772o(C135769l lVar, C135766i iVar, C46801dp dpVar, C40305b bVar, C136713c cVar, AccountId accountId, C28463g gVar, C38553h hVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(gVar, "syntheticHost");
        C69664n.m101061g(hVar, "fragmentIncognitoChecker");
        this.f369826j = lVar;
        this.f369818b = iVar;
        this.f369819c = dpVar;
        this.f369827k = bVar;
        this.f369828l = cVar;
        this.f369829m = accountId;
        this.f369820d = gVar;
        this.f369832p = hVar;
        C136711a aVar = (C136711a) cVar.f372129a.mo17428b();
        aVar.getClass();
        C40060y yVar = (C40060y) cVar.f372130b.mo17428b();
        yVar.getClass();
        this.f369830n = new C136712b(bVar, aVar, yVar);
        Context requireContext = lVar.requireContext();
        C69664n.m101060f(requireContext, "fragment.requireContext()");
        this.f369821e = requireContext;
    }

    /* renamed from: w */
    private final C28423g m220285w() {
        if (this.f369832p.f101930a) {
            return C45954d.m82061b();
        }
        return C45954d.m82060a(this.f369829m);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo112532a(View view, float f) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112533b(View view, int i) {
    }

    /* renamed from: c */
    public final View mo112534c() {
        return this.f369826j.requireView().findViewById(R.id.googleapp_browser_goc_circular_progress_indicator);
    }

    /* renamed from: d */
    public final void mo112535d() {
        C28439i iVar;
        if (!this.f369824h) {
            this.f369824h = true;
            View c = mo112534c();
            if (c != null) {
                c.setVisibility(this.f369823g != null ? 8 : 0);
            }
            C135776s sVar = this.f369823g;
            if (sVar == null || !sVar.f369841b) {
                mo112553v();
                return;
            }
            C54120s sVar2 = sVar.f369842c;
            if (sVar2 == null) {
                sVar2 = C54120s.f142008d;
            }
            C69664n.m101060f(sVar2, "lastResponse!!.pivotsResponse");
            C28439i iVar2 = this.f369831o;
            if (iVar2 != null) {
                this.f369820d.mo33921e(iVar2);
            }
            C54098av avVar = sVar2.f142012c;
            if (avVar == null) {
                avVar = C54098av.f141935j;
            }
            C54122u uVar = avVar.f141942f;
            if (uVar == null) {
                uVar = C54122u.f142014h;
            }
            C60214n nVar = uVar.f142022g;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            C69664n.m101060f(nVar, "response.pivots.loggingInfo.graftCgi");
            C60218r rVar = nVar.f162921f;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            C69664n.m101060f(rVar, "graftCgi.veEventId");
            if ((rVar.f162927a & 2) != 0) {
                C60213m mVar = (C60213m) nVar.toBuilder();
                C60217q qVar = (C60217q) rVar.toBuilder();
                qVar.copyOnWrite();
                C60218r rVar2 = (C60218r) qVar.instance;
                rVar2.f162927a &= -3;
                rVar2.f162929c = 0;
                C60218r rVar3 = (C60218r) qVar.build();
                mVar.copyOnWrite();
                C60214n nVar2 = (C60214n) mVar.instance;
                rVar3.getClass();
                nVar2.f162921f = rVar3;
                nVar2.f162916a |= 2048;
                C62942bv build = mVar.build();
                C69664n.m101060f(build, "graftCgi\n          .toBu…ild())\n          .build()");
                nVar = (C60214n) build;
            }
            C28313c a = this.f369820d.mo33917a(C28375ak.m53062d(nVar));
            a.mo33859g(m220285w());
            a.mo33859g(C28375ak.m53061c(120776));
            C28439i a2 = a.mo33808a();
            C69664n.m101060f(a2, "syntheticHost\n        .c…      )\n        .attach()");
            this.f369831o = a2;
            C28463g gVar = this.f369820d;
            if (a2 == null) {
                C69664n.m101065k("rootClientVisualElement");
                a2 = null;
            }
            gVar.mo33920d(a2);
            C136712b bVar = this.f369830n;
            Context context = this.f369821e;
            C28439i iVar3 = this.f369831o;
            if (iVar3 == null) {
                C69664n.m101065k("rootClientVisualElement");
                iVar = null;
            } else {
                iVar = iVar3;
            }
            C28423g w = m220285w();
            C40060y yVar = bVar.f372128c;
            C40059x xVar = new C40059x((byte[]) null);
            C60887da daVar = (C60887da) yVar.f105261a.mo17428b();
            daVar.getClass();
            Executor executor = (Executor) yVar.f105262b.mo17428b();
            executor.getClass();
            C28310af afVar = (C28310af) yVar.f105263c.mo17428b();
            afVar.getClass();
            C28463g gVar2 = (C28463g) yVar.f105264d.mo17428b();
            gVar2.getClass();
            ((C28470n) yVar.f105265e.mo17428b()).getClass();
            C28443m mVar2 = (C28443m) yVar.f105266f.mo17428b();
            mVar2.getClass();
            C28399t tVar = (C28399t) yVar.f105267g.mo17428b();
            tVar.getClass();
            C40480q qVar2 = (C40480q) yVar.f105268h.mo17428b();
            qVar2.getClass();
            C40364q qVar3 = (C40364q) yVar.f105269i.mo17428b();
            qVar3.getClass();
            iVar.getClass();
            C40058w wVar = new C40058w(daVar, executor, afVar, gVar2, mVar2, tVar, qVar2, qVar3, iVar, w, xVar);
            C21255ay b = bVar.f372127b.mo26721b();
            b.mo26714b(wVar);
            C21256az a3 = b.mo26713a();
            bVar.f372126a.mo32553l();
            C21196h hVar = new C21196h(context, a3);
            hVar.setId(R.id.googleapp_browser_goc_elementsoutput);
            C136712b bVar2 = this.f369830n;
            C54098av avVar2 = sVar2.f142012c;
            if (avVar2 == null) {
                avVar2 = C54098av.f141935j;
            }
            C57784p pVar = avVar2.f141943g;
            if (pVar == null) {
                pVar = C57784p.f154382f;
            }
            bVar2.f372126a.mo32553l().mo42108a(hVar, pVar);
            mo112553v();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            View requireView = this.f369826j.requireView();
            C69664n.m101059e(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) requireView).addView(hVar, layoutParams);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo112536e(View view) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo112537f(View view) {
    }

    /* renamed from: g */
    public final void mo112538g(View view) {
        this.f369825i = false;
    }

    /* renamed from: h */
    public final void mo112539h(View view) {
        this.f369825i = false;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo112540i(View view) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo112541j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo112542k(View view) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo112543l(View view) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo112544m(View view) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo112545n(View view) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo112546o(View view) {
    }

    /* renamed from: p */
    public final void mo112547p(float f) {
        this.f369825i = true;
        mo112535d();
    }

    /* renamed from: q */
    public final /* synthetic */ void mo112548q(float f) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo112549r(float f) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo112550s(float f) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo112551t() {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo112552u() {
    }

    /* renamed from: v */
    public final void mo112553v() {
        C21196h hVar = (C21196h) this.f369826j.requireView().findViewById(R.id.googleapp_browser_goc_elementsoutput);
        if (hVar != null) {
            this.f369830n.f372126a.mo32553l();
            hVar.mo26215b((byte[]) null);
            C40058w wVar = (C40058w) hVar.f59458a.mo26722c();
            if (wVar != null) {
                wVar.mo42158f();
            }
            View requireView = this.f369826j.requireView();
            C69664n.m101059e(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) requireView).removeView(hVar);
        }
    }
}

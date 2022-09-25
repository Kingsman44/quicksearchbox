package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30190ar;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.particle.C30230d;
import com.google.android.libraries.onegoogle.account.particle.C30232f;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30271p;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30273r;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.accountmenu.features.C30638u;
import com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.C30528d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30506c;
import com.google.android.libraries.onegoogle.accountmenu.features.p2362c.C30523a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2373g.C30611e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2373g.C30612f;
import com.google.android.libraries.onegoogle.accountmenu.features.p2373g.C30613g;
import com.google.android.libraries.onegoogle.accountmenu.p2351a.C30288c;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30939z;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.j */
/* compiled from: PG */
public final /* synthetic */ class C30684j implements C31032ag {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f82829a;

    /* renamed from: b */
    public final /* synthetic */ C30305n f82830b;

    /* renamed from: c */
    public final /* synthetic */ C30922i f82831c;

    /* renamed from: d */
    public final /* synthetic */ C63644b f82832d;

    public /* synthetic */ C30684j(C31036ak akVar, C30305n nVar, C30922i iVar, C63644b bVar) {
        this.f82829a = akVar;
        this.f82830b = nVar;
        this.f82831c = iVar;
        this.f82832d = bVar;
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C31036ak akVar = this.f82829a;
        C30305n nVar = this.f82830b;
        C30922i iVar = this.f82831c;
        C63644b bVar = this.f82832d;
        if (akVar.getView() == null) {
            return C30694t.m57352d(layoutInflater);
        }
        C2391v viewLifecycleOwner = akVar.getViewLifecycleOwner();
        C30669ar arVar = new C30669ar(layoutInflater.getContext());
        C30233g c = C30694t.m57351c(nVar, viewLifecycleOwner);
        C19559g.m37304c();
        arVar.f82802q = nVar;
        arVar.f82803r = bVar;
        arVar.f82799n = iVar;
        arVar.f82797l = nVar.mo35860k().mo36170c();
        arVar.f82798m = nVar.mo35860k().mo36180m();
        arVar.f82800o = new C30939z(nVar.mo35862m(), bVar, nVar.mo35858i());
        arVar.f82795j = nVar.mo35864o();
        arVar.mo35630b(arVar.f82795j);
        int dimensionPixelSize = arVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing);
        C30271p pVar = new C30271p(arVar.getContext(), C30677c.m57333a(nVar), new C30659ah(iVar, nVar), iVar, bVar, nVar.mo35864o(), dimensionPixelSize, C58833ax.m90834k(c));
        C30669ar.m57320e(arVar.f82788c, pVar);
        arVar.f82786a.mo36389e(nVar, bVar, iVar);
        arVar.f82801p = nVar.mo35860k().mo36171d();
        String str2 = null;
        if (arVar.f82801p.mo36153b().mo56113h()) {
            Context context = arVar.getContext();
            C30506c cVar = (C30506c) arVar.f82801p.mo36153b().mo56107c();
            str = context.getString(R.string.og_collapse_account_list_a11y);
        } else {
            str = null;
        }
        if (arVar.f82801p.mo36153b().mo56113h()) {
            Context context2 = arVar.getContext();
            C30506c cVar2 = (C30506c) arVar.f82801p.mo36153b().mo56107c();
            str2 = context2.getString(R.string.og_expand_account_list_a11y);
        }
        arVar.f82787b.f81789a.mo35590h();
        arVar.f82787b.f81789a.mo35593k(nVar.mo35859j().mo36092d());
        SelectedAccountView selectedAccountView = arVar.f82787b;
        C30213m c2 = nVar.mo35853c();
        C30158c b = nVar.mo35852b();
        nVar.mo35867r();
        if (nVar.mo35860k().mo36171d().mo36153b().mo56113h() || nVar.mo35860k().mo36180m().mo56113h()) {
            C30232f b2 = c.mo35707b();
            b2.mo35705b(C58836b.f156633a);
            c = b2.mo35704a();
        }
        C58833ax k = C58833ax.m90834k(c);
        C30660ai aiVar = new C30660ai(arVar);
        selectedAccountView.f81796h = k;
        selectedAccountView.mo33195b();
        selectedAccountView.f81794f = new C30230d(selectedAccountView, b, k);
        selectedAccountView.f81789a.mo35600r(c2, b);
        selectedAccountView.f81797i = str;
        selectedAccountView.f81798j = str2;
        selectedAccountView.f81799k = aiVar;
        selectedAccountView.f81795g = false;
        selectedAccountView.f81790b.setRotation(360.0f);
        selectedAccountView.mo35764d(false);
        arVar.f82787b.f81789a.mo35589g(nVar.mo35864o());
        C58480gp e = C58485gu.m89837e();
        arVar.f82804s = nVar.mo35860k().mo36177j();
        if (arVar.f82804s.mo56113h()) {
            e.mo55395g(new C30528d(arVar.getContext(), viewLifecycleOwner, (C30238l) arVar.f82804s.mo56107c()));
        }
        C58833ax o = nVar.mo35860k().mo36182o();
        if (o.mo56113h() && ((C30638u) o.mo56107c()).mo36316e(arVar.getContext())) {
            C30306o i = nVar.mo35858i();
            C30939z zVar = arVar.f82800o;
            C30897z o2 = nVar.mo35864o();
            AccountParticleDisc accountParticleDisc = arVar.f82787b.f81789a;
            C30611e eVar = new C30611e(i, zVar, o2, (C30638u) o.mo56107c(), accountParticleDisc, arVar.getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_disc_size), iVar, nVar.mo35852b());
            AccountParticleDisc accountParticleDisc2 = accountParticleDisc;
            C30613g gVar = new C30613g(accountParticleDisc2, eVar);
            if (C2043bi.m5569aw(accountParticleDisc2)) {
                gVar.f82702b.mo36309a();
            } else {
                accountParticleDisc2.addOnAttachStateChangeListener(gVar);
            }
            e.mo55395g(new C30612f(arVar.getContext(), (C30638u) o.mo56107c(), nVar.mo35852b()));
        }
        C58485gu f = e.mo55394f();
        if (!f.isEmpty()) {
            arVar.f82787b.f81789a.mo35595m(new C30190ar(f, viewLifecycleOwner));
        }
        if (arVar.f82798m.mo56113h()) {
            SelectedAccountView selectedAccountView2 = arVar.f82787b;
            C30523a aVar = (C30523a) arVar.f82798m.mo56107c();
            C30523a aVar2 = (C30523a) arVar.f82798m.mo56107c();
            selectedAccountView2.f81791c.setImageResource(R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
            selectedAccountView2.f81791c.setContentDescription(selectedAccountView2.getContext().getString(R.string.og_account_switching_deactivated));
            C2043bi.m5551ae(selectedAccountView2.f81791c, 1);
        }
        boolean h = arVar.f82798m.mo56113h();
        boolean h2 = arVar.f82801p.mo36153b().mo56113h();
        arVar.mo36364c(h || h2);
        int a = C30271p.m56305a(arVar.getContext()) + dimensionPixelSize;
        C30378bf bfVar = new C30378bf(arVar.getContext(), arVar.f82802q.mo35858i(), arVar.f82791f, arVar.f82799n, arVar.f82795j, a, arVar.f82797l);
        C30669ar.m57320e(arVar.f82789d, bfVar);
        arVar.mo36365g(nVar, pVar, bfVar);
        C30378bf bfVar2 = bfVar;
        C30271p pVar2 = pVar;
        C30699y yVar = new C30699y(nVar, arVar.getContext(), bVar, iVar, viewLifecycleOwner, arVar.f82793h);
        yVar.f82868e = true;
        yVar.f82871h = true;
        int i2 = C30288c.f81916a;
        yVar.f82869f = C30288c.m56359a(nVar, false);
        yVar.f82867d = h2;
        C30695u uVar = (C30695u) yVar.mo36385a();
        int i3 = a;
        C30669ar arVar2 = arVar;
        C30669ar.m57320e((RecyclerView) arVar2.findViewById(R.id.cards_and_actions), arVar2.mo36363a(uVar.f82860a, i3));
        C30669ar.m57320e((RecyclerView) arVar2.findViewById(R.id.common_actions), arVar2.mo36363a(uVar.f82861b, i3));
        C2391v vVar = viewLifecycleOwner;
        C30699y yVar2 = r2;
        C30699y yVar3 = new C30699y(nVar, arVar2.getContext(), bVar, iVar, vVar, arVar2.f82793h);
        yVar2.f82867d = !h2;
        yVar2.f82872i = true;
        C30698x a2 = yVar2.mo36385a();
        RecyclerView recyclerView = (RecyclerView) arVar2.findViewById(R.id.og_top_cards);
        C30378bf a3 = arVar2.mo36363a(((C30695u) a2).f82860a, i3);
        C30669ar.m57320e(recyclerView, a3);
        int i4 = true != h2 ? 0 : i3;
        RecyclerView recyclerView2 = arVar2.f82788c;
        recyclerView2.addItemDecoration$ar$ds(new C30273r(recyclerView2, i4));
        C30273r rVar = new C30273r(arVar2.f82789d, i4);
        C30306o i5 = nVar.mo35858i();
        C30663al alVar = new C30663al(pVar2, arVar2.f82789d, rVar);
        C30664am amVar = new C30664am(arVar2, pVar2, bfVar2);
        C30665an anVar = new C30665an(arVar2, a3, recyclerView);
        recyclerView.setFocusable(false);
        C30271p pVar3 = pVar2;
        C30306o oVar = i5;
        C30669ar arVar3 = arVar2;
        C30666ao aoVar = new C30666ao(arVar2, oVar, pVar3, alVar, amVar, bfVar2, a3, anVar);
        arVar3.addOnAttachStateChangeListener(aoVar);
        if (C2043bi.m5569aw(arVar3)) {
            aoVar.onViewAttachedToWindow(arVar3);
        }
        arVar3.setId(R.id.og_has_selected_content);
        return arVar3;
    }
}

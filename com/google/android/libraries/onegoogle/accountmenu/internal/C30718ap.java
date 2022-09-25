package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.UserManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.account.particle.C30230d;
import com.google.android.libraries.onegoogle.account.policyfooter.C30241a;
import com.google.android.libraries.onegoogle.account.policyfooter.C30243c;
import com.google.android.libraries.onegoogle.account.policyfooter.C30245e;
import com.google.android.libraries.onegoogle.account.policyfooter.C30246f;
import com.google.android.libraries.onegoogle.account.policyfooter.PolicyFooterView;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30261f;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30639v;
import com.google.android.libraries.onegoogle.accountmenu.features.C30641x;
import com.google.android.libraries.onegoogle.accountmenu.features.p2375i.C30626e;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30323e;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30329k;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30478s;
import com.google.android.libraries.onegoogle.actions.C30802c;
import com.google.android.libraries.onegoogle.actions.C30807h;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30908ah;
import com.google.android.libraries.onegoogle.common.C30923j;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.common.C30939z;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.ap */
/* compiled from: PG */
public abstract class C30718ap extends LinearLayout {

    /* renamed from: a */
    protected final SelectedAccountHeaderView f82929a = ((SelectedAccountHeaderView) findViewById(R.id.selected_account_header));

    /* renamed from: b */
    protected final AccountMenuBodyView f82930b = ((AccountMenuBodyView) findViewById(R.id.account_menu_body));

    /* renamed from: c */
    protected final NestedScrollView f82931c = ((NestedScrollView) findViewById(R.id.scroll_view));

    /* renamed from: d */
    public final int f82932d;

    /* renamed from: e */
    protected C30898c f82933e;

    /* renamed from: f */
    public C30778v f82934f;

    /* renamed from: g */
    private final PolicyFooterView f82935g = ((PolicyFooterView) findViewById(R.id.og_footer));

    protected C30718ap(Context context, AttributeSet attributeSet, int i, int i2) {
        super(new ContextThemeWrapper(context, 2132149637), attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(i2, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C30747br.f82992a, i, 2132149621);
        try {
            this.f82932d = obtainStyledAttributes.getColor(6, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C63644b mo35801a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo36412b() {
        return getResources().getDimension(R.dimen.app_menu_header_elevation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo36413c();

    /* renamed from: d */
    public final void mo36414d() {
        C30778v vVar = this.f82934f;
        if (vVar != null) {
            ((C30707ae) vVar).f82915a.dismiss();
        }
    }

    /* renamed from: e */
    public void mo36415e(C30305n nVar, C30261f fVar) {
        C58485gu f;
        this.f82933e = nVar.mo35862m();
        SelectedAccountHeaderView selectedAccountHeaderView = this.f82929a;
        mo35801a();
        nVar.getClass();
        selectedAccountHeaderView.f82900i = nVar;
        selectedAccountHeaderView.f82901j = new C30230d(selectedAccountHeaderView, nVar.mo35852b(), C58836b.f156633a);
        selectedAccountHeaderView.mo36392b(selectedAccountHeaderView.f82895d);
        selectedAccountHeaderView.mo36392b(selectedAccountHeaderView.f82896e);
        selectedAccountHeaderView.mo36392b(selectedAccountHeaderView.f82897f);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) selectedAccountHeaderView.findViewById(R.id.no_selected_account_avatar);
        accountParticleDisc.mo35600r(nVar.mo35853c(), nVar.mo35852b());
        C30641x xVar = null;
        accountParticleDisc.mo35592j((Object) null);
        AccountMenuBodyView accountMenuBodyView = this.f82930b;
        C30713ak akVar = new C30713ak(this);
        C63644b a = mo35801a();
        RecyclerView recyclerView = accountMenuBodyView.f82879a;
        recyclerView.setLayoutManager(new C30776t(accountMenuBodyView, recyclerView.getContext()));
        RecyclerView recyclerView2 = accountMenuBodyView.f82879a;
        recyclerView2.getClass();
        C30939z zVar = new C30939z(nVar.mo35862m(), a, nVar.mo35858i());
        Context context = recyclerView2.getContext();
        C58480gp e = C58485gu.m89837e();
        if (((UserManager) context.getSystemService(UserManager.class)).isDemoUser()) {
            f = e.mo55394f();
        } else {
            C30807h a2 = C30802c.m57499a(nVar.mo35858i(), nVar.mo35855e().mo35819c(), context);
            if (a2 != null) {
                C30901aa aaVar = new C30901aa(a2.mo36497d());
                aaVar.mo36586a(zVar, 11);
                C30938y yVar = new C30938y(aaVar);
                C30462c g = C30464e.m56760g();
                g.mo36053f(a2.mo36494a());
                g.mo36052e(a2.mo36496c());
                g.mo36054g(a2.mo36500f());
                g.mo36056i(a2.mo36495b());
                ((C30466g) g).f82288b = yVar;
                e.mo55395g(g.mo36048a());
            }
            C30464e a3 = C30323e.m56485a(nVar, context);
            if (a3 != null) {
                C30901aa aaVar2 = new C30901aa(a3.mo36064d());
                aaVar2.mo36586a(zVar, 12);
                e.mo55395g(a3.mo36068i(new C30938y(aaVar2)));
            }
            if (nVar.mo35860k().mo36183p().mo56113h()) {
                xVar = (C30641x) nVar.mo35860k().mo36183p().mo56107c();
            } else if (nVar.mo35859j().mo36096g()) {
                xVar = C30626e.m57233e().mo36343a();
            }
            if (xVar != null) {
                C30462c h = C30329k.m56489a(context, nVar.mo35858i(), xVar).mo36067h();
                h.mo36057j(new C30478s(nVar.mo35858i()));
                C30464e a4 = h.mo36048a();
                C30901aa aaVar3 = new C30901aa(a4.mo36064d());
                aaVar3.mo36586a(zVar, 6);
                aaVar3.f83317e = new C30773q(fVar);
                e.mo55395g(a4.mo36068i(new C30938y(aaVar3)));
            }
            C30464e a5 = C30325g.m56486a(nVar, context);
            if (a5 != null) {
                int i = true != C30325g.m56487b(context) ? 41 : 42;
                C30901aa aaVar4 = new C30901aa(a5.mo36064d());
                aaVar4.mo36586a(zVar, i);
                e.mo55395g(a5.mo36068i(new C30938y(aaVar4)));
            }
            f = e.mo55394f();
        }
        C58485gu guVar = f;
        C58480gp e2 = C58485gu.m89837e();
        C58485gu c = nVar.mo35859j().mo36091c();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C30464e eVar = (C30464e) c.get(i2);
            C30901aa aaVar5 = new C30901aa(eVar.mo36064d());
            aaVar5.mo36586a(zVar, 43);
            e2.mo55395g(eVar.mo36068i(new C30938y(aaVar5)));
        }
        C30908ah.m57698a(recyclerView2, new C30772p(C30923j.m57716b(recyclerView2.getContext()), nVar, guVar, e2.mo55394f(), new C30774r(nVar, fVar), akVar, a));
        accountMenuBodyView.f82880b.mo36389e(nVar, a, new C30777u());
        accountMenuBodyView.f82883e = nVar.mo35858i();
        C30243c cVar = new C30243c(nVar.mo35852b());
        C30639v e3 = nVar.mo35860k().mo36172e();
        PolicyFooterView policyFooterView = this.f82935g;
        C30245e j = C30246f.m56249j();
        C30306o i3 = nVar.mo35858i();
        Objects.requireNonNull(i3);
        ((C30241a) j).f81756a = new C30714al(i3);
        C30860b m = nVar.mo35862m();
        C63644b a6 = mo35801a();
        j.mo35735d(m);
        j.mo35736e(a6);
        j.mo35739h(nVar.mo35864o());
        C58833ax c2 = e3.mo36334c();
        Objects.requireNonNull(cVar);
        j.mo35737f((C30156a) c2.mo56109e(new C30715am(cVar)));
        C58833ax d = e3.mo36335d();
        Objects.requireNonNull(cVar);
        j.mo35738g((C30156a) d.mo56109e(new C30716an(cVar)));
        j.mo35756i(e3.mo36333b(), e3.mo36332a());
        policyFooterView.mo35729c(j.mo35732a());
        mo36418h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36416f() {
        this.f82931c.f6034d = new C30717ao(this);
    }

    /* renamed from: g */
    public abstract void mo36417g(int i);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36418h() {
        SelectedAccountHeaderView selectedAccountHeaderView = this.f82929a;
        C30306o i = selectedAccountHeaderView.f82900i.mo35858i();
        boolean z = !i.f81934a.mo35794b().isEmpty();
        Object c = C30281j.m56319c(i.f81934a.f81883d);
        if (!z) {
            selectedAccountHeaderView.f82899h = false;
        }
        int i2 = 8;
        selectedAccountHeaderView.f82892a.setVisibility(c != null ? 8 : 0);
        View view = selectedAccountHeaderView.f82893b;
        if (c != null) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (c != null) {
            selectedAccountHeaderView.f82901j.mo35703a(c, C30751bv.f82998a);
        } else if (z) {
            selectedAccountHeaderView.f82894c.setText(R.string.og_choose_an_account);
            selectedAccountHeaderView.f82894c.setOnClickListener((View.OnClickListener) null);
            selectedAccountHeaderView.f82894c.setClickable(false);
        } else {
            selectedAccountHeaderView.f82894c.setText(R.string.og_sign_in);
            selectedAccountHeaderView.f82894c.setOnClickListener(new C30752bw(selectedAccountHeaderView, i));
        }
        selectedAccountHeaderView.mo36394g();
        selectedAccountHeaderView.mo36397j();
        this.f82930b.mo36387a();
    }
}

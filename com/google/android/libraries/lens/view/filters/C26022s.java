package com.google.android.libraries.lens.view.filters;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Size;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import androidx.core.content.p091b.C1874w;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25983g;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25984h;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.gleam.C26583fc;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.main.C27383ds;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25598f;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4711m.C62632i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import dagger.hilt.android.internal.managers.C68324h;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.filters.s */
/* compiled from: PG */
public final class C26022s implements C27654a, C25922ba {

    /* renamed from: t */
    private static final C58974d f70711t = C58974d.m91135i("FilterSelectorFragment");

    /* renamed from: a */
    public final C26019p f70712a;

    /* renamed from: b */
    public final C25989d f70713b;

    /* renamed from: c */
    public final C27655b f70714c;

    /* renamed from: d */
    public final C25941f f70715d;

    /* renamed from: e */
    public final C25758g f70716e;

    /* renamed from: f */
    public final boolean f70717f;

    /* renamed from: g */
    public final C25758g f70718g = new C25758g(false);

    /* renamed from: h */
    public final C25758g f70719h = new C25758g(true);

    /* renamed from: i */
    public final C26244b f70720i;

    /* renamed from: j */
    public final C26586ff f70721j;

    /* renamed from: k */
    public final C25598f f70722k;

    /* renamed from: l */
    public final boolean f70723l;

    /* renamed from: m */
    public C58833ax f70724m = C58836b.f156633a;

    /* renamed from: n */
    public C25935c f70725n;

    /* renamed from: o */
    public C25497ac f70726o = C25497ac.NONE;

    /* renamed from: p */
    public ViewStub f70727p;

    /* renamed from: q */
    public FilterPreview f70728q;

    /* renamed from: r */
    public C25922ba f70729r;

    /* renamed from: s */
    public C27383ds f70730s;

    /* renamed from: u */
    private final C26017n f70731u;

    /* renamed from: v */
    private final AccountId f70732v;

    /* renamed from: w */
    private final C25976a f70733w;

    /* renamed from: x */
    private final PointF f70734x = new PointF();

    /* renamed from: y */
    private C25980d f70735y;

    public C26022s(C26017n nVar, C26019p pVar, AccountId accountId, C26244b bVar, C25989d dVar, C27655b bVar2, C25941f fVar, C27232l lVar, C26586ff ffVar, C25976a aVar, C25598f fVar2, boolean z) {
        this.f70731u = nVar;
        this.f70712a = pVar;
        this.f70732v = accountId;
        this.f70720i = bVar;
        this.f70713b = dVar;
        this.f70714c = bVar2;
        this.f70715d = fVar;
        this.f70721j = ffVar;
        this.f70733w = aVar;
        this.f70722k = fVar2;
        this.f70723l = z;
        this.f70716e = new C25758g(Boolean.valueOf(nVar.f70703c));
        this.f70717f = C62632i.m94823h(lVar.mo32701h());
        this.f70735y = mo31223d();
    }

    /* renamed from: b */
    public static C26019p m48036b(AccountId accountId, C25980d dVar, boolean z) {
        C26016m mVar = (C26016m) C26017n.f70699d.createBuilder();
        C56306df b = dVar.mo31199b();
        mVar.copyOnWrite();
        C26017n nVar = (C26017n) mVar.instance;
        nVar.f70702b = b.f150068m;
        nVar.f70701a |= 1;
        mVar.copyOnWrite();
        C26017n nVar2 = (C26017n) mVar.instance;
        nVar2.f70701a |= 2;
        nVar2.f70703c = z;
        C26019p pVar = new C26019p();
        C68324h.m98669f(pVar);
        C47247a.m84047b(pVar, accountId);
        C47243l.m84039a(pVar, (C26017n) mVar.build());
        return pVar;
    }

    /* renamed from: a */
    public final C25935c mo31222a() {
        if (this.f70717f) {
            return null;
        }
        C25935c cVar = (C25935c) this.f70712a.getChildFragmentManager().f634a.mo670b(R.id.filter_carousel_placeholder);
        if (cVar != null) {
            return cVar;
        }
        AccountId accountId = this.f70732v;
        C26017n nVar = this.f70731u;
        C25935c cVar2 = new C25935c();
        C68324h.m98669f(cVar2);
        C47247a.m84047b(cVar2, accountId);
        C47243l.m84039a(cVar2, nVar);
        C0154a aVar = new C0154a(this.f70712a.getChildFragmentManager());
        aVar.mo511h(R.id.filter_carousel_placeholder, cVar2, (String) null, 1);
        aVar.mo509f();
        C26012i a = cVar2.mo17754z();
        C25758g gVar = this.f70716e;
        C25758g gVar2 = this.f70718g;
        a.f70690o = this;
        gVar2.mo5704e(a.f70679d, new C25971d(a));
        gVar.mo5704e(a.f70679d, new C25975e(a));
        return cVar2;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("FilterSelectorFragment");
    }

    /* renamed from: d */
    public final C25980d mo31223d() {
        C56306df a = C56306df.m87964a(this.f70731u.f70702b);
        if (a == null) {
            a = C56306df.UNKNOWN_FILTER_TYPE;
        }
        return C25980d.m47949a(a);
    }

    /* renamed from: e */
    public final void mo31224e() {
        C25935c cVar;
        if (this.f70720i.mo31462g(C26239a.ENABLE_FILTER_RECOMMENDATIONS) && (cVar = this.f70725n) != null) {
            cVar.mo17754z().mo31216b();
        }
    }

    /* renamed from: f */
    public final void mo31225f(C56306df dfVar, boolean z) {
        C25980d a = C25980d.m47949a(dfVar);
        this.f70713b.mo31205d(a);
        C25935c cVar = this.f70725n;
        if (cVar != null) {
            cVar.mo17754z().mo31217c(z);
            return;
        }
        C25994i iVar = this.f70713b.f70642a;
        mo31227h(iVar.mo31209b(iVar.mo31208a(a)));
    }

    /* renamed from: g */
    public final void mo31226g() {
        if (this.f70712a.getChildFragmentManager().mo461ab()) {
            ((C58970a) ((C58970a) f70711t.mo56226d()).mo56372aa(49357)).mo56386p("Should not perform the commit after onSaveInstanceState.");
        } else if (this.f70725n == null) {
            this.f70725n = mo31222a();
        }
    }

    /* renamed from: h */
    public final void mo31227h(C25981e eVar) {
        this.f70713b.mo31205d(eVar.mo31185d());
        this.f70721j.mo31853e();
        this.f70715d.mo31110c(eVar);
        mo31224e();
        mo31230k();
        mo31231l(eVar);
    }

    /* renamed from: i */
    public final void mo31228i(FragmentManager fragmentManager) {
        Fragment c;
        if (!this.f70724m.mo56113h() && (c = fragmentManager.f634a.mo671c("permissions_fragment_tag")) != null) {
            this.f70724m = C58833ax.m90834k((C25984h) c);
        }
        if (this.f70724m.mo56113h()) {
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo516m((Fragment) this.f70724m.mo56107c());
            aVar.mo509f();
            this.f70724m = C58836b.f156633a;
        }
    }

    /* renamed from: j */
    public final void mo31229j() {
        if (this.f70723l) {
            C25598f fVar = this.f70722k;
            C60870cx cxVar = fVar.f69645h;
            if (cxVar != null) {
                cxVar.cancel(true);
                fVar.f69645h = null;
            }
            synchronized (fVar) {
                C119096ae aeVar = fVar.f69643f;
                if (aeVar != null) {
                    aeVar.mo104116h();
                }
            }
            fVar.f69644g = null;
        }
    }

    /* renamed from: k */
    public final void mo31230k() {
        FragmentManager childFragmentManager = this.f70712a.getChildFragmentManager();
        if (childFragmentManager.mo461ab()) {
            ((C58970a) ((C58970a) f70711t.mo56226d()).mo56372aa(49358)).mo56386p("Should not perform the commit after onSaveInstanceState.");
            return;
        }
        C25980d dVar = this.f70713b.f70642a.f70649b;
        if (!this.f70733w.mo31167a(dVar, this.f70726o) || this.f70724m.mo56113h()) {
            mo31228i(childFragmentManager);
            this.f70719h.mo5708l(true);
            return;
        }
        C69464a aVar = (C69464a) this.f70733w.f70593a.get(dVar);
        C58838bb.m90867b(aVar, "No module installed for FilterPermissions of type %s", dVar);
        C25984h a = ((C25983g) aVar.mo17428b()).mo31200a();
        C0154a aVar2 = new C0154a(childFragmentManager);
        aVar2.mo689v(R.id.filter_permissions_fragment_placeholder, a, "permissions_fragment_tag");
        aVar2.mo509f();
        View view = a.getView();
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) a.getResources().getInteger(R.integer.filter_permission_view_fade_in_duration_ms));
            view.startAnimation(alphaAnimation);
        }
        this.f70724m = C58833ax.m90834k(a);
        FilterPreview filterPreview = this.f70728q;
        if (filterPreview != null) {
            filterPreview.mo30988a();
        }
        this.f70719h.mo5708l(false);
    }

    /* renamed from: l */
    public final void mo31231l(C25981e eVar) {
        ViewStub viewStub;
        if (eVar.mo31185d() != this.f70735y && !this.f70724m.mo56113h()) {
            this.f70735y = eVar.mo31185d();
            if (this.f70728q == null && (viewStub = this.f70727p) != null) {
                this.f70728q = (FilterPreview) viewStub.inflate();
            }
            FilterPreview filterPreview = this.f70728q;
            if (filterPreview != null) {
                filterPreview.f70216a.f70696a.setImageDrawable(C1874w.m5109f(filterPreview.getResources(), eVar.mo31184c(), (Resources.Theme) null));
                filterPreview.f70216a.f70697b.setText(eVar.mo31190h());
                FilterPreview filterPreview2 = this.f70728q;
                filterPreview2.f70219d = this.f70734x;
                filterPreview2.mo30989b();
                FilterPreview filterPreview3 = this.f70728q;
                filterPreview3.mo30988a();
                filterPreview3.f70216a.f70698c.setAlpha(1.0f);
                filterPreview3.f70216a.f70698c.postDelayed(filterPreview3.f70218c, (long) filterPreview3.f70217b.f70695b);
            }
        }
    }

    /* renamed from: m */
    public final void mo31232m(C26583fc fcVar) {
        RectF rectF;
        if (((Boolean) this.f70716e.mo3842a()).booleanValue()) {
            View requireView = this.f70712a.requireView();
            Size size = new Size(requireView.getWidth(), requireView.getHeight());
            C26586ff ffVar = this.f70721j;
            rectF = ffVar.mo31850b(ffVar.mo31849a(size), ffVar.f72474a.f70642a.f70649b);
        } else {
            rectF = new RectF(fcVar.mo31846a());
        }
        this.f70734x.x = rectF.centerX();
        this.f70734x.y = rectF.centerY();
        FilterPreview filterPreview = this.f70728q;
        if (filterPreview != null) {
            filterPreview.f70219d = this.f70734x;
            filterPreview.mo30989b();
        }
    }
}

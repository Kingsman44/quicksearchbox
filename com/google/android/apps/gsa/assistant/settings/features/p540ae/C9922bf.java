package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.p509a.C9437a;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.C9935bs;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a.C9861b;
import com.google.android.apps.gsa.assistant.settings.p515c.C9516a;
import com.google.android.apps.gsa.assistant.settings.p515c.C9517b;
import com.google.android.apps.gsa.assistant.settings.p515c.C9518c;
import com.google.android.apps.gsa.assistant.settings.p515c.C9519d;
import com.google.android.apps.gsa.assistant.settings.p515c.C9520e;
import com.google.android.apps.gsa.assistant.settings.search.k;
import com.google.android.apps.gsa.assistant.settings.shared.e.b;
import com.google.android.apps.gsa.assistant.settings.shared.e.c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.IdentityView;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.C30789p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.C30522c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30507d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30508e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2361b.C30519a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2361b.C30520b;
import com.google.android.libraries.onegoogle.accountmenu.features.p2362c.C30523a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2374h.C30617a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2374h.C30620d;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59573ac;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60630x;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bf */
/* compiled from: PG */
public final class C9922bf extends C9961f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9935bs f34022a;

    /* renamed from: c */
    private Context f34023c;

    /* renamed from: d */
    private final C2393x f34024d = new C2393x(this);

    /* renamed from: e */
    private boolean f34025e;

    @Deprecated
    public C9922bf() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18121b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34023c == null) {
            this.f34023c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34023c;
    }

    /* renamed from: f */
    public final C9935bs mo17754z() {
        C9935bs bsVar = this.f34022a;
        if (bsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34025e) {
            return bsVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f34024d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C9935bs f = mo17754z();
            f.f34059s = new C9933bq(f);
            C30306o i = f.f34046f.mo35858i();
            i.f81934a.f81880a.add(f.f34059s);
            if (!f.f34049i.mo79746e(C90059dk.f249069af)) {
                f.f34058r = AccountMenu.m56331g(f.f34042b, f.f34046f);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Fragment fragment;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9935bs f = mo17754z();
            f.f34042b.getViewLifecycleOwner().getLifecycle().mo5790b(f.f34047g);
            c cVar = f.f34043c;
            C46691ai aiVar = C9861b.f33894a;
            C9922bf bfVar = f.f34042b;
            Objects.requireNonNull(bfVar);
            b a = cVar.a(aiVar, new C9928bl(bfVar));
            f.f34057q.mo50707a(f.f34056p.mo18082a(), new C9935bs.C9936a(f, a));
            View inflate = layoutInflater.inflate(R.layout.main_page_v2_layout, viewGroup, false);
            f.f34053m.f76997b.mo33800a(C28427h.m53115a(95012)).mo33809b(inflate);
            if (f.f34042b.getChildFragmentManager().f634a.mo671c("LIST_FRAGMENT") == null) {
                C0154a aVar = new C0154a(f.f34042b.getChildFragmentManager());
                if (f.f34049i.mo79746e(C90059dk.f249057aT)) {
                    fragment = new C9964i();
                    C68324h.m98669f(fragment);
                } else {
                    fragment = new C9974r();
                    C68324h.m98669f(fragment);
                }
                aVar.mo689v(R.id.main_page_list_fragment, fragment, "LIST_FRAGMENT");
                aVar.mo509f();
            }
            View a2 = a.a(layoutInflater, viewGroup, inflate);
            C47831fm.m85019n();
            return a2;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C9935bs f = mo17754z();
            f.f34042b.getViewLifecycleOwner().getLifecycle().mo5791c(f.f34047g);
            c.close();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34025e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C9935bs f = mo17754z();
            C60630x xVar = (C60630x) C59573ac.f158248m.createBuilder();
            xVar.copyOnWrite();
            C59573ac acVar = (C59573ac) xVar.instance;
            acVar.f158261l = 2;
            acVar.f158250a |= 1024;
            C59573ac acVar2 = (C59573ac) xVar.build();
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            acVar2.getClass();
            cbVar.f160098aj = acVar2;
            cbVar.f160122c |= 4;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_SETTINGS_PAGE_MAIN_END;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) f.f34055o.mo27525b()).mo74236a(fVar.mo83699a());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            ((C89859i) mo17754z().f34055o.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_PAGE_MAIN_START);
            e.close();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C9935bs f = mo17754z();
            C0395p pVar = (C0395p) f.f34042b.requireActivity();
            OpenSearchBar openSearchBar = (OpenSearchBar) view.findViewById(R.id.assistant_settings_toolbar);
            if (f.f34049i.mo79746e(C90059dk.f249117ba)) {
                f.f34053m.f76997b.mo33800a(C28427h.m53115a(100760)).mo33809b(openSearchBar);
                TextView textView = (TextView) view.findViewById(R.id.center_search_hint);
                if (f.f34049i.mo79746e(C90059dk.f249069af)) {
                    openSearchBar.f77584B.setHint(R.string.search_hint);
                    openSearchBar.mo2404n(R.menu.account_disc_menu);
                    C30343m.m56502b(f.f34042b, f.f34046f, C30789p.m57485a(openSearchBar.mo2393g().findItem(R.id.selected_account_disc_item)));
                } else {
                    textView.setAlpha(1.0f);
                    openSearchBar.mo2418s(f.f34042b.getResources().getDrawable(R.drawable.quantum_ic_arrow_back_grey600_24, (Resources.Theme) null));
                    pVar.mo1322k().mo1192t(openSearchBar);
                }
                if ((f.f34042b.requireContext().getResources().getConfiguration().uiMode & 48) == 32) {
                    openSearchBar.getBackground().setTint(C1878d.m5128a(f.f34042b.requireContext(), R.color.grey850));
                }
                k f2 = k.f();
                C0154a aVar = new C0154a(f.f34042b.getChildFragmentManager());
                aVar.mo689v(R.id.assistant_settings_searchview, f2, (String) null);
                aVar.mo509f();
                OpenSearchView openSearchView = (OpenSearchView) view.findViewById(R.id.assistant_settings_searchview);
                openSearchView.f77608j.addTextChangedListener(new C9934br(f2));
                openSearchView.mo34100b(new C9929bm(f, textView, openSearchBar));
            } else {
                C58976aa aaVar = C58975e.f156826a;
                openSearchBar.setVisibility(8);
                Toolbar toolbar = (Toolbar) view.findViewById(R.id.fallback_assistant_settings_toolbar);
                toolbar.setVisibility(0);
                pVar.mo1322k().mo1192t(toolbar);
                C73778a.m108339b(f.f34042b);
            }
            if (f.f34049i.mo79746e(C90059dk.f249069af)) {
                view.findViewById(R.id.profile_section).setVisibility(8);
            } else {
                IdentityView findViewById = view.findViewById(R.id.settings_identity);
                if (!f.f34045e.f()) {
                    findViewById.c(true);
                    findViewById.c.setOnClickListener(new C9925bi(f));
                } else {
                    findViewById.c(false);
                }
                Chip chip = (Chip) view.findViewById(R.id.manage_google_account);
                chip.setVisibility(0);
                chip.setOnClickListener(new C9926bj(f));
                ((Chip) view.findViewById(R.id.data_in_assistant)).setOnClickListener(new C9927bk(f));
            }
            if (!f.f34049i.mo79746e(C90059dk.f249069af)) {
                View inflate = LayoutInflater.from(f.f34042b.requireContext()).inflate(R.layout.policies_footer, (LinearLayout) view.findViewById(R.id.scrollable_content));
                TextView textView2 = (TextView) inflate.findViewById(R.id.tos_text);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText(LinkUtil.m133792b(C9437a.m23954b(f.f34042b.getResources())));
                TextView textView3 = (TextView) inflate.findViewById(R.id.pp_text);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                textView3.setText(LinkUtil.m133792b(C9437a.m23953a(f.f34042b.getResources())));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9921be.m24691a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        C30305n nVar;
        this.f122869b.mo51381i();
        try {
            if (!this.f34025e) {
                super.onAttach(context);
                if (this.f34022a == null) {
                    Object jN = mo18160a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9922bf) {
                        C9922bf bfVar = (C9922bf) fragment;
                        C68225k.m98532d(bfVar);
                        c p = ((C74178nm) jN).mo70074p();
                        C91189au auVar = (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b();
                        h hVar = (h) ((C74178nm) jN).f207130a.a.f202853es.mo17428b();
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        C30305n nVar2 = (C30305n) bvVar.f205644cn.mo17428b();
                        C9520e eVar = new C9520e(bvVar.mo69381m(), (C73906a) bvVar.f205798h.mo17428b(), (h) bvVar.f205604c.a.f202853es.mo17428b(), (Activity) bvVar.f205710e.mo17428b());
                        if (!((C86124t) bvVar.f205604c.a.f202006C.mo17428b()).mo79746e(C90059dk.f249069af)) {
                            nVar = nVar2;
                        } else {
                            C30495a a = C30518b.m56960a();
                            if (eVar.f33002c.f()) {
                                ((C30522c) a).f82438h = C58833ax.m90834k(new C30523a(C58833ax.m90834k(eVar.f33003d.getString(R.string.assistant_settings_account_switching_disabled_explanation, new Object[]{eVar.f33002c.b()}))));
                            }
                            C30630m k = C30631n.m57247k();
                            k.mo36303d(eVar.f33003d.getResources().getString(R.string.google_account_history));
                            Drawable c = C0678gm.m2375e().mo3100c(eVar.f33003d, R.drawable.quantum_gm_ic_google_vd_theme_24);
                            c.getClass();
                            ((C30606g) k).f82676a = c;
                            ((C30606g) k).f82677b = new C9516a(eVar);
                            C58485gu n = C58485gu.m89846n(k.mo36300a());
                            C30507d a2 = C30508e.m56929a();
                            a2.mo36152c(n);
                            a.mo36134f(a2.mo36138a());
                            Activity activity = eVar.f33003d;
                            a.mo36131c(C58485gu.m89847o(C30520b.m56982a(activity, activity.getString(R.string.privacy_advisor_product_name_assistant), new C9517b(eVar)), C30519a.m56981a(eVar.f33003d, new C9519d(eVar))));
                            if (eVar.f33001b.mo65438a()) {
                                C30617a aVar = new C30617a();
                                C9518c cVar = new C9518c(eVar);
                                aVar.f82713c = C58833ax.m90834k(Integer.valueOf(R.string.opa_transparency_disclosure));
                                aVar.f82714d = C58833ax.m90834k(cVar);
                                C30620d a3 = aVar.mo36331a();
                                if (a3 != null) {
                                    ((C30522c) a).f82434d = a3;
                                } else {
                                    throw new NullPointerException("Null policyFooterCustomizer");
                                }
                            }
                            C30304m g = nVar2.mo35856g(eVar.f33003d);
                            g.mo35845s(a.mo36129a());
                            nVar = g.mo35830d();
                        }
                        C68225k.m98532d(nVar);
                        this.f34022a = new C9935bs(bfVar, p, auVar, hVar, nVar, (GmsheadAccountsModelUpdater) ((C74178nm) jN).f207136c.f205645co.mo17428b(), (C86054o) ((C74178nm) jN).f207130a.a.f202324I.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (Set) ((C74178nm) jN).f207136c.f205559bH.mo17428b(), ((C74178nm) jN).f207136c.f205597bt, ((C74178nm) jN).mo70072n(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q), ((C74178nm) jN).f207136c.mo69378j(), (C46801dp) ((C74178nm) jN).f207138e.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34024d));
                    } else {
                        String obj = C9935bs.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C9921be.m24691a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

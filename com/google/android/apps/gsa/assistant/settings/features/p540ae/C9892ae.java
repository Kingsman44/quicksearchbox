package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.IdentityView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.api.C74712bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.tabs.TabLayout;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59573ac;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60630x;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ae */
/* compiled from: PG */
public final class C9892ae extends C9959d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9907at f33948a;

    /* renamed from: c */
    private Context f33949c;

    /* renamed from: d */
    private final C2393x f33950d = new C2393x(this);

    /* renamed from: e */
    private boolean f33951e;

    @Deprecated
    public C9892ae() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18096b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f33949c == null) {
            this.f33949c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f33949c;
    }

    /* renamed from: f */
    public final C9907at mo17754z() {
        C9907at atVar = this.f33948a;
        if (atVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f33951e) {
            return atVar;
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
        return this.f33950d;
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
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C9907at f = mo17754z();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 798;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            l lVar = f.f33976g;
            C9858a aVar = f.f33973d;
            Objects.requireNonNull(aVar);
            C9893af afVar = new C9893af(aVar);
            C9894ag agVar = new C9894ag(f);
            C9892ae aeVar = f.f33972c;
            Objects.requireNonNull(aeVar);
            f.f33986q = lVar.b(afVar, agVar, new C9895ah(aeVar));
            if (f.f33978i.mo79746e(C90059dk.f249130bn)) {
                f.f33992w = new C9903ap(f);
                f.f33980k.mo35858i().f81934a.f81880a.add(f.f33992w);
                f.f33990u = AccountMenu.m56331g(f.f33972c, f.f33980k);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9907at f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.main_page_content, (ViewGroup) null, false);
            View a = f.f33986q.b.a(layoutInflater, viewGroup, inflate);
            f.f33983n.f76997b.mo33800a(C28427h.m53115a(60979)).mo33809b(a);
            C0395p pVar = (C0395p) f.f33972c.getActivity();
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.assistant_settings_toolbar);
            C0401v k = pVar.mo1322k();
            ((C0356aq) k).mo1163P();
            if (((C0356aq) k).f1215o == null) {
                pVar.mo1322k().mo1192t(toolbar);
            }
            toolbar.mo2423x(BuildConfig.FLAVOR);
            f.f33989t = (AppBarLayout) inflate.findViewById(R.id.app_bar);
            C73778a.m108339b(f.f33972c);
            f.f33972c.getViewLifecycleOwner().getLifecycle().mo5790b(f.f33981l);
            IdentityView findViewById = inflate.findViewById(R.id.settings_identity);
            if (!f.f33978i.mo79746e(C90059dk.f249130bn) || !f.f33978i.mo79746e(C90014bt.f247760nI) || f.f33975f.f()) {
                findViewById.c(false);
            } else {
                findViewById.c(true);
                findViewById.c.setOnClickListener(new C9898ak(f));
            }
            Chip chip = (Chip) a.findViewById(R.id.manage_google_account);
            if (f.f33978i.mo79746e(C90059dk.f249130bn)) {
                chip.setVisibility(0);
                chip.setOnClickListener(new C9899al(f));
            } else {
                chip.setVisibility(8);
            }
            ImageView imageView = (ImageView) a.findViewById(R.id.search_icon);
            if (f.f33978i.mo79746e(C90059dk.f249060aW)) {
                List<ResolveInfo> queryIntentActivities = f.f33972c.getActivity().getPackageManager().queryIntentActivities(C9907at.f33971b, 65536);
                if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                    C58976aa aaVar = C58975e.f156826a;
                    imageView.setVisibility(8);
                } else {
                    f.f33983n.f76997b.mo33800a(C28427h.m53115a(92515)).mo33809b(imageView);
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(new C9900am(f));
                }
            } else {
                imageView.setVisibility(8);
            }
            f.f33991v = (TabLayout) a.findViewById(R.id.settings_tabs);
            f.f33983n.f76997b.mo33800a(C28427h.m53115a(99232)).mo33809b(f.f33991v);
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C9907at f = mo17754z();
            f.f33972c.getViewLifecycleOwner().getLifecycle().mo5791c(f.f33981l);
            c.close();
            return;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f33951e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
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
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C9907at f = mo17754z();
            C60630x xVar = (C60630x) C59573ac.f158248m.createBuilder();
            xVar.copyOnWrite();
            C59573ac acVar = (C59573ac) xVar.instance;
            acVar.f158261l = 1;
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
            ((C89859i) f.f33985p.mo27525b()).mo74236a(fVar.mo83699a());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C9907at f = mo17754z();
            ((C89859i) f.f33985p.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_PAGE_MAIN_START);
            if (f.f33988s && f.f33978i.mo79746e(C90059dk.f249059aV)) {
                new C90873ag(f.f33973d.mo18081a(), f.f33977h, "MainPageFragmentPeer.Load", new C9896ai(f)).mo85223a(C9897aj.f33956a);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C9891ad.m24644a(th, th);
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
        this.f122869b.mo51381i();
        try {
            if (!this.f33951e) {
                super.onAttach(context);
                if (this.f33948a == null) {
                    Object jN = mo18156a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9892ae) {
                        C9892ae aeVar = (C9892ae) fragment;
                        C68225k.m98532d(aeVar);
                        this.f33948a = new C9907at(aeVar, new C9858a(((C74178nm) jN).f207130a.b.mo67568p(), ((C74178nm) jN).mo70046ab(), (Set) ((C74178nm) jN).f207136c.f205559bH.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b()), (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), (h) ((C74178nm) jN).f207130a.a.f202853es.mo17428b(), ((C74178nm) jN).mo70075q(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C9972p) ((C74178nm) jN).f207136c.f205643cm.mo17428b(), (C30305n) ((C74178nm) jN).f207136c.f205644cn.mo17428b(), (GmsheadAccountsModelUpdater) ((C74178nm) jN).f207136c.f205645co.mo17428b(), (C86054o) ((C74178nm) jN).f207130a.a.f202324I.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), C58833ax.m90834k((C74712bm) ((C74178nm) jN).f207130a.d.f201752ez.mo17428b()), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f33950d));
                    } else {
                        String obj = C9907at.class.toString();
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
                C9891ad.m24644a(th2, th3);
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

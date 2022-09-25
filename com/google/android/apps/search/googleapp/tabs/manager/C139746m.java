package com.google.android.apps.search.googleapp.tabs.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.p10117aa.C133100ar;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.tabs.manager.p10524a.C139716c;
import com.google.android.apps.search.googleapp.tabs.manager.p10524a.C139717d;
import com.google.android.apps.search.googleapp.tabs.manager.p10525b.C139733b;
import com.google.android.apps.search.googleapp.tabs.manager.p10526c.C139736a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.m */
/* compiled from: PG */
public final class C139746m extends C139730al implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139720ac f379845a;

    /* renamed from: c */
    private Context f379846c;

    /* renamed from: d */
    private final C2393x f379847d = new C2393x(this);

    /* renamed from: e */
    private boolean f379848e;

    @Deprecated
    public C139746m() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139720ac mo17754z() {
        C139720ac acVar = this.f379845a;
        if (acVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379848e) {
            return acVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115206b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379846c == null) {
            this.f379846c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379846c;
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
        return this.f379847d;
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
            C139745l.m227212a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139720ac a = mo17754z();
            a.f379775h.mo50829i(R.id.googleapp_tabs_manager_load_tabs_subscription, new C133100ar(a.f379773f), new C139718aa(a), C139750q.f379855a);
            a.f379778k.mo50429i(a.f379791x);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139745l.m227212a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139720ac a = mo17754z();
            if (a.f379785r) {
                layoutInflater = LayoutInflater.from(new ContextThemeWrapper(layoutInflater.getContext(), 2132150663));
            }
            View inflate = layoutInflater.inflate(R.layout.googleapp_tabs_manager, viewGroup, false);
            C28306ab abVar = a.f379780m;
            C28439i b = abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(110649)));
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.googleapp_tabs_manager_toolbar);
            toolbar.mo2404n(R.menu.googleapp_tabs_manager_menu);
            toolbar.mo2393g().findItem(R.id.googleapp_tabs_manager_close_all_tabs_button).setOnMenuItemClickListener(new C47579cc(a.f379776i, "CloseAllTabsMenuItem onClick", new C139756w(a, new C28452b(b).mo33907a("close_all_tabs", a.f379780m.f76990a.mo33805a(C28427h.m53115a(110650))))));
            toolbar.mo2393g().findItem(R.id.googleapp_tabs_manager_send_feedback_button).setOnMenuItemClickListener(new C47579cc(a.f379776i, "SendFeedbackMenuItem onClick", new C139751r(a)));
            if (toolbar.mo2393g() instanceof C0477q) {
                ((C0477q) toolbar.mo2393g()).f1659j = true;
            }
            View findViewById = inflate.findViewById(R.id.googleapp_tabs_manager_new_button);
            C28306ab abVar2 = a.f379780m;
            abVar2.mo33801b(findViewById, abVar2.f76990a.mo33805a(C28427h.m53115a(110652)));
            findViewById.setOnClickListener(new C47591co(a.f379776i, "NewTabButton onClick", new C139759z(a)));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.googleapp_tabs_manager_recycler);
            recyclerView.setLayoutManager(new GridLayoutManager(a.f379770c.getContext(), 2));
            recyclerView.addItemDecoration$ar$ds(new C139722ad(a));
            recyclerView.setAdapter(a.f379790w);
            RecyclerView recyclerView2 = recyclerView;
            recyclerView.addOnScrollListener(new C139723ae(recyclerView2, a.f379770c.getResources().getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_horizontal_offset), (ExtendedFloatingActionButton) inflate.findViewById(R.id.googleapp_tabs_manager_new_button), (ViewGroup) inflate.findViewById(R.id.googleapp_tabs_manager_toolbar_container), a.f379770c.getResources().getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_toolbar_elevation)));
            if (a.f379788u) {
                if (a.f379770c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_tabs_manager_mavatar_fragment) == null) {
                    C0154a aVar = new C0154a(a.f379770c.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_tabs_manager_mavatar_fragment, C133252d.m216261a(a.f379771d, C133189b.f363045d), "GoogleApp_AccountDiscFragment", 1);
                    aVar.mo509f();
                }
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139745l.m227212a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379848e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139745l.m227212a(th, th);
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
            C139745l.m227212a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C139720ac a = mo17754z();
            C47393f.m84233d(this, C139717d.class, new C139725ag(a));
            C47393f.m84233d(this, C139716c.class, new C139726ah(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139745l.m227212a(th, th);
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
            if (!this.f379848e) {
                super.onAttach(context);
                if (this.f379845a == null) {
                    Object jN = mo115207d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139746m) {
                        C139746m mVar = (C139746m) fragment;
                        C68225k.m98532d(mVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C139748o oVar = (C139748o) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C139748o.f379849d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(oVar);
                        this.f379845a = new C139720ac(mVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), oVar, (InstanceStateStoreFactory) ((C74176nj) jN).f206700aW.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66869dp(), (C133081f) ((C74176nj) jN).f206836d.f205432n.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), new C139733b(((C74176nj) jN).f206730b.f198027a.mo66813cm(), ((C74176nj) jN).mo69590cg(), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b()), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), ((C74176nj) jN).mo69697eh(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C133118a) ((C74176nj) jN).f206730b.f198027a.f199877w.mo17428b(), (C133411h) ((C74176nj) jN).f206836d.f205431m.mo17428b(), ((C74176nj) jN).mo69794gY(), new C139736a((Context) ((C74176nj) jN).f206677a.g.mo17428b()), ((C74176nj) jN).f206677a.d.mo67789bm().mo60830b(), (C136370a) ((C74176nj) jN).f206724au.mo17428b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199443fC.mo17428b()).booleanValue(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45369968").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379847d));
                    } else {
                        String obj = C139720ac.class.toString();
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
                C139745l.m227212a(th2, th3);
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

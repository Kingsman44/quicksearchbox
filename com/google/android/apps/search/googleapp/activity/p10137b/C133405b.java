package com.google.android.apps.search.googleapp.activity.p10137b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2107v;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p043a.p044a.C0782b;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.navigation.C44820g;
import com.google.android.material.navigation.NavigationBarView;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3704f.p3705a.C47664a;
import com.google.apps.tiktok.tracing.contrib.p3704f.p3705a.C47665b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69076cs;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69086g;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69104y;

/* renamed from: com.google.android.apps.search.googleapp.activity.b.b */
/* compiled from: PG */
public final class C133405b extends C133413j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133409f f363503a;

    /* renamed from: c */
    private Context f363504c;

    /* renamed from: d */
    private final C2393x f363505d = new C2393x(this);

    /* renamed from: e */
    private boolean f363506e;

    @Deprecated
    public C133405b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133409f mo17754z() {
        C133409f fVar = this.f363503a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363506e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111131b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363504c == null) {
            this.f363504c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363504c;
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
        return this.f363505d;
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
            C133404a.m216535a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C133409f a2 = mo17754z();
            C47558bi a3 = C47831fm.m85006a("NavigationBarFragmentPeer#onCreateView");
            try {
                View inflate = layoutInflater.cloneInContext(new C0782b(layoutInflater.getContext(), true != a2.f363525o ? 2132150915 : 2132150916)).inflate(true != a2.f363521k.mo111133a() ? R.layout.googleapp_bottom_navigation_material : R.layout.googleapp_navigation_rail_material, viewGroup, false);
                NavigationBarView navigationBarView = (NavigationBarView) inflate.findViewById(R.id.googleapp_navigation_bar);
                navigationBarView.mo48181c(R.menu.googleapp_navigation_bar_material_menu);
                if (a2.f363516f) {
                    C44820g gVar = navigationBarView.f116864a;
                    MenuItem findItem = gVar.findItem(R.id.googleapp_navigation_bar_search);
                    MenuItem findItem2 = gVar.findItem(R.id.googleapp_navigation_bar_collections);
                    gVar.removeItem(R.id.googleapp_navigation_bar_search);
                    gVar.removeItem(R.id.googleapp_navigation_bar_collections);
                    gVar.mo1650c(findItem2.getGroupId(), findItem2.getItemId(), findItem.getOrder(), findItem2.getTitle()).setIcon(findItem2.getIcon());
                    gVar.mo1650c(findItem.getGroupId(), findItem.getItemId(), findItem2.getOrder(), findItem.getTitle()).setIcon(findItem.getIcon());
                }
                if (a2.f363518h.mo110979b()) {
                    navigationBarView.f116864a.add(0, R.id.googleapp_navigation_bar_tabs, 4, R.string.bottom_navigation_tabs_label).setIcon(R.drawable.googleapp_m2_tabs_tab);
                }
                if (a2.f363526p && navigationBarView.f116864a.f1652c.size() < 5) {
                    navigationBarView.f116864a.add(0, R.id.googleapp_navigation_bar_inbox, 4, R.string.googleapp_bottom_navigation_inbox_label).setIcon(R.drawable.quantum_gm_ic_notifications_gm_grey_24);
                }
                if (a2.f363520j) {
                    navigationBarView.f116864a.findItem(R.id.googleapp_navigation_bar_discover).setTitle(R.string.googleapp_navigation_bar_spark_label_no_discover);
                }
                a = C47831fm.m85006a("NavigationBarFragmentPeer#setupNavigationListeners");
                navigationBarView.getClass();
                C28452b bVar = new C28452b(a2.f363515e.mo33801b(navigationBarView, a2.f363514d.mo33805a(C28427h.m53115a(true != a2.f363521k.mo111133a() ? 78436 : 148332))));
                bVar.mo33907a(Integer.valueOf(R.id.googleapp_navigation_bar_discover), a2.f363514d.mo33805a(C28427h.m53115a(78506)));
                bVar.mo33907a(Integer.valueOf(R.id.googleapp_navigation_bar_search), a2.f363514d.mo33805a(C28427h.m53115a(78509)));
                a2.f363524n.mo50707a(a2.f363523m.mo113453j(C63934bu.SEARCH_BOTTOMBAR_ICON, C63926bm.HOME), new C133408e(a2));
                bVar.mo33907a(Integer.valueOf(R.id.googleapp_navigation_bar_collections), a2.f363514d.mo33805a(C28427h.m53115a(89055)));
                if (a2.f363518h.mo110979b()) {
                    bVar.mo33907a(Integer.valueOf(R.id.googleapp_navigation_bar_tabs), a2.f363514d.mo33805a(C28427h.m53115a(106497)));
                }
                if (a2.f363526p && navigationBarView.f116864a.f1652c.size() < 5) {
                    bVar.mo33907a(Integer.valueOf(R.id.googleapp_navigation_bar_inbox), a2.f363514d.mo33805a(C28427h.m53115a(150331)));
                }
                navigationBarView.f116867d = new C47664a(a2.f363517g, navigationBarView, new C133407d(a2, bVar, navigationBarView));
                a.close();
                C2107v.m5811a(navigationBarView.f116864a.findItem(R.id.googleapp_navigation_bar_collections), a2.f363512b.getString(R.string.googleapp_bottom_navigation_collections_label_content_description));
                a3.close();
                C47831fm.m85019n();
                return inflate;
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C133404a.m216535a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f363506e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133404a.m216535a(th, th);
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
            C133404a.m216535a(th, th);
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
            if (!this.f363506e) {
                super.onAttach(context);
                if (this.f363503a == null) {
                    Object jN = mo111134d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C133405b) {
                        C133405b bVar = (C133405b) fragment;
                        C68225k.m98532d(bVar);
                        this.f363503a = new C133409f(bVar, (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), C69076cs.m100173a(((C74176nj) jN).f206730b.f198009I), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45353244").mo50907f(), new C47665b((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b()), ((C74176nj) jN).mo69693ed(), C69104y.m100233a(((C74176nj) jN).f206730b.f198009I), ((C74176nj) jN).mo69551bu(), ((C74176nj) jN).mo69638db(), (C136969bx) ((C74176nj) jN).f206730b.f198027a.f199441fA.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).f206677a.d.mo67789bm().mo60830b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45368868").mo50907f(), C69086g.m100210d(((C74176nj) jN).f206730b.f198009I));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f363505d));
                    } else {
                        String obj = C133409f.class.toString();
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
                C133404a.m216535a(th2, th3);
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

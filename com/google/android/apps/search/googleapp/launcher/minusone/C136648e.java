package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.C134747g;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134712j;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137117k;
import com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62942bv;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.e */
/* compiled from: PG */
public final class C136648e extends C136637co implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136652i f371971a;

    /* renamed from: c */
    private Context f371972c;

    /* renamed from: d */
    private final C2393x f371973d = new C2393x(this);

    /* renamed from: e */
    private boolean f371974e;

    @Deprecated
    public C136648e() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136652i mo17754z() {
        C136652i iVar = this.f371971a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371974e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113283b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371972c == null) {
            this.f371972c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371972c;
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
        return this.f371973d;
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
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136652i a = mo17754z();
            a.f371992k.mo50429i(a.f372006y);
            boolean z = Build.VERSION.SDK_INT >= 31;
            C0154a aVar = new C0154a(a.f371988g.getChildFragmentManager());
            if (a.f371988g.getChildFragmentManager().f634a.mo670b(R.id.googleapp_header_container) == null) {
                aVar.mo511h(R.id.googleapp_header_container, a.f372004w.mo113242b(), (String) null, 1);
            }
            if (a.f371988g.getChildFragmentManager().f634a.mo670b(R.id.googleapp_minus_one_discover) == null) {
                C134714d dVar = a.f371989h;
                AccountId accountId = a.f371983b;
                C134747g gVar = (C134747g) C134749h.f366906k.createBuilder();
                C57528m mVar = C57528m.ANDROID_LAUNCHER_MAIN_SCREEN;
                gVar.copyOnWrite();
                C134749h hVar = (C134749h) gVar.instance;
                hVar.f366909b = mVar.f153693B;
                hVar.f366908a |= 1;
                int dimensionPixelSize = a.f371988g.getResources().getDimensionPixelSize(R.dimen.googleapp_hs_header_total_height);
                gVar.copyOnWrite();
                C134749h hVar2 = (C134749h) gVar.instance;
                hVar2.f366908a |= 256;
                hVar2.f366917j = dimensionPixelSize;
                gVar.copyOnWrite();
                C134749h hVar3 = (C134749h) gVar.instance;
                hVar3.f366908a |= 16;
                hVar3.f366913f = z;
                C62942bv build = gVar.build();
                C69664n.m101060f(build, "newBuilder()\n           …stS)\n            .build()");
                aVar.mo511h(R.id.googleapp_minus_one_discover, dVar.mo111903a(accountId, (C134749h) build), (String) null, 1);
            }
            aVar.mo509f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout;
        C134744f c;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136652i a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            if (a.f371998q) {
                CoordinatorLayout coordinatorLayout2 = new CoordinatorLayout(layoutInflater.getContext());
                coordinatorLayout2.setLayoutParams(new C1773f(-1, -1));
                layoutInflater.inflate(R.layout.googleapp_minus_one_fragment, coordinatorLayout2, true);
                coordinatorLayout = coordinatorLayout2;
            } else {
                coordinatorLayout = layoutInflater.inflate(R.layout.googleapp_minus_one_fragment, viewGroup, false);
            }
            C69664n.m101059e(coordinatorLayout, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) coordinatorLayout;
            a.f371985d.mo113061a(114275, viewGroup2);
            a.f371990i.ifPresent(new C136657l(a));
            View r = C2043bi.m5589r(viewGroup2, R.id.googleapp_minus_one_header_container);
            C69664n.m101060f(r, "requireViewById(root, R.…nus_one_header_container)");
            RestrictedWidthLayout restrictedWidthLayout = (RestrictedWidthLayout) viewGroup2.findViewById(R.id.googleapp_header_container);
            if (restrictedWidthLayout != null) {
                if (a.f371994m) {
                    restrictedWidthLayout.f373297a = viewGroup2.getResources().getDimensionPixelSize(a.f371996o == 3 ? R.dimen.googleapp_minus_one_header_container_three_column_size : R.dimen.googleapp_minus_one_header_container_two_column_size);
                    restrictedWidthLayout.requestLayout();
                }
                C2043bi.m5555ai(restrictedWidthLayout, new C136609bp(restrictedWidthLayout, false, false, C136608bo.TOP));
                C134744f c2 = a.mo113307c();
                if (c2 != null) {
                    c2.mo111949c(new C136658m(restrictedWidthLayout, a, viewGroup2));
                    c2.mo111958l(new C136659n(r));
                    restrictedWidthLayout.addOnLayoutChangeListener(new C136660o(c2, a));
                }
            }
            C2043bi.m5555ai(viewGroup2, new C136609bp(viewGroup2, false, true, C136608bo.LEFT, C136608bo.RIGHT));
            viewGroup2.addOnLayoutChangeListener(a.f371978A);
            if (!a.f372000s) {
                a.f371995n.mo50707a(a.f371993l.mo112310a(), a.f372007z);
            }
            a.f371991j.mo115163a();
            if (a.f371997p) {
                a.f371995n.mo50707a(a.f371999r.mo113451h(), a.f372003v);
            }
            if (a.f372005x && (c = a.mo113307c()) != null) {
                c.mo111955i();
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z();
            b.close();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C136652i a = mo17754z();
            View view = a.f371988g.getView();
            if (view != null) {
                view.removeOnLayoutChangeListener(a.f371978A);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371974e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
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
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z();
            e.close();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C136652i a = mo17754z();
            C47393f.m84233d(this, C134712j.class, new C136661p(a));
            C47393f.m84233d(this, C139762c.class, new C136662q(a));
            C47393f.m84233d(this, C137117k.class, new C136663r(a));
            this.f54442o.mo24720k(bundle);
            mo17754z().f372004w.mo113247g(view);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136647d.m222177a(th, th);
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
            if (!this.f371974e) {
                super.onAttach(context);
                if (this.f371971a == null) {
                    this.f371971a = ((C136664s) mo113284d().mo17653jN()).mo113312cF();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371973d));
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C136647d.m222177a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

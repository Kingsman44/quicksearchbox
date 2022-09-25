package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.navigation.C3807af;
import androidx.navigation.C3827az;
import androidx.navigation.C3834bb;
import androidx.navigation.fragment.C3884h;
import androidx.navigation.p179b.C3830b;
import androidx.navigation.p179b.C3831c;
import androidx.navigation.p179b.C3832d;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.HashSet;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cp */
/* compiled from: PG */
public final class C132230cp extends C132320fn implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132233cs f360912a;

    /* renamed from: c */
    private Context f360913c;

    /* renamed from: d */
    private final C2393x f360914d = new C2393x(this);

    /* renamed from: e */
    private boolean f360915e;

    @Deprecated
    public C132230cp() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132233cs mo17754z() {
        C132233cs csVar = this.f360912a;
        if (csVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360915e) {
            return csVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110557b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360913c == null) {
            this.f360913c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360913c;
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
        return this.f360914d;
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
            C132229co.m214884a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C132233cs a = mo17754z();
            ((C132352p) new C2368bp((CustodioActivity) a.f360919a).mo5770a(C132352p.class)).f361289b = new C132232cr(a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132229co.m214884a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132233cs a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_custodio_root, viewGroup, false);
            Toolbar toolbar = (Toolbar) a.f360919a.findViewById(R.id.assistant_custodio_toolbar);
            C46485f fVar = a.f360922d;
            C3884h hVar = (C3884h) a.f360920b.getChildFragmentManager().f634a.mo670b(R.id.assistant_custodio_nav_host_container);
            if (hVar == null) {
                hVar = a.f360922d.mo50481b(R.navigation.assistant_custodio_nav_graph, a.f360921c);
                C0154a aVar = new C0154a(a.f360920b.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_custodio_nav_host_container, hVar, (String) null, 1);
                aVar.mo518o(hVar);
                aVar.mo509f();
            }
            C46496q e = fVar.mo50484e(hVar.mo8129a());
            C3807af a2 = e.mo50505a();
            C69664n.m101061g(toolbar, "toolbar");
            C69664n.m101061g(a2, "navController");
            C3834bb g = a2.mo8047g();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(C3827az.m11055a(g).f12360i));
            C3830b bVar = new C3830b(hashSet);
            C69664n.m101061g(toolbar, "toolbar");
            C69664n.m101061g(a2, "navController");
            a2.mo8051k(new C3832d(toolbar, bVar));
            toolbar.mo2419t(new C3831c(a2));
            toolbar.mo2419t(new C132231cq(a, e));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132229co.m214884a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360915e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132229co.m214884a(th, th);
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
            C132229co.m214884a(th, th);
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
            if (!this.f360915e) {
                super.onAttach(context);
                if (this.f360912a == null) {
                    Object jN = mo110627d().mo17653jN();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C132230cp) {
                        C132230cp cpVar = (C132230cp) fragment;
                        C68225k.m98532d(cpVar);
                        this.f360912a = new C132233cs(activity, cpVar, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (HelpAndFeedbackStarter) ((C74176nj) jN).f207099z.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360914d));
                    } else {
                        String obj = C132233cs.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C132229co.m214884a(th, th2);
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

package com.google.android.apps.search.weather.suggestions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.weather.suggestions.p10694a.C142130g;
import com.google.android.apps.search.weather.suggestions.p10696c.C142140f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
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
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58836b;
import com.google.frameworks.client.data.android.C61531o;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.weather.suggestions.f */
/* compiled from: PG */
public final class C142147f extends C142153k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142150i f385607a;

    /* renamed from: c */
    private Context f385608c;

    /* renamed from: d */
    private final C2393x f385609d = new C2393x(this);

    /* renamed from: e */
    private boolean f385610e;

    @Deprecated
    public C142147f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C142150i mo17754z() {
        C142150i iVar = this.f385607a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385610e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117028b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385608c == null) {
            this.f385608c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385608c;
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
        return this.f385609d;
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
            C142146e.m230751a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142150i a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.weather_suggestions_fragment, viewGroup, false);
            a.f385616d.mo33801b(inflate, a.f385615c.mo33805a(C28427h.m53115a(121832)));
            C142149h hVar = new C142149h(a);
            C46753j jVar = new C46753j();
            jVar.f122102a = new C142148g(hVar);
            C46755l a2 = jVar.mo50770a();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a.f385614b.getContext());
            C0569cl clVar = new C0569cl(a.f385614b.getContext(), linearLayoutManager.getOrientation());
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.weather_suggestions_list_view);
            recyclerView.mHasFixedSize = true;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.addItemDecoration$ar$ds(clVar);
            recyclerView.setAdapter(a2);
            a.mo117029a(C58836b.f156633a);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C142146e.m230751a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385610e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142146e.m230751a(th, th);
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
            C142146e.m230751a(th, th);
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
            if (!this.f385610e) {
                super.onAttach(context);
                if (this.f385607a == null) {
                    Object jN = mo117032d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C142147f) {
                        C142147f fVar = (C142147f) fragment;
                        C68225k.m98532d(fVar);
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        this.f385607a = new C142150i(context2, fVar, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C142130g(new C142140f((C61531o) aqe.f199175a.a.f202716cN.mo17428b(), (Executor) aqe.f199175a.n.mo17428b()), (C46407v) aqe.f199587ho.mo17428b(), aqe.mo66894eN(), (Executor) aqe.f199175a.n.mo17428b()), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385609d));
                    } else {
                        String obj = C142150i.class.toString();
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
                C142146e.m230751a(th, th2);
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

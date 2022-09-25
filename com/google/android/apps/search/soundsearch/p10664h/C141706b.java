package com.google.android.apps.search.soundsearch.p10664h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62971cq;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.soundsearch.h.b */
/* compiled from: PG */
public final class C141706b extends C141717m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141712h f384599a;

    /* renamed from: c */
    private Context f384600c;

    /* renamed from: d */
    private final C2393x f384601d = new C2393x(this);

    /* renamed from: e */
    private boolean f384602e;

    @Deprecated
    public C141706b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141712h mo17754z() {
        C141712h hVar = this.f384599a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f384602e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116664b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f384600c == null) {
            this.f384600c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f384600c;
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
        return this.f384601d;
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
            C141705a.m229931a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        Optional optional;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141712h a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.soundsearch_result_fragment, viewGroup, false);
            inflate.findViewById(R.id.soundsearch_new_search_button).setOnClickListener(new C141709e(a));
            inflate.findViewById(R.id.soundsearch_try_again_button).setOnClickListener(new C141710f(a));
            if ((a.f384621g.f384605a & 1) != 0) {
                a.f384616b.mo33801b(inflate.findViewById(R.id.soundsearch_results_container), a.f384615a.mo33805a(C28427h.m53115a(129780)));
                C54591n nVar = a.f384621g.f384606b;
                if (nVar == null) {
                    nVar = C54591n.f143323c;
                }
                C62971cq cqVar = nVar.f143325a;
                C141708d dVar = a.f384621g;
                if ((dVar.f384605a & 2) != 0) {
                    optional = Optional.m71637of(dVar.f384607c);
                } else {
                    optional = Optional.empty();
                }
                Optional optional2 = optional;
                C141716l lVar = a.f384619e;
                ArrayList b = C58597ky.m90211b(C58557jl.m90125f(cqVar, 3));
                C28310af afVar = (C28310af) lVar.f384639a.mo17428b();
                afVar.getClass();
                C28306ab abVar = (C28306ab) lVar.f384640b.mo17428b();
                abVar.getClass();
                C28443m mVar = (C28443m) lVar.f384641c.mo17428b();
                mVar.getClass();
                C47449e eVar = (C47449e) lVar.f384642d.mo17428b();
                eVar.getClass();
                Boolean bool = (Boolean) lVar.f384643e.mo17428b();
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                optional2.getClass();
                C141715k kVar = r7;
                C141715k kVar2 = new C141715k(afVar, abVar, mVar, eVar, booleanValue, b, optional2);
                View findViewById = inflate.findViewById(R.id.soundsearch_show_more);
                a.f384616b.mo33801b(findViewById, a.f384615a.mo33805a(C28427h.m53115a(129711)));
                if (cqVar.size() > 3) {
                    inflate.findViewById(R.id.soundsearch_show_more).setVisibility(0);
                    inflate.findViewById(R.id.soundsearch_show_more_divider).setVisibility(0);
                    findViewById.setOnClickListener(new C47591co(a.f384618d, "Clicked Show more", new C141711g(a, inflate, kVar, cqVar)));
                } else {
                    C141712h.m229939a(inflate);
                }
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.soundsearch_recycler_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(a.f384620f.getContext(), 1, false));
                recyclerView.setAdapter(kVar);
                recyclerView.getScrollingChildHelper().mo5279a(false);
            } else {
                inflate.findViewById(R.id.soundsearch_no_results_container).setVisibility(0);
                inflate.findViewById(R.id.soundsearch_results_container).setVisibility(8);
                inflate.findViewById(R.id.soundsearch_new_search_button).setVisibility(8);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C141705a.m229931a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f384602e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141705a.m229931a(th, th);
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
            C141705a.m229931a(th, th);
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
            if (!this.f384602e) {
                super.onAttach(context);
                if (this.f384599a == null) {
                    Object jN = mo116669d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141706b) {
                        C141706b bVar = (C141706b) fragment;
                        C68225k.m98532d(bVar);
                        asp asp = ((C74176nj) jN).f206677a.a;
                        C141716l lVar = new C141716l(asp.f202878fQ, asp.f202880fS, asp.f202879fR, ((C74176nj) jN).f207092s, ((C74176nj) jN).f206730b.f198027a.f199582hj);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C141708d dVar = (C141708d) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141708d.f384603d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(dVar);
                        this.f384599a = new C141712h(bVar, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), lVar, dVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f384601d));
                    } else {
                        String obj = C141712h.class.toString();
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
                C141705a.m229931a(th2, th3);
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

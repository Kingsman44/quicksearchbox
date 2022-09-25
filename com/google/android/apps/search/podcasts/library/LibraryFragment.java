package com.google.android.apps.search.podcasts.library;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.library.showsubscriptions.C140621b;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class LibraryFragment extends C140568c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140565b f381732a;

    /* renamed from: c */
    private Context f381733c;

    /* renamed from: d */
    private final C2393x f381734d = new C2393x(this);

    /* renamed from: e */
    private boolean f381735e;

    @Deprecated
    public LibraryFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140565b mo17754z() {
        C140565b bVar = this.f381732a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381735e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115740b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381733c == null) {
            this.f381733c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381733c;
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
        return this.f381734d;
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
            C140558a.m228276a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140565b a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_library_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(R.layou…* attachToRoot= */ false)");
            a.f381761c.mo116230a(a.f381759a, inflate);
            View findViewById = inflate.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(findViewById, "rootView.findViewById<Ap…d.podcasts_appbar_layout)");
            C141215f.m229224b((AppBarLayout) findViewById);
            View findViewById2 = inflate.findViewById(R.id.podcasts_show_subscriptions_button);
            C69664n.m101060f(findViewById2, "rootView.findViewById(R.…how_subscriptions_button)");
            findViewById2.setOnClickListener(a.f381760b.mo50480a(R.id.podcasts_action_to_show_subscriptions, C46490k.m82868a(C140621b.f381913c).mo50504d(), "Clicked Library to Show Subscriptions"));
            inflate.findViewById(R.id.podcasts_library_queue).setOnClickListener(a.f381760b.mo50480a(R.id.podcasts_action_to_queue, (Bundle) null, "Clicked Library to Queue"));
            inflate.findViewById(R.id.podcasts_library_download).setOnClickListener(a.f381760b.mo50480a(R.id.podcasts_action_to_download, (Bundle) null, "Clicked Library to Download"));
            inflate.findViewById(R.id.podcasts_show_history_button).setOnClickListener(a.f381760b.mo50480a(R.id.podcasts_action_to_history, (Bundle) null, "Clicked Library to History"));
            C28306ab abVar = a.f381762d;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(96719)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140558a.m228276a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381735e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140558a.m228276a(th, th);
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
            C140558a.m228276a(th, th);
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
            if (!this.f381735e) {
                super.onAttach(context);
                if (this.f381732a == null) {
                    Object jN = mo115746d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof LibraryFragment) {
                        LibraryFragment libraryFragment = (LibraryFragment) fragment;
                        C68225k.m98532d(libraryFragment);
                        this.f381732a = new C140565b(libraryFragment, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), ((C74176nj) jN).mo69664eA(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381734d));
                    } else {
                        String obj = C140565b.class.toString();
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
                C140558a.m228276a(th, th2);
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

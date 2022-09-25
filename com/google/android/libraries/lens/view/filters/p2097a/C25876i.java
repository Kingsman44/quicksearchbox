package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.search.location.C38693ak;
import com.google.android.material.button.MaterialButton;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4711m.C62632i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.a.i */
/* compiled from: PG */
public final class C25876i extends C25867aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25891x f70309a;

    /* renamed from: b */
    private Context f70310b;

    /* renamed from: c */
    private final C2393x f70311c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70312d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70313e;

    @Deprecated
    public C25876i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25891x mo17754z() {
        C25891x xVar = this.f70309a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70313e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31032b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70310b == null) {
            this.f70310b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70310b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70312d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70311c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70312d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70312d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70312d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70312d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f70312d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70312d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70312d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25891x a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.dining_filter_settings, viewGroup, false);
            if (a.f70357u != null) {
                MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.location_picker_button);
                materialButton.getClass();
                a.f70350n = materialButton;
                a.mo31058g(a.f70362z);
                a.f70352p = R.drawable.quantum_gm_ic_location_on_vd_theme_24;
                MaterialProgressBar materialProgressBar = (MaterialProgressBar) inflate.findViewById(R.id.location_picker_progress_bar);
                materialProgressBar.getClass();
                a.f70351o = materialProgressBar;
                a.f70350n.mo47553j(a.f70352p);
                a.f70353q = a.f70350n.getPaddingLeft();
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.location_picker_tooltip_container);
                relativeLayout.getClass();
                a.f70354r = relativeLayout;
                a.f70354r.setOnClickListener(new C47591co(a.f70331B, "Click location picker tooltip", new C25886s(a)));
                a.f70343g = C62632i.m94820e(a.f70361y.mo32701h());
                a.f70347k = true;
                a.mo31062k(8);
                if (!a.f70343g) {
                    a.f70350n.setOnClickListener(new C47591co(a.f70331B, "Click location picker", new C25885r(a)));
                    a.mo31053b();
                }
                a.f70330A.mo33801b(a.f70354r, a.f70355s.mo33805a(C28427h.m53115a(82134)));
                a.f70330A.mo33801b(a.f70350n, a.f70355s.mo33805a(C28427h.m53115a(72968)));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70312d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70312d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70312d.mo51376d();
        try {
            super.onDetach();
            this.f70313e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70312d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70312d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70312d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70312d.mo51377e();
        try {
            super.onResume();
            C25891x a = mo17754z();
            if (a.f70357u != null) {
                if (!a.f70343g && a.f70341e == null) {
                    a.mo31053b();
                    if (a.f70342f) {
                        a.mo31054c();
                    }
                }
            }
            e.close();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70312d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f70312d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70312d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25875h.m47730a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70312d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70312d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [java.lang.Object, com.google.android.libraries.search.location.aa] */
    public final void onAttach(Context context) {
        this.f70312d.mo51381i();
        try {
            if (!this.f70313e) {
                super.onAttach(context);
                if (this.f70309a == null) {
                    Object jN = mo31033d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25876i) {
                        C25876i iVar = (C25876i) fragment;
                        C68225k.m98532d(iVar);
                        this.f70309a = new C25891x(accountId, iVar, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C31863s) ((C74176nj) jN).f206836d.f205237aE.mo17428b(), new C38693ak(((C74176nj) jN).f206730b.mo66470is()), (C27749al) ((C74176nj) jN).f206836d.f205221P.mo17428b(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25874g) ((C74176nj) jN).f206836d.f205213H.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70312d, this.f70311c));
                    } else {
                        String obj = C25891x.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70312d;
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
                C25875h.m47730a(th2, th3);
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

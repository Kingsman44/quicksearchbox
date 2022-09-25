package com.google.android.libraries.lens.view.filters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25984h;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.main.C27383ds;
import com.google.android.libraries.lens.view.p2085ax.p2086a.C25598f;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.p */
/* compiled from: PG */
public final class C26019p extends C25930bi implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26022s f70704a;

    /* renamed from: b */
    private Context f70705b;

    /* renamed from: c */
    private final C2393x f70706c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70707d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70708e;

    @Deprecated
    public C26019p() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26022s mo17754z() {
        C26022s sVar = this.f70704a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70708e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31090b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70705b == null) {
            this.f70705b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70705b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70707d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70706c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70707d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70707d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70707d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70707d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f70707d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70707d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70707d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26022s a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.filter_selector_container, viewGroup, false);
            a.f70727p = (ViewStub) inflate.findViewById(R.id.filter_preview_stub);
            C25994i iVar = a.f70713b.f70642a;
            a.mo31227h(iVar.mo31209b(iVar.mo31208a(a.mo31223d())));
            a.f70721j.f72478e.mo5704e(a.f70712a.getViewLifecycleOwner(), new C26020q(a));
            a.f70715d.mo31109b(a.f70712a.getViewLifecycleOwner(), new C26021r(a));
            C0167am requireActivity = a.f70712a.requireActivity();
            View findViewById = requireActivity.findViewById(R.id.filter_selector_fragment_placeholder);
            if (findViewById != null) {
                C26023t tVar = new C26023t(requireActivity, a.f70720i, requireActivity.getResources().getDimensionPixelSize(R.dimen.lens_info_panel_corner_radius));
                C1773f fVar = (C1773f) findViewById.getLayoutParams();
                fVar.getClass();
                fVar.mo4974a(tVar);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70707d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70707d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70707d.mo51376d();
        try {
            super.onDetach();
            this.f70708e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70707d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70707d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70707d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70707d.mo51377e();
        try {
            super.onResume();
            C26022s a = mo17754z();
            a.mo31226g();
            a.f70721j.mo31853e();
            if (a.f70724m.mo56113h()) {
                if (((C25984h) a.f70724m.mo56107c()).mo31202b()) {
                    a.f70719h.mo5708l(false);
                    ((C25984h) a.f70724m.mo56107c()).mo31201a();
                } else {
                    a.f70719h.mo5708l(true);
                    a.mo31228i(a.f70712a.getChildFragmentManager());
                    C27383ds dsVar = a.f70730s;
                    if (dsVar != null) {
                        C27327bq bqVar = dsVar.f74876a.f74881C;
                        bqVar.getClass();
                        bqVar.mo32894z();
                    }
                }
            }
            e.close();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70707d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f70707d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70707d.mo51381i();
        try {
            super.onStop();
            mo17754z().mo31229j();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26018o.m48026a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70707d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70707d;
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
        C47515ab abVar = this.f70707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70707d;
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

    public final void onAttach(Context context) {
        this.f70707d.mo51381i();
        try {
            if (!this.f70708e) {
                super.onAttach(context);
                if (this.f70704a == null) {
                    Object jN = mo31091d().mo17653jN();
                    C26017n eN = ((C74176nj) jN).mo69677eN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26019p) {
                        C26019p pVar = (C26019p) fragment;
                        C68225k.m98532d(pVar);
                        this.f70704a = new C26022s(eN, pVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C27655b) ((C74176nj) jN).f206836d.f205260ab.mo17428b(), (C25941f) ((C74176nj) jN).f206836d.f205284az.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C26586ff) ((C74176nj) jN).f206836d.f205233aA.mo17428b(), new C25976a(((C74176nj) jN).f206836d.mo69010ar()), (C25598f) ((C74176nj) jN).f206836d.f205234aB.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45374153").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70707d, this.f70706c));
                    } else {
                        String obj = C26022s.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                C26022s sVar = this.f70704a;
                sVar.f70714c.mo33143a(sVar);
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70707d;
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
                C26018o.m48026a(th2, th3);
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

package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.C135487ak;
import com.google.android.apps.search.googleapp.googleappbrowser.C135489am;
import com.google.android.apps.search.googleapp.googleappbrowser.C135490an;
import com.google.android.apps.search.googleapp.googleappbrowser.C135491ao;
import com.google.android.apps.search.googleapp.googleappbrowser.C135492ap;
import com.google.android.apps.search.googleapp.googleappbrowser.C135493aq;
import com.google.android.apps.search.googleapp.googleappbrowser.C135494ar;
import com.google.android.apps.search.googleapp.googleappbrowser.C135495as;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.material.bottomsheet.C44565p;
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
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.b */
/* compiled from: PG */
public final class C135648b extends C135677s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C135662d f369487b;

    /* renamed from: c */
    private Context f369488c;

    /* renamed from: d */
    private final C2393x f369489d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f369490e = new C47515ab(this);

    /* renamed from: f */
    private boolean f369491f;

    /* renamed from: g */
    private boolean f369492g;

    @Deprecated
    public C135648b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135662d mo17754z() {
        C135662d dVar = this.f369487b;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369492g) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112437b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369488c == null) {
            this.f369488c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369488c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f369490e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f369489d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f369490e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f369490e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f369490e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f369490e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f369490e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C135662d a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_bottom_sheet_menu_dialog, viewGroup, false);
            C0154a aVar = new C0154a(a.f369527a.getChildFragmentManager());
            C58801sm G = ((C58485gu) a.f369528b).listIterator(0);
            while (G.hasNext()) {
                aVar.mo511h(R.id.googleapp_browser_menu_item_container, ((C136012b) G.next()).mo112367a(), (String) null, 1);
            }
            aVar.mo509f();
            Dialog dialog = a.f369527a.getDialog();
            dialog.getClass();
            dialog.setOnShowListener(new C28458c(a.f369527a, new C135661c(a)));
            this.f369491f = false;
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f369490e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f369490e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f369490e.mo51376d();
        try {
            super.onDetach();
            this.f369492g = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f369490e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f369490e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f369490e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f369490e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f369490e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f369491f) {
                    C47389c.m84226a(getContext()).f123128b = C47393f.m84230a(this);
                    C135664f.m220015a(this, mo17754z());
                    this.f369491f = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f369490e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f369490e.mo51381i();
        try {
            if (!getShowsDialog() && !this.f369491f) {
                C47389c.m84226a(getContext()).f123128b = view;
                C135664f.m220015a(this, mo17754z());
                this.f369491f = true;
            }
            this.f54441a.mo24720k(bundle);
            C44565p pVar = (C44565p) mo17754z().f369527a.getDialog();
            if (pVar != null) {
                pVar.mo47541h().mo47518u(true);
                pVar.mo47541h().mo47519v(3);
                pVar.mo47541h().f115860C = true;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135636a.m219955a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f369490e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f369490e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f369490e;
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
        C47515ab abVar = this.f369490e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f369490e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f369490e;
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
        this.f369490e.mo51381i();
        try {
            if (!this.f369492g) {
                super.onAttach(context);
                if (this.f369487b == null) {
                    Object jN = mo112461d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    boolean ki = ((C74176nj) jN).f206730b.f198027a.mo67121ki();
                    long g = ((C74176nj) jN).f206730b.f198027a.mo66986g();
                    boolean z = ((C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b()).f101930a;
                    C58480gp e = C58485gu.m89837e();
                    e.mo55395g(new C135487ak(accountId));
                    if (!z) {
                        e.mo55395g(new C135489am(accountId));
                    }
                    e.mo55395g(new C135490an(accountId));
                    e.mo55395g(new C135491ao(accountId));
                    if (!z && g == 0) {
                        e.mo55395g(new C135492ap(accountId));
                    }
                    if (!z) {
                        e.mo55395g(new C135493aq(accountId));
                    }
                    if (ki) {
                        e.mo55395g(new C135494ar(accountId));
                    }
                    e.mo55395g(new C135495as(accountId));
                    C58485gu f = e.mo55394f();
                    C68225k.m98532d(f);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135648b) {
                        C135648b bVar = (C135648b) fragment;
                        C68225k.m98532d(bVar);
                        this.f369487b = new C135662d(f, bVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f369490e, this.f369489d));
                    } else {
                        String obj = C135662d.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f369490e;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C135636a.m219955a(th, th2);
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

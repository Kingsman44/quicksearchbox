package com.google.android.libraries.lens.view.p2113h.p2132j;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3506c.C44581b;
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

/* renamed from: com.google.android.libraries.lens.view.h.j.c */
/* compiled from: PG */
public final class C26888c extends C26893h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26891f f73298a;

    /* renamed from: b */
    private Context f73299b;

    /* renamed from: c */
    private final C2393x f73300c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73301d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73302e;

    @Deprecated
    public C26888c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26891f mo17754z() {
        C26891f fVar = this.f73298a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73302e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32260b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73299b == null) {
            this.f73299b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73299b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73301d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73300c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73301d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73301d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73301d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73301d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f73301d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f73301d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73301d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C26891f a = mo17754z();
        C44581b bVar = new C44581b(a.f73307c.requireContext(), 2132149371);
        bVar.mo47606y(R.layout.camera_unavailable_dialog);
        bVar.mo47601t(R.string.lens_camera_unavailable_open_gallery, new C26889d(a));
        C0392m create = bVar.create();
        DialogVisualElements.m53173a(a.f73307c, create, new C26890e(a));
        return create;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73301d.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73301d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73301d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73301d.mo51376d();
        try {
            super.onDetach();
            this.f73302e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f73301d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73301d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73301d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73301d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73301d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73301d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f73301d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73301d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26887b.m49778a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73301d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73301d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73301d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73301d;
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
        C47515ab abVar = this.f73301d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73301d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73301d;
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
        this.f73301d.mo51381i();
        try {
            if (!this.f73302e) {
                super.onAttach(context);
                if (this.f73298a == null) {
                    Object jN = mo32262d().mo17653jN();
                    C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26888c) {
                        C26888c cVar = (C26888c) fragment;
                        C68225k.m98532d(cVar);
                        this.f73298a = new C26891f(abVar, mVar, cVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73301d, this.f73300c));
                    } else {
                        String obj = C26891f.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f73301d;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C26887b.m49778a(th, th2);
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

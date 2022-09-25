package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.filters.a.aa */
/* compiled from: PG */
public final class C25851aa extends C25868ar implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25864an f70233a;

    /* renamed from: b */
    private Context f70234b;

    /* renamed from: c */
    private final C2393x f70235c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70236d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70237e;

    @Deprecated
    public C25851aa() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25864an mo17754z() {
        C25864an anVar = this.f70233a;
        if (anVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70237e) {
            return anVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31017b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70234b == null) {
            this.f70234b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70234b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70236d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70235c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70236d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70236d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70236d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70236d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f70236d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f70236d.mo51381i();
        try {
            super.onCreate(bundle);
            mo17754z().f70266j.setStyle(0, 2132150752);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70236d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70236d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25864an a = mo17754z();
            a.f70259c = layoutInflater;
            View inflate = layoutInflater.inflate(R.layout.nearby_restaurants_fragment_main, viewGroup, false);
            a.f70258b = (RecyclerView) inflate.findViewById(R.id.restaurant_search_list_view);
            a.f70257a = inflate.findViewById(R.id.rationale_view);
            Button button = (Button) a.f70257a.findViewById(R.id.request_permissions_button);
            button.getClass();
            a.f70260d = button;
            a.f70260d.setOnClickListener(new C47591co(a.f70273q, "Click request permissions", new C25855ae(a)));
            a.f70261e = (Button) a.f70257a.findViewById(R.id.postpone_permissions_button);
            a.f70261e.setOnClickListener(new C47591co(a.f70273q, "Click postpone permissions", new C25856af(a)));
            a.f70258b.setLayoutManager(new LinearLayoutManager(a.f70264h));
            a.f70266j.getDialog().setOnShowListener(new C28458c(a.f70266j, new C25857ag(a)));
            a.f70272p.mo33801b(a.f70257a, a.f70269m.mo33805a(C28427h.m53115a(82676)));
            a.f70272p.mo33801b(a.f70260d, a.f70269m.mo33805a(C28427h.m53115a(82677)));
            a.f70272p.mo33801b(a.f70261e, a.f70269m.mo33805a(C28427h.m53115a(82678)));
            a.f70263g = (EditText) inflate.findViewById(R.id.restaurant_search_bar);
            ((ImageView) inflate.findViewById(R.id.back_icon)).setOnClickListener(new C47591co(a.f70273q, "Click back", new C25858ah(a)));
            if (a.f70265i) {
                a.mo31031d();
            } else {
                a.mo31029b();
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70236d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70236d.mo51375c();
        try {
            super.onDestroyView();
            C25864an a = mo17754z();
            a.f70263g.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) a.f70264h.getSystemService("input_method");
            View view = a.f70266j.getView();
            view.getClass();
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            c.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70236d.mo51376d();
        try {
            super.onDetach();
            this.f70237e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f70236d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70236d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70236d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70236d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70236d.mo51377e();
        try {
            super.onResume();
            C25864an a = mo17754z();
            Stream stream = DesugarArrays.stream((T[]) a.f70268l.mo30538h());
            C25504aj ajVar = a.f70268l;
            Objects.requireNonNull(ajVar);
            if (!stream.anyMatch(new C25854ad(ajVar))) {
                if (!a.f70262f) {
                    if (a.f70265i) {
                        a.mo31031d();
                    }
                    e.close();
                    return;
                }
            }
            a.mo31029b();
            e.close();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70236d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f70236d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70236d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25893z.m47767a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70236d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70236d;
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
        C47515ab abVar = this.f70236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70236d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70236d;
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
        this.f70236d.mo51381i();
        try {
            if (!this.f70237e) {
                super.onAttach(context);
                if (this.f70233a == null) {
                    Object jN = mo31035d().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25851aa) {
                        C25851aa aaVar = (C25851aa) fragment;
                        C68225k.m98532d(aaVar);
                        this.f70233a = new C25864an(b, context2, aaVar, (C31863s) ((C74176nj) jN).f206836d.f205237aE.mo17428b(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70236d, this.f70235c));
                    } else {
                        String obj = C25864an.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70236d;
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
                C25893z.m47767a(th, th2);
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

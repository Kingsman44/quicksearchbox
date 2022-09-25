package com.google.android.libraries.lens.view.p2133i;

import android.app.Activity;
import android.app.Dialog;
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
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26912h;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26913i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3687b.p3688a.p3689a.C47593a;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3687b.p3688a.p3689a.C47594b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4707j.C62586t;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.i.d */
/* compiled from: PG */
public final class C26917d extends C26936u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26932q f73355a;

    /* renamed from: b */
    private Context f73356b;

    /* renamed from: c */
    private final C2393x f73357c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73358d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73359e;

    @Deprecated
    public C26917d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26932q mo17754z() {
        C26932q qVar = this.f73355a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73359e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32302b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73356b == null) {
            this.f73356b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73356b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73358d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73357c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73358d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73358d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73358d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73358d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f73358d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f73358d.mo51381i();
        try {
            super.onCreate(bundle);
            C26932q a = mo17754z();
            a.f73389d.setStyle(0, 2132150751);
            if (bundle != null) {
                a.f73389d.dismiss();
            } else {
                C26913i iVar = a.f73391f;
                C62586t tVar = a.f73386a.f73334a;
                if (tVar == null) {
                    tVar = C62586t.f168973d;
                }
                iVar.mo32298n(tVar);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73358d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        this.f73358d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26932q a = mo17754z();
            LayoutInflater layoutInflater2 = layoutInflater;
            View inflate = layoutInflater.inflate(R.layout.device_picker, viewGroup, false);
            a.f73399n = new C26931p(inflate);
            Dialog dialog = a.f73389d.getDialog();
            if (dialog != null) {
                dialog.setOnShowListener(new C28458c(a.f73389d, new C26920e(a)));
            }
            inflate.setOnClickListener(new C47591co(a.f73396k, "Click device picker", new C26921f(a)));
            inflate.setOnTouchListener(C26922g.f73362a);
            a.f73398m = new C26929n(a, inflate);
            ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = a.f73398m;
            onGlobalLayoutListener.getClass();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            String string = inflate.getContext().getResources().getString(R.string.lens_cloud_copy_device_picker_helper_item_explainer, new Object[]{a.f73387b});
            C26931p pVar = a.f73399n;
            pVar.f73377f.setText(string);
            pVar.f73381j.setText(string);
            a.f73399n.f73380i.setOnClickListener(new C47591co(a.f73396k, "Click zero state retry", new C26923h(a)));
            a.f73399n.f73378g.setOnClickListener(new C47591co(a.f73396k, "Click refresh device list", new C26924i(a)));
            C26935t tVar = new C26935t(layoutInflater, a.f73390e, a.f73393h, a.f73391f, new C26925j(a), a.f73395j, a.f73396k);
            tVar.setHasStableIds(true);
            a.f73397l = tVar;
            RecyclerView recyclerView = a.f73399n.f73376e;
            recyclerView.setAdapter(tVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(a.f73389d.getContext()));
            BottomSheetBehavior C = BottomSheetBehavior.m78767C(a.f73399n.f73373b);
            C.mo47516N(0);
            C.mo47518u(true);
            C.f115860C = true;
            C.mo47519v(5);
            C.mo47506D(new C47593a(a.f73388c, new C26930o(a)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C26904c.m49816a(th, th2);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73358d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73358d.mo51375c();
        try {
            super.onDestroyView();
            C26932q a = mo17754z();
            if (a.f73398m != null) {
                ViewTreeObserver viewTreeObserver = a.f73399n.f73372a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = a.f73398m;
                    onGlobalLayoutListener.getClass();
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                a.f73398m = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73358d.mo51376d();
        try {
            super.onDetach();
            C26932q a = mo17754z();
            a.f73391f.mo32297m((C26912h) null);
            a.f73391f.mo32296l();
            this.f73359e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f73358d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73358d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73358d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73358d.mo51381i();
        try {
            super.onPause();
            mo17754z().f73400o.cancel(false);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73358d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73358d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f73358d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73358d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26904c.m49816a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73358d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73358d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73358d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73358d;
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
        C47515ab abVar = this.f73358d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73358d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73358d;
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
        this.f73358d.mo51381i();
        try {
            if (!this.f73359e) {
                super.onAttach(context);
                if (this.f73355a == null) {
                    Object jN = mo32321d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C26902b bVar = (C26902b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C26902b.f73332c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    C58833ax axVar = (C58833ax) ((C74176nj) jN).f206836d.f205439u.mo17428b();
                    C47594b bVar2 = new C47594b((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26917d) {
                        C26917d dVar = (C26917d) fragment;
                        C68225k.m98532d(dVar);
                        C68225k.m98532d(C60948g.f165068a);
                        this.f73355a = new C26932q(bVar, axVar, bVar2, dVar, (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C26913i) ((C74176nj) jN).f206836d.f205281aw.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73358d, this.f73357c));
                    } else {
                        String obj = C26932q.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                C26932q qVar = this.f73355a;
                if (qVar.f73401p == null) {
                    qVar.f73401p = new C26928m(qVar);
                }
                qVar.f73391f.mo32297m(qVar.f73401p);
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f73358d;
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
                C26904c.m49816a(th2, th3);
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

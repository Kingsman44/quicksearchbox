package com.google.android.apps.search.googleapp.discover.p10189g;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.b */
/* compiled from: PG */
public final class C134331b extends C134346q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C134337h f365894b;

    /* renamed from: c */
    private Context f365895c;

    /* renamed from: d */
    private final C2393x f365896d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f365897e = new C47515ab(this);

    /* renamed from: f */
    private boolean f365898f;

    @Deprecated
    public C134331b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134337h mo17754z() {
        C134337h hVar = this.f365894b;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365898f) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111738b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365895c == null) {
            this.f365895c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365895c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f365897e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f365896d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f365897e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f365897e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f365897e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f365897e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f365897e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C134337h a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            a.f365919d = (C134334e) new C2368bp(a.f365916a).mo5770a(C134334e.class);
            View inflate = layoutInflater.inflate(R.layout.googleapp_discover_bottomsheet_fragment_layout, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …tainer,\n      false\n    )");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f365897e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f365897e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f365897e.mo51376d();
        try {
            super.onDetach();
            this.f365898f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f365897e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            C134337h a = mo17754z();
            C69664n.m101061g(dialogInterface, "dialog");
            View view = a.f365916a.getView();
            C69664n.m101059e(view, "null cannot be cast to non-null type com.facebook.litho.LithoView");
            LithoView lithoView = (LithoView) view;
            lithoView.mo12753y();
            lithoView.mo12731D();
            lithoView.mo12729B((ComponentTree) null);
            f.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f365897e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f365897e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f365897e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f365897e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f365897e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f365897e.mo51381i();
        try {
            this.f54441a.mo24720k(bundle);
            C134337h a = mo17754z();
            C69664n.m101061g(view, "view");
            C134334e eVar = a.f365919d;
            C134766q qVar = null;
            C40027ah ahVar = eVar != null ? eVar.f365905a : null;
            C40305b bVar = eVar != null ? eVar.f365906b : null;
            String str = eVar != null ? eVar.f365907c : null;
            if (eVar != null) {
                qVar = eVar.f365908d;
            }
            if (!(ahVar == null || bVar == null || str == null || qVar == null)) {
                a.mo111740a(ahVar, bVar, str, qVar);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134330a.m217947a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f365897e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f365897e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f365897e;
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
        C47515ab abVar = this.f365897e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f365897e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f365897e;
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
        this.f365897e.mo51381i();
        try {
            if (!this.f365898f) {
                super.onAttach(context);
                if (this.f365894b == null) {
                    this.f365894b = ((C134338i) mo111750d().mo17653jN()).mo111741bJ();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f365897e, this.f365896d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f365897e;
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
                C134330a.m217947a(th, th2);
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

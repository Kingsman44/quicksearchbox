package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.AppCompatImageButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback.FeedbackOverflowMenuItem;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10273a.C135614a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10276d.C135631a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10281g.C135694a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.contrib.p3375f.p3376a.C43535c;
import com.google.android.libraries.web.contrib.p3375f.p3376a.C43536d;
import com.google.android.libraries.web.contrib.p3375f.p3376a.C43537e;
import com.google.android.libraries.web.contrib.p3375f.p3377b.p3378a.C43538a;
import com.google.android.libraries.web.contrib.p3375f.p3377b.p3379b.C43539a;
import com.google.android.libraries.web.contrib.p3375f.p3377b.p3380c.C43540a;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.shared.p3445e.C44096a;
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
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.i */
/* compiled from: PG */
public final class C135667i extends C135678t implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135668j f369534a;

    /* renamed from: c */
    private Context f369535c;

    /* renamed from: d */
    private final C2393x f369536d = new C2393x(this);

    /* renamed from: e */
    private boolean f369537e;

    @Deprecated
    public C135667i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135668j mo17754z() {
        C135668j jVar = this.f369534a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369537e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112455b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369535c == null) {
            this.f369535c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369535c;
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
        return this.f369536d;
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
            C135666h.m220016a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C43536d dVar = mo17754z().f369538a;
            AppCompatImageButton a = dVar.f113686a.mo46501a(new C43535c(dVar, viewGroup), viewGroup);
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C135666h.m220016a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f369537e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135666h.m220016a(th, th);
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
            C135666h.m220016a(th, th);
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
            if (!this.f369537e) {
                super.onAttach(context);
                if (this.f369534a == null) {
                    Object jN = mo112463d().mo17653jN();
                    C43537e eVar = new C43537e(((C74176nj) jN).f206677a.a.f202879fR, ((C74176nj) jN).f206725av, ((C74176nj) jN).f206730b.f198663m);
                    C43538a fH = ((C74176nj) jN).mo69724fH();
                    C43539a fI = ((C74176nj) jN).mo69725fI();
                    C135631a ck = ((C74176nj) jN).mo69594ck();
                    C69464a aVar = ((C74176nj) jN).f206726aw;
                    C135694a cm = ((C74176nj) jN).mo69596cm();
                    C136370a aVar2 = (C136370a) ((C74176nj) jN).f206724au.mo17428b();
                    C135614a ci = ((C74176nj) jN).mo69592ci();
                    FeedbackOverflowMenuItem cj = ((C74176nj) jN).mo69593cj();
                    new C43540a((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, ((C74176nj) jN).mo69736fT(), (C44096a) ((C74176nj) jN).f206727ax.mo17428b());
                    boolean ki = ((C74176nj) jN).f206730b.f198027a.mo67121ki();
                    boolean z = ((C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b()).f101930a;
                    C58480gp e = C58485gu.m89837e();
                    e.mo55395g(fI);
                    if (!z) {
                        e.mo55395g(fH);
                    }
                    if (!aVar2.mo112949a()) {
                        e.mo55395g(ck);
                    }
                    e.mo55395g((C43541a) aVar.mo17428b());
                    if (!z) {
                        e.mo55395g(cm);
                    }
                    if (ki) {
                        e.mo55395g(ci);
                    }
                    e.mo55395g(cj);
                    C58485gu f = e.mo55394f();
                    C68225k.m98532d(f);
                    this.f369534a = new C135668j(eVar, f);
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f369536d));
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
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C135666h.m220016a(th, th2);
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

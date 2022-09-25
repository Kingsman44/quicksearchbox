package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.k */
/* compiled from: PG */
public final class C103173k extends C103123am implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C103188z f287902a;

    /* renamed from: c */
    private Context f287903c;

    /* renamed from: d */
    private final C2393x f287904d = new C2393x(this);

    /* renamed from: e */
    private boolean f287905e;

    @Deprecated
    public C103173k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C103188z mo17754z() {
        C103188z zVar = this.f287902a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287905e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo93631b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f287903c == null) {
            this.f287903c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f287903c;
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
        return this.f287904d;
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
            C103172j.m171068a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C103188z a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.nga_pie_assist_shelf_fragment, viewGroup, false);
            viewGroup2.setTranslationY(2000.0f);
            View findViewById = viewGroup2.findViewById(R.id.nga_pie_assist_shelf_shadow);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(new RectShape());
            shapeDrawable.setShaderFactory(new C103187y(new int[]{Color.parseColor("#00000000"), Color.parseColor("#1A000000"), Color.parseColor("#00000000")}, new float[]{0.0f, 0.73f, 1.0f}));
            findViewById.setBackground(shapeDrawable);
            viewGroup2.findViewById(R.id.nga_pie_assist_shelf_back).setOnClickListener(new C103186x(a));
            a.f287931e.mo93660e();
            C103143bf.m171039f(viewGroup2);
            C80246cm a2 = C80246cm.m128102a(a.f287927a.f220140b);
            if (a2 == null) {
                a2 = C80246cm.NO_UI;
            }
            if (a2 == C80246cm.MULTISTEP_EDUCATION) {
                C80269x xVar = a.f287927a.f220144f;
                if (xVar == null) {
                    xVar = C80269x.f220270b;
                }
                C103137b a3 = C103137b.m171023a(xVar);
                C0154a aVar = new C0154a(a.f287928b.getParentFragmentManager());
                aVar.mo689v(R.id.nga_pie_assist_shelf_content, a3, (String) null);
                aVar.mo690w(new C103175m(a, a3));
                aVar.mo505b(false);
            } else {
                C80244ck ckVar = a.f287927a;
                C103112ab abVar = new C103112ab();
                C68324h.m98669f(abVar);
                C47243l.m84039a(abVar, ckVar);
                C0154a aVar2 = new C0154a(a.f287928b.getParentFragmentManager());
                aVar2.f814j = 0;
                aVar2.mo689v(R.id.nga_pie_assist_shelf_content, abVar, (String) null);
                aVar2.mo690w(new C103176n(a, abVar));
                aVar2.mo505b(false);
            }
            viewGroup2.animate().translationY(0.0f).setDuration(500).start();
            a.f287932f = viewGroup2;
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C103172j.m171068a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f287905e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C103172j.m171068a(th, th);
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
            C103172j.m171068a(th, th);
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
            if (!this.f287905e) {
                super.onAttach(context);
                if (this.f287902a == null) {
                    Object jN = mo93632d().mo17653jN();
                    C80244ck s = ((C74178nm) jN).mo70077s();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C103173k) {
                        C103173k kVar = (C103173k) fragment;
                        C68225k.m98532d(kVar);
                        this.f287902a = new C103188z(s, kVar, (C103032a) ((C74178nm) jN).f207130a.b.f200011bY.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f287904d));
                    } else {
                        String obj = C103188z.class.toString();
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
                C103172j.m171068a(th, th2);
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

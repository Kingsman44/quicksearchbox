package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cw */
/* compiled from: PG */
public final class C10304cw extends C10289ch implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10312da f34906a;

    /* renamed from: c */
    private Context f34907c;

    /* renamed from: d */
    private final C2393x f34908d = new C2393x(this);

    /* renamed from: e */
    private boolean f34909e;

    @Deprecated
    public C10304cw() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C10304cw m25221f(C10256ad adVar) {
        C10304cw cwVar = new C10304cw();
        C68324h.m98669f(cwVar);
        C47243l.m84039a(cwVar, adVar);
        return cwVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18389b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34907c == null) {
            this.f34907c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34907c;
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
        return this.f34908d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C10312da mo17754z() {
        C10312da daVar = this.f34906a;
        if (daVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34909e) {
            return daVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10303cv.m25220a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C10312da j = mo17754z();
            if (j.f34951s != 1) {
                j.f34948p = Optional.m71637of(new C10419q(j.f34933a.getContext(), j.f34951s, j.f34936d, j.f34939g, j.f34934b, j.f34935c, j.f34940h, j.f34941i, j.f34942j));
            }
            if (j.f34952t != 1) {
                j.f34949q = Optional.m71637of(new C10415m(j.f34933a.getContext(), j.f34952t, j.f34934b, j.f34935c, j.f34940h, j.f34942j));
            }
            if (j.f34951s == 4 && j.f34942j.mo79746e(C90019by.f248084r)) {
                j.f34950r = Optional.m71637of(new C10236bl(j.f34933a.getContext(), j.f34935c, j.f34940h));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10303cv.m25220a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10312da j = mo17754z();
            j.f34943k = Optional.m71637of(layoutInflater.inflate(R.layout.tab_fragment, viewGroup, false));
            j.f34935c.f76997b.mo33800a(C28427h.m53115a(105139)).mo33809b((View) j.f34943k.get());
            if (j.f34948p.isPresent()) {
                View view = (View) j.f34943k.get();
                if (j.f34937e) {
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.shortcut_section_header_stub_view);
                    int i = j.f34951s - 1;
                    if (i == 1) {
                        viewStub.setLayoutResource(R.layout.explore_tab_shortcut_section_header);
                    } else if (i == 2) {
                        viewStub.setLayoutResource(R.layout.your_shortcut_tab_shortcut_section_header);
                    } else if (i == 3) {
                        viewStub.setLayoutResource(R.layout.all_tab_shortcut_section_header);
                    }
                    viewStub.inflate();
                }
                ((RecyclerView) view.findViewById(R.id.shortcut_list)).setAdapter((C0640fb) j.f34948p.get());
            }
            if (j.f34949q.isPresent()) {
                View view2 = (View) j.f34943k.get();
                if (j.f34938f) {
                    ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.app_section_header_stub_view);
                    int i2 = j.f34952t - 1;
                    if (i2 == 1) {
                        viewStub2.setLayoutResource(R.layout.your_shortcut_tab_app_section_header);
                    } else if (i2 == 2) {
                        viewStub2.setLayoutResource(R.layout.explore_tab_app_section_header);
                    }
                    viewStub2.inflate();
                }
                ((RecyclerView) view2.findViewById(R.id.app_list)).setAdapter((C0640fb) j.f34949q.get());
            }
            if (j.f34950r.isPresent()) {
                ((RecyclerView) ((View) j.f34943k.get()).findViewById(R.id.education_list)).setAdapter((C0640fb) j.f34950r.get());
            }
            if (j.f34944l.isPresent()) {
                j.mo18409a((List) j.f34944l.get(), (List) j.f34945m.get(), j.f34946n, j.f34947o);
            }
            View view3 = (View) j.f34943k.get();
            C47831fm.m85019n();
            return view3;
        } catch (Throwable th) {
            C10303cv.m25220a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C10312da j = mo17754z();
            j.f34943k = Optional.empty();
            j.f34944l = Optional.empty();
            j.f34946n = C58729pv.f156485a;
            j.f34947o = Optional.empty();
            c.close();
            return;
        } catch (Throwable th) {
            C10303cv.m25220a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34909e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10303cv.m25220a(th, th);
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
            C10303cv.m25220a(th, th);
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
            if (!this.f34909e) {
                super.onAttach(context);
                if (this.f34906a == null) {
                    Object jN = mo18388a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10304cw) {
                        C10304cw cwVar = (C10304cw) fragment;
                        C68225k.m98532d(cwVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10256ad adVar = (C10256ad) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10256ad.f34765j, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(adVar);
                        this.f34906a = new C10312da(cwVar, (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), adVar, ((C74178nm) jN).mo70064f(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C47400m) ((C74178nm) jN).f207130a.d.f201806g.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34908d));
                    } else {
                        String obj = C10312da.class.toString();
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
                C10303cv.m25220a(th, th2);
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

package com.google.android.apps.gsa.assistant.settings.features.p571aq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.az.bd;
import com.google.android.apps.gsa.assistant.settings.features.az.bf;
import com.google.android.apps.gsa.assistant.settings.features.az.bs;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18516d;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.tabs.TabLayout;
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
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aq.c */
/* compiled from: PG */
public final class C10432c extends C10429a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10435f f35157a;

    /* renamed from: c */
    private Context f35158c;

    /* renamed from: d */
    private final C2393x f35159d = new C2393x(this);

    /* renamed from: e */
    private boolean f35160e;

    @Deprecated
    public C10432c() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18479b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f35158c == null) {
            this.f35158c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f35158c;
    }

    /* renamed from: f */
    public final C10435f mo17754z() {
        C10435f fVar = this.f35157a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f35160e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f35159d;
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
            C10431b.m25399a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C73778a.m108339b(mo17754z().f35165a);
            View inflate = layoutInflater.inflate(R.layout.fragment_merged_quick_phrases_settings, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C10431b.m25399a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f35160e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10431b.m25399a(th, th);
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
            C10431b.m25399a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C10435f f = mo17754z();
            f.f35165a.requireView().findViewById(R.id.content_container).setVisibility(8);
            f.f35165a.requireView().findViewById(R.id.loading_view).setVisibility(0);
            if (f.f35167c.mo79746e(C90082eg.f249994cD)) {
                bf bfVar = f.f35166b;
                acu acu = (acu) acv.f128920X.createBuilder();
                acu.copyOnWrite();
                acv acv = (acv) acu.instance;
                acv.f128946b |= 1073741824;
                acv.f128935N = true;
                acu.copyOnWrite();
                acv acv2 = (acv) acu.instance;
                acv2.f128945a |= 268435456;
                acv2.f128968x = true;
                acu.copyOnWrite();
                acv acv3 = (acv) acu.instance;
                acv3.f128945a |= 512;
                acv3.f128954j = true;
                C60870cx j = bfVar.a.j(bfVar.b.a(), (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, bfVar.getClass().getSimpleName());
                C60856cj.m92911t(j, new bd(bfVar), C60826bg.f164896a);
                j.mo4106b(new C10433d(f), C60826bg.f164896a);
            } else {
                f.mo18483b();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C10431b.m25399a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            mo17754z();
            ((TabLayout) view.findViewById(R.id.tab_layout)).mo48408d(new C10434e((ViewSwitcher) view.findViewById(R.id.view_switcher)));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10431b.m25399a(th, th);
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
            if (!this.f35160e) {
                super.onAttach(context);
                if (this.f35157a == null) {
                    Object jN = mo18478a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10432c) {
                        C10432c cVar = (C10432c) fragment;
                        C68225k.m98532d(cVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C18516d dVar = (C18516d) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C18516d.f52474d, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(dVar);
                        this.f35157a = new C10435f(cVar, (bf) ((C74178nm) jN).f207136c.f205649cs.mo17428b(), (bs) ((C74178nm) jN).f207136c.f205650ct.mo17428b(), ((C74178nm) jN).f207130a.a.mo68166cX(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), dVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f35159d));
                    } else {
                        String obj = C10435f.class.toString();
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
                C10431b.m25399a(th, th2);
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

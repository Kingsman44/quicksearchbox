package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.el;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72883t;
import com.google.android.apps.gsa.assistant.settings.shared.ao;
import com.google.android.apps.gsa.assistant.settings.shared.ui.PageDescriptionView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bh */
/* compiled from: PG */
public final class C10131bh extends C10147f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10134bk f34463a;

    /* renamed from: c */
    private Context f34464c;

    /* renamed from: d */
    private final C2393x f34465d = new C2393x(this);

    /* renamed from: e */
    private boolean f34466e;

    @Deprecated
    public C10131bh() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C10131bh m24975f(String str) {
        C10131bh bhVar = new C10131bh();
        C68324h.m98669f(bhVar);
        C47243l.m84040b(bhVar, str);
        return bhVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18268b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34464c == null) {
            this.f34464c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34464c;
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
        return this.f34465d;
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
    public final C10134bk mo17754z() {
        C10134bk bkVar = this.f34463a;
        if (bkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34466e) {
            return bkVar;
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
            C10130bg.m24974a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10134bk j = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_structure_level_structure_pr_settings, viewGroup, false);
            FragmentManager childFragmentManager = j.f34469a.getChildFragmentManager();
            if (childFragmentManager.f634a.mo671c("structure_setup_action_card") == null) {
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo511h(R.id.structure_setup_action_card_container, el.f(j.f34470b), "structure_setup_action_card", 1);
                aVar.mo509f();
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C10130bg.m24974a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34466e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10130bg.m24974a(th, th);
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
            C10130bg.m24974a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().mo18271a();
            e.close();
            return;
        } catch (Throwable th) {
            C10130bg.m24974a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C10134bk j = mo17754z();
            C47393f.m84233d(this, C72883t.class, new C10135bl(j));
            a.mo51254d(a.f123128b.findViewById(R.id.future_devices), new C10136bm(j));
            a.mo51254d(a.f123128b.findViewById(R.id.remove_personal_results), new C10137bn(j));
            this.f54442o.mo24720k(bundle);
            C10134bk j2 = mo17754z();
            PageDescriptionView findViewById = view.findViewById(R.id.page_description);
            findViewById.f(view.getResources().getString(R.string.structure_level_personal_results_title, new Object[]{j2.f34471c.d(j2.f34470b)}));
            ao.b(findViewById.a(), R.string.sla_personal_results_subtitle_with_link, R.string.sla_personal_results_link);
            j2.f34474f = (RecyclerView) view.findViewById(R.id.devices_list);
            j2.f34475g = view.findViewById(R.id.structure_setup_action_card_container);
            j2.f34476h = view.findViewById(R.id.future_devices);
            j2.f34477i = view.findViewById(R.id.zero_state_container);
            j2.f34478j = view.findViewById(R.id.content_container);
            j2.f34479k = view.findViewById(R.id.remove_personal_results);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10130bg.m24974a(th, th);
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
            if (!this.f34466e) {
                super.onAttach(context);
                if (this.f34463a == null) {
                    Object jN = mo18285a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10131bh) {
                        C10131bh bhVar = (C10131bh) fragment;
                        C68225k.m98532d(bhVar);
                        String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                        C68225k.m98532d(b);
                        this.f34463a = new C10134bk(bhVar, b, (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (dn) ((C74178nm) jN).f207130a.b.f200233fi.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34465d));
                    } else {
                        String obj = C10134bk.class.toString();
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
                C10130bg.m24974a(th, th2);
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

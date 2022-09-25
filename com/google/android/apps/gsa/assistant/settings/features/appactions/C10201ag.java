package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10187b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10188c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10190e;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10192g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10193h;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.settings.shared.e.j;
import com.google.android.apps.gsa.assistant.settings.shared.e.k;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ag */
/* compiled from: PG */
public final class C10201ag extends C10285cd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10216av f34645a;

    /* renamed from: c */
    private Context f34646c;

    /* renamed from: d */
    private final C2393x f34647d = new C2393x(this);

    /* renamed from: e */
    private boolean f34648e;

    @Deprecated
    public C10201ag() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C10216av mo17754z() {
        C10216av avVar = this.f34645a;
        if (avVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34648e) {
            return avVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18339b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34646c == null) {
            this.f34646c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34646c;
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
        return this.f34647d;
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
            C10200af.m25077a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C10216av a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f34675k.mo50429i(a.f34676l);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10200af.m25077a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10216av a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f34680p = layoutInflater.inflate(R.layout.app_shortcut_page_fragment, viewGroup, false);
            View view = a.f34680p;
            view.getClass();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.setting_header_stub_view);
            View view2 = a.f34680p;
            view2.getClass();
            ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.collapsed_setting_header_stub_view);
            C10266k a2 = C10266k.m25161a(a.f34667c.f34807d);
            if (a2 == null) {
                a2 = C10266k.UNKNOWN;
            }
            if (a2 == C10266k.MAIN_PAGE) {
                viewStub.setLayoutResource(R.layout.main_page_setting_header);
                viewStub2.setLayoutResource(R.layout.main_page_collapsed_setting_header);
            } else {
                viewStub.setLayoutResource(R.layout.app_specific_page_setting_header);
                viewStub2.setLayoutResource(R.layout.app_specific_page_collapsed_setting_header);
            }
            a.f34683s = viewStub.inflate();
            a.f34684t = viewStub2.inflate();
            if (bundle == null) {
                C0395p pVar = (C0395p) a.f34668d.getActivity();
                View view3 = a.f34680p;
                view3.getClass();
                pVar.mo1322k().mo1192t((Toolbar) view3.findViewById(R.id.assistant_settings_toolbar));
            }
            C73778a.m108339b(a.f34668d);
            View view4 = a.f34680p;
            view4.getClass();
            TabLayout tabLayout = (TabLayout) view4.findViewById(R.id.page_tabs);
            View view5 = a.f34680p;
            view5.getClass();
            ViewPager viewPager = (ViewPager) view5.findViewById(R.id.page_pager);
            C10212ar arVar = new C10212ar(a, a.f34668d.getChildFragmentManager());
            a.f34681q = Optional.m71637of(arVar);
            viewPager.mo9146k(arVar);
            tabLayout.mo48419n(viewPager, false);
            l lVar = a.f34672h;
            j a3 = a.mo18344a();
            C10201ag agVar = a.f34668d;
            Objects.requireNonNull(agVar);
            k a4 = lVar.a(a3, new C10210ap(agVar));
            View view6 = a.f34680p;
            view6.getClass();
            View a5 = a4.b.a(layoutInflater, viewGroup, view6);
            C28306ab abVar = a.f34674j.f76997b;
            C10266k a6 = C10266k.m25161a(a.f34667c.f34807d);
            if (a6 == null) {
                a6 = C10266k.UNKNOWN;
            }
            abVar.mo33800a(C28427h.m53115a(a6 == C10266k.MAIN_PAGE ? 105135 : 105134)).mo33809b(a5);
            a.f34674j.f76997b.mo33800a(C28427h.m53115a(105136)).mo33809b(tabLayout);
            if (a5 != null) {
                C47831fm.m85019n();
                return a5;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C10200af.m25077a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C10216av a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f34681q = Optional.empty();
            a.f34680p = null;
            a.f34683s = null;
            a.f34684t = null;
            c.close();
            return;
        } catch (Throwable th) {
            C10200af.m25077a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34648e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10200af.m25077a(th, th);
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
            C10200af.m25077a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C10216av a = mo17754z();
            C47393f.m84233d(this, C10192g.class, new C10217aw(a));
            C47393f.m84233d(this, C10187b.class, new C10218ax(a));
            C47393f.m84233d(this, C10190e.class, new C10219ay(a));
            C47393f.m84233d(this, C10188c.class, new C10220az(a));
            C47393f.m84233d(this, C10193h.class, new C10225ba(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10200af.m25077a(th, th);
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
            if (!this.f34648e) {
                super.onAttach(context);
                if (this.f34645a == null) {
                    Object jN = mo18379d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10201ag) {
                        C10201ag agVar = (C10201ag) fragment;
                        C68225k.m98532d(agVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10267l lVar = (C10267l) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10267l.f34802e, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(lVar);
                        this.f34645a = new C10216av(agVar, lVar, (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C10325al) ((C74178nm) jN).f207136c.f205576bY.mo17428b(), (C10311c) ((C74178nm) jN).f207136c.f205575bX.mo17428b(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), ((C74178nm) jN).mo70075q(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aW.mo17428b(), ((C74178nm) jN).mo70063e(), (C46439e) ((C74178nm) jN).f207139f.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34647d));
                    } else {
                        String obj = C10216av.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C10200af.m25077a(th2, th3);
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

package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.C9889ac;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a.C9861b;
import com.google.android.apps.gsa.assistant.settings.shared.e.b;
import com.google.android.apps.gsa.assistant.settings.shared.e.c;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.r */
/* compiled from: PG */
public final class C9974r extends C9944c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9889ac f34154a;

    /* renamed from: c */
    private Context f34155c;

    /* renamed from: d */
    private final C2393x f34156d = new C2393x(this);

    /* renamed from: e */
    private boolean f34157e;

    @Deprecated
    public C9974r() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18142b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34155c == null) {
            this.f34155c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34155c;
    }

    /* renamed from: f */
    public final C9889ac mo17754z() {
        C9889ac acVar = this.f34154a;
        if (acVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34157e) {
            return acVar;
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
        return this.f34156d;
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
            C9973q.m24760a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9889ac f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.main_page_flat_list, viewGroup, false);
            c cVar = f.f33939c;
            C46691ai aiVar = C9861b.f33894a;
            C9974r rVar = f.f33938b;
            Objects.requireNonNull(rVar);
            b a = cVar.a(aiVar, new C9979w(rVar));
            f.f33943g.mo50707a(f.f33942f.mo18082a(), new C9889ac.C9890a(f, a));
            View a2 = a.a(layoutInflater, viewGroup, inflate);
            C47831fm.m85019n();
            return a2;
        } catch (Throwable th) {
            C9973q.m24760a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34157e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9973q.m24760a(th, th);
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
            C9973q.m24760a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C9889ac f = mo17754z();
            ((RecyclerView) view.findViewById(R.id.top_settings_section)).setAdapter(f.f33944h);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.link_cards_section);
            ((CardView) linearLayout.findViewById(R.id.you_link_card)).setOnClickListener(new C9887aa(f));
            ((CardView) linearLayout.findViewById(R.id.devices_link_card)).setOnClickListener(new C9888ab(f));
            ((RecyclerView) view.findViewById(R.id.all_settings_section)).setAdapter(f.f33945i);
            Chip chip = (Chip) view.findViewById(R.id.all_settings_chip);
            chip.setOnClickListener(new C9975s(f));
            chip.f116094e = new C9976t(f);
            chip.mo47665E();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9973q.m24760a(th, th);
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
            if (!this.f34157e) {
                super.onAttach(context);
                if (this.f34154a == null) {
                    Object jN = mo18141a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9974r) {
                        C9974r rVar = (C9974r) fragment;
                        C68225k.m98532d(rVar);
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        this.f34154a = new C9889ac(rVar, ((C74178nm) jN).mo70074p(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), bvVar.f205597bt, bvVar.mo69378j(), (C46801dp) ((C74178nm) jN).f207138e.mo17428b(), (C9912ay) ((C74178nm) jN).mo70042Y());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34156d));
                    } else {
                        String obj = C9889ac.class.toString();
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
                C9973q.m24760a(th, th2);
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

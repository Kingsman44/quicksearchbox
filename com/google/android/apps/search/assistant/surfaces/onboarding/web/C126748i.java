package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.i */
/* compiled from: PG */
public final class C126748i extends C126756q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126752m f349049a;

    /* renamed from: c */
    private Context f349050c;

    /* renamed from: d */
    private final C2393x f349051d = new C2393x(this);

    /* renamed from: e */
    private boolean f349052e;

    @Deprecated
    public C126748i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126752m mo17754z() {
        C126752m mVar = this.f349049a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349052e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107743b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349050c == null) {
            this.f349050c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349050c;
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
        return this.f349051d;
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
            C126747h.m207323a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C126752m a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_onboarding_web_fragment, viewGroup, false);
            ViewFlipper viewFlipper = (ViewFlipper) inflate.findViewById(R.id.assistant_onboarding_view_flipper);
            viewFlipper.setDisplayedChild(0);
            Bundle extras = a.f349063f.getActivity().getIntent().getExtras();
            if (extras != null) {
                if (!a.f349063f.getActivity().getIntent().hasExtra("intent_extra_additional_ve")) {
                    ((C59052c) ((C59052c) C126752m.f349058a.mo56224b()).mo56372aa(37135)).mo56386p("No additional ve id.");
                } else {
                    int i = extras.getInt("intent_extra_additional_ve");
                    a.f349067j.f76997b.mo33800a(C28427h.m53115a(i)).mo33811d((LinearLayout) inflate.findViewById(R.id.assistant_onboarding_web_outer_container));
                    ((C59052c) ((C59052c) C126752m.f349058a.mo56224b()).mo56372aa(37134)).mo56387q("Additional ve id: %d.", i);
                }
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.assistant_onboarding_footer_container);
            linearLayout.setVisibility(8);
            a.f349062e.mo50708b(a.f349061d.mo50244a(a.f349060c), C46788de.DONT_CARE, new C126749j());
            a.f349062e.mo50707a(a.f349065h.mo46469b(), new C126750k(a, viewFlipper, linearLayout));
            if (a.f349063f.getChildFragmentManager().f634a.mo671c("webx_fragment") == null) {
                C43861g a2 = C43864j.m77435a(a.f349060c, a.f349064g);
                C0154a aVar = new C0154a(a.f349063f.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_onboarding_webx_container, a2, "webx_fragment", 1);
                aVar.mo509f();
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C126747h.m207323a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349052e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126747h.m207323a(th, th);
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
            C126747h.m207323a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_onboarding_action_button), new C126753n(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126747h.m207323a(th, th);
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
            if (!this.f349052e) {
                super.onAttach(context);
                if (this.f349049a == null) {
                    Object jN = mo107745d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C46175b bVar = (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b();
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126748i) {
                        C126748i iVar = (C126748i) fragment;
                        C68225k.m98532d(iVar);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f349049a = new C126752m(accountId, bVar, dpVar, iVar, b, ((C74176nj) jN).mo69736fT(), ((C74176nj) jN).f206730b.mo66295fc(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349051d));
                    } else {
                        String obj = C126752m.class.toString();
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
                C126747h.m207323a(th, th2);
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

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
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a.C135637a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a.C135644h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.l */
/* compiled from: PG */
public final class C135670l extends C135679u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135674p f369539a;

    /* renamed from: c */
    private Context f369540c;

    /* renamed from: d */
    private final C2393x f369541d = new C2393x(this);

    /* renamed from: e */
    private boolean f369542e;

    @Deprecated
    public C135670l() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135674p mo17754z() {
        C135674p pVar = this.f369539a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369542e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112457b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369540c == null) {
            this.f369540c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369540c;
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
        return this.f369541d;
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
            C135669k.m220024a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C135674p a = mo17754z();
            AppCompatImageButton a2 = a.f369546a.mo46501a(new C135672n(a), viewGroup);
            if (a.f369551f) {
                a.f369553h = a.f369552g.mo113527a(a2, a.f369548c.getResources().getString(R.string.googleapp_browser_amp_tooltip_text), C63932bs.ABOVE);
                a.f369553h.mo113525c(new C135671m(a));
                C46801dp dpVar = a.f369549d;
                C135644h hVar = a.f369550e;
                C46689ag a3 = hVar.f369481d.mo46470a(new C135637a(hVar));
                C69664n.m101060f(a3, "webStateDataSources.crea…s::loadShouldShowTooltip)");
                dpVar.mo50707a(a3, new C135673o(a));
            }
            C47831fm.m85019n();
            return a2;
        } catch (Throwable th) {
            C135669k.m220024a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f369542e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135669k.m220024a(th, th);
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
            C135669k.m220024a(th, th);
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
            if (!this.f369542e) {
                super.onAttach(context);
                if (this.f369539a == null) {
                    Object jN = mo112465d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C43402c cVar = (C43402c) ((C74176nj) jN).f206725av.mo17428b();
                    C135644h hVar = new C135644h(((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45365781").mo50903b(), (C71422aw) ((C74176nj) jN).f206677a.H.mo17428b(), (C69585o) ((C74176nj) jN).f206677a.G.mo17428b(), ((C74176nj) jN).mo69737fU(), (C42876ab) ((C74176nj) jN).f206730b.f198027a.f199526gg.mo17428b());
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135670l) {
                        C135670l lVar = (C135670l) fragment;
                        C68225k.m98532d(lVar);
                        this.f369539a = new C135674p(accountId, cVar, hVar, lVar, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67121ki(), ((C74176nj) jN).mo69640dd());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f369541d));
                    } else {
                        String obj = C135674p.class.toString();
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
                C135669k.m220024a(th, th2);
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

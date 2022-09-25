package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.settings.p10426c.C137594c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43261l;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.f */
/* compiled from: PG */
public final class C137571f extends C137585t implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137574i f374189a;

    /* renamed from: c */
    private Context f374190c;

    /* renamed from: d */
    private final C2393x f374191d = new C2393x(this);

    /* renamed from: e */
    private boolean f374192e;

    @Deprecated
    public C137571f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137574i mo17754z() {
        C137574i iVar = this.f374189a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374192e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113831b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374190c == null) {
            this.f374190c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374190c;
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
        return this.f374191d;
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
            C137570e.m223489a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137574i a = mo17754z();
            if (a.f374197c.mo46339h()) {
                C43261l.m76332a(a.f374197c, a.f374198d.mo113834a());
            }
            RequestBlockMixin requestBlockMixin = a.f374200f;
            requestBlockMixin.mo46747b(R.id.googleapp_ads_personalization_setting_allowed_urls_in_webx, C137572g.f374193a);
            requestBlockMixin.mo46749d(R.id.googleapp_ads_personalization_setting_blocked_urls_in_webx, new C137573h(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137570e.m223489a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137574i a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_ads_personalization_setting_fragment, viewGroup, false);
            C28306ab abVar = a.f374199e;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(150732)));
            if (((C43861g) a.f374196b.getChildFragmentManager().f634a.mo671c("web_fragment")) == null) {
                C43261l.m76332a(a.f374197c, a.f374198d.mo113834a());
                C43861g b = C43864j.m77436b(a.f374195a);
                C0154a aVar = new C0154a(a.f374196b.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_ads_personalization_setting_fragment, b, "web_fragment", 1);
                aVar.mo511h(R.id.googleapp_ads_personalization_setting_loading_bar_fragment, C43679c.m77075a(a.f374195a, R.drawable.webx_loading_bar_background, C43675b.f113958d), "loading_bar", 1);
                aVar.mo509f();
                C43515c.m76782a(b, C137594c.m223545f(a.f374195a));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C137570e.m223489a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374192e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137570e.m223489a(th, th);
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
            C137570e.m223489a(th, th);
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
            if (!this.f374192e) {
                super.onAttach(context);
                if (this.f374189a == null) {
                    Object jN = mo113836d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137571f) {
                        C137571f fVar = (C137571f) fragment;
                        C68225k.m98532d(fVar);
                        String e = ((C46897i) ((C74176nj) jN).f206677a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.device 45366936").mo50906e();
                        C68225k.m98532d(e);
                        this.f374189a = new C137574i(accountId, fVar, ((C74176nj) jN).mo69766fx(), ((C74176nj) jN).mo69726fJ(), ((C74176nj) jN).mo69697eh(), (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b(), new C137581p((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), e), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374191d));
                    } else {
                        String obj = C137574i.class.toString();
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
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C137570e.m223489a(th, th2);
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

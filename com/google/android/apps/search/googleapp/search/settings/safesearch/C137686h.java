package com.google.android.apps.search.googleapp.search.settings.safesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0401v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.search.settings.p10426c.C137594c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.h */
/* compiled from: PG */
public final class C137686h extends C137691m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137687i f374494a;

    /* renamed from: c */
    private Context f374495c;

    /* renamed from: d */
    private final C2393x f374496d = new C2393x(this);

    /* renamed from: e */
    private boolean f374497e;

    @Deprecated
    public C137686h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137687i mo17754z() {
        C137687i iVar = this.f374494a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374497e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113905b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374495c == null) {
            this.f374495c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374495c;
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
        return this.f374496d;
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
            C137685g.m223776a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137687i a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_safe_search_setting_fragment, viewGroup, false);
            C28306ab abVar = a.f374501d;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(150055)));
            if (((C43861g) a.f374499b.getChildFragmentManager().f634a.mo671c("web_fragment")) == null) {
                AccountId accountId = a.f374498a;
                Uri.Builder appendQueryParameter = Uri.parse("https://www.google.com/safesearch").buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
                C133933a aVar = a.f374500c;
                int i = C0401v.f1356b;
                String str = "1";
                if (true != C133933a.m217248a(aVar.f364779a)) {
                    str = "0";
                }
                C43861g a2 = C43864j.m77435a(accountId, appendQueryParameter.appendQueryParameter("cs", str).toString());
                C0154a aVar2 = new C0154a(a.f374499b.getChildFragmentManager());
                aVar2.mo511h(R.id.googleapp_safe_search_setting_fragment, a2, "web_fragment", 1);
                aVar2.mo511h(R.id.googleapp_safe_search_setting_loading_bar_fragment, C43679c.m77075a(a.f374498a, R.drawable.webx_loading_bar_background, C43675b.f113958d), "loading_bar", 1);
                aVar2.mo509f();
                C43515c.m76782a(a2, C137594c.m223545f(a.f374498a));
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C137685g.m223776a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374497e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137685g.m223776a(th, th);
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
            C137685g.m223776a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C137688j(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137685g.m223776a(th, th);
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
            if (!this.f374497e) {
                super.onAttach(context);
                if (this.f374494a == null) {
                    Object jN = mo113906d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137686h) {
                        C137686h hVar = (C137686h) fragment;
                        C68225k.m98532d(hVar);
                        this.f374494a = new C137687i(accountId, hVar, ((C74176nj) jN).f206730b.mo66071bQ(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), ((C74176nj) jN).mo69731fO());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374496d));
                    } else {
                        String obj = C137687i.class.toString();
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
                C137685g.m223776a(th, th2);
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

package com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a;

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
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.config.webfeature.AutoValue_UserAgentListenerFeature;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.search.silk.web.close.C40727c;
import com.google.android.libraries.search.silk.web.close.SilkCloseFeature;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
import com.google.android.libraries.web.contrib.jsclose.JsCloseFeature;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
import com.google.android.libraries.web.webview.contrib.stuckjs.StuckJsFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.apk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.f */
/* compiled from: PG */
public final class C136795f extends C136801l implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136796g f372368a;

    /* renamed from: c */
    private Context f372369c;

    /* renamed from: d */
    private final C2393x f372370d = new C2393x(this);

    /* renamed from: e */
    private boolean f372371e;

    @Deprecated
    public C136795f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136796g mo17754z() {
        C136796g gVar = this.f372368a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f372371e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113372b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f372369c == null) {
            this.f372369c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f372369c;
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
        return this.f372370d;
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
            C136794e.m222450a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C136791c cVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136796g a = mo17754z();
            ((C59052c) ((C59052c) C136796g.f372372a.mo56224b()).mo56372aa(40830)).mo56386p("onCreateView");
            View inflate = layoutInflater.inflate(R.layout.googleapp_sno_webuisettings_web_root_fragment, viewGroup, false);
            C43264o oVar = (C43264o) a.f372374c.getChildFragmentManager().f634a.mo671c("web_coordinator_fragment");
            if (oVar == null) {
                cVar = null;
            } else {
                cVar = (C136791c) oVar.mo17754z().mo46379a();
            }
            if (cVar == null) {
                AccountId accountId = a.f372373b;
                C136785a aVar = a.f372375d;
                C43259j jVar = new C43259j();
                jVar.f113058a = false;
                jVar.mo46375e(aVar.f372343a.mo111322c());
                C40758l lVar = aVar.f372344b;
                C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
                apk apk = apk.TNG_NOTIFICATION;
                jVar2.copyOnWrite();
                C40757k kVar = (C40757k) jVar2.instance;
                kVar.f106860b = apk.f159677E;
                kVar.f106859a |= 1;
                jVar.mo46372b(StuckJsFeature.m78405e(), lVar.mo42702a((C40757k) jVar2.build()), SilkCloseFeature.m70571e(new C40727c()), new AutoValue_UserAgentListenerFeature(), WebViewSetupFeature.m78387d(C136798i.class));
                jVar.mo46373c(JsCloseFeature.m77046d(C136802m.class));
                C43264o a2 = C43265p.m76349a(accountId, jVar.mo46371a());
                C0154a aVar2 = new C0154a(a.f372374c.getChildFragmentManager());
                aVar2.mo511h(R.id.googleapp_sno_webuisettings_web_root_fragment_container, a2, "web_coordinator_fragment", 1);
                aVar2.mo509f();
                C43266q f = a2.mo17754z();
                AccountId accountId2 = a.f372373b;
                String str = a.f372376e;
                C136791c cVar2 = new C136791c();
                C68324h.m98669f(cVar2);
                C47247a.m84047b(cVar2, accountId2);
                C47243l.m84040b(cVar2, str);
                f.mo46380b(cVar2);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136794e.m222450a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f372371e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136794e.m222450a(th, th);
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
            C136794e.m222450a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C136797h(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136794e.m222450a(th, th);
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
            if (!this.f372371e) {
                super.onAttach(context);
                if (this.f372368a == null) {
                    Object jN = mo113375d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136795f) {
                        C136795f fVar = (C136795f) fragment;
                        C68225k.m98532d(fVar);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f372368a = new C136796g(accountId, fVar, new C136785a((C133665d) ((C74176nj) jN).f206730b.f198021U.mo17428b(), ((C74176nj) jN).mo69754fl()), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b(), b);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f372370d));
                    } else {
                        String obj = C136796g.class.toString();
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
                C136794e.m222450a(th, th2);
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

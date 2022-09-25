package com.google.android.libraries.kids.platform.kidonboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.kids.platform.kidonboarding.p1987a.C24039b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p3501z.C44494c;
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
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p386ak.C8401q;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.i */
/* compiled from: PG */
public final class C24052i extends C24062s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C24058o f65719a;

    /* renamed from: c */
    private Context f65720c;

    /* renamed from: d */
    private final C2393x f65721d = new C2393x(this);

    /* renamed from: e */
    private boolean f65722e;

    @Deprecated
    public C24052i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C24058o mo17754z() {
        C24058o oVar = this.f65719a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f65722e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo29442b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f65720c == null) {
            this.f65720c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f65720c;
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
        return this.f65721d;
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
            C24051h.m44655a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C24058o a = mo17754z();
            a.f65728c.requireActivity().f2707h.mo3339b(a.f65728c, new C24053j(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C24051h.m44655a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C24058o a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C69664n.m101061g(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.kid_creation_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "rootView");
            WebView a2 = a.mo29443a(inflate);
            a2.setWebViewClient(a.f65730e);
            C8401q qVar = new C8401q();
            qVar.mo17171j("os", "Android");
            qVar.mo17170i("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
            qVar.mo17171j("app", a.f65727b.f143395d);
            qVar.mo17171j("appVersion", a.f65727b.f143396e);
            WebSettings settings = a2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
            String userAgentString = settings.getUserAgentString();
            settings.setUserAgentString(userAgentString + " KcIdWebView " + qVar);
            CookieManager.getInstance().setAcceptCookie(true);
            KidOnboardingViewModel b = a.mo29444b();
            C54618k kVar = a.f65727b;
            C24039b b2 = b.mo29432a(kVar).mo29438b(new C24055l(a));
            C69664n.m101061g(a2, "<this>");
            C69664n.m101061g(b2, "bridge");
            b2.mo29433a(a2);
            if (bundle != null) {
                a2.restoreState(bundle);
            }
            C47426f.m84293a(a.f65729d.mo51262a(a.mo29444b().f65694b), new C24056m(a));
            KidOnboardingViewModel b3 = a.mo29444b();
            b3.f65695c.mo51259b(a.f65727b);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C24051h.m44655a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f65722e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C24051h.m44655a(th, th);
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
            C24051h.m44655a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C24058o a = mo17754z();
            C69664n.m101061g(bundle, "outState");
            View requireView = a.f65728c.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            a.mo29443a(requireView).saveState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C24051h.m44655a(th, th);
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
            if (!this.f65722e) {
                super.onAttach(context);
                if (this.f65719a == null) {
                    Object jN = mo29448d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C54618k kVar = (C54618k) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C54618k.f143390g, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(kVar);
                    C62921ba baVar = (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C24052i) {
                        C24052i iVar = (C24052i) fragment;
                        C68225k.m98532d(iVar);
                        C47429i gX = ((C74176nj) jN).mo69793gX();
                        int i = C44494c.f115645a;
                        C65603f fVar = (C65603f) ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66958fY().f185297a.mo17428b()).mo50901a("com.google.kids.platform.android 45378527").mo50905d();
                        C68225k.m98532d(fVar);
                        this.f65719a = new C24058o(kVar, baVar, iVar, gX, new C24061r(new C24059p(fVar), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f65721d));
                    } else {
                        String obj = C24058o.class.toString();
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
                C24051h.m44655a(th, th2);
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

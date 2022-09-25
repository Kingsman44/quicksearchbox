package com.google.android.apps.search.googleapp.googleappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d.C135751l;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135543c;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.experiments.C46897i;
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
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69036bf;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69086g;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class GoogleAppBrowserCoordinatorFragment extends C135517bj implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136018m f369025a;

    /* renamed from: c */
    private Context f369026c;

    /* renamed from: d */
    private final C2393x f369027d = new C2393x(this);

    /* renamed from: e */
    private boolean f369028e;

    @Deprecated
    public GoogleAppBrowserCoordinatorFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static GoogleAppBrowserCoordinatorFragment m219623a(AccountId accountId, C135462h hVar) {
        GoogleAppBrowserCoordinatorFragment googleAppBrowserCoordinatorFragment = new GoogleAppBrowserCoordinatorFragment();
        C68324h.m98669f(googleAppBrowserCoordinatorFragment);
        C47247a.m84047b(googleAppBrowserCoordinatorFragment, accountId);
        C47243l.m84039a(googleAppBrowserCoordinatorFragment, hVar);
        return googleAppBrowserCoordinatorFragment;
    }

    /* renamed from: b */
    public final C136018m mo17754z() {
        C136018m mVar = this.f369025a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369028e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo112347d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369026c == null) {
            this.f369026c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369026c;
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
        return this.f369027d;
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
            C136014i.m220823a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136018m b = mo17754z();
            if (b.f370431g.isPresent()) {
                b.f370433i.mo50828h(R.id.googleapp_browser_firstrun_datasubscription, b.f370432h.mo112384a(), b.f370435k);
            }
            if (b.f370434j && b.f370426b.f369069i) {
                b.mo112690n();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136014i.m220823a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136018m b = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_fragment_root, viewGroup, false);
            C28306ab abVar = b.f370429e;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(114868)));
            b.f370427c.requireActivity().getWindow().setStatusBarColor(0);
            if (!b.f370431g.isPresent()) {
                b.mo112688l();
            }
            b.f370430f.mo115161a(b.f370427c, inflate, new C136017l(b));
            C69664n.m101060f(inflate, "root");
            C2043bi.m5555ai(inflate, C136015j.f370422a);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C136014i.m220823a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C136018m b2 = mo17754z();
            if (b2.f370434j && b2.f370426b.f369069i) {
                b2.mo112689m();
            }
            b.close();
            return;
        } catch (Throwable th) {
            C136014i.m220823a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f369028e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136014i.m220823a(th, th);
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
            C136014i.m220823a(th, th);
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
        Optional optional;
        this.f122869b.mo51381i();
        try {
            if (!this.f369028e) {
                super.onAttach(context);
                if (this.f369025a == null) {
                    Object jN = mo112377f().mo17653jN();
                    C135462h ch = ((C74176nj) jN).mo69591ch();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof GoogleAppBrowserCoordinatorFragment) {
                        GoogleAppBrowserCoordinatorFragment googleAppBrowserCoordinatorFragment = (GoogleAppBrowserCoordinatorFragment) fragment;
                        C68225k.m98532d(googleAppBrowserCoordinatorFragment);
                        C139680b bVar = (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C135514bg bgVar = new C135514bg((C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), ((C74176nj) jN).mo69693ed(), (C136370a) ((C74176nj) jN).f206724au.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67117ke(), ((C74176nj) jN).f206730b.f198027a.mo67119kg(), ((C74176nj) jN).f206730b.f198027a.mo66986g(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45366398").mo50907f(), new C136010h(((C74176nj) jN).f206730b.f198027a.mo67120kh()));
                        C136370a aVar = (C136370a) ((C74176nj) jN).f206724au.mo17428b();
                        boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45359348").mo50907f();
                        C139676e eVar = (C139676e) ((C74176nj) jN).f206836d.f205434p.mo17428b();
                        AccountId accountId2 = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        boolean b = C69086g.m100208b(((C74176nj) jN).f206730b.f198009I);
                        C69664n.m101061g(accountId2, "accountId");
                        if (b) {
                            optional = Optional.m71637of(new C135751l(accountId2));
                            C69664n.m101060f(optional, "accountId: AccountId,\n  …)\n        }\n      )\n    }");
                        } else {
                            optional = Optional.empty();
                            C69664n.m101060f(optional, "{\n      Optional.empty()\n    }");
                        }
                        Optional optional2 = optional;
                        C68225k.m98532d(optional2);
                        boolean a = C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I);
                        C133110a ed = ((C74176nj) jN).mo69693ed();
                        C136018m mVar = r3;
                        C136018m mVar2 = new C136018m(ch, accountId, googleAppBrowserCoordinatorFragment, bVar, abVar, bgVar, aVar, f, eVar, optional2, (C135543c) ((C74176nj) jN).f206730b.f198117bk.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), a, ed);
                        this.f369025a = mVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f369027d));
                    } else {
                        String obj = C136018m.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C136014i.m220823a(th2, th3);
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

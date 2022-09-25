package com.google.android.apps.search.googleapp.silkpane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
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

/* renamed from: com.google.android.apps.search.googleapp.silkpane.y */
/* compiled from: PG */
public final class C139303y extends C139277ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139304z f378873a;

    /* renamed from: c */
    private Context f378874c;

    /* renamed from: d */
    private final C2393x f378875d = new C2393x(this);

    /* renamed from: e */
    private boolean f378876e;

    @Deprecated
    public C139303y() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139304z mo17754z() {
        C139304z zVar = this.f378873a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378876e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114874b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378874c == null) {
            this.f378874c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378874c;
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
        return this.f378875d;
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
            C139302x.m226432a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ all -> 0x0139, all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e A[Catch:{ all -> 0x0139, all -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51119t(r9, r10, r11)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.z r11 = r8.mo17754z()     // Catch:{ all -> 0x0139 }
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.silkpane.C139304z.f378877a     // Catch:{ all -> 0x0139 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "onCreateView"
            r2 = 41365(0xa195, float:5.7965E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0139 }
            r0 = 2131625405(0x7f0e05bd, float:1.8878017E38)
            r1 = 0
            android.view.View r9 = r9.inflate(r0, r10, r1)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.v r10 = r11.mo114885a()     // Catch:{ all -> 0x0139 }
            if (r10 != 0) goto L_0x012b
            com.google.apps.tiktok.account.AccountId r10 = r11.f378878b     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.b.b r0 = r11.f378882f     // Catch:{ all -> 0x0139 }
            boolean r0 = r0.f378836e     // Catch:{ all -> 0x0139 }
            r2 = 1
            if (r0 == 0) goto L_0x003c
            com.google.android.libraries.web.weblayer.b.c r0 = r11.f378880d     // Catch:{ all -> 0x0139 }
            boolean r0 = r0.mo47088b()     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r0 = 0
            goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            com.google.common.base.C58838bb.m90883r(r0)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.b.b r0 = r11.f378882f     // Catch:{ all -> 0x0139 }
            boolean r0 = r0.f378836e     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.base.j r3 = new com.google.android.libraries.web.base.j     // Catch:{ all -> 0x0139 }
            r3.<init>()     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x004e
            com.google.android.libraries.web.base.v r0 = com.google.android.libraries.web.base.C43271v.WEB_LAYER     // Catch:{ all -> 0x0139 }
            goto L_0x0050
        L_0x004e:
            com.google.android.libraries.web.base.v r0 = com.google.android.libraries.web.base.C43271v.WEB_VIEW     // Catch:{ all -> 0x0139 }
        L_0x0050:
            r3.f113060c = r0     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.config.d r0 = r11.f378881e     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r0.mo111322c()     // Catch:{ all -> 0x0139 }
            r3.mo46375e(r0)     // Catch:{ all -> 0x0139 }
            r0 = 9
            com.google.android.libraries.web.shared.contrib.WebFeature[] r0 = new com.google.android.libraries.web.shared.contrib.WebFeature[r0]     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.contrib.googlesignin.d r4 = com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature.m76919e()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature r4 = r4.mo46642c()     // Catch:{ all -> 0x0139 }
            r0[r1] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.core.l r4 = r11.f378884h     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.core.k r5 = com.google.android.libraries.search.silk.web.core.C40757k.f106857c     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.core.j r5 = (com.google.android.libraries.search.silk.web.core.C40756j) r5     // Catch:{ all -> 0x0139 }
            com.google.common.o.apk r6 = com.google.common.p4552o.apk.TNG_SILK_PANE     // Catch:{ all -> 0x0139 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.core.k r7 = (com.google.android.libraries.search.silk.web.core.C40757k) r7     // Catch:{ all -> 0x0139 }
            int r6 = r6.f159677E     // Catch:{ all -> 0x0139 }
            r7.f106860b = r6     // Catch:{ all -> 0x0139 }
            int r6 = r7.f106859a     // Catch:{ all -> 0x0139 }
            r6 = r6 | r2
            r7.f106859a = r6     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.core.k r5 = (com.google.android.libraries.search.silk.web.core.C40757k) r5     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = r4.mo42702a(r5)     // Catch:{ all -> 0x0139 }
            r0[r2] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.share.c r4 = new com.google.android.libraries.search.silk.web.share.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.share.SilkShareFeature.m70984e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 2
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.geolocation.c r4 = new com.google.android.libraries.search.silk.web.geolocation.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.geolocation.SilkGeolocationFeature.m70712e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 3
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.download.c r4 = new com.google.android.libraries.search.silk.web.download.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.download.SilkDownloadFeature.m70636e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 4
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.amp.silk.f r4 = new com.google.android.apps.search.googleapp.amp.silk.f     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.amp.SilkAmpFeature.m70435e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 5
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.close.c r4 = new com.google.android.libraries.search.silk.web.close.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.close.SilkCloseFeature.m70571e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 6
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.androiduri.c r4 = new com.google.android.libraries.search.silk.web.androiduri.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.androiduri.SilkAndroidUriFeature.m70461e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 7
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.search.silk.web.homescreenshortcuts.c r4 = new com.google.android.libraries.search.silk.web.homescreenshortcuts.c     // Catch:{ all -> 0x0139 }
            r4.<init>()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.shared.contrib.WebFeature r4 = com.google.android.libraries.search.silk.web.homescreenshortcuts.SilkHomescreenShortcutsFeature.m70740e(r4)     // Catch:{ all -> 0x0139 }
            r5 = 8
            r0[r5] = r4     // Catch:{ all -> 0x0139 }
            r3.mo46372b(r0)     // Catch:{ all -> 0x0139 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0139 }
            java.lang.Class<com.google.android.apps.search.googleapp.silkpane.SilkPaneBlockedUrlObserver> r4 = com.google.android.apps.search.googleapp.silkpane.SilkPaneBlockedUrlObserver.class
            r0[r1] = r4     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.b.a.a r1 = r3.f113072o     // Catch:{ all -> 0x0139 }
            p5462h.p5463a.C69540x.m100812s(r1, r0)     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.base.WebConfig r0 = r3.mo46371a()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.base.o r10 = com.google.android.libraries.web.base.C43265p.m76349a(r10, r0)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.y r0 = r11.f378879c     // Catch:{ all -> 0x0139 }
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()     // Catch:{ all -> 0x0139 }
            android.support.v4.app.a r1 = new android.support.v4.app.a     // Catch:{ all -> 0x0139 }
            r1.<init>((android.support.p031v4.app.FragmentManager) r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "web_coordinator_fragment"
            r3 = 2131431932(0x7f0b11fc, float:1.8485607E38)
            r1.mo511h(r3, r10, r0, r2)     // Catch:{ all -> 0x0139 }
            r1.mo509f()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.web.base.q r10 = r10.mo17754z()     // Catch:{ all -> 0x0139 }
            com.google.apps.tiktok.account.AccountId r0 = r11.f378878b     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.b.b r11 = r11.f378882f     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.googleapp.silkpane.v r1 = new com.google.android.apps.search.googleapp.silkpane.v     // Catch:{ all -> 0x0139 }
            r1.<init>()     // Catch:{ all -> 0x0139 }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r1)     // Catch:{ all -> 0x0139 }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r1, r0)     // Catch:{ all -> 0x0139 }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r1, r11)     // Catch:{ all -> 0x0139 }
            r10.mo46380b(r1)     // Catch:{ all -> 0x0139 }
        L_0x012b:
            if (r9 == 0) goto L_0x0131
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r9
        L_0x0131:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x0139 }
            java.lang.String r10 = "Fragment cannot use Event annotations with null view!"
            r9.<init>(r10)     // Catch:{ all -> 0x0139 }
            throw r9     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x013e }
            goto L_0x0142
        L_0x013e:
            r10 = move-exception
            com.google.android.apps.search.googleapp.silkpane.C139302x.m226432a(r9, r10)
        L_0x0142:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.silkpane.C139303y.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378876e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139302x.m226432a(th, th);
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
            C139302x.m226432a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C139273aa(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139302x.m226432a(th, th);
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
            if (!this.f378876e) {
                super.onAttach(context);
                if (this.f378873a == null) {
                    Object jN = mo114875d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139303y) {
                        C139303y yVar = (C139303y) fragment;
                        C68225k.m98532d(yVar);
                        this.f378873a = new C139304z(accountId, yVar, (C44127c) ((C74176nj) jN).f206677a.a.f202659bJ.mo17428b(), (C133665d) ((C74176nj) jN).f206730b.f198021U.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b(), ((C74176nj) jN).mo69754fl(), ((C74176nj) jN).mo69615dE());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378875d));
                    } else {
                        String obj = C139304z.class.toString();
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
                C139302x.m226432a(th, th2);
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

package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4580v.C60950i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b */
/* compiled from: PG */
public final class C124858b extends C124873p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124859c f344476a;

    /* renamed from: c */
    private Context f344477c;

    /* renamed from: d */
    private final C2393x f344478d = new C2393x(this);

    /* renamed from: e */
    private boolean f344479e;

    @Deprecated
    public C124858b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124859c mo17754z() {
        C124859c cVar = this.f344476a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344479e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106683b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344477c == null) {
            this.f344477c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344477c;
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
        return this.f344478d;
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
            C124857a.m204664a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7 A[Catch:{ all -> 0x011c, all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf A[Catch:{ all -> 0x011c, all -> 0x0121 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r0 = "web_fragment"
            com.google.apps.tiktok.tracing.ab r1 = r5.f122869b
            r1.mo51381i()
            r5.mo51119t(r6, r7, r8)     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.c r6 = r5.mo17754z()     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.dataservice.dp r8 = r6.f344485f     // Catch:{ all -> 0x011c }
            com.google.android.libraries.web.c.v r1 = r6.f344486g     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.dataservice.ag r1 = r1.mo46469b()     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.dataservice.di r2 = r6.f344489j     // Catch:{ all -> 0x011c }
            r8.mo50707a(r1, r2)     // Catch:{ all -> 0x011c }
            java.util.concurrent.atomic.AtomicReference r8 = r6.f344488i     // Catch:{ all -> 0x011c }
            com.google.common.v.i r1 = r6.f344487h     // Catch:{ all -> 0x011c }
            j$.time.Instant r1 = r1.mo57444a()     // Catch:{ all -> 0x011c }
            r8.set(r1)     // Catch:{ all -> 0x011c }
            android.view.ContextThemeWrapper r8 = new android.view.ContextThemeWrapper     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b r1 = r6.f344484e     // Catch:{ all -> 0x011c }
            android.support.v4.app.am r1 = r1.requireActivity()     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b r2 = r6.f344484e     // Catch:{ all -> 0x011c }
            android.content.Context r2 = r2.requireContext()     // Catch:{ all -> 0x011c }
            boolean r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt.m204633d(r2)     // Catch:{ all -> 0x011c }
            r3 = 1
            if (r3 == r2) goto L_0x003f
            r2 = 2132150708(0x7f1609b4, float:1.9943458E38)
            goto L_0x0042
        L_0x003f:
            r2 = 2132150701(0x7f1609ad, float:1.9943444E38)
        L_0x0042:
            r8.<init>(r1, r2)     // Catch:{ all -> 0x011c }
            android.content.Context r8 = com.google.android.material.p3505b.C44534d.m78716c(r8)     // Catch:{ all -> 0x011c }
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)     // Catch:{ all -> 0x011c }
            r1 = 2131624174(0x7f0e00ee, float:1.887552E38)
            r2 = 0
            android.view.View r7 = r8.inflate(r1, r7, r2)     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b r8 = r6.f344484e     // Catch:{ all -> 0x011c }
            android.support.v4.app.FragmentManager r8 = r8.getChildFragmentManager()     // Catch:{ all -> 0x011c }
            android.support.v4.app.cc r8 = r8.f634a     // Catch:{ all -> 0x011c }
            android.support.v4.app.Fragment r8 = r8.mo671c(r0)     // Catch:{ all -> 0x011c }
            com.google.android.libraries.web.k.g r8 = (com.google.android.libraries.web.p3420k.C43861g) r8     // Catch:{ all -> 0x011c }
            if (r8 != 0) goto L_0x0118
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b r8 = r6.f344484e     // Catch:{ all -> 0x011c }
            android.content.Context r8 = r8.requireContext()     // Catch:{ all -> 0x011c }
            boolean r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt.m204633d(r8)     // Catch:{ all -> 0x011c }
            r1 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            if (r8 == 0) goto L_0x009b
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r8 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r8 = r8.f344503c     // Catch:{ all -> 0x011c }
            if (r8 != 0) goto L_0x007c
            com.google.android.d.bg r8 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x007c:
            com.google.protobuf.cq r8 = r8.f386144d     // Catch:{ all -> 0x011c }
            int r8 = r8.size()     // Catch:{ all -> 0x011c }
            if (r8 <= 0) goto L_0x009b
            com.google.apps.tiktok.account.AccountId r8 = r6.f344482c     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r4 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r4 = r4.f344503c     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x008e
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x008e:
            com.google.protobuf.cq r4 = r4.f386144d     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011c }
            com.google.android.libraries.web.k.g r8 = com.google.android.libraries.web.p3420k.C43864j.m77435a(r8, r2)     // Catch:{ all -> 0x011c }
            goto L_0x00c1
        L_0x009b:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r8 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r8 = r8.f344503c     // Catch:{ all -> 0x011c }
            if (r8 != 0) goto L_0x00a3
            com.google.android.d.bg r8 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x00a3:
            com.google.protobuf.cq r8 = r8.f386142b     // Catch:{ all -> 0x011c }
            int r8 = r8.size()     // Catch:{ all -> 0x011c }
            if (r8 <= 0) goto L_0x010f
            com.google.apps.tiktok.account.AccountId r8 = r6.f344482c     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r4 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r4 = r4.f344503c     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00b5
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x00b5:
            com.google.protobuf.cq r4 = r4.f386142b     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011c }
            com.google.android.libraries.web.k.g r8 = com.google.android.libraries.web.p3420k.C43864j.m77435a(r8, r2)     // Catch:{ all -> 0x011c }
        L_0x00c1:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r2 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r2 = r2.f344503c     // Catch:{ all -> 0x011c }
            if (r2 != 0) goto L_0x00c9
            com.google.android.d.bg r2 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x00c9:
            int r2 = r2.f386141a     // Catch:{ all -> 0x011c }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x00e8
            android.view.View r2 = r7.findViewById(r1)     // Catch:{ all -> 0x011c }
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch:{ all -> 0x011c }
            androidx.constraintlayout.widget.d r2 = (androidx.constraintlayout.widget.C1745d) r2     // Catch:{ all -> 0x011c }
            r2.getClass()
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r4 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.d.bg r4 = r4.f344503c     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00e4
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f     // Catch:{ all -> 0x011c }
        L_0x00e4:
            java.lang.String r4 = r4.f386145e     // Catch:{ all -> 0x011c }
            r2.f5238G = r4     // Catch:{ all -> 0x011c }
        L_0x00e8:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.b r2 = r6.f344484e     // Catch:{ all -> 0x011c }
            android.support.v4.app.FragmentManager r2 = r2.getChildFragmentManager()     // Catch:{ all -> 0x011c }
            android.support.v4.app.a r4 = new android.support.v4.app.a     // Catch:{ all -> 0x011c }
            r4.<init>((android.support.p031v4.app.FragmentManager) r2)     // Catch:{ all -> 0x011c }
            r4.mo511h(r1, r8, r0, r3)     // Catch:{ all -> 0x011c }
            r4.mo509f()     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.account.AccountId r0 = r6.f344482c     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h r6 = r6.f344483d     // Catch:{ all -> 0x011c }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.m r1 = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.m     // Catch:{ all -> 0x011c }
            r1.<init>()     // Catch:{ all -> 0x011c }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r1)     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r1, r0)     // Catch:{ all -> 0x011c }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r1, r6)     // Catch:{ all -> 0x011c }
            com.google.android.libraries.web.contrib.errorpage.C43515c.m76782a(r8, r1)     // Catch:{ all -> 0x011c }
            goto L_0x0118
        L_0x010f:
            android.view.View r6 = r7.findViewById(r1)     // Catch:{ all -> 0x011c }
            r8 = 8
            r6.setVisibility(r8)     // Catch:{ all -> 0x011c }
        L_0x0118:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r7
        L_0x011c:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r7 = move-exception
            com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124857a.m204664a(r6, r7)
        L_0x0125:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124858b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344479e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124857a.m204664a(th, th);
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
            C124857a.m204664a(th, th);
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
            if (!this.f344479e) {
                super.onAttach(context);
                if (this.f344476a == null) {
                    Object jN = mo106690d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C124865h q = ((C74176nj) jN).mo70007q();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C124858b) {
                        C124858b bVar = (C124858b) fragment;
                        C68225k.m98532d(bVar);
                        this.f344476a = new C124859c(accountId, q, bVar, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69736fT(), ((C74176nj) jN).mo69721fE(), (C60950i) ((C74176nj) jN).f206677a.bC.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344478d));
                    } else {
                        String obj = C124859c.class.toString();
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
                C124857a.m204664a(th, th2);
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

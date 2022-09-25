package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.search.p2476a.p2482d.C32215d;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.v */
/* compiled from: PG */
public final class C136680v extends C136638cp implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136681w f372048a;

    /* renamed from: c */
    private Context f372049c;

    /* renamed from: d */
    private final C2393x f372050d = new C2393x(this);

    /* renamed from: e */
    private boolean f372051e;

    @Deprecated
    public C136680v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136681w mo17754z() {
        C136681w wVar = this.f372048a;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f372051e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113286b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f372049c == null) {
            this.f372049c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f372049c;
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
        return this.f372050d;
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
            C136679u.m222254a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064 A[Catch:{ all -> 0x00de, all -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[Catch:{ all -> 0x00de, all -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6 A[SYNTHETIC, Splitter:B:24:0x00d6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51119t(r9, r10, r11)     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.w r11 = r8.mo17754z()     // Catch:{ all -> 0x00de }
            r0 = 2131625300(0x7f0e0554, float:1.8877804E38)
            r1 = 0
            android.view.View r9 = r9.inflate(r0, r10, r1)     // Catch:{ all -> 0x00de }
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.v r10 = r11.f372053b     // Catch:{ all -> 0x00de }
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.v r0 = r11.f372053b     // Catch:{ all -> 0x00de }
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.b.f.c r2 = r11.f372054c     // Catch:{ all -> 0x00de }
            int r3 = r2.f371547a     // Catch:{ all -> 0x00de }
            r3 = r3 & 4
            r4 = 1
            if (r3 == 0) goto L_0x0037
            com.google.android.apps.search.googleapp.launcher.b.c.h r2 = r2.f371550d     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x0031
            com.google.android.apps.search.googleapp.launcher.b.c.h r2 = com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h.f371506d     // Catch:{ all -> 0x00de }
        L_0x0031:
            int r2 = r2.f371508a     // Catch:{ all -> 0x00de }
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            com.google.android.apps.search.googleapp.launcher.b.f.c r2 = r11.f372054c     // Catch:{ all -> 0x00de }
            boolean r2 = r2.f371549c     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x004b
            com.google.apps.tiktok.account.AccountId r2 = r11.f372052a     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.ah r3 = new com.google.android.apps.search.googleapp.launcher.minusone.ah     // Catch:{ all -> 0x00de }
            r3.<init>()     // Catch:{ all -> 0x00de }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r3)     // Catch:{ all -> 0x00de }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r3, r2)     // Catch:{ all -> 0x00de }
            goto L_0x0058
        L_0x004b:
            com.google.apps.tiktok.account.AccountId r2 = r11.f372052a     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.ac r3 = new com.google.android.apps.search.googleapp.launcher.minusone.ac     // Catch:{ all -> 0x00de }
            r3.<init>()     // Catch:{ all -> 0x00de }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r3)     // Catch:{ all -> 0x00de }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r3, r2)     // Catch:{ all -> 0x00de }
        L_0x0058:
            android.support.v4.app.cc r2 = r0.f634a     // Catch:{ all -> 0x00de }
            r5 = 2131431614(0x7f0b10be, float:1.8484962E38)
            android.support.v4.app.Fragment r2 = r2.mo670b(r5)     // Catch:{ all -> 0x00de }
            r6 = 0
            if (r2 != 0) goto L_0x006f
            android.support.v4.app.a r2 = new android.support.v4.app.a     // Catch:{ all -> 0x00de }
            r2.<init>((android.support.p031v4.app.FragmentManager) r0)     // Catch:{ all -> 0x00de }
            r2.mo511h(r5, r3, r6, r4)     // Catch:{ all -> 0x00de }
            r2.mo509f()     // Catch:{ all -> 0x00de }
        L_0x006f:
            android.support.v4.app.cc r0 = r10.f634a     // Catch:{ all -> 0x00de }
            r2 = 2131431617(0x7f0b10c1, float:1.8484968E38)
            android.support.v4.app.Fragment r0 = r0.mo670b(r2)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00ab
            com.google.apps.tiktok.account.AccountId r11 = r11.f372052a     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.u.r r0 = com.google.android.apps.search.googleapp.p10527u.C139777r.f379893c     // Catch:{ all -> 0x00de }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.u.q r0 = (com.google.android.apps.search.googleapp.p10527u.C139776q) r0     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN     // Catch:{ all -> 0x00de }
            r0.copyOnWrite()     // Catch:{ all -> 0x00de }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.u.r r7 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r7     // Catch:{ all -> 0x00de }
            int r3 = r3.f379907i     // Catch:{ all -> 0x00de }
            r7.f379896b = r3     // Catch:{ all -> 0x00de }
            int r3 = r7.f379895a     // Catch:{ all -> 0x00de }
            r3 = r3 | r4
            r7.f379895a = r3     // Catch:{ all -> 0x00de }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.u.r r0 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r0     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.incognito.i.b r11 = com.google.android.apps.search.googleapp.incognito.p10333i.C136347b.m221524a(r11, r0)     // Catch:{ all -> 0x00de }
            android.support.v4.app.a r0 = new android.support.v4.app.a     // Catch:{ all -> 0x00de }
            r0.<init>((android.support.p031v4.app.FragmentManager) r10)     // Catch:{ all -> 0x00de }
            r0.mo511h(r2, r11, r6, r4)     // Catch:{ all -> 0x00de }
            r0.mo509f()     // Catch:{ all -> 0x00de }
        L_0x00ab:
            android.view.View r10 = r9.findViewById(r5)     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bp r11 = new com.google.android.apps.search.googleapp.launcher.minusone.bp     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bo[] r0 = new com.google.android.apps.search.googleapp.launcher.minusone.C136608bo[r4]     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bo r2 = com.google.android.apps.search.googleapp.launcher.minusone.C136608bo.TOP     // Catch:{ all -> 0x00de }
            r0[r1] = r2     // Catch:{ all -> 0x00de }
            r11.<init>(r10, r1, r1, r0)     // Catch:{ all -> 0x00de }
            androidx.core.p098j.C2043bi.m5555ai(r10, r11)     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bp r10 = new com.google.android.apps.search.googleapp.launcher.minusone.bp     // Catch:{ all -> 0x00de }
            r11 = 2
            com.google.android.apps.search.googleapp.launcher.minusone.bo[] r11 = new com.google.android.apps.search.googleapp.launcher.minusone.C136608bo[r11]     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bo r0 = com.google.android.apps.search.googleapp.launcher.minusone.C136608bo.LEFT     // Catch:{ all -> 0x00de }
            r11[r1] = r0     // Catch:{ all -> 0x00de }
            com.google.android.apps.search.googleapp.launcher.minusone.bo r0 = com.google.android.apps.search.googleapp.launcher.minusone.C136608bo.RIGHT     // Catch:{ all -> 0x00de }
            r11[r4] = r0     // Catch:{ all -> 0x00de }
            r10.<init>(r9, r1, r4, r11)     // Catch:{ all -> 0x00de }
            androidx.core.p098j.C2043bi.m5555ai(r9, r10)     // Catch:{ all -> 0x00de }
            if (r9 == 0) goto L_0x00d6
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r9
        L_0x00d6:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x00de }
            java.lang.String r10 = "Fragment cannot use Event annotations with null view!"
            r9.<init>(r10)     // Catch:{ all -> 0x00de }
            throw r9     // Catch:{ all -> 0x00de }
        L_0x00de:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r10 = move-exception
            com.google.android.apps.search.googleapp.launcher.minusone.C136679u.m222254a(r9, r10)
        L_0x00e7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.launcher.minusone.C136680v.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f372051e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136679u.m222254a(th, th);
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
            C136679u.m222254a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C136681w a = mo17754z();
            C47393f.m84233d(this, C32214c.class, new C136682x(a));
            C47393f.m84233d(this, C32215d.class, new C136683y(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136679u.m222254a(th, th);
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
            if (!this.f372051e) {
                super.onAttach(context);
                if (this.f372048a == null) {
                    this.f372048a = ((C136684z) mo113287d().mo17653jN()).mo113328cG();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f372050d));
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
                C136679u.m222254a(th, th2);
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

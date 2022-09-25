package com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.a.e */
/* compiled from: PG */
public final class C136026e extends C136022a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136027f f370462a;

    /* renamed from: c */
    private Context f370463c;

    /* renamed from: d */
    private final C2393x f370464d = new C2393x(this);

    /* renamed from: e */
    private boolean f370465e;

    @Deprecated
    public C136026e() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C136026e m220865f(AccountId accountId) {
        C136026e eVar = new C136026e();
        C68324h.m98669f(eVar);
        C47247a.m84047b(eVar, accountId);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112693b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370463c == null) {
            this.f370463c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370463c;
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
        return this.f370464d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C136027f mo17754z() {
        C136027f fVar = this.f370462a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370465e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136025d.m220864a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r7.f370466a.getChildFragmentManager().f634a.mo671c("GAB_TOP_BAR_ACTION_FRAGMENT") != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            com.google.apps.tiktok.tracing.ab r0 = r4.f122869b
            r0.mo51381i()
            r4.mo51119t(r5, r6, r7)     // Catch:{ all -> 0x007c }
            com.google.android.apps.search.googleapp.googleappbrowser.pane.a.f r7 = r4.mo17754z()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "layoutInflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ all -> 0x007c }
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper     // Catch:{ all -> 0x007c }
            android.support.v4.app.Fragment r1 = r7.f370466a     // Catch:{ all -> 0x007c }
            android.content.Context r1 = r1.requireContext()     // Catch:{ all -> 0x007c }
            r2 = 2132150922(0x7f160a8a, float:1.9943892E38)
            r0.<init>(r1, r2)     // Catch:{ all -> 0x007c }
            android.view.LayoutInflater r5 = r5.cloneInContext(r0)     // Catch:{ all -> 0x007c }
            r0 = 2131625226(0x7f0e050a, float:1.8877654E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)     // Catch:{ all -> 0x007c }
            java.util.Set r6 = r7.f370467b     // Catch:{ all -> 0x007c }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "GAB_TOP_BAR_ACTION_FRAGMENT"
            r2 = 0
            if (r0 != 0) goto L_0x0044
            android.support.v4.app.Fragment r0 = r7.f370466a     // Catch:{ all -> 0x007c }
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()     // Catch:{ all -> 0x007c }
            android.support.v4.app.cc r0 = r0.f634a     // Catch:{ all -> 0x007c }
            android.support.v4.app.Fragment r0 = r0.mo671c(r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r6 = r2
        L_0x0045:
            if (r6 == 0) goto L_0x0073
            android.support.v4.app.Fragment r6 = r7.f370466a     // Catch:{ all -> 0x007c }
            android.support.v4.app.FragmentManager r6 = r6.getChildFragmentManager()     // Catch:{ all -> 0x007c }
            android.support.v4.app.a r0 = new android.support.v4.app.a     // Catch:{ all -> 0x007c }
            r0.<init>((android.support.p031v4.app.FragmentManager) r6)     // Catch:{ all -> 0x007c }
            java.util.Set r6 = r7.f370467b     // Catch:{ all -> 0x007c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007c }
        L_0x0058:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x007c }
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x007c }
            com.google.android.apps.search.googleapp.googleappbrowser.h.b r7 = (com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b) r7     // Catch:{ all -> 0x007c }
            android.support.v4.app.Fragment r7 = r7.mo112367a()     // Catch:{ all -> 0x007c }
            r2 = 1
            r3 = 2131431387(0x7f0b0fdb, float:1.8484502E38)
            r0.mo511h(r3, r7, r1, r2)     // Catch:{ all -> 0x007c }
            goto L_0x0058
        L_0x0070:
            r0.mo509f()     // Catch:{ all -> 0x007c }
        L_0x0073:
            java.lang.String r6 = "layoutInflater\n      .cl…Now()\n          }\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x007c }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r5
        L_0x007c:
            r5 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r6 = move-exception
            com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136025d.m220864a(r5, r6)
        L_0x0085:
            goto L_0x0087
        L_0x0086:
            throw r5
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136026e.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370465e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136025d.m220864a(th, th);
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
            C136025d.m220864a(th, th);
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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[Catch:{ ClassCastException -> 0x00c5, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[Catch:{ ClassCastException -> 0x00c5, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ ClassCastException -> 0x00c5, all -> 0x00f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.content.Context r12) {
        /*
            r11 = this;
            com.google.apps.tiktok.tracing.ab r0 = r11.f122869b
            r0.mo51381i()
            boolean r0 = r11.f370465e     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00e9
            super.onAttach((android.content.Context) r12)     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.search.googleapp.googleappbrowser.pane.a.f r12 = r11.f370462a     // Catch:{ all -> 0x00f1 }
            r0 = 1
            if (r12 != 0) goto L_0x00ce
            com.google.apps.tiktok.inject.e.a.a r12 = r11.mo112692a()     // Catch:{ ClassCastException -> 0x00c5 }
            java.lang.Object r12 = r12.mo17653jN()     // Catch:{ ClassCastException -> 0x00c5 }
            com.google.android.apps.search.googleapp.googleappbrowser.pane.a.f r1 = new com.google.android.apps.search.googleapp.googleappbrowser.pane.a.f     // Catch:{ all -> 0x00f1 }
            r2 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r2 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r2     // Catch:{ all -> 0x00f1 }
            g.a.a r2 = r2.f206889e     // Catch:{ all -> 0x00f1 }
            dagger.a.g r2 = (dagger.p5294a.C68221g) r2     // Catch:{ all -> 0x00f1 }
            java.lang.Object r2 = r2.f184583a     // Catch:{ all -> 0x00f1 }
            android.support.v4.app.Fragment r2 = (android.support.p031v4.app.Fragment) r2     // Catch:{ all -> 0x00f1 }
            r3 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r3 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r3     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r3 = r3.f206730b     // Catch:{ all -> 0x00f1 }
            g.a.a r3 = r3.f198239e     // Catch:{ all -> 0x00f1 }
            java.lang.Object r3 = r3.mo17428b()     // Catch:{ all -> 0x00f1 }
            com.google.apps.tiktok.account.AccountId r3 = (com.google.apps.tiktok.account.AccountId) r3     // Catch:{ all -> 0x00f1 }
            r4 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r4 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r4     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r4 = r4.f206730b     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r4 = r4.f198027a     // Catch:{ all -> 0x00f1 }
            boolean r4 = r4.mo67119kg()     // Catch:{ all -> 0x00f1 }
            r5 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r5 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r5     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r5 = r5.f206730b     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r5 = r5.f198027a     // Catch:{ all -> 0x00f1 }
            boolean r5 = r5.mo67117ke()     // Catch:{ all -> 0x00f1 }
            r6 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r6 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r6     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r6 = r6.f206730b     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r6 = r6.f198027a     // Catch:{ all -> 0x00f1 }
            g.a.a r6 = r6.f199220as     // Catch:{ all -> 0x00f1 }
            java.lang.Object r6 = r6.mo17428b()     // Catch:{ all -> 0x00f1 }
            com.google.android.libraries.search.k.h r6 = (com.google.android.libraries.search.p3025k.C38553h) r6     // Catch:{ all -> 0x00f1 }
            r7 = r12
            com.google.android.apps.gsa.binaries.satin.app.nj r7 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r7     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r7 = r7.f206730b     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r7 = r7.f198027a     // Catch:{ all -> 0x00f1 }
            long r7 = r7.mo66986g()     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.nj r12 = (com.google.android.apps.gsa.binaries.satin.app.C74176nj) r12     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.anh r12 = r12.f206730b     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r12 = r12.f198027a     // Catch:{ all -> 0x00f1 }
            boolean r12 = r12.mo67127ko()     // Catch:{ all -> 0x00f1 }
            com.google.common.b.ih r9 = new com.google.common.b.ih     // Catch:{ all -> 0x00f1 }
            r9.<init>()     // Catch:{ all -> 0x00f1 }
            if (r5 != 0) goto L_0x007b
            if (r4 != 0) goto L_0x007b
            if (r12 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r12 = 0
            goto L_0x007c
        L_0x007b:
            r12 = 1
        L_0x007c:
            r4 = 1
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x008a
            com.google.android.apps.search.googleapp.googleappbrowser.aa r4 = new com.google.android.apps.search.googleapp.googleappbrowser.aa     // Catch:{ all -> 0x00f1 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f1 }
            r9.mo55373c(r4)     // Catch:{ all -> 0x00f1 }
        L_0x008a:
            boolean r4 = r6.f101930a     // Catch:{ all -> 0x00f1 }
            if (r4 != 0) goto L_0x0096
            com.google.android.apps.search.googleapp.googleappbrowser.al r4 = new com.google.android.apps.search.googleapp.googleappbrowser.al     // Catch:{ all -> 0x00f1 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f1 }
            r9.mo55373c(r4)     // Catch:{ all -> 0x00f1 }
        L_0x0096:
            if (r12 != 0) goto L_0x00a8
            com.google.android.apps.search.googleapp.googleappbrowser.at r12 = new com.google.android.apps.search.googleapp.googleappbrowser.at     // Catch:{ all -> 0x00f1 }
            r12.<init>(r3)     // Catch:{ all -> 0x00f1 }
            r9.mo55373c(r12)     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.search.googleapp.googleappbrowser.au r12 = new com.google.android.apps.search.googleapp.googleappbrowser.au     // Catch:{ all -> 0x00f1 }
            r12.<init>(r3)     // Catch:{ all -> 0x00f1 }
            r9.mo55373c(r12)     // Catch:{ all -> 0x00f1 }
        L_0x00a8:
            com.google.common.b.ij r12 = r9.mo55486f()     // Catch:{ all -> 0x00f1 }
            dagger.p5294a.C68225k.m98532d(r12)     // Catch:{ all -> 0x00f1 }
            r1.<init>(r2, r12)     // Catch:{ all -> 0x00f1 }
            r11.f370462a = r1     // Catch:{ all -> 0x00f1 }
            androidx.lifecycle.o r12 = super.getLifecycle()     // Catch:{ all -> 0x00f1 }
            com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle r1 = new com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle     // Catch:{ all -> 0x00f1 }
            com.google.apps.tiktok.tracing.ab r2 = r11.f122869b     // Catch:{ all -> 0x00f1 }
            androidx.lifecycle.x r3 = r11.f370464d     // Catch:{ all -> 0x00f1 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00f1 }
            r12.mo5790b(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00ce
        L_0x00c5:
            r12 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
            r0.<init>(r1, r12)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00ce:
            android.support.v4.app.Fragment r12 = r11.getParentFragment()     // Catch:{ all -> 0x00f1 }
            boolean r1 = r12 instanceof com.google.apps.tiktok.tracing.C47570bu     // Catch:{ all -> 0x00f1 }
            if (r1 == 0) goto L_0x00e5
            com.google.apps.tiktok.tracing.ab r1 = r11.f122869b     // Catch:{ all -> 0x00f1 }
            com.google.apps.tiktok.tracing.ey r2 = r1.f123354b     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x00e5
            com.google.apps.tiktok.tracing.bu r12 = (com.google.apps.tiktok.tracing.C47570bu) r12     // Catch:{ all -> 0x00f1 }
            com.google.apps.tiktok.tracing.ey r12 = r12.mo17859g()     // Catch:{ all -> 0x00f1 }
            r1.mo51380h(r12, r0)     // Catch:{ all -> 0x00f1 }
        L_0x00e5:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x00e9:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "A Fragment cannot be attached more than once. Instead, create a new Fragment instance."
            r12.<init>(r0)     // Catch:{ all -> 0x00f1 }
            throw r12     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r12 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00f6 }
            goto L_0x00fa
        L_0x00f6:
            r0 = move-exception
            com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136025d.m220864a(r12, r0)
        L_0x00fa:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136026e.onAttach(android.content.Context):void");
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

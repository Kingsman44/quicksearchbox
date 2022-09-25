package com.google.android.apps.search.googleapp.search.srp.error;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10318i.C136213b;
import com.google.android.apps.search.googleapp.p10318i.C136225n;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.l */
/* compiled from: PG */
public final class C137813l extends C137827z implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137821t f374938a;

    /* renamed from: c */
    private Context f374939c;

    /* renamed from: d */
    private final C2393x f374940d = new C2393x(this);

    /* renamed from: e */
    private boolean f374941e;

    @Deprecated
    public C137813l() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137821t mo17754z() {
        C137821t tVar = this.f374938a;
        if (tVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374941e) {
            return tVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113977b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374939c == null) {
            this.f374939c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374939c;
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
        return this.f374940d;
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
            C137812k.m224040a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51119t(r6, r7, r8)     // Catch:{ all -> 0x00a9 }
            com.google.android.apps.search.googleapp.search.srp.error.t r8 = r5.mo17754z()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "parent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "ErrorCardKtFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)     // Catch:{ all -> 0x00a9 }
            r1 = 2131625277(0x7f0e053d, float:1.8877757E38)
            r2 = 0
            android.view.View r7 = r6.inflate(r1, r7, r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            p5462h.p5473f.p5475b.C69664n.m101059e(r7, r1)     // Catch:{ all -> 0x00a2 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x00a2 }
            com.google.android.libraries.web.contrib.errorpage.s r1 = r8.f374955e     // Catch:{ all -> 0x00a2 }
            com.google.android.libraries.web.contrib.errorpage.q r2 = new com.google.android.libraries.web.contrib.errorpage.q     // Catch:{ all -> 0x00a2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.googleapp.search.srp.error.q r1 = com.google.android.apps.search.googleapp.search.srp.error.C137818q.f374947a     // Catch:{ all -> 0x00a2 }
            r2.mo46589d(r1)     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.googleapp.search.srp.error.r r1 = com.google.android.apps.search.googleapp.search.srp.error.C137819r.f374948a     // Catch:{ all -> 0x00a2 }
            r2.mo46588c(r1)     // Catch:{ all -> 0x00a2 }
            r2.mo46590e()     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.googleapp.search.srp.error.s r1 = new com.google.android.apps.search.googleapp.search.srp.error.s     // Catch:{ all -> 0x00a2 }
            r1.<init>(r8)     // Catch:{ all -> 0x00a2 }
            r2.f113658c = r1     // Catch:{ all -> 0x00a2 }
            r2.mo46586a()     // Catch:{ all -> 0x00a2 }
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            p5462h.p5473f.p5475b.C69664n.m101059e(r8, r1)     // Catch:{ all -> 0x00a2 }
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8     // Catch:{ all -> 0x00a2 }
            android.content.Context r1 = r6.getContext()     // Catch:{ all -> 0x00a2 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x00a2 }
            r2 = 2131168632(0x7f070d78, float:1.7951571E38)
            int r1 = r1.getDimensionPixelSize(r2)     // Catch:{ all -> 0x00a2 }
            r8.topMargin = r1     // Catch:{ all -> 0x00a2 }
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch:{ all -> 0x00a2 }
            r1.<init>()     // Catch:{ all -> 0x00a2 }
            android.content.Context r2 = r6.getContext()     // Catch:{ all -> 0x00a2 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x00a2 }
            r3 = 2131168630(0x7f070d76, float:1.7951567E38)
            r4 = 1
            r2.getValue(r3, r1, r4)     // Catch:{ all -> 0x00a2 }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x00a2 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00a2 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x00a2 }
            int r6 = r6.widthPixels     // Catch:{ all -> 0x00a2 }
            float r6 = (float) r6     // Catch:{ all -> 0x00a2 }
            float r1 = r1.getFloat()     // Catch:{ all -> 0x00a2 }
            float r6 = r6 * r1
            double r1 = (double) r6     // Catch:{ all -> 0x00a2 }
            double r1 = java.lang.Math.rint(r1)     // Catch:{ all -> 0x00a2 }
            float r6 = (float) r1     // Catch:{ all -> 0x00a2 }
            int r6 = (int) r6     // Catch:{ all -> 0x00a2 }
            r8.width = r6     // Catch:{ all -> 0x00a2 }
            r7.setLayoutParams(r8)     // Catch:{ all -> 0x00a2 }
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r6)     // Catch:{ all -> 0x00a9 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r7
        L_0x00a2:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)     // Catch:{ all -> 0x00a9 }
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r7 = move-exception
            com.google.android.apps.search.googleapp.search.srp.error.C137812k.m224040a(r6, r7)
        L_0x00b2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.error.C137813l.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374941e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137812k.m224040a(th, th);
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
            C137812k.m224040a(th, th);
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
            if (!this.f374941e) {
                super.onAttach(context);
                if (this.f374938a == null) {
                    Object jN = mo113988d().mo17653jN();
                    boolean kk = ((C74176nj) jN).f206730b.f198027a.mo67123kk();
                    C136213b cb = ((C74176nj) jN).mo69585cb();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137813l) {
                        C137813l lVar = (C137813l) fragment;
                        C68225k.m98532d(lVar);
                        this.f374938a = new C137821t(kk, cb, lVar, ((C74176nj) jN).mo69586cc(), ((C74176nj) jN).mo69720fD(), ((C74176nj) jN).mo69642df(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C74176nj) jN).mo69795gZ(), new C136225n(((C74176nj) jN).mo69795gZ()), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374940d));
                    } else {
                        String obj = C137821t.class.toString();
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
                C137812k.m224040a(th, th2);
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

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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.b */
/* compiled from: PG */
public final class C137803b extends C137826y implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137811j f374912a;

    /* renamed from: c */
    private Context f374913c;

    /* renamed from: d */
    private final C2393x f374914d = new C2393x(this);

    /* renamed from: e */
    private boolean f374915e;

    @Deprecated
    public C137803b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137811j mo17754z() {
        C137811j jVar = this.f374912a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374915e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113968b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374913c == null) {
            this.f374913c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374913c;
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
        return this.f374914d;
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
            C137802a.m224024a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            com.google.apps.tiktok.tracing.ab r0 = r6.f122869b
            r0.mo51381i()
            r6.mo51119t(r7, r8, r9)     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.googleapp.search.srp.error.j r9 = r6.mo17754z()     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "ErrorCardFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)     // Catch:{ all -> 0x00a6 }
            r1 = 2131625277(0x7f0e053d, float:1.8877757E38)
            r2 = 1
            r3 = 0
            android.view.View r8 = r7.inflate(r1, r8, r3)     // Catch:{ all -> 0x008a }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x008a }
            com.google.android.libraries.web.contrib.errorpage.s r1 = r9.f374928e     // Catch:{ all -> 0x008a }
            com.google.android.libraries.web.contrib.errorpage.q r4 = new com.google.android.libraries.web.contrib.errorpage.q     // Catch:{ all -> 0x008a }
            r4.<init>(r1)     // Catch:{ all -> 0x008a }
            com.google.android.apps.search.googleapp.search.srp.error.d r1 = com.google.android.apps.search.googleapp.search.srp.error.C137805d.f374918a     // Catch:{ all -> 0x008a }
            r4.mo46589d(r1)     // Catch:{ all -> 0x008a }
            com.google.android.apps.search.googleapp.search.srp.error.e r1 = com.google.android.apps.search.googleapp.search.srp.error.C137806e.f374919a     // Catch:{ all -> 0x008a }
            r4.mo46588c(r1)     // Catch:{ all -> 0x008a }
            r4.mo46590e()     // Catch:{ all -> 0x008a }
            com.google.android.apps.search.googleapp.search.srp.error.f r1 = new com.google.android.apps.search.googleapp.search.srp.error.f     // Catch:{ all -> 0x008a }
            r1.<init>(r9)     // Catch:{ all -> 0x008a }
            r4.f113658c = r1     // Catch:{ all -> 0x008a }
            r4.mo46586a()     // Catch:{ all -> 0x008a }
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()     // Catch:{ all -> 0x008a }
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9     // Catch:{ all -> 0x008a }
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x008a }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x008a }
            r4 = 2131168632(0x7f070d78, float:1.7951571E38)
            int r1 = r1.getDimensionPixelSize(r4)     // Catch:{ all -> 0x008a }
            r9.topMargin = r1     // Catch:{ all -> 0x008a }
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch:{ all -> 0x008a }
            r1.<init>()     // Catch:{ all -> 0x008a }
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x008a }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x008a }
            r5 = 2131168630(0x7f070d76, float:1.7951567E38)
            r4.getValue(r5, r1, r2)     // Catch:{ all -> 0x008a }
            android.content.Context r7 = r7.getContext()     // Catch:{ all -> 0x008a }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x008a }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x008a }
            int r7 = r7.widthPixels     // Catch:{ all -> 0x008a }
            float r7 = (float) r7     // Catch:{ all -> 0x008a }
            float r1 = r1.getFloat()     // Catch:{ all -> 0x008a }
            float r7 = r7 * r1
            int r7 = java.lang.Math.round(r7)     // Catch:{ all -> 0x008a }
            r9.width = r7     // Catch:{ all -> 0x008a }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x008a }
            r0.close()     // Catch:{ all -> 0x00a6 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r8
        L_0x008a:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x008f }
            goto L_0x00a5
        L_0x008f:
            r8 = move-exception
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00a5 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r9[r3] = r0     // Catch:{ Exception -> 0x00a5 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r9 = r0.getDeclaredMethod(r1, r9)     // Catch:{ Exception -> 0x00a5 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a5 }
            r0[r3] = r8     // Catch:{ Exception -> 0x00a5 }
            r9.invoke(r7, r0)     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r7 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r8 = move-exception
            com.google.android.apps.search.googleapp.search.srp.error.C137802a.m224024a(r7, r8)
        L_0x00af:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.error.C137803b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374915e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137802a.m224024a(th, th);
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
            C137802a.m224024a(th, th);
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
            if (!this.f374915e) {
                super.onAttach(context);
                if (this.f374912a == null) {
                    Object jN = mo113986d().mo17653jN();
                    boolean kk = ((C74176nj) jN).f206730b.f198027a.mo67123kk();
                    C136213b cb = ((C74176nj) jN).mo69585cb();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137803b) {
                        C137803b bVar = (C137803b) fragment;
                        C68225k.m98532d(bVar);
                        this.f374912a = new C137811j(kk, cb, bVar, ((C74176nj) jN).mo69586cc(), ((C74176nj) jN).mo69720fD(), ((C74176nj) jN).mo69642df(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C74176nj) jN).mo69795gZ(), new C136225n(((C74176nj) jN).mo69795gZ()), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374914d));
                    } else {
                        String obj = C137811j.class.toString();
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
                C137802a.m224024a(th, th2);
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

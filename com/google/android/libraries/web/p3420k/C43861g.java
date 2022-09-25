package com.google.android.libraries.web.p3420k;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.browser.internal.C43297i;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43332ah;
import com.google.android.libraries.web.p3428m.C43946w;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.k.g */
/* compiled from: PG */
public final class C43861g extends C43858d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f114305a = new C2393x(this);

    /* renamed from: b */
    private C43870p f114306b;

    /* renamed from: c */
    private Context f114307c;

    /* renamed from: d */
    private final C47515ab f114308d = new C47515ab(this);

    /* renamed from: e */
    private boolean f114309e;

    @Deprecated
    public C43861g() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo46867b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f114307c == null) {
            this.f114307c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f114307c;
    }

    /* renamed from: f */
    public final C43870p mo17754z() {
        C43870p pVar = this.f114306b;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f114309e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f114308d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f114305a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f114308d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f114308d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f114308d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f114308d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f114308d.mo51381i();
        try {
            super.onCreate(bundle);
            C43870p f = mo17754z();
            if (bundle != null) {
                if (bundle.containsKey("first_request_received")) {
                    ((C43332ah) f.f114325g.mo47072a(C43332ah.class)).f113196a = bundle.getBoolean("first_request_received");
                }
                C43756o.m77265a(f.f114319a).f114096e = bundle.getBoolean("restored_waiting_for_initial_url");
            }
            if (f.f114323e.mo46384b().f112970i) {
                f.f114320b.mo51124s().mo3339b(f.f114319a, new C43865k(f));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f114308d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            com.google.apps.tiktok.tracing.ab r0 = r6.f114308d
            r0.mo51381i()
            super.onCreateView(r7, r8, r9)     // Catch:{ all -> 0x00aa }
            com.google.android.libraries.web.k.p r0 = r6.mo17754z()     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "WebFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r1)     // Catch:{ all -> 0x00aa }
            com.google.android.libraries.web.k.b.a r2 = r0.f114326h     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.a r2 = r2.mo46855b()     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.internal.C43309u.m76408a(r2)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.g r2 = r0.f114319a     // Catch:{ all -> 0x00a3 }
            androidx.lifecycle.x r2 = r2.f114305a     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.internal.CoreBrowserController$onWebFragmentCreated$1 r3 = new com.google.android.libraries.web.browser.internal.CoreBrowserController$onWebFragmentCreated$1     // Catch:{ all -> 0x00a3 }
            r3.<init>()     // Catch:{ all -> 0x00a3 }
            r2.mo5790b(r3)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.g r2 = r0.f114319a     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal r2 = com.google.android.libraries.web.coordinator.internal.fragment.C43756o.m77265a(r2)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.b.a r3 = r0.f114326h     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.a r3 = r3.mo46855b()     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.internal.t r3 = com.google.android.libraries.web.browser.internal.C43309u.m76408a(r3)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.a r3 = r3.f113152b     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.browser.internal.a.b r3 = com.google.android.libraries.web.browser.internal.p3352a.C43284c.m76381a(r3)     // Catch:{ all -> 0x00a3 }
            boolean r3 = r3.mo46396d()     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.b.a r4 = r0.f114326h     // Catch:{ all -> 0x00a3 }
            android.view.View r7 = r4.mo46854a(r7, r8, r9)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.logging.ve.af r8 = r0.f114322d     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.logging.ve.ab r8 = r8.f76997b     // Catch:{ all -> 0x00a3 }
            r4 = 89132(0x15c2c, float:1.249E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.logging.ve.c r8 = r8.mo33800a(r4)     // Catch:{ all -> 0x00a3 }
            r8.mo33809b(r7)     // Catch:{ all -> 0x00a3 }
            if (r3 != 0) goto L_0x007e
            if (r9 != 0) goto L_0x0073
            java.lang.String r8 = r0.f114321c     // Catch:{ all -> 0x00a3 }
            int r8 = r8.length()     // Catch:{ all -> 0x00a3 }
            if (r8 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            com.google.android.libraries.web.k.l r8 = new com.google.android.libraries.web.k.l     // Catch:{ all -> 0x00a3 }
            r8.<init>(r0)     // Catch:{ all -> 0x00a3 }
            r0.f114329k = r8     // Catch:{ all -> 0x00a3 }
            goto L_0x007e
        L_0x0073:
            if (r9 == 0) goto L_0x007e
            boolean r8 = r2.f114096e     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.m r4 = new com.google.android.libraries.web.k.m     // Catch:{ all -> 0x00a3 }
            r4.<init>(r9, r0, r8)     // Catch:{ all -> 0x00a3 }
            r0.f114329k = r4     // Catch:{ all -> 0x00a3 }
        L_0x007e:
            android.support.v4.app.Fragment r8 = r0.f114330l     // Catch:{ all -> 0x00a3 }
            r4 = 0
            if (r8 == 0) goto L_0x0088
            r0.mo46874b(r8)     // Catch:{ all -> 0x00a3 }
            r0.f114330l = r4     // Catch:{ all -> 0x00a3 }
        L_0x0088:
            r8 = 0
            if (r3 != 0) goto L_0x008f
            if (r9 == 0) goto L_0x008f
            r9 = 1
            goto L_0x0090
        L_0x008f:
            r9 = 0
        L_0x0090:
            com.google.android.libraries.web.k.b.a r3 = r0.f114326h     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.web.k.n r5 = new com.google.android.libraries.web.k.n     // Catch:{ all -> 0x00a3 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x00a3 }
            r3.mo46860g(r9, r5)     // Catch:{ all -> 0x00a3 }
            r2.f114096e = r8     // Catch:{ all -> 0x00a3 }
            p5462h.p5472e.C69598b.m101013a(r1, r4)     // Catch:{ all -> 0x00aa }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r7
        L_0x00a3:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r7)     // Catch:{ all -> 0x00aa }
            throw r8     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r7 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r8 = move-exception
            com.google.android.libraries.web.p3420k.C43860f.m77425a(r7, r8)
        L_0x00b3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.p3420k.C43861g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C47573bx b = this.f114308d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f114308d.mo51375c();
        try {
            super.onDestroyView();
            C43870p f = mo17754z();
            f.f114329k = null;
            f.f114326h.mo46856c();
            C43756o.m77265a(f.f114319a).f114099h = null;
            c.close();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f114308d.mo51376d();
        try {
            super.onDetach();
            this.f114309e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f114308d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f114308d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f114308d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f114308d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f114308d.mo51381i();
        try {
            C43870p f = mo17754z();
            C69664n.m101061g(bundle, "outState");
            f.f114326h.mo46857d(bundle);
            Object orElse = C43946w.m77584a(C43309u.m76408a(f.f114326h.mo46855b()).f113155e).map(C43297i.f113113a).orElse(false);
            C69664n.m101060f(orElse, "windowsManager.activeWin…-1 }\n      .orElse(false)");
            if (!((Boolean) orElse).booleanValue()) {
                C43367l lVar = f.f114324f.mo46468a().f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                String str = lVar.f113296b;
                C69664n.m101060f(str, "webStateDataService.webS…pendingRequest.currentUrl");
                if (!f.f114323e.mo46384b().f112978q) {
                    if (str.length() != 0) {
                        bundle.putString("restored_initial_url", str);
                    }
                }
                if (f.f114328j) {
                    bundle.putBoolean("restored_waiting_for_initial_url", true);
                }
            }
            bundle.putBoolean("first_request_received", ((C43332ah) f.f114325g.mo47072a(C43332ah.class)).f113196a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f114308d.mo51381i();
        try {
            super.onStart();
            C43870p f = mo17754z();
            f.f114326h.mo46858e();
            C69615a aVar = f.f114329k;
            if (aVar != null) {
                C43756o.m77265a(f.f114319a).mo46775b(new C43869o(aVar));
                f.f114329k = null;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f114308d.mo51381i();
        try {
            super.onStop();
            mo17754z().f114326h.mo46859f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43860f.m77425a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f114308d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f114308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f114308d.mo51381i();
        try {
            if (!this.f114309e) {
                super.onAttach(context);
                if (this.f114306b == null) {
                    this.f114306b = ((C43871q) mo46866a().mo17653jN()).mo46877gM();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f114308d, this.f114305a));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f114308d;
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
                C43860f.m77425a(th, th2);
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

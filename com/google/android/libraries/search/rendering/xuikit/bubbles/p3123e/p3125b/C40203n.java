package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.p4283bv.p4287b.p4342b.C56943g;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.n */
/* compiled from: PG */
public final class C40203n extends C40196g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C40208s f105626a;

    /* renamed from: c */
    private Context f105627c;

    /* renamed from: d */
    private final C2393x f105628d = new C2393x(this);

    /* renamed from: e */
    private boolean f105629e;

    @Deprecated
    public C40203n() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo42309b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f105627c == null) {
            this.f105627c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f105627c;
    }

    /* renamed from: f */
    public final C40208s mo17754z() {
        C40208s sVar = this.f105626a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f105629e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f105628d;
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
            C40202m.m69804a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0127, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0128, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        com.google.apps.tiktok.tracing.C47831fm.m85019n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012e, code lost:
        com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40202m.m69804a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0132, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            com.google.apps.tiktok.tracing.ab r2 = r1.f122869b
            r2.mo51381i()
            r18.mo51119t(r19, r20, r21)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r2 = r18.mo17754z()     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)     // Catch:{ all -> 0x0127 }
            r3 = 2131624465(0x7f0e0211, float:1.887611E38)
            r4 = 0
            r5 = r20
            android.view.View r0 = r0.inflate(r3, r5, r4)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.n r3 = r2.f105642d     // Catch:{ all -> 0x0127 }
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()     // Catch:{ all -> 0x0127 }
            android.support.v4.app.a r5 = new android.support.v4.app.a     // Catch:{ all -> 0x0127 }
            r5.<init>((android.support.p031v4.app.FragmentManager) r3)     // Catch:{ all -> 0x0127 }
            com.google.apps.tiktok.account.AccountId r3 = r2.f105641c     // Catch:{ all -> 0x0127 }
            android.support.v4.app.Fragment r3 = com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40539h.m70274a(r3)     // Catch:{ all -> 0x0127 }
            java.lang.String r6 = "XBlendFragment"
            r7 = 2131437239(0x7f0b26b7, float:1.8496371E38)
            r5.mo689v(r7, r3, r6)     // Catch:{ all -> 0x0127 }
            r5.mo509f()     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.q r3 = r2.f105640b     // Catch:{ all -> 0x0127 }
            com.google.bv.b.b.g r3 = r3.f105635c     // Catch:{ all -> 0x0127 }
            if (r3 != 0) goto L_0x0043
            com.google.bv.b.b.g r3 = com.google.p4283bv.p4287b.p4342b.C56943g.f151982f     // Catch:{ all -> 0x0127 }
        L_0x0043:
            java.lang.String r5 = "params.address"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ all -> 0x0127 }
            r2.f105650l = r3     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.q r3 = r2.f105640b     // Catch:{ all -> 0x0127 }
            int r3 = r3.f105637e     // Catch:{ all -> 0x0127 }
            int r3 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40195f.m69792a(r3)     // Catch:{ all -> 0x0127 }
            if (r3 != 0) goto L_0x0056
            goto L_0x0110
        L_0x0056:
            r5 = 2
            if (r3 != r5) goto L_0x0110
            com.google.bv.b.b.g r3 = r2.f105650l     // Catch:{ all -> 0x0127 }
            r5 = 0
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = "address"
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ all -> 0x0127 }
            r3 = r5
        L_0x0064:
            java.lang.String r6 = r3.f151985b     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = "xBlendAddress.path"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x0127 }
            int r6 = r6.length()     // Catch:{ all -> 0x0127 }
            if (r6 == 0) goto L_0x0123
            com.google.apps.tiktok.dataservice.dp r14 = r2.f105644f     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.h r15 = r2.f105645g     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.c.d r13 = r2.f105651m     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.n r6 = r2.f105642d     // Catch:{ all -> 0x0127 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x0127 }
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x0127 }
            android.os.LocaleList r6 = r6.getLocales()     // Catch:{ all -> 0x0127 }
            java.util.Locale r10 = r6.get(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "{\n        configuration.locales[0]\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)     // Catch:{ all -> 0x0127 }
            j$.util.Optional r11 = r2.f105643e     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.q r4 = r2.f105640b     // Catch:{ all -> 0x0127 }
            com.google.protobuf.dn r4 = r4.f105636d     // Catch:{ all -> 0x0127 }
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "params.queryParametersMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "xBlendAddress"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "authTokenProviderOptional"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "queryParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.a r4 = r15.f105587c     // Catch:{ all -> 0x0127 }
            java.lang.Object r6 = r4.f105565c     // Catch:{ all -> 0x0127 }
            monitor-enter(r6)     // Catch:{ all -> 0x0127 }
            java.util.HashMap r7 = r4.f105566d     // Catch:{ all -> 0x010d }
            boolean r7 = r7.containsKey(r13)     // Catch:{ all -> 0x010d }
            if (r7 != 0) goto L_0x00cc
            java.util.HashMap r4 = r4.f105566d     // Catch:{ all -> 0x010d }
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x010d }
            java.lang.String r8 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x010d }
            r4.put(r13, r7)     // Catch:{ all -> 0x010d }
        L_0x00cc:
            monitor-exit(r6)     // Catch:{ all -> 0x0127 }
            kotlinx.coroutines.aw r4 = r15.f105585a     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.f r9 = new com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.f     // Catch:{ all -> 0x0127 }
            r16 = 0
            r6 = r9
            r7 = r15
            r8 = r13
            r17 = r9
            r9 = r3
            r1 = r13
            r13 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.g r6 = new com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.g     // Catch:{ all -> 0x0127 }
            r6.<init>(r15, r1, r5)     // Catch:{ all -> 0x0127 }
            com.google.apps.tiktok.dataservice.ah r1 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40190h.m69784b(r1)     // Catch:{ all -> 0x0127 }
            r5 = r17
            com.google.apps.tiktok.dataservice.ag r1 = com.google.apps.tiktok.dataservice.p3637b.C46716g.m83256a(r4, r5, r6, r1)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.r r4 = new com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.r     // Catch:{ all -> 0x0127 }
            r4.<init>(r2)     // Catch:{ all -> 0x0127 }
            r14.mo50707a(r1, r4)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.d.f.k r1 = r2.f105648j     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r3.f151985b     // Catch:{ all -> 0x0127 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "parse(xBlendAddress.path)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.search.rendering.xuikit.d.f.k r1 = r1.mo42415b(r2)     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = "XBlend.Container.Request"
            r1.mo42416c(r2)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x010d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0110:
            java.lang.String r1 = "fragmentRootView"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x0127 }
            r1 = 2131437249(0x7f0b26c1, float:1.8496391E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0123
            r2 = 8
            r1.setVisibility(r2)     // Catch:{ all -> 0x0127 }
        L_0x0123:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r0
        L_0x0127:
            r0 = move-exception
            r1 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x012d }
            goto L_0x0132
        L_0x012d:
            r0 = move-exception
            r2 = r0
            com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40202m.m69804a(r1, r2)
        L_0x0132:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40203n.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f105629e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C40202m.m69804a(th, th);
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
            C40202m.m69804a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C40208s f = mo17754z();
            C56943g gVar = f.f105640b.f105635c;
            if (gVar == null) {
                gVar = C56943g.f151982f;
            }
            String str = gVar.f151985b;
            C69664n.m101060f(str, "params.address.path");
            if (str.length() == 0) {
                C40208s.m69817j(f);
                C40208s.m69818l(f);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C40202m.m69804a(th, th);
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
            if (!this.f105629e) {
                super.onAttach(context);
                if (this.f105626a == null) {
                    this.f105626a = ((C40209t) mo42308a().mo17653jN()).mo42321eZ();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f105628d));
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
                C40202m.m69804a(th, th2);
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

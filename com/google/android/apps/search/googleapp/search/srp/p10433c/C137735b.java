package com.google.android.apps.search.googleapp.search.srp.p10433c;

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
import com.google.android.apps.search.googleapp.p10257g.C135449v;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135396m;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135401r;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58733pz;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.b */
/* compiled from: PG */
public final class C137735b extends C137745k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137737d f374667a;

    /* renamed from: c */
    private Context f374668c;

    /* renamed from: d */
    private final C2393x f374669d = new C2393x(this);

    /* renamed from: e */
    private boolean f374670e;

    @Deprecated
    public C137735b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137737d mo17754z() {
        C137737d dVar = this.f374667a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374670e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113935b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374668c == null) {
            this.f374668c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374668c;
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
        return this.f374669d;
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
            C137734a.m223887a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            com.google.apps.tiktok.tracing.ab r0 = r4.f122869b
            r0.mo51381i()
            r4.mo51119t(r5, r6, r7)     // Catch:{ all -> 0x00a0 }
            com.google.android.apps.search.googleapp.search.srp.c.d r7 = r4.mo17754z()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "DoodleFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)     // Catch:{ all -> 0x00a0 }
            r1 = 2131625367(0x7f0e0597, float:1.887794E38)
            r2 = 0
            android.view.View r5 = r5.inflate(r1, r6, r2)     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.ab r6 = r7.f374682k     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.af r1 = r7.f374683l     // Catch:{ all -> 0x0099 }
            r2 = 26518(0x6796, float:3.716E-41)
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.c r1 = r1.mo33805a(r2)     // Catch:{ all -> 0x0099 }
            r6.mo33801b(r5, r1)     // Catch:{ all -> 0x0099 }
            r6 = 2131431520(0x7f0b1060, float:1.8484772E38)
            android.view.View r6 = r5.findViewById(r6)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "root.findViewById(R.id.googleapp_doodle)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x0099 }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.ab r1 = r7.f374682k     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.af r2 = r7.f374683l     // Catch:{ all -> 0x0099 }
            r3 = 61
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x0099 }
            r1.mo33801b(r6, r2)     // Catch:{ all -> 0x0099 }
            r6 = 2131431686(0x7f0b1106, float:1.8485108E38)
            android.view.View r6 = r5.findViewById(r6)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "root.findViewById(R.id.googleapp_logo)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.ab r1 = r7.f374682k     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.af r2 = r7.f374683l     // Catch:{ all -> 0x0099 }
            r3 = 59
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x0099 }
            r1.mo33801b(r6, r2)     // Catch:{ all -> 0x0099 }
            boolean r6 = r7.f374684m     // Catch:{ all -> 0x0099 }
            if (r6 != 0) goto L_0x007d
            com.google.apps.tiktok.dataservice.dp r6 = r7.f374680i     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.googleapp.g.a.r r1 = r7.f374676e     // Catch:{ all -> 0x0099 }
            com.google.apps.tiktok.dataservice.ag r1 = r1.mo112308d()     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.googleapp.search.srp.c.d$a r2 = r7.f374686o     // Catch:{ all -> 0x0099 }
            r6.mo50707a(r1, r2)     // Catch:{ all -> 0x0099 }
        L_0x007d:
            com.google.android.apps.search.googleapp.startup.appinteractive.f r6 = r7.f374675d     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.googleapp.search.srp.c.e r1 = new com.google.android.apps.search.googleapp.search.srp.c.e     // Catch:{ all -> 0x0099 }
            r1.<init>(r7)     // Catch:{ all -> 0x0099 }
            r6.mo115167b(r1)     // Catch:{ all -> 0x0099 }
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r6)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x0091
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r5
        L_0x0091:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "Fragment cannot use Event annotations with null view!"
            r5.<init>(r6)     // Catch:{ all -> 0x00a0 }
            throw r5     // Catch:{ all -> 0x00a0 }
        L_0x0099:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r6 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r5)     // Catch:{ all -> 0x00a0 }
            throw r6     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r5 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r6 = move-exception
            com.google.android.apps.search.googleapp.search.srp.p10433c.C137734a.m223887a(r5, r6)
        L_0x00a9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10433c.C137735b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374670e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137734a.m223887a(th, th);
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
            C137734a.m223887a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_logo), new C137744j(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137734a.m223887a(th, th);
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
            if (!this.f374670e) {
                super.onAttach(context);
                if (this.f374667a == null) {
                    Object jN = mo113939d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 118").mo50907f();
                    C47449e eVar = (C47449e) ((C74176nj) jN).f207092s.mo17428b();
                    C139684f eb = ((C74176nj) jN).mo69691eb();
                    C135401r ca = ((C74176nj) jN).mo69584ca();
                    C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137735b) {
                        C137735b bVar = (C137735b) fragment;
                        C68225k.m98532d(bVar);
                        C135449v bZ = ((C74176nj) jN).mo69530bZ();
                        C58733pz pzVar = C58733pz.f156496a;
                        C47429i gX = ((C74176nj) jN).mo69793gX();
                        C137737d dVar = r3;
                        C137737d dVar2 = new C137737d(context2, f, eVar, eb, ca, dhVar, bVar, (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), bZ, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66950fQ().mo60836b(), (C135396m) ((C74176nj) jN).f206783c.f205457k.mo17428b(), gX);
                        this.f374667a = dVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374669d));
                    } else {
                        String obj = C137737d.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C137734a.m223887a(th2, th3);
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

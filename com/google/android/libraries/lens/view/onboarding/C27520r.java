package com.google.android.libraries.lens.view.onboarding;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.android.libraries.lens.view.p2078at.C25526i;
import com.google.android.libraries.lens.view.p2078at.C25534q;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.sampleimages.C27699c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.onboarding.r */
/* compiled from: PG */
public final class C27520r extends C27502bh implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27525w f75261a;

    /* renamed from: b */
    private Context f75262b;

    /* renamed from: c */
    private final C2393x f75263c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f75264d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75265e;

    @Deprecated
    public C27520r() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27525w mo17754z() {
        C27525w wVar = this.f75261a;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75265e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33040b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75262b == null) {
            this.f75262b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75262b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75264d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75263c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75264d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75264d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75264d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75264d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f75264d.mo51381i();
        try {
            super.onCreate(bundle);
            C27525w a = mo17754z();
            a.f75281e.mo50429i(a.f75292p);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75264d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5 A[SYNTHETIC, Splitter:B:41:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.ab r0 = r3.f75264d
            r0.mo51381i()
            super.onCreateView(r4, r5, r6)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.onboarding.w r6 = r3.mo17754z()     // Catch:{ all -> 0x00dd }
            r0 = 2131626199(0x7f0e08d7, float:1.8879627E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.logging.ve.ab r5 = r6.f75291o     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.logging.ve.af r0 = r5.f76990a     // Catch:{ all -> 0x00dd }
            r2 = 97316(0x17c24, float:1.36369E-40)
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.logging.ve.c r0 = r0.mo33805a(r2)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.ba.e r2 = r6.f75290n     // Catch:{ all -> 0x00dd }
            com.google.apps.tiktok.account.AccountId r2 = r2.f69824a     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.logging.ve.g r2 = com.google.apps.tiktok.account.p3603a.C45954d.m82060a(r2)     // Catch:{ all -> 0x00dd }
            r0.mo33859g(r2)     // Catch:{ all -> 0x00dd }
            r5.mo33801b(r4, r0)     // Catch:{ all -> 0x00dd }
            boolean r5 = r6.f75288l     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0041
            com.google.android.libraries.lens.view.l.l r5 = r6.f75285i     // Catch:{ all -> 0x00dd }
            com.google.common.base.ax r5 = r5.mo32701h()     // Catch:{ all -> 0x00dd }
            boolean r5 = com.google.lens.p4711m.C62632i.m94823h(r5)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x005b
        L_0x0041:
            com.google.android.libraries.lens.view.d.g r5 = r6.f75278b     // Catch:{ all -> 0x00dd }
            java.lang.Object r0 = r5.mo3842a()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.onboarding.af r0 = (com.google.android.libraries.lens.view.onboarding.C27473af) r0     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.onboarding.ae r0 = r0.mo33009a()     // Catch:{ all -> 0x00dd }
            r2 = 1
            r0.mo33008b(r2)     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.onboarding.af r0 = r0.mo33007a()     // Catch:{ all -> 0x00dd }
            r0.getClass()
            r5.mo5708l(r0)     // Catch:{ all -> 0x00dd }
        L_0x005b:
            android.support.v4.app.Fragment r5 = r6.mo33059a()     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "android.permission.CAMERA"
            if (r5 != 0) goto L_0x00ab
            boolean r5 = r6.mo33074q()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x008b
            boolean r5 = r6.f75288l     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0079
            com.google.android.libraries.lens.view.l.l r5 = r6.f75285i     // Catch:{ all -> 0x00dd }
            com.google.common.base.ax r5 = r5.mo32701h()     // Catch:{ all -> 0x00dd }
            boolean r5 = com.google.lens.p4711m.C62632i.m94823h(r5)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x007d
        L_0x0079:
            r6.mo33072o()     // Catch:{ all -> 0x00dd }
            goto L_0x00a3
        L_0x007d:
            com.google.android.libraries.lens.view.at.w r5 = r6.f75287k     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.u r5 = r5.mo30590a()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.u r0 = com.google.android.libraries.lens.view.p2078at.C25538u.LVF_STARTUP     // Catch:{ all -> 0x00dd }
            if (r5 != r0) goto L_0x00a3
            r6.mo33071n(r1)     // Catch:{ all -> 0x00dd }
            goto L_0x00a3
        L_0x008b:
            r6.mo33060c()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.w r5 = r6.f75287k     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.u r5 = r5.mo30590a()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.u r2 = com.google.android.libraries.lens.view.p2078at.C25538u.LVF_STARTUP     // Catch:{ all -> 0x00dd }
            if (r5 != r2) goto L_0x00a3
            com.google.android.libraries.lens.view.at.aj r5 = r6.f75289m     // Catch:{ all -> 0x00dd }
            boolean r5 = r5.mo30536f(r0)     // Catch:{ all -> 0x00dd }
            if (r5 != 0) goto L_0x00a3
            r6.mo33070m(r1)     // Catch:{ all -> 0x00dd }
        L_0x00a3:
            com.google.android.libraries.search.b.b r5 = r6.f75283g     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98412B     // Catch:{ all -> 0x00dd }
            r5.mo19974a(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cc
        L_0x00ab:
            boolean r5 = r6.mo33074q()     // Catch:{ all -> 0x00dd }
            if (r5 != 0) goto L_0x00cc
            r6.mo33060c()     // Catch:{ all -> 0x00dd }
            com.google.android.libraries.lens.view.at.aj r5 = r6.f75289m     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = r5.mo30532b()     // Catch:{ all -> 0x00dd }
            boolean r5 = r5.mo30536f(r1)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x00cc
            com.google.android.libraries.lens.view.at.aj r5 = r6.f75289m     // Catch:{ all -> 0x00dd }
            boolean r5 = r5.mo30536f(r0)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x00cc
            r6.mo33066i()     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x00cc:
            r6.mo33064g()     // Catch:{ all -> 0x00dd }
        L_0x00cf:
            if (r4 == 0) goto L_0x00d5
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r4
        L_0x00d5:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "Fragment cannot use Event annotations with null view!"
            r4.<init>(r5)     // Catch:{ all -> 0x00dd }
            throw r4     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r4 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00e2 }
            goto L_0x00e6
        L_0x00e2:
            r5 = move-exception
            com.google.android.libraries.lens.view.onboarding.C27519q.m51232a(r4, r5)
        L_0x00e6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.onboarding.C27520r.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C47573bx b = this.f75264d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f75264d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75264d.mo51376d();
        try {
            super.onDetach();
            this.f75265e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75264d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75264d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75264d.mo51381i();
        try {
            super.onPause();
            C27525w a = mo17754z();
            if (!a.f75294r) {
                a.mo33063f(C62722b.CANCELLED);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75264d.mo51377e();
        try {
            super.onResume();
            C27525w a = mo17754z();
            C25504aj ajVar = a.f75289m;
            if (ajVar.mo30536f(ajVar.mo30532b())) {
                a.mo33061d();
            }
            if (a.f75284h.mo30359o() && a.f75289m.mo30536f("android.permission.CAMERA") && (!C62632i.m94823h(a.f75285i.mo32701h()) || a.f75284h.mo30346b() > 0)) {
                a.mo33062e();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75264d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f75264d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75264d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75264d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C27525w a = mo17754z();
            C47393f.m84233d(this, C27483ap.class, new C27527x(a));
            C47393f.m84233d(this, C27474ag.class, new C27528y(a));
            C47393f.m84233d(this, C25526i.class, new C27529z(a));
            C47393f.m84233d(this, C25534q.class, new C27468aa(a));
            C47393f.m84233d(this, C25512ar.class, new C27469ab(a));
            C47393f.m84233d(this, C27699c.class, new C27470ac(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27519q.m51232a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75264d;
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
        C47515ab abVar = this.f75264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75264d;
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
        this.f75264d.mo51381i();
        try {
            if (!this.f75265e) {
                super.onAttach(context);
                if (this.f75261a == null) {
                    Object jN = mo33041d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C27522t tVar = (C27522t) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C27522t.f75266c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(tVar);
                    C21370a aVar = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27520r) {
                        C27520r rVar = (C27520r) fragment;
                        C68225k.m98532d(rVar);
                        this.f75261a = new C27525w(accountId, activity, tVar, aVar, rVar, (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b(), (C25540w) ((C74176nj) jN).f206836d.f205269ak.mo17428b(), (C25758g) ((C74176nj) jN).f206836d.f205279au.mo17428b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199555hI.mo17428b()).booleanValue(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f75264d, this.f75263c));
                    } else {
                        String obj = C27525w.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f75264d;
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
                C27519q.m51232a(th2, th3);
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

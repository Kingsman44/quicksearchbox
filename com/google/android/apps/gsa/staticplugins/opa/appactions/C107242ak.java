package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.appactions.C73829p;
import com.google.android.apps.gsa.assistant.shared.appactions.C73830q;
import com.google.android.apps.gsa.assistant.shared.appactions.ErrorStatesLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107290n;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ak */
/* compiled from: PG */
public final class C107242ak extends C107252au implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C107247ap f298492a;

    /* renamed from: c */
    private Context f298493c;

    /* renamed from: d */
    private final C2393x f298494d = new C2393x(this);

    /* renamed from: e */
    private boolean f298495e;

    @Deprecated
    public C107242ak() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C107242ak m178031a(C107273d dVar) {
        C107242ak akVar = new C107242ak();
        C68324h.m98669f(akVar);
        C47243l.m84039a(akVar, dVar);
        return akVar;
    }

    /* renamed from: b */
    public final C107247ap mo17754z() {
        C107247ap apVar = this.f298492a;
        if (apVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f298495e) {
            return apVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo95869d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f298493c == null) {
            this.f298493c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f298493c;
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
        return this.f298494d;
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
            C107241aj.m178030a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C107247ap b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            b.f298502c.mo50429i(b.f298509j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107241aj.m178030a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[Catch:{ all -> 0x0105, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A[Catch:{ all -> 0x0105, all -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51119t(r6, r7, r8)     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.ap r8 = r5.mo17754z()     // Catch:{ all -> 0x0105 }
            r0 = 2131625074(0x7f0e0472, float:1.8877346E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r7, r1)     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r7 = r8.f298501b     // Catch:{ all -> 0x0105 }
            int r0 = r7.f298574a     // Catch:{ all -> 0x0105 }
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.a r0 = r8.f298505f     // Catch:{ all -> 0x0105 }
            com.google.android.libraries.search.assistant.proactive.f.d r7 = r7.f298575b     // Catch:{ all -> 0x0105 }
            if (r7 != 0) goto L_0x0024
            com.google.android.libraries.search.assistant.proactive.f.d r7 = com.google.android.libraries.search.assistant.proactive.p2774f.C36265d.f94713k     // Catch:{ all -> 0x0105 }
        L_0x0024:
            com.google.android.apps.gsa.staticplugins.opa.appactions.i r7 = r0.mo95896a(r7)     // Catch:{ all -> 0x0105 }
            goto L_0x00e2
        L_0x002a:
            com.google.android.apps.gsa.staticplugins.opa.appactions.h r7 = com.google.android.apps.gsa.staticplugins.opa.appactions.C107308i.m178129a()     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r0.f298576c     // Catch:{ all -> 0x0105 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0105 }
            r2 = r7
            com.google.android.apps.gsa.staticplugins.opa.appactions.ah r2 = (com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah) r2     // Catch:{ all -> 0x0105 }
            r2.f298466c = r0     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.protobuf.z r0 = r0.f298577d     // Catch:{ all -> 0x0105 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0105 }
            r2 = r7
            com.google.android.apps.gsa.staticplugins.opa.appactions.ah r2 = (com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah) r2     // Catch:{ all -> 0x0105 }
            r2.f298465b = r0     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r0.f298578e     // Catch:{ all -> 0x0105 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0105 }
            r2 = r7
            com.google.android.apps.gsa.staticplugins.opa.appactions.ah r2 = (com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah) r2     // Catch:{ all -> 0x0105 }
            r2.f298470g = r0     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            int r2 = r0.f298579f     // Catch:{ all -> 0x0105 }
            int r2 = com.google.assistant.p3825an.p3830c.p3831a.C49255aa.m85393b(r2)     // Catch:{ all -> 0x0105 }
            r3 = 2
            if (r2 != 0) goto L_0x0061
            r2 = 2
        L_0x0061:
            r4 = r7
            com.google.android.apps.gsa.staticplugins.opa.appactions.ah r4 = (com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah) r4     // Catch:{ all -> 0x0105 }
            r4.f298475l = r2     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.bc r0 = r0.f298580g     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x006c
            com.google.assistant.at.bc r0 = com.google.assistant.p3861at.C49845bc.f129538c     // Catch:{ all -> 0x0105 }
        L_0x006c:
            int r2 = r0.f129540a     // Catch:{ all -> 0x0105 }
            java.lang.String r4 = ""
            if (r2 != r1) goto L_0x0077
            java.lang.Object r0 = r0.f129541b     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0105 }
            goto L_0x0078
        L_0x0077:
            r0 = r4
        L_0x0078:
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x009a
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.bc r0 = r0.f298580g     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x0086
            com.google.assistant.at.bc r0 = com.google.assistant.p3861at.C49845bc.f129538c     // Catch:{ all -> 0x0105 }
        L_0x0086:
            int r1 = r0.f129540a     // Catch:{ all -> 0x0105 }
            if (r1 != r3) goto L_0x008f
            java.lang.Object r0 = r0.f129541b     // Catch:{ all -> 0x0105 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0105 }
        L_0x008f:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x009a
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0105 }
            goto L_0x00a6
        L_0x009a:
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.bc r0 = r0.f298580g     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00a2
            com.google.assistant.at.bc r0 = com.google.assistant.p3861at.C49845bc.f129538c     // Catch:{ all -> 0x0105 }
        L_0x00a2:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0105 }
        L_0x00a6:
            r7.mo95849e(r0)     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.ay r0 = r0.f298581h     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00b1
            com.google.assistant.at.ay r0 = com.google.assistant.p3861at.C49840ay.f129512f     // Catch:{ all -> 0x0105 }
        L_0x00b1:
            java.lang.String r0 = r0.f129515b     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00d7
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.ay r0 = r0.f298581h     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00c1
            com.google.assistant.at.ay r0 = com.google.assistant.p3861at.C49840ay.f129512f     // Catch:{ all -> 0x0105 }
        L_0x00c1:
            java.lang.String r0 = r0.f129516c     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00ca
            goto L_0x00d7
        L_0x00ca:
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = r8.f298501b     // Catch:{ all -> 0x0105 }
            com.google.assistant.at.ay r0 = r0.f298581h     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00d2
            com.google.assistant.at.ay r0 = com.google.assistant.p3861at.C49840ay.f129512f     // Catch:{ all -> 0x0105 }
        L_0x00d2:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00db
        L_0x00d7:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0105 }
        L_0x00db:
            r7.mo95848d(r0)     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.i r7 = r7.mo95845a()     // Catch:{ all -> 0x0105 }
        L_0x00e2:
            r8.f298508i = r7     // Catch:{ all -> 0x0105 }
            r7 = 2131430491(0x7f0b0c5b, float:1.8482684E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ all -> 0x0105 }
            com.google.android.apps.gsa.assistant.shared.appactions.ErrorStatesLayout r7 = (com.google.android.apps.gsa.assistant.shared.appactions.ErrorStatesLayout) r7     // Catch:{ all -> 0x0105 }
            r8.f298507h = r7     // Catch:{ all -> 0x0105 }
            com.google.android.libraries.logging.ve.af r7 = r8.f298510k     // Catch:{ all -> 0x0105 }
            com.google.android.libraries.logging.ve.ab r7 = r7.f76997b     // Catch:{ all -> 0x0105 }
            r8 = 108576(0x1a820, float:1.52147E-40)
            com.google.android.libraries.logging.ve.h r8 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r8)     // Catch:{ all -> 0x0105 }
            com.google.android.libraries.logging.ve.c r7 = r7.mo33800a(r8)     // Catch:{ all -> 0x0105 }
            r7.mo33809b(r6)     // Catch:{ all -> 0x0105 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r6
        L_0x0105:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r7 = move-exception
            com.google.android.apps.gsa.staticplugins.opa.appactions.C107241aj.m178030a(r6, r7)
        L_0x010e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appactions.C107242ak.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f298495e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C107241aj.m178030a(th, th);
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
            C107241aj.m178030a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C107247ap b = mo17754z();
            ErrorStatesLayout errorStatesLayout = b.f298507h;
            errorStatesLayout.getClass();
            errorStatesLayout.f195102a = Optional.m71637of(new C107246ao(b));
            TextView textView = (TextView) errorStatesLayout.findViewById(R.id.try_again_button);
            textView.setVisibility(0);
            ((C73830q) errorStatesLayout.f195102a.get()).mo65308b(textView);
            textView.setOnClickListener(new C73829p(errorStatesLayout));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107241aj.m178030a(th, th);
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
            if (!this.f298495e) {
                super.onAttach(context);
                if (this.f298492a == null) {
                    Object jN = mo95877f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C107242ak) {
                        C107242ak akVar = (C107242ak) fragment;
                        C68225k.m98532d(akVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C107273d dVar = (C107273d) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C107273d.f298572i, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(dVar);
                        this.f298492a = new C107247ap(akVar, dVar, (C46439e) ((C74178nm) jN).f207139f.mo17428b(), (C107290n) ((C74178nm) jN).f207130a.d.f201706eF.mo17428b(), ((C74178nm) jN).f207130a.d.mo67680J(), new C107298a(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), ((C74178nm) jN).mo70019B());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f298494d));
                    } else {
                        String obj = C107247ap.class.toString();
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
                C107241aj.m178030a(th2, th3);
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

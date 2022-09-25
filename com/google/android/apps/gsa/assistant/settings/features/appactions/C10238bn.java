package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10188c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10192g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10271p;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bn */
/* compiled from: PG */
public final class C10238bn extends C10287cf implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10249by f34729a;

    /* renamed from: c */
    private Context f34730c;

    /* renamed from: d */
    private final C2393x f34731d = new C2393x(this);

    /* renamed from: e */
    private boolean f34732e;

    @Deprecated
    public C10238bn() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C10249by mo17754z() {
        C10249by byVar = this.f34729a;
        if (byVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34732e) {
            return byVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18369b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34730c == null) {
            this.f34730c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34730c;
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
        return this.f34731d;
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
            C10237bm.m25138a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C10249by a = mo17754z();
            l lVar = a.f34751i;
            C10247bw bwVar = new C10247bw(a);
            C10238bn bnVar = a.f34745c;
            Objects.requireNonNull(bnVar);
            a.f34758p = lVar.a(bwVar, new C10243bs(bnVar));
            C58976aa aaVar = C58975e.f156826a;
            a.f34753k.mo50429i(a.f34754l);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10237bm.m25138a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[Catch:{ all -> 0x0173, all -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f A[Catch:{ all -> 0x0173, all -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016b A[SYNTHETIC, Splitter:B:51:0x016b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51119t(r9, r10, r11)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.by r0 = r8.mo17754z()     // Catch:{ all -> 0x0173 }
            r1 = 2131624862(0x7f0e039e, float:1.8876916E38)
            r2 = 0
            android.view.View r1 = r9.inflate(r1, r10, r2)     // Catch:{ all -> 0x0173 }
            r0.f34759q = r1     // Catch:{ all -> 0x0173 }
            android.view.View r1 = r0.f34759q     // Catch:{ all -> 0x0173 }
            r1.getClass()
            r3 = 2131435768(0x7f0b20f8, float:1.8493387E38)
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ all -> 0x0173 }
            android.view.ViewStub r1 = (android.view.ViewStub) r1     // Catch:{ all -> 0x0173 }
            android.view.View r3 = r0.f34759q     // Catch:{ all -> 0x0173 }
            r3.getClass()
            r4 = 2131429784(0x7f0b0998, float:1.848125E38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ all -> 0x0173 }
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.p r4 = r0.f34744b     // Catch:{ all -> 0x0173 }
            int r5 = r4.f34815a     // Catch:{ all -> 0x0173 }
            r6 = 2
            r7 = 1
            if (r5 != r7) goto L_0x0058
            java.lang.Object r4 = r4.f34816b     // Catch:{ all -> 0x0173 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0173 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0173 }
            int r4 = com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10255ac.m25160a(r4)     // Catch:{ all -> 0x0173 }
            if (r4 != 0) goto L_0x0049
            goto L_0x0058
        L_0x0049:
            if (r4 != r6) goto L_0x0058
            r4 = 2131624896(0x7f0e03c0, float:1.8876985E38)
            r1.setLayoutResource(r4)     // Catch:{ all -> 0x0173 }
            r4 = 2131624895(0x7f0e03bf, float:1.8876983E38)
            r3.setLayoutResource(r4)     // Catch:{ all -> 0x0173 }
            goto L_0x0064
        L_0x0058:
            r4 = 2131627301(0x7f0e0d25, float:1.8881863E38)
            r1.setLayoutResource(r4)     // Catch:{ all -> 0x0173 }
            r4 = 2131627300(0x7f0e0d24, float:1.888186E38)
            r3.setLayoutResource(r4)     // Catch:{ all -> 0x0173 }
        L_0x0064:
            r1.inflate()     // Catch:{ all -> 0x0173 }
            android.view.View r1 = r3.inflate()     // Catch:{ all -> 0x0173 }
            r1.getClass()
            r3 = 2131429785(0x7f0b0999, float:1.8481253E38)
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ all -> 0x0173 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x0173 }
            android.view.View r3 = r0.f34759q     // Catch:{ all -> 0x0173 }
            r3.getClass()
            r4 = 2131427834(0x7f0b01fa, float:1.8477295E38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ all -> 0x0173 }
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.bv r4 = new com.google.android.apps.gsa.assistant.settings.features.appactions.bv     // Catch:{ all -> 0x0173 }
            r4.<init>(r1)     // Catch:{ all -> 0x0173 }
            r3.mo47402l(r4)     // Catch:{ all -> 0x0173 }
            if (r11 != 0) goto L_0x00ac
            com.google.android.apps.gsa.assistant.settings.features.appactions.bn r11 = r0.f34745c     // Catch:{ all -> 0x0173 }
            android.support.v4.app.am r11 = r11.getActivity()     // Catch:{ all -> 0x0173 }
            android.support.v7.app.p r11 = (android.support.p033v7.app.C0395p) r11     // Catch:{ all -> 0x0173 }
            android.view.View r1 = r0.f34759q     // Catch:{ all -> 0x0173 }
            r1.getClass()
            r3 = 2131429004(0x7f0b068c, float:1.8479668E38)
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ all -> 0x0173 }
            android.support.v7.widget.Toolbar r1 = (android.support.p033v7.widget.Toolbar) r1     // Catch:{ all -> 0x0173 }
            android.support.v7.app.v r11 = r11.mo1322k()     // Catch:{ all -> 0x0173 }
            r11.mo1192t(r1)     // Catch:{ all -> 0x0173 }
        L_0x00ac:
            com.google.android.apps.gsa.assistant.settings.features.appactions.bn r11 = r0.f34745c     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a.m108339b(r11)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.shared.e.k r11 = r0.f34758p     // Catch:{ all -> 0x0173 }
            r11.getClass()
            android.view.View r1 = r0.f34759q     // Catch:{ all -> 0x0173 }
            r1.getClass()
            com.google.android.apps.gsa.assistant.settings.shared.e.h r11 = r11.b     // Catch:{ all -> 0x0173 }
            android.view.View r9 = r11.a(r9, r10, r1)     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.logging.ve.af r10 = r0.f34752j     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.logging.ve.ab r10 = r10.f76997b     // Catch:{ all -> 0x0173 }
            r11 = 106185(0x19ec9, float:1.48797E-40)
            com.google.android.libraries.logging.ve.h r11 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r11)     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.logging.ve.c r10 = r10.mo33800a(r11)     // Catch:{ all -> 0x0173 }
            r10.mo33809b(r9)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.bn r10 = r0.f34745c     // Catch:{ all -> 0x0173 }
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()     // Catch:{ all -> 0x0173 }
            android.support.v4.app.a r11 = new android.support.v4.app.a     // Catch:{ all -> 0x0173 }
            r11.<init>((android.support.p031v4.app.FragmentManager) r10)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r10 = com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad.f34765j     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.aa r10 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10253aa) r10     // Catch:{ all -> 0x0173 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bv r1 = r10.instance     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r1 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad) r1     // Catch:{ all -> 0x0173 }
            int r3 = r1.f34767a     // Catch:{ all -> 0x0173 }
            r3 = r3 | r6
            r1.f34767a = r3     // Catch:{ all -> 0x0173 }
            r1.f34768b = r7     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.p r1 = r0.f34744b     // Catch:{ all -> 0x0173 }
            int r3 = r1.f34815a     // Catch:{ all -> 0x0173 }
            if (r3 != r7) goto L_0x0108
            java.lang.Object r1 = r1.f34816b     // Catch:{ all -> 0x0173 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0173 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0173 }
            int r1 = com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10255ac.m25160a(r1)     // Catch:{ all -> 0x0173 }
            if (r1 != 0) goto L_0x0109
        L_0x0108:
            r1 = 1
        L_0x0109:
            r10.copyOnWrite()     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bv r3 = r10.instance     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r3 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad) r3     // Catch:{ all -> 0x0173 }
            int r1 = r1 + -1
            r3.f34769c = r1     // Catch:{ all -> 0x0173 }
            int r1 = r3.f34767a     // Catch:{ all -> 0x0173 }
            r1 = r1 | 4
            r3.f34767a = r1     // Catch:{ all -> 0x0173 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bv r1 = r10.instance     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r1 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad) r1     // Catch:{ all -> 0x0173 }
            int r3 = r1.f34767a     // Catch:{ all -> 0x0173 }
            r3 = r3 | 16
            r1.f34767a = r3     // Catch:{ all -> 0x0173 }
            r1.f34771e = r7     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.p r0 = r0.f34744b     // Catch:{ all -> 0x0173 }
            int r1 = r0.f34815a     // Catch:{ all -> 0x0173 }
            if (r1 != r7) goto L_0x0142
            java.lang.Object r0 = r0.f34816b     // Catch:{ all -> 0x0173 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0173 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0173 }
            int r0 = com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10255ac.m25160a(r0)     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x013e
            goto L_0x0142
        L_0x013e:
            r1 = 3
            if (r0 != r1) goto L_0x0142
            r2 = 1
        L_0x0142:
            r10.copyOnWrite()     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bv r0 = r10.instance     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r0 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad) r0     // Catch:{ all -> 0x0173 }
            int r1 = r0.f34767a     // Catch:{ all -> 0x0173 }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r0.f34767a = r1     // Catch:{ all -> 0x0173 }
            r0.f34775i = r2     // Catch:{ all -> 0x0173 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad r10 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad) r10     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.assistant.settings.features.appactions.cw r10 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10304cw.m25221f(r10)     // Catch:{ all -> 0x0173 }
            r0 = 2131429970(0x7f0b0a52, float:1.8481628E38)
            r1 = 0
            r11.mo689v(r0, r10, r1)     // Catch:{ all -> 0x0173 }
            r11.mo509f()     // Catch:{ all -> 0x0173 }
            if (r9 == 0) goto L_0x016b
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r9
        L_0x016b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "Fragment cannot use Event annotations with null view!"
            r9.<init>(r10)     // Catch:{ all -> 0x0173 }
            throw r9     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r9 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0178 }
            goto L_0x017c
        L_0x0178:
            r10 = move-exception
            com.google.android.apps.gsa.assistant.settings.features.appactions.C10237bm.m25138a(r9, r10)
        L_0x017c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.appactions.C10238bn.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            mo17754z().f34759q = null;
            c.close();
            return;
        } catch (Throwable th) {
            C10237bm.m25138a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34732e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10237bm.m25138a(th, th);
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
            C10237bm.m25138a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C10249by a = mo17754z();
            C47393f.m84233d(this, C10192g.class, new C10250bz(a));
            C47393f.m84233d(this, C10188c.class, new C10282ca(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10237bm.m25138a(th, th);
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
            if (!this.f34732e) {
                super.onAttach(context);
                if (this.f34729a == null) {
                    Object jN = mo18383d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10238bn) {
                        C10238bn bnVar = (C10238bn) fragment;
                        C68225k.m98532d(bnVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10271p pVar = (C10271p) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10271p.f34813c, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(pVar);
                        this.f34729a = new C10249by(bnVar, pVar, (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C10325al) ((C74178nm) jN).f207136c.f205576bY.mo17428b(), (C10311c) ((C74178nm) jN).f207136c.f205575bX.mo17428b(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aW.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), ((C74178nm) jN).mo70075q(), ((C74178nm) jN).mo70063e(), (C46439e) ((C74178nm) jN).f207139f.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34731d));
                    } else {
                        String obj = C10249by.class.toString();
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
                C10237bm.m25138a(th2, th3);
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

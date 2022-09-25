package com.google.android.apps.search.googleapp.p10257g;

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
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.g.b */
/* compiled from: PG */
public final class C135425b extends C135424ao implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135435j f368951a;

    /* renamed from: c */
    private Context f368952c;

    /* renamed from: d */
    private final C2393x f368953d = new C2393x(this);

    /* renamed from: e */
    private boolean f368954e;

    @Deprecated
    public C135425b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135435j mo17754z() {
        C135435j jVar = this.f368951a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f368954e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo112325b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f368952c == null) {
            this.f368952c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f368952c;
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
        return this.f368953d;
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
            C135383a.m219536a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a5, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a9, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b4, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b8, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.apps.tiktok.tracing.ab r0 = r7.f122869b
            r0.mo51381i()
            r7.mo51119t(r8, r9, r10)     // Catch:{ all -> 0x01b9 }
            com.google.android.apps.search.googleapp.g.j r10 = r7.mo17754z()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "container"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "DoodleFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)     // Catch:{ all -> 0x01b9 }
            com.google.android.apps.search.googleapp.g.f r1 = r10.f368977e     // Catch:{ all -> 0x01b2 }
            int r1 = r1.f368967b     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.e r1 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r1)     // Catch:{ all -> 0x01b2 }
            if (r1 != 0) goto L_0x0028
            com.google.android.apps.search.googleapp.g.e r1 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN     // Catch:{ all -> 0x01b2 }
        L_0x0028:
            int r1 = r1.ordinal()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x01aa
            r2 = 1
            if (r1 == r2) goto L_0x004f
            r2 = 2
            if (r1 == r2) goto L_0x004b
            r2 = 3
            if (r1 == r2) goto L_0x004b
            r2 = 4
            if (r1 == r2) goto L_0x0047
            r2 = 5
            if (r1 != r2) goto L_0x0041
            r1 = 2131625273(0x7f0e0539, float:1.887775E38)
            goto L_0x0052
        L_0x0041:
            h.g r8 = new h.g     // Catch:{ all -> 0x01b2 }
            r8.<init>()     // Catch:{ all -> 0x01b2 }
            throw r8     // Catch:{ all -> 0x01b2 }
        L_0x0047:
            r1 = 2131625272(0x7f0e0538, float:1.8877747E38)
            goto L_0x0052
        L_0x004b:
            r1 = 2131625271(0x7f0e0537, float:1.8877745E38)
            goto L_0x0052
        L_0x004f:
            r1 = 2131625270(0x7f0e0536, float:1.8877743E38)
        L_0x0052:
            r2 = 0
            android.view.View r8 = r8.inflate(r1, r9, r2)     // Catch:{ all -> 0x01b2 }
            boolean r9 = r10.f368988p     // Catch:{ all -> 0x01b2 }
            if (r9 == 0) goto L_0x009f
            r9 = 2131431526(0x7f0b1066, float:1.8484784E38)
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout r9 = (com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout) r9     // Catch:{ all -> 0x01b2 }
            if (r9 == 0) goto L_0x009f
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x01b2 }
            r3 = 2131168452(0x7f070cc4, float:1.7951206E38)
            int r3 = r1.getDimensionPixelSize(r3)     // Catch:{ all -> 0x01b2 }
            r9.f373297a = r3     // Catch:{ all -> 0x01b2 }
            r9.requestLayout()     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.f r3 = r10.f368977e     // Catch:{ all -> 0x01b2 }
            int r3 = r3.f368967b     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.e r3 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r3)     // Catch:{ all -> 0x01b2 }
            if (r3 != 0) goto L_0x0082
            com.google.android.apps.search.googleapp.g.e r3 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN     // Catch:{ all -> 0x01b2 }
        L_0x0082:
            com.google.android.apps.search.googleapp.g.e r4 = com.google.android.apps.search.googleapp.p10257g.C135430e.HOMESCREEN     // Catch:{ all -> 0x01b2 }
            if (r3 != r4) goto L_0x009f
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            p5462h.p5473f.p5475b.C69664n.m101059e(r3, r4)     // Catch:{ all -> 0x01b2 }
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3     // Catch:{ all -> 0x01b2 }
            r4 = 2131168451(0x7f070cc3, float:1.7951204E38)
            int r1 = r1.getDimensionPixelSize(r4)     // Catch:{ all -> 0x01b2 }
            r3.leftMargin = r1     // Catch:{ all -> 0x01b2 }
            r3.rightMargin = r1     // Catch:{ all -> 0x01b2 }
            r9.setLayoutParams(r3)     // Catch:{ all -> 0x01b2 }
        L_0x009f:
            r9 = 2131431523(0x7f0b1063, float:1.8484778E38)
            android.view.View r9 = androidx.core.p098j.C2043bi.m5589r(r8, r9)     // Catch:{ all -> 0x01b2 }
            java.lang.String r1 = "requireViewById<ViewGrou…ogleapp_doodle_container)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)     // Catch:{ all -> 0x01b2 }
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.ab r1 = r10.f368981i     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.af r3 = r1.f76990a     // Catch:{ all -> 0x01b2 }
            r4 = 98917(0x18265, float:1.38612E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)     // Catch:{ all -> 0x01b2 }
            r1.mo33801b(r9, r3)     // Catch:{ all -> 0x01b2 }
            r9 = 2131431520(0x7f0b1060, float:1.8484772E38)
            android.view.View r9 = androidx.core.p098j.C2043bi.m5589r(r8, r9)     // Catch:{ all -> 0x01b2 }
            java.lang.String r1 = "requireViewById<ImageVie…t, R.id.googleapp_doodle)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)     // Catch:{ all -> 0x01b2 }
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.ab r1 = r10.f368981i     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.af r3 = r1.f76990a     // Catch:{ all -> 0x01b2 }
            r4 = 61
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)     // Catch:{ all -> 0x01b2 }
            r1.mo33801b(r9, r3)     // Catch:{ all -> 0x01b2 }
            r1 = 2131431913(0x7f0b11e9, float:1.8485569E38)
            android.view.View r1 = androidx.core.p098j.C2043bi.m5589r(r8, r1)     // Catch:{ all -> 0x01b2 }
            java.lang.String r3 = "requireViewById<ImageVie…leapp_share_doodle_image)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x01b2 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.ab r3 = r10.f368981i     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.af r4 = r3.f76990a     // Catch:{ all -> 0x01b2 }
            r5 = 7267(0x1c63, float:1.0183E-41)
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.c r4 = r4.mo33805a(r5)     // Catch:{ all -> 0x01b2 }
            r3.mo33801b(r1, r4)     // Catch:{ all -> 0x01b2 }
            r1 = 2131431686(0x7f0b1106, float:1.8485108E38)
            android.view.View r1 = androidx.core.p098j.C2043bi.m5589r(r8, r1)     // Catch:{ all -> 0x01b2 }
            java.lang.String r3 = "requireViewById<ImageVie…oot, R.id.googleapp_logo)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x01b2 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.ab r3 = r10.f368981i     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.af r4 = r3.f76990a     // Catch:{ all -> 0x01b2 }
            r5 = 53
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)     // Catch:{ all -> 0x01b2 }
            com.google.android.libraries.logging.ve.c r4 = r4.mo33805a(r5)     // Catch:{ all -> 0x01b2 }
            r3.mo33801b(r1, r4)     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.f r3 = r10.f368977e     // Catch:{ all -> 0x01b2 }
            boolean r3 = r3.f368968c     // Catch:{ all -> 0x01b2 }
            if (r3 == 0) goto L_0x0125
            r1.setVisibility(r2)     // Catch:{ all -> 0x01b2 }
        L_0x0125:
            java.lang.String r2 = "root"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.f r2 = r10.f368977e     // Catch:{ all -> 0x01b2 }
            int r2 = r2.f368967b     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.e r2 = com.google.android.apps.search.googleapp.p10257g.C135430e.m219591a(r2)     // Catch:{ all -> 0x01b2 }
            if (r2 != 0) goto L_0x0136
            com.google.android.apps.search.googleapp.g.e r2 = com.google.android.apps.search.googleapp.p10257g.C135430e.UNKNOWN     // Catch:{ all -> 0x01b2 }
        L_0x0136:
            com.google.android.apps.search.googleapp.g.e r3 = com.google.android.apps.search.googleapp.p10257g.C135430e.HOMESCREEN     // Catch:{ all -> 0x01b2 }
            if (r2 != r3) goto L_0x015c
            int r2 = r9.getPaddingLeft()     // Catch:{ all -> 0x01b2 }
            int r3 = r9.getPaddingTop()     // Catch:{ all -> 0x01b2 }
            int r4 = r9.getPaddingRight()     // Catch:{ all -> 0x01b2 }
            android.content.res.Resources r5 = r9.getResources()     // Catch:{ all -> 0x01b2 }
            r6 = 2131168484(0x7f070ce4, float:1.7951271E38)
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ all -> 0x01b2 }
            r9.setPadding(r2, r3, r4, r5)     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.g.o r9 = new com.google.android.apps.search.googleapp.g.o     // Catch:{ all -> 0x01b2 }
            r9.<init>(r8, r1)     // Catch:{ all -> 0x01b2 }
            r8.setOnApplyWindowInsetsListener(r9)     // Catch:{ all -> 0x01b2 }
        L_0x015c:
            java.lang.String r9 = "DoodleFragmentPeer:subscribeToDs"
            com.google.apps.tiktok.tracing.bi r9 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r9)     // Catch:{ all -> 0x01b2 }
            boolean r1 = r10.f368986n     // Catch:{ all -> 0x01a3 }
            if (r1 != 0) goto L_0x017d
            com.google.apps.tiktok.dataservice.dp r1 = r10.f368980h     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.googleapp.g.a.y r2 = r10.f368984l     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.dataservice.bg r3 = r2.f368917a     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.googleapp.g.a.x r4 = new com.google.android.apps.search.googleapp.g.a.x     // Catch:{ all -> 0x01a3 }
            r4.<init>(r2)     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.dataservice.bc r2 = new com.google.apps.tiktok.dataservice.bc     // Catch:{ all -> 0x01a3 }
            java.lang.String r5 = "ENABLE_DOODLE_ANIMATION_DATA_SOURCE_KEY"
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.dataservice.di r3 = r10.f368989q     // Catch:{ all -> 0x01a3 }
            r1.mo50707a(r2, r3)     // Catch:{ all -> 0x01a3 }
        L_0x017d:
            boolean r1 = r10.f368987o     // Catch:{ all -> 0x01a3 }
            if (r1 != 0) goto L_0x018e
            com.google.apps.tiktok.dataservice.dp r1 = r10.f368980h     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.googleapp.g.a.r r2 = r10.f368975c     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.dataservice.ag r2 = r2.mo112308d()     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.googleapp.g.j$a r3 = r10.f368990r     // Catch:{ all -> 0x01a3 }
            r1.mo50707a(r2, r3)     // Catch:{ all -> 0x01a3 }
        L_0x018e:
            com.google.android.apps.search.googleapp.startup.appinteractive.f r1 = r10.f368983k     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.googleapp.g.n r2 = new com.google.android.apps.search.googleapp.g.n     // Catch:{ all -> 0x01a3 }
            r2.<init>(r10)     // Catch:{ all -> 0x01a3 }
            r1.mo115167b(r2)     // Catch:{ all -> 0x01a3 }
            r10 = 0
            p5462h.p5472e.C69598b.m101013a(r9, r10)     // Catch:{ all -> 0x01b2 }
            p5462h.p5472e.C69598b.m101013a(r0, r10)     // Catch:{ all -> 0x01b9 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r8
        L_0x01a3:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r10 = move-exception
            p5462h.p5472e.C69598b.m101013a(r9, r8)     // Catch:{ all -> 0x01b2 }
            throw r10     // Catch:{ all -> 0x01b2 }
        L_0x01aa:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01b2 }
            java.lang.String r9 = "FragmentLocation param must be set"
            r8.<init>(r9)     // Catch:{ all -> 0x01b2 }
            throw r8     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r9 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r8)     // Catch:{ all -> 0x01b9 }
            throw r9     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r8 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x01be }
            goto L_0x01c2
        L_0x01be:
            r9 = move-exception
            com.google.android.apps.search.googleapp.p10257g.C135383a.m219536a(r8, r9)
        L_0x01c2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10257g.C135425b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f368954e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135383a.m219536a(th, th);
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
            C135383a.m219536a(th, th);
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
            if (!this.f368954e) {
                super.onAttach(context);
                if (this.f368951a == null) {
                    this.f368951a = ((C135447t) mo112326d().mo17653jN()).mo112336bY();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f368953d));
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
                C135383a.m219536a(th, th2);
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

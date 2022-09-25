package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.l */
/* compiled from: PG */
public final class C126725l extends C126718e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126727n f349000a;

    /* renamed from: c */
    private Context f349001c;

    /* renamed from: d */
    private final C2393x f349002d = new C2393x(this);

    /* renamed from: e */
    private boolean f349003e;

    @Deprecated
    public C126725l() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C126725l m207268f(String str) {
        C126725l lVar = new C126725l();
        C68324h.m98669f(lVar);
        C47243l.m84040b(lVar, str);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo107726b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349001c == null) {
            this.f349001c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349001c;
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
        return this.f349002d;
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
    public final C126727n mo17754z() {
        C126727n nVar = this.f349000a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349003e) {
            return nVar;
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
            C126724k.m207267a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r0.equals("lefttop") != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6 A[Catch:{ all -> 0x014b, all -> 0x0150 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            java.lang.String r0 = "intent_extra_hardware_button_position"
            com.google.apps.tiktok.tracing.ab r1 = r9.f122869b
            r1.mo51381i()
            r9.mo51119t(r10, r11, r12)     // Catch:{ all -> 0x014b }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.n r12 = r9.mo17754z()     // Catch:{ all -> 0x014b }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.l r1 = r12.f349007c     // Catch:{ all -> 0x014b }
            android.support.v4.app.am r1 = r1.getActivity()     // Catch:{ all -> 0x014b }
            android.content.Intent r1 = r1.getIntent()     // Catch:{ all -> 0x014b }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x014b }
            r2 = 2131624376(0x7f0e01b8, float:1.887593E38)
            r3 = 0
            android.view.View r10 = r10.inflate(r2, r11, r3)     // Catch:{ all -> 0x014b }
            com.google.android.setupdesign.GlifLayout r10 = (com.google.android.setupdesign.GlifLayout) r10     // Catch:{ all -> 0x014b }
            r11 = 2131428473(0x7f0b0479, float:1.8478591E38)
            android.view.View r11 = r10.findViewById(r11)     // Catch:{ all -> 0x014b }
            android.widget.ImageView r11 = (android.widget.ImageView) r11     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "lefttop"
            if (r1 == 0) goto L_0x0044
            boolean r4 = r1.containsKey(r0)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r1.getString(r0)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0044
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x014b }
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            int r1 = r0.hashCode()     // Catch:{ all -> 0x014b }
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 5
            switch(r1) {
                case -1751918350: goto L_0x0081;
                case -1443030948: goto L_0x0077;
                case -1436059207: goto L_0x006d;
                case 14309191: goto L_0x0063;
                case 55463918: goto L_0x005c;
                case 323196593: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x008b
        L_0x0052:
            java.lang.String r1 = "rightmiddle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r3 = 4
            goto L_0x008c
        L_0x005c:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008b
            goto L_0x008c
        L_0x0063:
            java.lang.String r1 = "rightbottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r3 = 5
            goto L_0x008c
        L_0x006d:
            java.lang.String r1 = "righttop"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r3 = 3
            goto L_0x008c
        L_0x0077:
            java.lang.String r1 = "leftmiddle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r3 = 1
            goto L_0x008c
        L_0x0081:
            java.lang.String r1 = "leftbottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r3 = 2
            goto L_0x008c
        L_0x008b:
            r3 = -1
        L_0x008c:
            r0 = 2131231378(0x7f080292, float:1.8078835E38)
            if (r3 == 0) goto L_0x00e6
            if (r3 == r7) goto L_0x00d9
            if (r3 == r6) goto L_0x00cc
            if (r3 == r5) goto L_0x00bf
            if (r3 == r4) goto L_0x00b2
            if (r3 == r8) goto L_0x00a5
            android.content.Context r1 = r12.f349006b     // Catch:{ all -> 0x014b }
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00a5:
            android.content.Context r0 = r12.f349006b     // Catch:{ all -> 0x014b }
            r1 = 2131231379(0x7f080293, float:1.8078837E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00b2:
            android.content.Context r0 = r12.f349006b     // Catch:{ all -> 0x014b }
            r1 = 2131231380(0x7f080294, float:1.807884E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00bf:
            android.content.Context r0 = r12.f349006b     // Catch:{ all -> 0x014b }
            r1 = 2131231381(0x7f080295, float:1.8078841E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00cc:
            android.content.Context r0 = r12.f349006b     // Catch:{ all -> 0x014b }
            r1 = 2131231376(0x7f080290, float:1.8078831E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00d9:
            android.content.Context r0 = r12.f349006b     // Catch:{ all -> 0x014b }
            r1 = 2131231377(0x7f080291, float:1.8078833E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ef
        L_0x00e6:
            android.content.Context r1 = r12.f349006b     // Catch:{ all -> 0x014b }
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)     // Catch:{ all -> 0x014b }
            r11.setImageDrawable(r0)     // Catch:{ all -> 0x014b }
        L_0x00ef:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r11 = r12.f349012h     // Catch:{ all -> 0x014b }
            r11.mo107697c(r10)     // Catch:{ all -> 0x014b }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r11 = r12.f349012h     // Catch:{ all -> 0x014b }
            com.google.android.setupcompat.template.c r0 = new com.google.android.setupcompat.template.c     // Catch:{ all -> 0x014b }
            android.content.Context r1 = r12.f349006b     // Catch:{ all -> 0x014b }
            r0.<init>(r1)     // Catch:{ all -> 0x014b }
            r1 = 2132085054(0x7f15093e, float:1.9810296E38)
            r0.mo49181b(r1)     // Catch:{ all -> 0x014b }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.m r1 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.m     // Catch:{ all -> 0x014b }
            r1.<init>(r12)     // Catch:{ all -> 0x014b }
            r0.f118281b = r1     // Catch:{ all -> 0x014b }
            r0.f118282c = r8     // Catch:{ all -> 0x014b }
            r1 = 2132150157(0x7f16078d, float:1.994234E38)
            r0.f118283d = r1     // Catch:{ all -> 0x014b }
            com.google.android.setupcompat.template.d r0 = r0.mo49180a()     // Catch:{ all -> 0x014b }
            r11.f348934e = r0     // Catch:{ all -> 0x014b }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r11 = r12.f349012h     // Catch:{ all -> 0x014b }
            r11.mo107698d()     // Catch:{ all -> 0x014b }
            r11 = 2131429049(0x7f0b06b9, float:1.847976E38)
            android.view.View r11 = r10.findViewById(r11)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.ab r0 = r12.f349008d     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.af r1 = r12.f349009e     // Catch:{ all -> 0x014b }
            r2 = 149916(0x2499c, float:2.10077E-40)
            com.google.android.libraries.logging.ve.h r2 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r2)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.c r1 = r1.mo33805a(r2)     // Catch:{ all -> 0x014b }
            r0.mo33802c(r11, r1)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.ab r11 = r12.f349008d     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.af r12 = r12.f349009e     // Catch:{ all -> 0x014b }
            r0 = 149915(0x2499b, float:2.10076E-40)
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r0)     // Catch:{ all -> 0x014b }
            com.google.android.libraries.logging.ve.c r12 = r12.mo33805a(r0)     // Catch:{ all -> 0x014b }
            r11.mo33802c(r10, r12)     // Catch:{ all -> 0x014b }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r10
        L_0x014b:
            r10 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r11 = move-exception
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126724k.m207267a(r10, r11)
        L_0x0154:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126725l.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349003e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126724k.m207267a(th, th);
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
            C126724k.m207267a(th, th);
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
            if (!this.f349003e) {
                super.onAttach(context);
                if (this.f349000a == null) {
                    Object jN = mo107725a().mo17653jN();
                    Context context2 = (Context) ((C74178nm) jN).f207136c.f205710e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C126725l) {
                        C126725l lVar = (C126725l) fragment;
                        C68225k.m98532d(lVar);
                        String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                        C68225k.m98532d(b);
                        this.f349000a = new C126727n(context2, lVar, (C28306ab) ((C74178nm) jN).f207130a.a.f202880fS.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), b);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349002d));
                    } else {
                        String obj = C126727n.class.toString();
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
                C126724k.m207267a(th, th2);
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

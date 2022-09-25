package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.h */
/* compiled from: PG */
public final class C129209h extends C129176ac implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129210i f354922a;

    /* renamed from: c */
    private Context f354923c;

    /* renamed from: d */
    private final C2393x f354924d = new C2393x(this);

    /* renamed from: e */
    private boolean f354925e;

    @Deprecated
    public C129209h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129210i mo17754z() {
        C129210i iVar = this.f354922a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354925e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108878b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354923c == null) {
            this.f354923c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354923c;
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
        return this.f354924d;
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
            C129208g.m210927a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r1 == 1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SETTING_NATIVE_TOGGLE_FRAGMENT_TAG"
            java.lang.String r1 = "SETTING_NATIVE_SLIDER_FRAGMENT_TAG"
            com.google.apps.tiktok.tracing.ab r2 = r7.f122869b
            r2.mo51381i()
            r7.mo51111l(r8)     // Catch:{ all -> 0x008e }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.i r8 = r7.mo17754z()     // Catch:{ all -> 0x008e }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.h r2 = r8.f354926a     // Catch:{ all -> 0x008e }
            androidx.u.o r3 = new androidx.u.o     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            r2.setEnterTransition(r3)     // Catch:{ all -> 0x008e }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.h r2 = r8.f354926a     // Catch:{ all -> 0x008e }
            android.support.v4.app.FragmentManager r2 = r2.getChildFragmentManager()     // Catch:{ all -> 0x008e }
            com.google.assistant.e.j.gj r3 = r8.f354928c     // Catch:{ all -> 0x008e }
            int r3 = r3.f136795e     // Catch:{ all -> 0x008e }
            int r4 = com.google.assistant.p3897e.p3921j.C52130gi.m86513a(r3)     // Catch:{ all -> 0x008e }
            r5 = 2131428845(0x7f0b05ed, float:1.8479346E38)
            if (r4 != 0) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            r6 = 2
            if (r4 != r6) goto L_0x0059
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008e }
            android.support.v4.app.cc r0 = r2.f634a     // Catch:{ all -> 0x008e }
            android.support.v4.app.Fragment r0 = r0.mo671c(r1)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008a
            android.support.v4.app.a r0 = new android.support.v4.app.a     // Catch:{ all -> 0x008e }
            r0.<init>((android.support.p031v4.app.FragmentManager) r2)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.account.AccountId r2 = r8.f354927b     // Catch:{ all -> 0x008e }
            com.google.assistant.e.j.gj r8 = r8.f354928c     // Catch:{ all -> 0x008e }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.k r3 = new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.k     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r3)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r3, r2)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r3, r8)     // Catch:{ all -> 0x008e }
            r0.mo689v(r5, r3, r1)     // Catch:{ all -> 0x008e }
            r0.mo509f()     // Catch:{ all -> 0x008e }
            goto L_0x008a
        L_0x0059:
            int r1 = com.google.assistant.p3897e.p3921j.C52130gi.m86513a(r3)     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r3 = 1
            if (r1 != r3) goto L_0x008a
        L_0x0063:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008e }
            android.support.v4.app.cc r1 = r2.f634a     // Catch:{ all -> 0x008e }
            android.support.v4.app.Fragment r1 = r1.mo671c(r0)     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x008a
            android.support.v4.app.a r1 = new android.support.v4.app.a     // Catch:{ all -> 0x008e }
            r1.<init>((android.support.p031v4.app.FragmentManager) r2)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.account.AccountId r2 = r8.f354927b     // Catch:{ all -> 0x008e }
            com.google.assistant.e.j.gj r8 = r8.f354928c     // Catch:{ all -> 0x008e }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.r r3 = new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.r     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r3)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r3, r2)     // Catch:{ all -> 0x008e }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r3, r8)     // Catch:{ all -> 0x008e }
            r1.mo689v(r5, r3, r0)     // Catch:{ all -> 0x008e }
            r1.mo509f()     // Catch:{ all -> 0x008e }
        L_0x008a:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x008e:
            r8 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.C129208g.m210927a(r8, r0)
        L_0x0097:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.C129209h.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.assistant_ma_settings_native_card, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129208g.m210927a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354925e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129208g.m210927a(th, th);
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
            C129208g.m210927a(th, th);
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
            if (!this.f354925e) {
                super.onAttach(context);
                if (this.f354922a == null) {
                    Object jN = mo108879d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C129209h) {
                        C129209h hVar = (C129209h) fragment;
                        C68225k.m98532d(hVar);
                        this.f354922a = new C129210i(hVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ((C74176nj) jN).mo69848hf());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354924d));
                    } else {
                        String obj = C129210i.class.toString();
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
                C129208g.m210927a(th, th2);
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

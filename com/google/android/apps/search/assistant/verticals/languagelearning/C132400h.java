package com.google.android.apps.search.assistant.verticals.languagelearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.languagelearning.h */
/* compiled from: PG */
public final class C132400h extends C132406n implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132402j f361386a;

    /* renamed from: c */
    private Context f361387c;

    /* renamed from: d */
    private final C2393x f361388d = new C2393x(this);

    /* renamed from: e */
    private boolean f361389e;

    @Deprecated
    public C132400h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132402j mo17754z() {
        C132402j jVar = this.f361386a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f361389e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110693b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f361387c == null) {
            this.f361387c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f361387c;
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
        return this.f361388d;
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
            C132399g.m215210a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C132402j a = mo17754z();
            RequestBlockMixin requestBlockMixin = a.f361392c;
            Objects.requireNonNull(a.f361394e);
            requestBlockMixin.mo46748c(R.id.assistant_language_learning_external_links, new C132401i(), a.f361393d);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132399g.m215210a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r0 = "asc"
            java.lang.String r1 = "https://assistant.google.com/languagelearning"
            java.lang.String r2 = "WebFragment"
            com.google.apps.tiktok.tracing.ab r3 = r12.f122869b
            r3.mo51381i()
            r12.mo51119t(r13, r14, r15)     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.assistant.verticals.languagelearning.j r15 = r12.mo17754z()     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.assistant.verticals.languagelearning.h r3 = r15.f361391b     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.cc r3 = r3.f634a     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.Fragment r3 = r3.mo671c(r2)     // Catch:{ all -> 0x00a2 }
            r4 = 0
            if (r3 != 0) goto L_0x0097
            com.google.android.apps.search.assistant.verticals.languagelearning.h r3 = r15.f361391b     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.am r3 = r3.getActivity()     // Catch:{ all -> 0x00a2 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = "assistant_server_context"
            java.lang.String r3 = r3.getStringExtra(r5)     // Catch:{ all -> 0x00a2 }
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a2 }
            r6[r4] = r1     // Catch:{ all -> 0x00a2 }
            r7 = 1
            r6[r7] = r0     // Catch:{ all -> 0x00a2 }
            r8 = 2
            r6[r8] = r3     // Catch:{ all -> 0x00a2 }
            java.lang.String r9 = "%s?%s=%s"
            java.lang.String r6 = java.lang.String.format(r9, r6)     // Catch:{ all -> 0x00a2 }
            boolean r9 = com.google.common.base.C58837ba.m90859h(r3)     // Catch:{ all -> 0x00a2 }
            if (r9 != 0) goto L_0x006b
            byte[] r9 = android.util.Base64.decode(r3, r4)     // Catch:{ ct -> 0x006b }
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x006b }
            com.google.assistant.l.a.a.a.b r11 = com.google.assistant.p3957l.p3958a.p3959a.p3960a.C52970b.f138872b     // Catch:{ ct -> 0x006b }
            com.google.protobuf.bv r9 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (byte[]) r9, (com.google.protobuf.C62921ba) r10)     // Catch:{ ct -> 0x006b }
            com.google.assistant.l.a.a.a.b r9 = (com.google.assistant.p3957l.p3958a.p3959a.p3960a.C52970b) r9     // Catch:{ ct -> 0x006b }
            java.lang.String r9 = r9.f138874a     // Catch:{ ct -> 0x006b }
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ ct -> 0x006b }
            r10[r4] = r1     // Catch:{ ct -> 0x006b }
            r10[r7] = r0     // Catch:{ ct -> 0x006b }
            r10[r8] = r3     // Catch:{ ct -> 0x006b }
            r10[r5] = r9     // Catch:{ ct -> 0x006b }
            java.lang.String r0 = "%s?%s=%s&hl=%s"
            java.lang.String r6 = java.lang.String.format(r0, r10)     // Catch:{ ct -> 0x006b }
        L_0x006b:
            com.google.apps.tiktok.account.AccountId r0 = r15.f361390a     // Catch:{ all -> 0x00a2 }
            com.google.android.libraries.web.k.g r0 = com.google.android.libraries.web.p3420k.C43864j.m77435a(r0, r6)     // Catch:{ all -> 0x00a2 }
            com.google.android.apps.search.assistant.verticals.languagelearning.h r1 = r15.f361391b     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()     // Catch:{ all -> 0x00a2 }
            android.support.v4.app.a r3 = new android.support.v4.app.a     // Catch:{ all -> 0x00a2 }
            r3.<init>((android.support.p031v4.app.FragmentManager) r1)     // Catch:{ all -> 0x00a2 }
            com.google.apps.tiktok.account.AccountId r15 = r15.f361390a     // Catch:{ all -> 0x00a2 }
            com.google.android.libraries.web.contrib.loadingbar.a.b r1 = com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b.f113958d     // Catch:{ all -> 0x00a2 }
            r5 = 2131231397(0x7f0802a5, float:1.8078874E38)
            com.google.android.libraries.web.contrib.loadingbar.ui.b r15 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.m77075a(r15, r5, r1)     // Catch:{ all -> 0x00a2 }
            r1 = 2131428619(0x7f0b050b, float:1.8478888E38)
            r5 = 0
            r3.mo511h(r1, r15, r5, r7)     // Catch:{ all -> 0x00a2 }
            r15 = 2131428617(0x7f0b0509, float:1.8478884E38)
            r3.mo511h(r15, r0, r2, r7)     // Catch:{ all -> 0x00a2 }
            r3.mo509f()     // Catch:{ all -> 0x00a2 }
        L_0x0097:
            r15 = 2131624271(0x7f0e014f, float:1.8875717E38)
            android.view.View r13 = r13.inflate(r15, r14, r4)     // Catch:{ all -> 0x00a2 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r13
        L_0x00a2:
            r13 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r14 = move-exception
            com.google.android.apps.search.assistant.verticals.languagelearning.C132399g.m215210a(r13, r14)
        L_0x00ab:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.languagelearning.C132400h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f361389e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132399g.m215210a(th, th);
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
            C132399g.m215210a(th, th);
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
            if (!this.f361389e) {
                super.onAttach(context);
                if (this.f361386a == null) {
                    Object jN = mo110694d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C132400h) {
                        C132400h hVar = (C132400h) fragment;
                        C68225k.m98532d(hVar);
                        this.f361386a = new C132402j(accountId, hVar, ((C74176nj) jN).mo69726fJ(), new C132403k((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (PackageManager) ((C74176nj) jN).f206677a.J.mo17428b()), new C132404l());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f361388d));
                    } else {
                        String obj = C132402j.class.toString();
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
                C132399g.m215210a(th, th2);
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

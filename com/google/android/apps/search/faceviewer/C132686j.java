package com.google.android.apps.search.faceviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.faceviewer.p10091c.C132679a;
import com.google.android.apps.search.faceviewer.web.WebXFaceViewerWebImplementation;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p579ar.faceviewer.C10661e;
import com.google.android.libraries.p579ar.faceviewer.p580a.p582b.C10570d;
import com.google.android.libraries.p579ar.faceviewer.p580a.p584d.C10578a;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10642g;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10643h;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10647l;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10648m;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.C38769r;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.p4723b.C62711b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.faceviewer.j */
/* compiled from: PG */
public final class C132686j extends C132692p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f362067a = new C2393x(this);

    /* renamed from: c */
    private C132689m f362068c;

    /* renamed from: d */
    private Context f362069d;

    /* renamed from: e */
    private boolean f362070e;

    @Deprecated
    public C132686j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132689m mo17754z() {
        C132689m mVar = this.f362068c;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f362070e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110877b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f362069d == null) {
            this.f362069d = new C47236e((Fragment) this, super.getContext());
        }
        return this.f362069d;
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
        return this.f362067a;
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
            C132685i.m215683a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132689m a = mo17754z();
            Context context = a.f362073a.getContext();
            C10642g gVar = new C10642g(a.f362073a.getContext(), a.f362073a, a.f362075c, a.f362076d);
            C10647l lVar = a.f362080h;
            Executor executor = a.f362074b;
            Executor executor2 = a.f362075c;
            Executor executor3 = a.f362076d;
            C69464a aVar = a.f362079g;
            Objects.requireNonNull(aVar);
            C10661e eVar = r3;
            C10661e eVar2 = new C10661e(context, gVar, lVar, executor, executor2, executor3, new C132688l(aVar), new C62711b((Object) null), C10643h.f35539a, a.f362078f, (String) null, a.f362082j);
            a.f362081i = eVar;
            if (a.f362073a.getChildFragmentManager().f634a.mo671c("faceViewerWebFragment") == null) {
                C43861g b = C43864j.m77436b(a.f362077e);
                C0154a aVar2 = new C0154a(a.f362073a.getChildFragmentManager());
                aVar2.mo511h(R.id.web_container, b, "faceViewerWebFragment", 1);
                aVar2.mo509f();
            }
            C60870cx i = C60856cj.m92900i(Boolean.valueOf(a.f362082j.f362094b));
            SettableFuture settableFuture = a.f362081i.f35563d.f35361d;
            Context context2 = a.f362073a.getContext();
            Executor executor4 = a.f362076d;
            C60856cj.m92911t(C47638k.m84753d(i, settableFuture).mo51520a(new C132672a(i, settableFuture), executor4), C47810es.m84974n(new C132676b(context2)), executor4);
            a.f362081i.mo18696b(C132689m.m215691a(a.f362073a.getActivity().getIntent()), a.mo110879b());
            ViewGroup viewGroup2 = a.f362081i.f35562c;
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th2) {
            C132685i.m215683a(th, th2);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C132689m a = mo17754z();
            C10661e eVar = a.f362081i;
            if (eVar != null) {
                for (C10652c b : eVar.f35561b) {
                    b.mo18627b();
                }
                eVar.f35561b.clear();
                eVar.f35562c = null;
                a.f362081i = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C132685i.m215683a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f362070e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132685i.m215683a(th, th);
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
            C132685i.m215683a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C10648m mVar;
        this.f54442o.mo24734Q();
        C10647l lVar = mo17754z().f362080h;
        if (i == 1 && strArr.length > 0 && strArr[0].equals("android.permission.CAMERA") && iArr.length > 0 && (mVar = lVar.f35541b) != null) {
            if (iArr[0] == 0) {
                C10578a aVar = (C10578a) mVar;
                aVar.f35396b = 4;
                C10648m mVar2 = aVar.f35395a;
                if (mVar2 != null) {
                    mVar2.mo18630a();
                }
            } else if (!lVar.f35540a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                C10578a aVar2 = (C10578a) lVar.f35541b;
                aVar2.f35396b = 2;
                C10648m mVar3 = aVar2.f35395a;
                if (mVar3 != null) {
                    C10570d dVar = (C10570d) mVar3;
                    dVar.f35364g = false;
                    dVar.f35363f = false;
                    ((C10650a) dVar.f35362e).f35549e.f35544c.f35566g.mo18667a();
                }
            } else {
                C10578a aVar3 = (C10578a) lVar.f35541b;
                aVar3.f35396b = 5;
                C10648m mVar4 = aVar3.f35395a;
                if (mVar4 != null) {
                    C10570d dVar2 = (C10570d) mVar4;
                    dVar2.f35364g = false;
                    dVar2.f35363f = false;
                    ((C10650a) dVar2.f35362e).f35549e.f35544c.f35566g.mo18667a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r0.f35563d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r4 = this;
            com.google.apps.tiktok.tracing.ab r0 = r4.f122869b
            r0.mo51381i()
            r4.mo51117r()     // Catch:{ all -> 0x0046 }
            com.google.android.apps.search.faceviewer.m r0 = r4.mo17754z()     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.e r0 = r0.f362081i     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            com.google.android.libraries.ar.faceviewer.a.b.d r0 = r0.f35563d     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.c.d r1 = r0.f35362e     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0042
            com.google.android.libraries.ar.faceviewer.c.a r1 = (com.google.android.libraries.p579ar.faceviewer.p588c.C10650a) r1     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.c r1 = r1.f35549e     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.a.c.b r1 = r1.f35542a     // Catch:{ all -> 0x0046 }
            java.util.Map r2 = r1.f35393f     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.a.c.a r3 = com.google.android.libraries.p579ar.faceviewer.p580a.p583c.C10576a.EXPERIENCE     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0046 }
            com.google.common.base.ci r2 = (com.google.common.base.C58872ci) r2     // Catch:{ all -> 0x0046 }
            boolean r2 = r2.f156708a     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0037
            java.util.Map r1 = r1.f35393f     // Catch:{ all -> 0x0046 }
            com.google.android.libraries.ar.faceviewer.a.c.a r2 = com.google.android.libraries.p579ar.faceviewer.p580a.p583c.C10576a.EXPERIENCE     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0046 }
            com.google.common.base.ci r1 = (com.google.common.base.C58872ci) r1     // Catch:{ all -> 0x0046 }
            r1.mo56161f()     // Catch:{ all -> 0x0046 }
        L_0x0037:
            boolean r1 = r0.f35363f     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0042
            boolean r1 = r0.f35364g     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0042
            r0.mo18631d()     // Catch:{ all -> 0x0046 }
        L_0x0042:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0046:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r1 = move-exception
            com.google.android.apps.search.faceviewer.C132685i.m215683a(r0, r1)
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.faceviewer.C132686j.onStart():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r0.f35563d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51118s()     // Catch:{ all -> 0x0075 }
            com.google.android.apps.search.faceviewer.m r0 = r5.mo17754z()     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.e r0 = r0.f362081i     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            com.google.android.libraries.ar.faceviewer.a.b.d r0 = r0.f35563d     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c.d r1 = r0.f35362e     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0071
            com.google.android.libraries.ar.faceviewer.c.a r1 = (com.google.android.libraries.p579ar.faceviewer.p588c.C10650a) r1     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c r1 = r1.f35549e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.e r1 = r1.f35544c     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.a.e.au r1 = r1.f35565f     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.a.e.k r1 = r1.f35438h     // Catch:{ all -> 0x0075 }
            r1.mo18659d()     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c.d r1 = r0.f35362e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c.a r1 = (com.google.android.libraries.p579ar.faceviewer.p588c.C10650a) r1     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c r1 = r1.f35549e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.a.c.b r1 = r1.f35542a     // Catch:{ all -> 0x0075 }
            java.util.Map r2 = r1.f35393f     // Catch:{ all -> 0x0075 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0075 }
        L_0x0035:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0075 }
            com.google.common.base.ci r3 = (com.google.common.base.C58872ci) r3     // Catch:{ all -> 0x0075 }
            boolean r4 = r3.f156708a     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x0035
            r3.mo56162g()     // Catch:{ all -> 0x0075 }
            goto L_0x0035
        L_0x0049:
            com.google.android.libraries.ar.faceviewer.c.d r2 = r1.f35390c     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x005b
            com.google.android.libraries.ar.faceviewer.c.a r2 = (com.google.android.libraries.p579ar.faceviewer.p588c.C10650a) r2     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c r2 = r2.f35549e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.a.a.a r2 = r2.f35543b     // Catch:{ all -> 0x0075 }
            com.google.ad.a.q r2 = r2.mo18626a()     // Catch:{ all -> 0x0075 }
        L_0x0057:
            r1.mo18635d(r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0064
        L_0x005b:
            com.google.ad.a.r r2 = com.google.p363ad.p364a.C6694r.f19986j     // Catch:{ all -> 0x0075 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0075 }
            com.google.ad.a.q r2 = (com.google.p363ad.p364a.C6693q) r2     // Catch:{ all -> 0x0075 }
            goto L_0x0057
        L_0x0064:
            com.google.android.libraries.ar.faceviewer.c.d r0 = r0.f35362e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c.a r0 = (com.google.android.libraries.p579ar.faceviewer.p588c.C10650a) r0     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.c r0 = r0.f35549e     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.ar.faceviewer.a.a.a r0 = r0.f35543b     // Catch:{ all -> 0x0075 }
            com.google.common.base.ci r0 = r0.f35346a     // Catch:{ all -> 0x0075 }
            r0.mo56160e()     // Catch:{ all -> 0x0075 }
        L_0x0071:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0075:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r1 = move-exception
            com.google.android.apps.search.faceviewer.C132685i.m215683a(r0, r1)
        L_0x007e:
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.faceviewer.C132686j.onStop():void");
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
            if (!this.f362070e) {
                super.onAttach(context);
                if (this.f362068c == null) {
                    Object jN = mo110881d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C132686j) {
                        C132686j jVar = (C132686j) fragment;
                        C68225k.m98532d(jVar);
                        ((C74176nj) jN).mo69740fX();
                        this.f362068c = new C132689m(jVar, (C60888db) ((C74176nj) jN).f206677a.p.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.j.mo17428b(), new WebXFaceViewerWebImplementation(((C74176nj) jN).mo69766fx(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69740fX(), ((C74176nj) jN).mo69787gR()), new C132679a(((C38769r) ((C74176nj) jN).f206730b.f198027a.f199228b.mo66461ij()).mo41618a(C38828b.FACEVIEWER)), ((C74176nj) jN).f206677a.a.f202650bA);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f362067a));
                    } else {
                        String obj = C132689m.class.toString();
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
                C132685i.m215683a(th, th2);
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

package com.google.android.apps.search.webglide.navroot;

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
import androidx.navigation.fragment.C3884h;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.webglide.p10699b.C142170a;
import com.google.android.apps.search.webglide.p10699b.C142173d;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.apps.search.webglide.p10699b.C142177h;
import com.google.android.apps.search.webglide.p10699b.C142180k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
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
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.webglide.navroot.o */
/* compiled from: PG */
public final class C142240o extends C142229d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142241p f385871a;

    /* renamed from: c */
    private Context f385872c;

    /* renamed from: d */
    private final C2393x f385873d = new C2393x(this);

    /* renamed from: e */
    private boolean f385874e;

    @Deprecated
    public C142240o() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117071b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385872c == null) {
            this.f385872c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385872c;
    }

    /* renamed from: f */
    public final C142241p mo17754z() {
        C142241p pVar = this.f385871a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385874e) {
            return pVar;
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
        return this.f385873d;
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
            C142239n.m230931a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C142241p f = mo17754z();
            if ("android.intent.action.MAIN".equals(f.f385878d.getIntent().getAction()) && f.f385878d.getIntent().getCategories() != null && f.f385878d.getIntent().getCategories().contains("android.intent.category.LAUNCHER")) {
                if (C142174e.m230796b(f.f385878d.getIntent(), f.f385879e.f385686a).f385678b.isEmpty()) {
                    C142174e eVar = f.f385879e;
                    C142170a aVar = (C142170a) C142173d.f385675i.createBuilder();
                    C58485gu guVar = C142241p.f385875a;
                    aVar.copyOnWrite();
                    C142173d dVar = (C142173d) aVar.instance;
                    dVar.mo117042a();
                    C62947c.addAll((Iterable) guVar, (List) dVar.f385678b);
                    aVar.copyOnWrite();
                    C142173d dVar2 = (C142173d) aVar.instance;
                    dVar2.f385677a |= 1;
                    dVar2.f385679c = 2;
                    C142177h hVar = (C142177h) C142180k.f385703q.createBuilder();
                    hVar.copyOnWrite();
                    C142180k kVar = (C142180k) hVar.instance;
                    kVar.f385705a |= 4;
                    kVar.f385708d = true;
                    hVar.copyOnWrite();
                    C142180k kVar2 = (C142180k) hVar.instance;
                    kVar2.f385705a = 2 | kVar2.f385705a;
                    kVar2.f385707c = false;
                    hVar.copyOnWrite();
                    C142180k kVar3 = (C142180k) hVar.instance;
                    kVar3.f385705a |= 256;
                    kVar3.f385714j = true;
                    hVar.copyOnWrite();
                    C142180k kVar4 = (C142180k) hVar.instance;
                    kVar4.f385705a |= 128;
                    kVar4.f385713i = false;
                    hVar.copyOnWrite();
                    C142180k kVar5 = (C142180k) hVar.instance;
                    kVar5.f385705a |= 512;
                    kVar5.f385715k = true;
                    hVar.copyOnWrite();
                    C142180k kVar6 = (C142180k) hVar.instance;
                    kVar6.f385705a |= 1024;
                    kVar6.f385716l = false;
                    C142180k kVar7 = (C142180k) hVar.build();
                    aVar.copyOnWrite();
                    C142173d dVar3 = (C142173d) aVar.instance;
                    kVar7.getClass();
                    dVar3.f385681e = kVar7;
                    dVar3.f385677a |= 4;
                    aVar.copyOnWrite();
                    C142173d dVar4 = (C142173d) aVar.instance;
                    dVar4.f385683g = 1;
                    dVar4.f385677a |= 16;
                    eVar.mo41490e((C142173d) aVar.build());
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142239n.m230931a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142241p f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.webglide_nav_root_fragment, viewGroup, false);
            if (((C3884h) f.f385876b.getChildFragmentManager().f634a.mo670b(R.id.webglide_nav_host_container)) == null) {
                C3884h b = f.f385877c.mo50481b(R.navigation.webglide_nav_graph, C46490k.m82869b("1").mo50504d());
                C0154a aVar = new C0154a(f.f385876b.getChildFragmentManager());
                aVar.mo511h(R.id.webglide_nav_host_container, b, (String) null, 1);
                aVar.mo518o(b);
                aVar.mo509f();
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C142239n.m230931a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385874e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142239n.m230931a(th, th);
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
            C142239n.m230931a(th, th);
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
            if (!this.f385874e) {
                super.onAttach(context);
                if (this.f385871a == null) {
                    Object jN = mo117070a().mo17653jN();
                    this.f385871a = new C142241p((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C142174e) ((C74176nj) jN).f206656F.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385873d));
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
                C142239n.m230931a(th, th2);
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

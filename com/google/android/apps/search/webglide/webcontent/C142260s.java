package com.google.android.apps.search.webglide.webcontent;

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
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.logging.p3046g.C39214t;
import com.google.android.libraries.search.logging.p3046g.C39215u;
import com.google.android.libraries.search.logging.p3046g.C39216v;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.protobuf.C62940bt;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.webglide.webcontent.s */
/* compiled from: PG */
public final class C142260s extends C142246e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142263v f385941a;

    /* renamed from: c */
    private Context f385942c;

    /* renamed from: d */
    private final C2393x f385943d = new C2393x(this);

    /* renamed from: e */
    private boolean f385944e;

    @Deprecated
    public C142260s() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117083b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385942c == null) {
            this.f385942c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385942c;
    }

    /* renamed from: f */
    public final C142263v mo17754z() {
        C142263v vVar = this.f385941a;
        if (vVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385944e) {
            return vVar;
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
        return this.f385943d;
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
            C142259r.m230973a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142263v f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.webglide_web_entry_fragment, viewGroup, false);
            C28306ab abVar = f.f385954g;
            C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(126267));
            C62940bt btVar = C39216v.f103175a;
            C39214t tVar = (C39214t) C39215u.f103167f.createBuilder();
            String str = f.f385953f.f385726b;
            tVar.copyOnWrite();
            C39215u uVar = (C39215u) tVar.instance;
            str.getClass();
            uVar.f103169a |= 1;
            uVar.f103170b = str;
            a.mo33858f(new C28353e(btVar, (C39215u) tVar.build()));
            C28439i c = abVar.mo33802c(inflate, a);
            if (f.f385950c.getChildFragmentManager().f634a.mo671c("webglide-default-web-coordinator") == null) {
                C43861g b = C43864j.m77436b(f.f385949b);
                C43262m mVar = f.f385952e;
                C43255f m = C43257h.m76306m(f.f385953f.f385726b);
                m.f113051b.mo55433l(Collections.unmodifiableMap(f.f385953f.f385734j));
                m.mo46346g(true);
                m.mo46344e(f.f385958k.f385693b);
                mVar.mo46333b(m.mo46365k());
                C0154a aVar = new C0154a(f.f385950c.getChildFragmentManager());
                aVar.mo511h(R.id.webglide_web_container, b, "webglide-default-web-coordinator", 1);
                aVar.mo509f();
                b.mo17754z().mo46875c((Fragment) f.f385951d.apply(new C142257p(f.f385949b, f.f385953f)));
            }
            if (f.f385958k.f385698g) {
                f.f385957j.mo50707a(f.f385955h.mo46470a(C142261t.f385945a), new C142262u(f, c));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C142259r.m230973a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385944e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142259r.m230973a(th, th);
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
            C142259r.m230973a(th, th);
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
            if (!this.f385944e) {
                super.onAttach(context);
                if (this.f385941a == null) {
                    Object jN = mo117082a().mo17653jN();
                    C43251d fx = ((C74176nj) jN).mo69766fx();
                    C142185p eF = ((C74176nj) jN).mo69669eF();
                    C142256o oVar = C142256o.f385935a;
                    C68225k.m98532d(oVar);
                    this.f385941a = new C142263v((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, fx, eF, oVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69737fU(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C142176g) ((C74176nj) jN).f206730b.f198027a.f199480fn.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385943d));
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
                C142259r.m230973a(th, th2);
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

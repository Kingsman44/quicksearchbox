package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10274b.C135622d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.C135670l;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10282h.C135700b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10283i.C135710d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.C135830e;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c.C135931f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.p3358b.p3359a.C43393f;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.common.p4522b.C58528ij;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.b */
/* compiled from: PG */
public final class C136070b extends C136078bd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136091i f370588a;

    /* renamed from: c */
    private Context f370589c;

    /* renamed from: d */
    private final C2393x f370590d = new C2393x(this);

    /* renamed from: e */
    private boolean f370591e;

    @Deprecated
    public C136070b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136091i mo17754z() {
        C136091i iVar = this.f370588a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370591e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112729b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370589c == null) {
            this.f370589c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370589c;
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
        return this.f370590d;
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
            C136038a.m220902a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136091i a = mo17754z();
            a.f370638b.mo50828h(R.id.googleapp_browser_bottombar_data_subscription, new C136105w(a.f370639c), a.f370644h);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136038a.m220902a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136091i a = mo17754z();
            if (a.f370640d.isEmpty()) {
                view = new ViewStub(a.f370643g);
            } else {
                view = (ViewGroup) layoutInflater.cloneInContext(a.f370643g).inflate(R.layout.googleapp_browser_fragment_bottombar_actions, viewGroup, false);
                C28306ab abVar = a.f370642f;
                abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(109865)));
            }
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C136038a.m220902a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370591e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136038a.m220902a(th, th);
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
            C136038a.m220902a(th, th);
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
            if (!this.f370591e) {
                super.onAttach(context);
                if (this.f370588a == null) {
                    Object jN = mo112734d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136070b) {
                        C136070b bVar = (C136070b) fragment;
                        C68225k.m98532d(bVar);
                        C136106x xVar = new C136106x(((C74176nj) jN).f206730b.mo66142ci(), (C71422aw) ((C74176nj) jN).f206677a.H.mo17428b(), (C69585o) ((C74176nj) jN).f206677a.G.mo17428b());
                        C58528ij F = C58528ij.m90006F(((C74176nj) jN).mo69831hI());
                        C58485gu t = C58485gu.m89852t(C135622d.class, C43393f.class, C135830e.class, C135931f.class, C135700b.class, C135710d.class, C135670l.class);
                        C68225k.m98532d(t);
                        this.f370588a = new C136091i(bVar, (C46855i) ((C74176nj) jN).f207083j.mo17428b(), xVar, F, t, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370590d));
                    } else {
                        String obj = C136091i.class.toString();
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
                C136038a.m220902a(th2, th3);
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

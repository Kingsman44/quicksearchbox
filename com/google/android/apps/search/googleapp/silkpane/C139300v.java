package com.google.android.apps.search.googleapp.silkpane;

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
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c;
import com.google.android.libraries.web.contrib.p3358b.p3359a.C43389b;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.v */
/* compiled from: PG */
public final class C139300v extends C139276ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139301w f378865a;

    /* renamed from: c */
    private Context f378866c;

    /* renamed from: d */
    private final C2393x f378867d = new C2393x(this);

    /* renamed from: e */
    private boolean f378868e;

    @Deprecated
    public C139300v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139301w mo17754z() {
        C139301w wVar = this.f378865a;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378868e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114871b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378866c == null) {
            this.f378866c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378866c;
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
        return this.f378867d;
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
            C139299u.m226424a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139301w a = mo17754z();
            ((C59052c) ((C59052c) C139301w.f378869a.mo56224b()).mo56372aa(41363)).mo56389s("Url: %s", a.f378872d.f378833b);
            View inflate = layoutInflater.inflate(R.layout.googleapp_silk_pane_fragment, viewGroup, false);
            if (a.f378871c.getChildFragmentManager().f634a.mo671c("SILK_PANE_WEB_FRAGMENT") == null) {
                C43861g a2 = C43864j.m77435a(a.f378870b, a.f378872d.f378833b);
                C0154a aVar = new C0154a(a.f378871c.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_silk_pane_fragment_container, a2, "SILK_PANE_WEB_FRAGMENT", 1);
                C139280b bVar = a.f378872d;
                if (!bVar.f378834c) {
                    if (bVar.f378835d) {
                        AccountId accountId = a.f378870b;
                        C139290l lVar = new C139290l();
                        C68324h.m98669f(lVar);
                        C47247a.m84047b(lVar, accountId);
                        aVar.mo511h(R.id.googleapp_silk_pane_top_bar, lVar, (String) null, 1);
                    } else {
                        AccountId accountId2 = a.f378870b;
                        C43389b bVar2 = new C43389b();
                        C68324h.m98669f(bVar2);
                        C47247a.m84047b(bVar2, accountId2);
                        aVar.mo511h(R.id.googleapp_silk_pane_top_bar, bVar2, (String) null, 1);
                    }
                }
                if (a.f378872d.f378837f) {
                    aVar.mo511h(R.id.googleapp_silk_pane_loading_bar, C43679c.m77075a(a.f378870b, R.drawable.webx_loading_bar_background, C43675b.f113958d), (String) null, 1);
                }
                aVar.mo509f();
                AccountId accountId3 = a.f378870b;
                C139294p pVar = new C139294p();
                C68324h.m98669f(pVar);
                C47247a.m84047b(pVar, accountId3);
                C43515c.m76782a(a2, pVar);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139299u.m226424a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378868e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139299u.m226424a(th, th);
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
            C139299u.m226424a(th, th);
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
            if (!this.f378868e) {
                super.onAttach(context);
                if (this.f378865a == null) {
                    Object jN = mo114872d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139300v) {
                        C139300v vVar = (C139300v) fragment;
                        C68225k.m98532d(vVar);
                        this.f378865a = new C139301w(accountId, vVar, ((C74176nj) jN).mo69615dE());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378867d));
                    } else {
                        String obj = C139301w.class.toString();
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
                C139299u.m226424a(th, th2);
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

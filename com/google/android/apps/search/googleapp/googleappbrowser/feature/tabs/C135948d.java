package com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10117aa.C133102at;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43269t;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.d */
/* compiled from: PG */
public final class C135948d extends C135951g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private TabsFragmentPeer f370277a;

    /* renamed from: c */
    private Context f370278c;

    /* renamed from: d */
    private final C2393x f370279d = new C2393x(this);

    /* renamed from: e */
    private boolean f370280e;

    @Deprecated
    public C135948d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final TabsFragmentPeer mo17754z() {
        TabsFragmentPeer tabsFragmentPeer = this.f370277a;
        if (tabsFragmentPeer == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370280e) {
            return tabsFragmentPeer;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112648b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370278c == null) {
            this.f370278c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370278c;
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
        return this.f370279d;
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
            C135947c.m220617a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            TabsFragmentPeer a = mo17754z();
            String str = a.f370255d.mo46384b().f112969h;
            if (str != null) {
                a.f370257f.mo50828h(R.id.googleapp_tab_query_subscription, new C133102at(a.f370256e, str), a.f370261j);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135947c.m220617a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370280e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135947c.m220617a(th, th);
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
            C135947c.m220617a(th, th);
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
            if (!this.f370280e) {
                super.onAttach(context);
                if (this.f370277a == null) {
                    Object jN = mo112649d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135948d) {
                        C135948d dVar = (C135948d) fragment;
                        C68225k.m98532d(dVar);
                        C136139t tVar = (C136139t) ((C74176nj) jN).f206677a.a.f202663bN.mo17428b();
                        this.f370277a = new TabsFragmentPeer(dVar, (InstanceStateStoreFactory) ((C74176nj) jN).f206680aC.mo17428b(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66869dp(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C136370a) ((C74176nj) jN).f206724au.mo17428b(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67126kn(), (C133118a) ((C74176nj) jN).f206730b.f198027a.f199877w.mo17428b(), ((C74176nj) jN).mo69766fx());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370279d));
                    } else {
                        String obj = TabsFragmentPeer.class.toString();
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
                C135947c.m220617a(th, th2);
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

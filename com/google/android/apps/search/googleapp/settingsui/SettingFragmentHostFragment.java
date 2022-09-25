package com.google.android.apps.search.googleapp.settingsui;

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
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
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
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SettingFragmentHostFragment extends C139208cc implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139152af f378403a;

    /* renamed from: c */
    private Context f378404c;

    /* renamed from: d */
    private final C2393x f378405d = new C2393x(this);

    /* renamed from: e */
    private boolean f378406e;

    @Deprecated
    public SettingFragmentHostFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139152af mo17754z() {
        C139152af afVar = this.f378403a;
        if (afVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378406e) {
            return afVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114771b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378404c == null) {
            this.f378404c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378404c;
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
        return this.f378405d;
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
            C139151ae.m226079a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139152af a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(true != a.f378462e.mo111861f() ? R.layout.googleapp_settings_fragment_host : R.layout.googleapp_settings_fragment_host_with_recycler_view, viewGroup, false);
            C139219cn e = ((ToolbarView) inflate.findViewById(R.id.googleapp_settings_host_toolbar)).mo17754z();
            String j = a.f378462e.mo111460j();
            C69664n.m101060f(j, "settingSpec.title");
            C69664n.m101061g(j, "title");
            if (e.f378646g) {
                e.mo114847a().mo47439f(j);
            } else {
                e.f378647h.mo2423x(j);
            }
            if (a.f378459b.getChildFragmentManager().f634a.mo671c("HOSTED_FRAGMENT_TAG") == null) {
                C0154a aVar = new C0154a(a.f378459b.getChildFragmentManager());
                aVar.mo689v(R.id.googleapp_settings_hosted_fragment_container, a.f378462e.mo111860c(a.f378458a), "HOSTED_FRAGMENT_TAG");
                aVar.mo509f();
            }
            a.f378460c.mo114856a(new C139158al(a.f378461d));
            C69664n.m101060f(inflate, "mainLayout");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139151ae.m226079a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378406e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139151ae.m226079a(th, th);
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
            C139151ae.m226079a(th, th);
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
            if (!this.f378406e) {
                super.onAttach(context);
                if (this.f378403a == null) {
                    Object jN = mo114832d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof SettingFragmentHostFragment) {
                        SettingFragmentHostFragment settingFragmentHostFragment = (SettingFragmentHostFragment) fragment;
                        C68225k.m98532d(settingFragmentHostFragment);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f378403a = new C139152af(accountId, settingFragmentHostFragment, b, ((C74176nj) jN).mo69829hG(), (C139253b) ((C74176nj) jN).f206730b.f198027a.f199502gI.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378405d));
                    } else {
                        String obj = C139152af.class.toString();
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
                C139151ae.m226079a(th, th2);
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

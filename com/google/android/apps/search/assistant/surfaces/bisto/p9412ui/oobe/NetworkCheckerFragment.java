package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.NetworkCheckerFragment */
/* compiled from: PG */
public final class NetworkCheckerFragment extends C124877cb implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124822ay f344260a;

    /* renamed from: c */
    private Context f344261c;

    /* renamed from: d */
    private final C2393x f344262d = new C2393x(this);

    /* renamed from: e */
    private boolean f344263e;

    @Deprecated
    public NetworkCheckerFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124822ay mo17754z() {
        C124822ay ayVar = this.f344260a;
        if (ayVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344263e) {
            return ayVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106632b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344261c == null) {
            this.f344261c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344261c;
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
        return this.f344262d;
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
            C124819av.m204608a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            ScreenStateView screenStateView = (ScreenStateView) layoutInflater.inflate(R.layout.assistant_oobe_template_screen_root, viewGroup, false);
            screenStateView.mo106777c();
            C47831fm.m85019n();
            return screenStateView;
        } catch (Throwable th) {
            C124819av.m204608a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344263e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124819av.m204608a(th, th);
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
            C124819av.m204608a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C124822ay a = mo17754z();
            a.f344376b.requireContext().unregisterReceiver(a.f344375a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124819av.m204608a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C124822ay a = mo17754z();
            a.f344376b.requireContext().registerReceiver(a.f344375a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (!a.mo106659b()) {
                GlifLayout glifLayout = (GlifLayout) ((ScreenStateView) a.f344376b.requireView().findViewById(R.id.assistant_oobe_template_screen_root)).mo106775a(C125009e.MAIN, R.layout.assistant_bisto_oobe_generic);
                glifLayout.mo49196r(R.string.assistant_bisto_network_error_title);
                glifLayout.mo49194p(R.string.assistant_bisto_network_error_message);
                C45276c c = C124849bt.m204632c(a.f344376b.requireContext());
                c.mo49181b(R.string.assistant_bisto_network_settings_button);
                c.f118281b = new C124820aw(a);
                c.f118282c = 5;
                ((C45275b) glifLayout.mo49129j(C45275b.class)).mo49175f(c.mo49180a());
            } else {
                a.mo106658a();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C124819av.m204608a(th, th);
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
            if (!this.f344263e) {
                super.onAttach(context);
                if (this.f344260a == null) {
                    Object jN = mo106698d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof NetworkCheckerFragment) {
                        NetworkCheckerFragment networkCheckerFragment = (NetworkCheckerFragment) fragment;
                        C68225k.m98532d(networkCheckerFragment);
                        this.f344260a = new C124822ay(networkCheckerFragment, ((C74176nj) jN).f206677a.n(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo70006p(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344262d));
                    } else {
                        String obj = C124822ay.class.toString();
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
                C124819av.m204608a(th, th2);
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

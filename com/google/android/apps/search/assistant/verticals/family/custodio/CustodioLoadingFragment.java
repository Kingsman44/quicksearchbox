package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
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
import com.google.common.p4522b.C58485gu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class CustodioLoadingFragment extends C132315fi implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132189br f360539a;

    /* renamed from: c */
    private Context f360540c;

    /* renamed from: d */
    private final C2393x f360541d = new C2393x(this);

    /* renamed from: e */
    private boolean f360542e;

    @Deprecated
    public CustodioLoadingFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132189br mo17754z() {
        C132189br brVar = this.f360539a;
        if (brVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360542e) {
            return brVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110424b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360540c == null) {
            this.f360540c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360540c;
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
        return this.f360541d;
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
            C132187bp.m214837a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132189br a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_custodio_loading_screen, viewGroup, false);
            String string = a.f360814e.getString("entry_point_id");
            String string2 = a.f360814e.getString("supervised_oid");
            if (string2 == null || string == null) {
                throw new IllegalStateException("Not provided with required argument!");
            }
            a.f360816g.mo50707a(a.f360815f.mo110507g(string, C58485gu.m89846n(string2)), a.f360818i);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132187bp.m214837a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360542e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132187bp.m214837a(th, th);
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
            C132187bp.m214837a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C132189br a = mo17754z();
            a.f360819j.mo19974a(C37176a.f97211hK);
            a.mo110530b();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132187bp.m214837a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C132189br a = mo17754z();
            a.f360819j.mo19974a(C37176a.f97210hJ);
            ArrayList arrayList = new ArrayList(C58485gu.m89848p(a.f360813d.getString(R.string.assistant_custodio_loading_screen_title_one), a.f360813d.getString(R.string.assistant_custodio_loading_screen_title_two), a.f360813d.getString(R.string.assistant_custodio_loading_screen_title_three)));
            View view = a.f360813d.getView();
            Objects.requireNonNull(view);
            a.f360811b = new C132188bq(a, (TextView) view.findViewById(R.id.assistant_custodio_loading_screen_main_title), arrayList);
            a.f360811b.start();
            e.close();
            return;
        } catch (Throwable th) {
            C132187bp.m214837a(th, th);
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
            if (!this.f360542e) {
                super.onAttach(context);
                if (this.f360539a == null) {
                    Object jN = mo110617d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof CustodioLoadingFragment) {
                        CustodioLoadingFragment custodioLoadingFragment = (CustodioLoadingFragment) fragment;
                        C68225k.m98532d(custodioLoadingFragment);
                        this.f360539a = new C132189br(custodioLoadingFragment, (C132140a) ((C74176nj) jN).f206730b.f198027a.f199474fh.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360541d));
                    } else {
                        String obj = C132189br.class.toString();
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
                C132187bp.m214837a(th, th2);
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

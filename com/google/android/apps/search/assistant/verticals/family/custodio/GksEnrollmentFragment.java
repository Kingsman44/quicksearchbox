package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
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

/* compiled from: PG */
public final class GksEnrollmentFragment extends C132329fw implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132291em f360593a;

    /* renamed from: c */
    private Context f360594c;

    /* renamed from: d */
    private final C2393x f360595d = new C2393x(this);

    /* renamed from: e */
    private boolean f360596e;

    @Deprecated
    public GksEnrollmentFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132291em mo17754z() {
        C132291em emVar = this.f360593a;
        if (emVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360596e) {
            return emVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110450b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360594c == null) {
            this.f360594c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360594c;
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
        return this.f360595d;
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
            C132288ej.m214958a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132291em a = mo17754z();
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.assistant_gks_unicorn_enrollment_fragment, viewGroup, false);
            String string = a.f361078a.getString(R.string.assistant_gks_enrollment_main_title);
            String string2 = a.f361078a.getString(R.string.assistant_gks_enrollment_main_subtitle, new Object[]{"your child"});
            glifLayout.mo49197s(string);
            glifLayout.mo49195q(string2);
            Context context = glifLayout.getContext();
            C45275b bVar = (C45275b) glifLayout.mo49129j(C45275b.class);
            C45276c cVar = new C45276c(context);
            cVar.f118280a = context.getString(R.string.assistant_gks_enrollment_skip_opa_footer);
            cVar.f118281b = new C132289ek(a);
            cVar.f118282c = 7;
            bVar.mo49176g(cVar.mo49180a(), false);
            C45276c cVar2 = new C45276c(context);
            cVar2.f118280a = context.getString(R.string.assistant_gks_enrollment_enable_opa_footer);
            cVar2.f118281b = new C132290el(a);
            cVar2.f118282c = 5;
            bVar.mo49175f(cVar2.mo49180a());
            C47831fm.m85019n();
            return glifLayout;
        } catch (Throwable th) {
            C132288ej.m214958a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360596e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132288ej.m214958a(th, th);
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
            C132288ej.m214958a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f361080c.mo19974a(C37176a.f97274iU);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132288ej.m214958a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f361080c.mo19974a(C37176a.f97273iT);
            e.close();
            return;
        } catch (Throwable th) {
            C132288ej.m214958a(th, th);
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
            if (!this.f360596e) {
                super.onAttach(context);
                if (this.f360593a == null) {
                    Object jN = mo110645d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof GksEnrollmentFragment) {
                        GksEnrollmentFragment gksEnrollmentFragment = (GksEnrollmentFragment) fragment;
                        C68225k.m98532d(gksEnrollmentFragment);
                        this.f360593a = new C132291em(context2, gksEnrollmentFragment, (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360595d));
                    } else {
                        String obj = C132291em.class.toString();
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
                C132288ej.m214958a(th, th2);
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

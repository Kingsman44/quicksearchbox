package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

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
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.b */
/* compiled from: PG */
public final class C36752b extends C36764l implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C36755e f95762a;

    /* renamed from: c */
    private Context f95763c;

    /* renamed from: d */
    private final C2393x f95764d = new C2393x(this);

    /* renamed from: e */
    private boolean f95765e;

    @Deprecated
    public C36752b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C36755e mo17754z() {
        C36755e eVar = this.f95762a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f95765e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo40368b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f95763c == null) {
            this.f95763c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f95763c;
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
        return this.f95764d;
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
            C36688a.m65286a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C36755e a = mo17754z();
            a.f95773f.mo50429i(a.f95781n);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C36688a.m65286a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C36755e a = mo17754z();
            a.f95777j.mo19974a(C37176a.f97291il);
            View inflate = layoutInflater.inflate(R.layout.assistant_oobe_account_container_fragment, viewGroup, false);
            GlifLayout glifLayout = (GlifLayout) inflate.findViewById(R.id.assistant_oobe_account_fragment_layout);
            a.f95776i.mo50707a(a.f95779l.mo50245b(), a.f95784q);
            C45276c cVar = new C45276c(a.f95769b);
            cVar.mo49181b(R.string.assistant_oobe_account_screen_action_button_text);
            cVar.f118283d = R.style.AssistantOnboardingButtonPrimary;
            cVar.f118281b = new C47591co(a.f95770c, "Sign in button clicked", new C36754d(a));
            cVar.f118282c = 5;
            ((C45275b) glifLayout.mo49129j(C45275b.class)).mo49175f(cVar.mo49180a());
            a.f95774g.mo33802c(glifLayout.findViewById(R.id.assistant_oobe_empty_action_button), a.f95775h.mo33805a(C28427h.m53115a(152773)));
            a.f95774g.mo33802c(glifLayout, a.f95775h.mo33805a(C28427h.m53115a(152774)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C36688a.m65286a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f95765e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C36688a.m65286a(th, th);
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
            C36688a.m65286a(th, th);
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
            if (!this.f95765e) {
                super.onAttach(context);
                if (this.f95762a == null) {
                    Object jN = mo40375d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C36752b) {
                        C36752b bVar = (C36752b) fragment;
                        C68225k.m98532d(bVar);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f95762a = new C36755e(bVar, b, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).f206730b.mo66320gA(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f95764d));
                    } else {
                        String obj = C36755e.class.toString();
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
                C36688a.m65286a(th2, th3);
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

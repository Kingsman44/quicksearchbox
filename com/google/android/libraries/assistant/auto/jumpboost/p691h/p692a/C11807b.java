package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

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
import androidx.navigation.fragment.C3883g;
import androidx.navigation.fragment.C3884h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p891b.C13146a;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.p892a.C13173b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.contrib.p3629c.C46493n;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.b */
/* compiled from: PG */
public final class C11807b extends C11817l implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C11812g f37969a;

    /* renamed from: c */
    private Context f37970c;

    /* renamed from: d */
    private final C2393x f37971d = new C2393x(this);

    /* renamed from: e */
    private boolean f37972e;

    @Deprecated
    public C11807b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C11812g mo17754z() {
        C11812g gVar = this.f37969a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f37972e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo20163b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f37970c == null) {
            this.f37970c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f37970c;
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
        return this.f37971d;
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
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C11812g a = mo17754z();
            a.f37984h.mo50429i(a.f37986j);
            a.f37984h.mo50429i(a.f37987k);
            a.f37984h.mo50429i(a.f37988l);
            a.f37989m.mo19974a(C37179a.f97583cw);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C11812g a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C58833ax a2 = a.mo20164a();
            if (a2.mo56113h()) {
                a.f37990n.mo22369a(a.f37989m, (Intent) a2.mo56107c());
            }
            if ((a.f37994r.f38003a & 1) != 0) {
                a.f37989m.mo19974a(C37179a.f97535cA.mo40811d(a.f37994r.f38004b));
            }
            a.f37989m.mo19974a(C37179a.f97584cx);
            View inflate = layoutInflater.inflate(R.layout.assistant_projected_fragment, viewGroup, false);
            Bundle bundle2 = new Bundle();
            C46493n.m82876a(bundle2, a.f37979c);
            C3884h a3 = C3883g.m11185a(R.navigation.aap_navigation_graph, bundle2);
            C0154a aVar = new C0154a(a.f37983g.getChildFragmentManager());
            aVar.mo511h(R.id.nav_host_fragment, a3, (String) null, 1);
            aVar.mo518o(a3);
            aVar.mo509f();
            C58833ax a4 = a.mo20164a();
            if (a4.mo56113h() && ((Intent) a4.mo56107c()).getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_START_MEDIA_REC", false)) {
                a.f37980d.mo50482c(a3).mo50506b(R.id.aap_media_rec_screen);
            }
            a.f37989m.mo19974a(C37179a.f97585cy);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f37972e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
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
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C11812g a = mo17754z();
            a.f37995s = false;
            a.f37989m.mo19974a(C37179a.f97507bZ);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z().f37995s = true;
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C11812g a = mo17754z();
            C47393f.m84233d(this, C13146a.class, new C11813h(a));
            C47393f.m84233d(this, C13173b.class, new C11814i(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C11806a.m27464a(th, th);
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
            if (!this.f37972e) {
                super.onAttach(context);
                if (this.f37969a == null) {
                    this.f37969a = ((C11815j) mo20170d().mo17653jN()).mo20168eH();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f37971d));
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
                C11806a.m27464a(th, th2);
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

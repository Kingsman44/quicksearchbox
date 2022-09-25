package com.google.android.apps.search.podcasts.playerpanel.p10598a;

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
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.playerpanel.C140853a;
import com.google.android.apps.search.podcasts.widgets.valueselector.HorizontalValueSelector;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.b */
/* compiled from: PG */
public final class C140855b extends C140868o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140858e f382498a;

    /* renamed from: c */
    private Context f382499c;

    /* renamed from: d */
    private final C2393x f382500d = new C2393x(this);

    /* renamed from: e */
    private boolean f382501e;

    @Deprecated
    public C140855b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140858e mo17754z() {
        C140858e eVar = this.f382498a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382501e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115949b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382499c == null) {
            this.f382499c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382499c;
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
        return this.f382500d;
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
            C140854a.m228754a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140858e a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C69648ae aeVar = new C69648ae();
            aeVar.f186027a = layoutInflater.inflate(R.layout.podcasts_sleep_timer_settings, viewGroup, false);
            a.f382505a.mo51252a(((View) aeVar.f186027a).findViewById(R.id.podcasts_close_sleep_timer_setting), new C140853a());
            Object obj = aeVar.f186027a;
            C69664n.m101060f(obj, "rootView");
            HorizontalValueSelector a2 = C140859f.m228764a((View) obj);
            C58480gp e = C58485gu.m89837e();
            for (int i = 0; i < 21; i++) {
                e.mo55395g(new C140867n((i * 5) + 5));
            }
            a2.mo116314b(e.mo55394f());
            Object obj2 = aeVar.f186027a;
            C69664n.m101060f(obj2, "rootView");
            C140859f.m228764a((View) obj2).mo116315c(new C140867n(30), false);
            C140997s sVar = a.f382508d;
            View findViewById = ((View) aeVar.f186027a).findViewById(R.id.podcasts_end_of_episode);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.….podcasts_end_of_episode)");
            sVar.mo116063b(findViewById, new C140856c(a), "ClosePlayerPanelEvent");
            C140997s sVar2 = a.f382508d;
            View findViewById2 = ((View) aeVar.f186027a).findViewById(R.id.podcasts_start_sleep_timer);
            C69664n.m101060f(findViewById2, "rootView.findViewById(R.…dcasts_start_sleep_timer)");
            sVar2.mo116063b(findViewById2, new C140857d(a, aeVar), "ClosePlayerPanelEvent");
            C28306ab abVar = a.f382507c;
            abVar.mo33801b((View) aeVar.f186027a, abVar.f76990a.mo33805a(C28427h.m53115a(70847)));
            a.f382507c.mo33801b(((View) aeVar.f186027a).findViewById(R.id.podcasts_end_of_episode), a.f382507c.f76990a.mo33805a(C28427h.m53115a(70854)));
            a.f382507c.mo33801b(((View) aeVar.f186027a).findViewById(R.id.podcasts_start_sleep_timer), a.f382507c.f76990a.mo33805a(C28427h.m53115a(70852)));
            View view = (View) aeVar.f186027a;
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C140854a.m228754a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382501e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140854a.m228754a(th, th);
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
            C140854a.m228754a(th, th);
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
            if (!this.f382501e) {
                super.onAttach(context);
                if (this.f382498a == null) {
                    Object jN = mo115960d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C140855b) {
                        C68225k.m98532d((C140855b) fragment);
                        this.f382498a = new C140858e((C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C140997s) ((C74176nj) jN).f206757ba.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382500d));
                    } else {
                        String obj = C140858e.class.toString();
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
                C140854a.m228754a(th, th2);
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

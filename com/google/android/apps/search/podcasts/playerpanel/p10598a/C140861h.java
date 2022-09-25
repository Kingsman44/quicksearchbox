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
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.h */
/* compiled from: PG */
public final class C140861h extends C140869p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140866m f382509a;

    /* renamed from: c */
    private Context f382510c;

    /* renamed from: d */
    private final C2393x f382511d = new C2393x(this);

    /* renamed from: e */
    private boolean f382512e;

    @Deprecated
    public C140861h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140866m mo17754z() {
        C140866m mVar = this.f382509a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382512e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115951b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382510c == null) {
            this.f382510c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382510c;
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
        return this.f382511d;
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
            C140860g.m228765a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C140866m a = mo17754z();
            a.f382518b.mo50828h(R.id.podcasts_player_state_sleep_timer_subscription, a.f382520d.mo115880b(), a.f382525i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140860g.m228765a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140866m a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_sleep_timer_status, viewGroup, false);
            a.f382519c.mo51252a(inflate.findViewById(R.id.podcasts_close_sleep_timer_status), new C140853a());
            C140997s sVar = a.f382523g;
            View findViewById = inflate.findViewById(R.id.podcasts_stop_sleep_timer);
            C69664n.m101060f(findViewById, "rootView.findViewById<Vi…odcasts_stop_sleep_timer)");
            sVar.mo116063b(findViewById, new C140863j(a), "stop sleep timer and close player panel");
            C140997s sVar2 = a.f382523g;
            C69664n.m101060f(inflate, "rootView");
            View findViewById2 = inflate.findViewById(R.id.podcasts_add_five);
            C69664n.m101060f(findViewById2, "rootView.getAddFiveButton()");
            sVar2.mo116062a(findViewById2, new C140864k(a), "add 5 minutes to sleep timer");
            C140997s sVar3 = a.f382523g;
            C69664n.m101060f(inflate, "rootView");
            View findViewById3 = inflate.findViewById(R.id.podcasts_minus_five);
            C69664n.m101060f(findViewById3, "rootView.getMinusFiveButton()");
            sVar3.mo116062a(findViewById3, new C140865l(a), "remove 5 minutes to sleep timer");
            C28306ab abVar = a.f382522f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(70848)));
            C28306ab abVar2 = a.f382522f;
            C69664n.m101060f(inflate, "rootView");
            abVar2.mo33801b(inflate.findViewById(R.id.podcasts_add_five), a.f382522f.f76990a.mo33805a(C28427h.m53115a(70855)));
            C28306ab abVar3 = a.f382522f;
            C69664n.m101060f(inflate, "rootView");
            abVar3.mo33801b(inflate.findViewById(R.id.podcasts_minus_five), a.f382522f.f76990a.mo33805a(C28427h.m53115a(70856)));
            a.f382522f.mo33801b(inflate.findViewById(R.id.podcasts_stop_sleep_timer), a.f382522f.f76990a.mo33805a(C28427h.m53115a(70857)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140860g.m228765a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382512e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140860g.m228765a(th, th);
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
            C140860g.m228765a(th, th);
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
            if (!this.f382512e) {
                super.onAttach(context);
                if (this.f382509a == null) {
                    Object jN = mo115962d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C140861h) {
                        C140861h hVar = (C140861h) fragment;
                        C68225k.m98532d(hVar);
                        this.f382509a = new C140866m(hVar, (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), (C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C140997s) ((C74176nj) jN).f206757ba.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382511d));
                    } else {
                        String obj = C140866m.class.toString();
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
                C140860g.m228765a(th, th2);
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

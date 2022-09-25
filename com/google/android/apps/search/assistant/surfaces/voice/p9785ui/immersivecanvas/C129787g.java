package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129723f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129766b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
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
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.g */
/* compiled from: PG */
public final class C129787g extends C129742ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129739aa f356124a;

    /* renamed from: c */
    private Context f356125c;

    /* renamed from: d */
    private final C2393x f356126d = new C2393x(this);

    /* renamed from: e */
    private boolean f356127e;

    @Deprecated
    public C129787g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129739aa mo17754z() {
        C129739aa aaVar = this.f356124a;
        if (aaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356127e) {
            return aaVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109214b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356125c == null) {
            this.f356125c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356125c;
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
        return this.f356126d;
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
            C129785f.m211906a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129739aa a = mo17754z();
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38417)).mo56386p("ImmersiveCanvasFragment onCreate called");
            if (a.f356025b.getChildFragmentManager().f634a.mo671c("ImmersiveCanvasPlateFragment") == null) {
                C0154a aVar = new C0154a(a.f356025b.getChildFragmentManager());
                AccountId accountId = a.f356028e;
                C129766b bVar = new C129766b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                aVar.mo511h(R.id.assistant_canvas_plate, bVar, "ImmersiveCanvasPlateFragment", 1);
                aVar.mo509f();
            }
            a.f356026c.mo107946e(R.id.assistant_canvas_local_subscription, new C129852z(a), C129791k.f356131a);
            a.f356038o.mo108516a(R.id.assistant_continuous_match_event_subscription, new C129723f(new C129792l(a)));
            a.f356032i.mo50829i(R.id.assistant_canvas_error_subscription, a.f356026c.mo107944c(), new C129793m(a), C129794n.f356134a);
            a.f356034k.mo5790b(a.f356035l);
            a.f356032i.mo50828h(R.id.assistant_canvas_timeout_subscription, a.f356033j.mo108517a(), new C129795o(a));
            a.f356032i.mo50828h(R.id.assistant_canvas_state_subscription, a.f356026c.mo107943b(), new C129796p(a));
            a.f356037n = (ImmersiveCanvasViewModel) new C2368bp(a.f356025b).mo5770a(ImmersiveCanvasViewModel.class);
            FragmentManager childFragmentManager = a.f356025b.getChildFragmentManager();
            if (((C129320i) childFragmentManager.f634a.mo671c("SUGGESTION_FRAGMENT_TAG")) == null) {
                C129320i f = C129320i.m211126f(a.f356028e);
                C0154a aVar2 = new C0154a(childFragmentManager);
                aVar2.mo511h(R.id.assistant_canvas_suggestion_chip_wrapper, f, "SUGGESTION_FRAGMENT_TAG", 1);
                aVar2.mo509f();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129785f.m211906a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129739aa a = mo17754z();
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38408)).mo56386p("ImmersiveCanvasFragment onCreateView");
            C0167am activity = a.f356025b.getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C129739aa.f356023a.mo56226d()).mo56382g(e)).mo56372aa(38422)).mo56386p("setRequestedOrientation: Unable to setRequestedOrientation.");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C129785f.m211906a(th, th2);
            }
            throw th;
        }
        View inflate = layoutInflater.inflate(R.layout.assistant_canvas_fragment, viewGroup, false);
        C47831fm.m85019n();
        return inflate;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356127e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129785f.m211906a(th, th);
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
            C129785f.m211906a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C129739aa a = mo17754z();
            C0167am activity = a.f356025b.getActivity();
            if (activity != null && !activity.isChangingConfigurations() && a.f356031h.mo109220b()) {
                ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38419)).mo56386p("Stopping CMM since the Canvas fragment is being paused");
                a.f356039p.mo109206a();
                Optional.ofNullable(a.mo109207a()).ifPresent(C129803w.f356143a);
                Optional.ofNullable((C129766b) a.f356025b.getChildFragmentManager().f634a.mo671c("ImmersiveCanvasPlateFragment")).ifPresent(C129850x.f356249a);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129785f.m211906a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129739aa a = mo17754z();
            C128567c.m209821d(view, new C129851y(view));
            a.mo109210f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129785f.m211906a(th, th);
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
            if (!this.f356127e) {
                super.onAttach(context);
                if (this.f356124a == null) {
                    this.f356124a = ((C129740ab) mo109215d().mo17653jN()).mo109212ax();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356126d));
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
                C129785f.m211906a(th, th2);
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

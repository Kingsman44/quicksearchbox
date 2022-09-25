package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9791a.C129014f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129018d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129021g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.p9808a.C129288b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129621e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a.C130150a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d.C130235b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d.C130244k;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9876e.C130253c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130304b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130308f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130309g;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.r */
/* compiled from: PG */
public final class C130299r extends C130172av implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130158ah f357166a;

    /* renamed from: c */
    private Context f357167c;

    /* renamed from: d */
    private final C2393x f357168d = new C2393x(this);

    /* renamed from: e */
    private boolean f357169e;

    @Deprecated
    public C130299r() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130158ah mo17754z() {
        C130158ah ahVar = this.f357166a;
        if (ahVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357169e) {
            return ahVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109548b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357167c == null) {
            this.f357167c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357167c;
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
        return this.f357168d;
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
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130158ah a = mo17754z();
            if (a.f356865b.f357132b) {
                a.f356863G = C129621e.m211643a(a.f356885v, "CLIENT_OP");
            }
            C130150a aVar = a.f356864H;
            C130299r rVar = a.f356866c;
            aVar.f356848a = rVar;
            a.f356860D = (ResponseInfoViewModel) new C2368bp(rVar).mo5770a(ResponseInfoViewModel.class);
            C130171au auVar = a.f356880q;
            ResponseInfoViewModel responseInfoViewModel = a.f356860D;
            C69664n.m101061g(responseInfoViewModel, "responseInfoViewModel");
            auVar.f356905f = responseInfoViewModel;
            a.f356861E = (TtsViewModel) new C2368bp(a.f356866c).mo5770a(TtsViewModel.class);
            a.f356862F = (ResetFocusViewModel) new C2368bp(a.f356866c).mo5770a(ResetFocusViewModel.class);
            C130149a aVar2 = a.f356882s;
            aVar2.f356845d = (BackNavigationTupleListViewModel) new C2368bp(aVar2.f356843b).mo5770a(BackNavigationTupleListViewModel.class);
            FragmentManager childFragmentManager = a.f356866c.getChildFragmentManager();
            if (((C129320i) childFragmentManager.f634a.mo671c("SUGGESTION_FRAGMENT_TAG")) == null) {
                C129320i f = C129320i.m211126f(a.f356867d);
                C0154a aVar3 = new C0154a(childFragmentManager);
                aVar3.mo511h(R.id.assistant_suggestion_container, f, "SUGGESTION_FRAGMENT_TAG", 1);
                aVar3.mo509f();
            }
            if (((C130235b) childFragmentManager.f634a.mo671c("FEEDBACK_FRAGMENT_TAG")) == null) {
                C130235b a2 = C130244k.m212635a(a.f356867d);
                C0154a aVar4 = new C0154a(childFragmentManager);
                aVar4.mo511h(R.id.assistant_csat_container, a2, "FEEDBACK_FRAGMENT_TAG", 1);
                aVar4.mo509f();
            }
            if (childFragmentManager.f634a.mo671c("ASSISTANT_HEADER_FRAGMENT_TAG") == null) {
                C0154a aVar5 = new C0154a(childFragmentManager);
                AccountId accountId = a.f356867d;
                C129288b bVar = new C129288b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                aVar5.mo511h(R.id.assistant_response_layer_content, bVar, "ASSISTANT_HEADER_FRAGMENT_TAG", 1);
                aVar5.mo509f();
            }
            a.f356868e.mo107946e(R.id.assistant_response_client_op_local_subscription, new C130151aa(a), C130152ab.f356850a);
            a.f356870g.mo50828h(R.id.assistant_response_enter_transition_local_subscription, a.f356871h.mo108799a(), new C129014f(new C130153ac(a)));
            if (childFragmentManager.f634a.mo670b(R.id.assistant_response_layer_input_bar_container) == null) {
                C0154a aVar6 = new C0154a(childFragmentManager);
                AccountId accountId2 = a.f356867d;
                C130253c cVar = new C130253c();
                C68324h.m98669f(cVar);
                C47247a.m84047b(cVar, accountId2);
                aVar6.mo689v(R.id.assistant_response_layer_input_bar_container, cVar, "ASSISTANT_RESPONSE_LAYER_VOICE_INPUT_BAR_FRAGMENT_TAG");
                aVar6.mo509f();
            }
            a.f356870g.mo50828h(R.id.assistant_drl_top_container, new C129018d(a.f356873j, C129021g.POSITION_ABOVE_HEADER), new C130154ad(a));
            a.f356870g.mo50828h(R.id.assistant_drl_bottom_container, new C129018d(a.f356873j, C129021g.POSITION_BELOW_BOTTOM), new C130155ae(a));
            a.f356870g.mo50829i(R.id.assistant_response_error_subscription, a.f356868e.mo107944c(), new C130302u(a), C130310v.f357181a);
            a.f356870g.mo50828h(R.id.assistant_response_transcription_subscription, a.f356876m.mo109565b(), new C130157ag(a.f356877n));
            a.f356866c.requireActivity().f2707h.mo3339b(a.f356866c, a.f356859C);
            a.mo109541f(a.f356881r.isKeyguardLocked());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_response_layer_fragment, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C130158ah a = mo17754z();
            a.mo109541f(a.f356881r.isKeyguardLocked());
            a.f356864H.f356848a = null;
            b.close();
            return;
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357169e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
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
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            e.close();
            return;
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C130158ah a2 = mo17754z();
            C47393f.m84233d(this, C130303a.class, new C130159ai(a2));
            C47393f.m84233d(this, C130309g.class, new C130160aj(a2));
            C47393f.m84233d(this, C130308f.class, new C130161ak(a2));
            C47393f.m84233d(this, C130304b.class, new C130162al(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_response_lock_affordance), new C130163am(a2));
            this.f54442o.mo24720k(bundle);
            C130158ah a3 = mo17754z();
            a3.mo109540e();
            C128567c.m209821d(view, new C130314z(a3, view));
            a3.f356857A.mo19974a(C37176a.f97258iE);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130280q.m212692a(th, th);
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
            if (!this.f357169e) {
                super.onAttach(context);
                if (this.f357166a == null) {
                    this.f357166a = ((C130164an) mo109549d().mo17653jN()).mo109543ba();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357168d));
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
                C130280q.m212692a(th, th2);
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

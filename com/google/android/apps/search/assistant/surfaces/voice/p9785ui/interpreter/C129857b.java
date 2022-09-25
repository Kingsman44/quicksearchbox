package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

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
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127167d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127172f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate.C130008d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129854a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9857b.C129859b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9857b.C129860c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9859d.C129880b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.b */
/* compiled from: PG */
public final class C129857b extends C130028s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129868c f356255a;

    /* renamed from: c */
    private Context f356256c;

    /* renamed from: d */
    private final C2393x f356257d = new C2393x(this);

    /* renamed from: e */
    private boolean f356258e;

    @Deprecated
    public C129857b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129868c mo17754z() {
        C129868c cVar = this.f356255a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356258e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109298b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356256c == null) {
            this.f356256c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356256c;
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
        return this.f356257d;
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
            C129853a.m212004a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129868c a = mo17754z();
            C59052c cVar = (C59052c) C129868c.f356274a.mo56224b();
            cVar.mo56379ah(new C59094n(38578));
            cVar.mo56386p("InterpreterFragmentPeer onCreate");
            C46439e eVar = a.f356279f;
            eVar.mo50429i(a.f356284k);
            eVar.mo50429i(a.f356285l);
            eVar.mo50429i(a.f356286m);
            FragmentManager childFragmentManager = a.f356278e.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
            if (childFragmentManager.f634a.mo671c("MODE_SELECTOR_PLATE_FRAGMENT_TAG") == null) {
                C0154a aVar = new C0154a(childFragmentManager);
                AccountId accountId = a.f356275b;
                C69664n.m101061g(accountId, "accountId");
                C129880b bVar = new C129880b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                aVar.mo511h(R.id.assistant_interpreter_mode_toggle_plate, bVar, "MODE_SELECTOR_PLATE_FRAGMENT_TAG", 1);
                aVar.mo509f();
            }
            if (childFragmentManager.f634a.mo671c("MIC_PLATE_FRAGMENT_TAG") == null) {
                C0154a aVar2 = new C0154a(childFragmentManager);
                AccountId accountId2 = a.f356275b;
                C69664n.m101061g(accountId2, "accountId");
                C130008d dVar = new C130008d();
                C68324h.m98669f(dVar);
                C47247a.m84047b(dVar, accountId2);
                aVar2.mo511h(R.id.assistant_interpreter_mic_plate_view, dVar, "MIC_PLATE_FRAGMENT_TAG", 1);
                aVar2.mo509f();
            }
            if (childFragmentManager.f634a.mo671c("HEADER_FRAGMENT_TAG") == null) {
                C0154a aVar3 = new C0154a(childFragmentManager);
                AccountId accountId3 = a.f356275b;
                C69664n.m101061g(accountId3, "accountId");
                C129859b bVar2 = new C129859b();
                C68324h.m98669f(bVar2);
                C47247a.m84047b(bVar2, accountId3);
                aVar3.mo511h(R.id.assistant_interpreter_header_view, bVar2, "HEADER_FRAGMENT_TAG", 1);
                aVar3.mo509f();
            }
            a.f356280g.mo50828h(R.id.assistant_interpreter_local_data_service, new C129854a(a.f356287n), new C129985g(a));
            a.f356280g.mo50828h(R.id.assistant_interpreter_assistant_state_update, a.f356277d.mo107943b(), new C129987h(a));
            a.f356280g.mo50828h(R.id.assistant_interpreter_transcription_update, a.f356277d.mo107945d(), new C129997i(a));
            a.f356280g.mo50829i(R.id.assistant_interpreter_error_subscription, new C127167d((C127172f) a.f356277d), new C130001j(a), C130002k.f356524a);
            a.f356277d.mo107946e(R.id.assistant_interpreter_local_subscription, new C130003l(a), C130004m.f356526a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129853a.m212004a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129868c a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C0167am activity = a.f356278e.getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
            }
            C59052c cVar = (C59052c) C129868c.f356274a.mo56224b();
            cVar.mo56379ah(new C59094n(38573));
            cVar.mo56386p("InterpreterFragmentPeer onCreateView");
            View inflate = layoutInflater.inflate(R.layout.assistant_interpreter_fragment, viewGroup, false);
            a.f356283j.mo108810b(77073, inflate);
            C69664n.m101060f(inflate, "rootView");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129853a.m212004a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356258e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129853a.m212004a(th, th);
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
            C129853a.m212004a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C129860c.C129861a.class, new C130023n(mo17754z()));
            this.f54442o.mo24720k(bundle);
            mo17754z();
            C69664n.m101061g(view, "view");
            C128567c.m209821d(view, new C129878d(view));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129853a.m212004a(th, th);
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
            if (!this.f356258e) {
                super.onAttach(context);
                if (this.f356255a == null) {
                    this.f356255a = ((C130024o) mo109427d().mo17653jN()).mo109425aI();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356257d));
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
                C129853a.m212004a(th, th2);
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

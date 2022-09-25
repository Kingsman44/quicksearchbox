package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

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
import android.widget.TextView;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129854a;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.p */
/* compiled from: PG */
public final class C130044p extends C130054z implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130047s f356604a;

    /* renamed from: c */
    private Context f356605c;

    /* renamed from: d */
    private final C2393x f356606d = new C2393x(this);

    /* renamed from: e */
    private boolean f356607e;

    @Deprecated
    public C130044p() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130047s mo17754z() {
        C130047s sVar = this.f356604a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356607e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109453b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356605c == null) {
            this.f356605c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356605c;
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
        return this.f356606d;
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
            C130043o.m212320a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130047s a = mo17754z();
            FragmentManager childFragmentManager = a.f356614d.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
            if (childFragmentManager.f634a.mo671c("SMART_REPLIES_FRAGMENT_TAG") == null) {
                C0154a aVar = new C0154a(childFragmentManager);
                AccountId accountId = a.f356613c;
                C69664n.m101061g(accountId, "accountId");
                C130037i iVar = new C130037i();
                C68324h.m98669f(iVar);
                C47247a.m84047b(iVar, accountId);
                aVar.mo511h(R.id.assistant_interpreter_smart_replies_view, iVar, "SMART_REPLIES_FRAGMENT_TAG", 1);
                aVar.mo509f();
            }
            a.f356615e.mo50828h(R.id.assistant_interpreter_local_subscription, new C129854a(a.f356623m), new C130045q(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130043o.m212320a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C130047s a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            a.f356620j = (TtsViewModel) new C2368bp(a.f356614d).mo5770a(TtsViewModel.class);
            View inflate = layoutInflater.inflate(R.layout.assistant_interpreter_translation, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …achToRoot= */ false\n    )");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130043o.m212320a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356607e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130043o.m212320a(th, th);
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
            C130043o.m212320a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C130047s a2 = mo17754z();
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_interpreter_output_text_tts_button), new C130048t(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_interpreter_output_text_copy_button), new C130049u(a2));
            this.f54442o.mo24720k(bundle);
            C130047s a3 = mo17754z();
            List a4 = a3.mo109460f().mo109429a();
            int size = a4.size();
            for (int i = 0; i < size; i++) {
                ((View) a4.get(i)).setOnClickListener(new C47591co(a3.f356616f, "Interpreter Alternative Translation Box", new C130046r((TextView) a3.mo109460f().mo109430b(i).f186052a, a3)));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130043o.m212320a(th, th);
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
            if (!this.f356607e) {
                super.onAttach(context);
                if (this.f356604a == null) {
                    this.f356604a = ((C130050v) mo109469d().mo17653jN()).mo109463aS();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356606d));
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
                C130043o.m212320a(th, th2);
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

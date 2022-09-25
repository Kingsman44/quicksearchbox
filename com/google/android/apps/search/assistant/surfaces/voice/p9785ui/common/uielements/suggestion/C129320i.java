package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9871b.C130177c;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.i */
/* compiled from: PG */
public final class C129320i extends C129315d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129331t f355186a;

    /* renamed from: c */
    private Context f355187c;

    /* renamed from: d */
    private final C2393x f355188d = new C2393x(this);

    /* renamed from: e */
    private boolean f355189e;

    @Deprecated
    public C129320i() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C129320i m211126f(AccountId accountId) {
        C129320i iVar = new C129320i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108962b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355187c == null) {
            this.f355187c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355187c;
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
        return this.f355188d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C129331t mo17754z() {
        C129331t tVar = this.f355186a;
        if (tVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355189e) {
            return tVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129331t j = mo17754z();
            j.f355217p = (SuggestionViewModel) new C2368bp(j.f355206e).mo5770a(SuggestionViewModel.class);
            j.f355209h.mo50829i(R.id.assistant_response_suggestion_local_subscription, new C129317f(j.f355208g), new C129324m(j), C129325n.f355193a);
            j.f355210i.mo50429i(j.f355216o);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129331t j = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_suggestion_container_layout, viewGroup, false);
            j.f355215n.mo108810b(27225, inflate.findViewById(R.id.assistant_suggestion_chip_group));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355189e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
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
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C129331t j = mo17754z();
            C0167am activity = j.f355206e.getActivity();
            if (activity != null && !activity.isChangingConfigurations()) {
                SuggestionViewModel suggestionViewModel = j.f355217p;
                suggestionViewModel.getClass();
                suggestionViewModel.f355121a = BuildConfig.FLAVOR;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C129331t j = mo17754z();
            SuggestionViewModel suggestionViewModel = j.f355217p;
            suggestionViewModel.getClass();
            if (suggestionViewModel.f355121a.isEmpty()) {
                C58485gu b = C129331t.m211144b(j.f355206e);
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) b.get(i);
                    view.setEnabled(true);
                    view.setClickable(true);
                }
            }
            e.close();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C129331t j = mo17754z();
            C47393f.m84233d(this, C130177c.C130178a.class, new C129333u(j));
            C47393f.m84233d(this, C130177c.C130179b.class, new C129334v(j));
            this.f54442o.mo24720k(bundle);
            C129331t j2 = mo17754z();
            C128567c.m209821d(view, new C129327p(j2));
            C129331t.m211143a(j2.f355206e).addOnLayoutChangeListener(C129328q.f355196a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129319h.m211125a(th, th);
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
            if (!this.f355189e) {
                super.onAttach(context);
                if (this.f355186a == null) {
                    this.f355186a = ((C129335w) mo108961a().mo17653jN()).mo108974ah();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355188d));
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
                C129319h.m211125a(th, th2);
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

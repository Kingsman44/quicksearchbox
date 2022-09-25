package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p197u.C4230o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130307e;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.h */
/* compiled from: PG */
public final class C130288h extends C130298r implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130293m f357141a;

    /* renamed from: c */
    private Context f357142c;

    /* renamed from: d */
    private final C2393x f357143d = new C2393x(this);

    /* renamed from: e */
    private boolean f357144e;

    @Deprecated
    public C130288h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C130288h m212705a(AccountId accountId) {
        C130288h hVar = new C130288h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        return hVar;
    }

    /* renamed from: b */
    public final C130293m mo17754z() {
        C130293m mVar = this.f357141a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357144e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo109627d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357142c == null) {
            this.f357142c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357142c;
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
        return this.f357143d;
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
            C130287g.m212704a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130293m b = mo17754z();
            b.f357156h = (QueryTextViewModel) new C2368bp(b.f357150b).mo5770a(QueryTextViewModel.class);
            b.f357150b.setEnterTransition(new C4230o());
            b.f357154f.mo50828h(R.id.assistant_response_query_text_local_subscription, b.f357151c.mo107945d(), new C130289i(b));
            b.f357154f.mo50828h(R.id.assistant_response_query_highlight_local_subscription, b.f357152d.mo109564a(), new C130290j(b));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130287g.m212704a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C130293m b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_response_query_text, viewGroup, false);
            b.f357155g.mo108810b(148342, inflate.findViewById(R.id.assistant_query_text));
            ((TextView) inflate.findViewById(R.id.assistant_query_text)).setMovementMethod(new C130307e(new C130292l(b)));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130287g.m212704a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357144e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130287g.m212704a(th, th);
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
            C130287g.m212704a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_query_text), new C130294n(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C130293m b = mo17754z();
            C128567c.m209821d(view, new C130291k(b));
            b.mo109631e();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130287g.m212704a(th, th);
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
            if (!this.f357144e) {
                super.onAttach(context);
                if (this.f357141a == null) {
                    this.f357141a = ((C130295o) mo109638f().mo17653jN()).mo109634bi();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357143d));
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
                C130287g.m212704a(th, th2);
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

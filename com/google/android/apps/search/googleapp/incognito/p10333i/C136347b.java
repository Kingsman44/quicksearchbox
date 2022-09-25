package com.google.android.apps.search.googleapp.incognito.p10333i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
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
import com.google.apps.tiktok.inject.p3659d.C47243l;
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

/* renamed from: com.google.android.apps.search.googleapp.incognito.i.b */
/* compiled from: PG */
public final class C136347b extends C136355j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136348c f371233a;

    /* renamed from: c */
    private Context f371234c;

    /* renamed from: d */
    private final C2393x f371235d = new C2393x(this);

    /* renamed from: e */
    private boolean f371236e;

    @Deprecated
    public C136347b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C136347b m221524a(AccountId accountId, C139777r rVar) {
        C136347b bVar = new C136347b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, rVar);
        return bVar;
    }

    /* renamed from: b */
    public final C136348c mo17754z() {
        C136348c cVar = this.f371233a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371236e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo112929d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371234c == null) {
            this.f371234c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371234c;
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
        return this.f371235d;
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
            C136346a.m221523a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136348c b = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_incognito_signpost_fragment, viewGroup, false);
            C139779t a = C139779t.m227245a(b.f371237a.f379896b);
            if (a == null) {
                a = C139779t.UNSPECIFIED;
            }
            TextView textView = (TextView) viewGroup2.findViewById(R.id.googleapp_incognito_signpost_message);
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                textView.setText(R.string.googleapp_incognito_signpost_message_discover);
            } else if (ordinal == 2) {
                textView.setText(R.string.googleapp_incognito_signpost_message_search);
            } else if (ordinal == 3) {
                textView.setText(R.string.googleapp_incognito_signpost_message_collections);
            } else if (ordinal != 4) {
                textView.setText(R.string.googleapp_incognito_signpost_message_default);
            } else {
                textView.setText(R.string.googleapp_incognito_signpost_message_tabs);
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136346a.m221523a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371236e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136346a.m221523a(th, th);
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
            C136346a.m221523a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            mo17754z();
            a.f123128b.findViewById(R.id.googleapp_incognito_signpost_button).setTag(R.id.tiktok_event_internal_trace, "Signpost button tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_incognito_signpost_button), new C136349d());
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136346a.m221523a(th, th);
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
            if (!this.f371236e) {
                super.onAttach(context);
                if (this.f371233a == null) {
                    this.f371233a = ((C136350e) mo112935f().mo17653jN()).mo112931cE();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371235d));
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
                C136346a.m221523a(th, th2);
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

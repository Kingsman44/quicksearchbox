package com.google.android.apps.search.googleapp.search.settings.locationconsent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.location.p3029a.C38672p;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.k */
/* compiled from: PG */
public final class C137651k extends C137660s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137655o f374414a;

    /* renamed from: c */
    private Context f374415c;

    /* renamed from: d */
    private final C2393x f374416d = new C2393x(this);

    /* renamed from: e */
    private boolean f374417e;

    @Deprecated
    public C137651k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C137651k m223677a(AccountId accountId) {
        C137651k kVar = new C137651k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        return kVar;
    }

    /* renamed from: b */
    public final C137655o mo17754z() {
        C137655o oVar = this.f374414a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374417e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo113882d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374415c == null) {
            this.f374415c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374415c;
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
        return this.f374416d;
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
            C137650j.m223676a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137655o b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_location_consent_setting_fragment, viewGroup, false);
            C28306ab abVar = b.f374428h;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(150578)));
            SpannableStringBuilder append = new SpannableStringBuilder(b.f374422b.getString(R.string.googleapp_location_consent_setting_description_second)).append(" ").append(b.f374422b.getString(R.string.googleapp_location_consent_setting_description_learn_more), new URLSpan("https://support.google.com/websearch/?p=aga_location_settings"), 33);
            TextView textView = (TextView) inflate.findViewById(R.id.googleapp_location_consent_setting_description_second);
            textView.setText(append);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            inflate.findViewById(R.id.googleapp_location_consent_setting_radio_button_accepted).setOnClickListener(new C47591co(b.f374425e, "tapped location consent accepted", new C137652l(b)));
            inflate.findViewById(R.id.googleapp_location_consent_setting_radio_button_declined).setOnClickListener(new C47591co(b.f374425e, "tapped location consent declined", new C137653m(b)));
            inflate.findViewById(R.id.googleapp_location_consent_setting_radio_button_ask).setOnClickListener(new C47591co(b.f374425e, "tapped location consent ask", new C137654n(b)));
            C46801dp dpVar = b.f374424d;
            C38586af afVar = b.f374426f;
            dpVar.mo50707a(new C46719bc(afVar.f101995f, new C38672p(afVar), "compliance_location_data_access_app_setting"), b.f374427g);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C137650j.m223676a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374417e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137650j.m223676a(th, th);
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
            C137650j.m223676a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C137657p(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137650j.m223676a(th, th);
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
            if (!this.f374417e) {
                super.onAttach(context);
                if (this.f374414a == null) {
                    Object jN = mo113888f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137651k) {
                        C137651k kVar = (C137651k) fragment;
                        C68225k.m98532d(kVar);
                        this.f374414a = new C137655o(kVar, (C136247a) ((C74176nj) jN).f206662L.mo17428b(), (C38586af) ((C74176nj) jN).f206730b.f198007G.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374416d));
                    } else {
                        String obj = C137655o.class.toString();
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
                C137650j.m223676a(th, th2);
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

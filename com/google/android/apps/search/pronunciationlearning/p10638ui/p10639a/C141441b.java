package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a.C141431b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b.C141443b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b */
/* compiled from: PG */
public final class C141441b extends C141460e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141458c f383915a;

    /* renamed from: c */
    private Context f383916c;

    /* renamed from: d */
    private final C2393x f383917d = new C2393x(this);

    /* renamed from: e */
    private boolean f383918e;

    @Deprecated
    public C141441b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141458c mo17754z() {
        C141458c cVar = this.f383915a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383918e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116438b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383916c == null) {
            this.f383916c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383916c;
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
        return this.f383917d;
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
            C141429a.m229505a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_half_main_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …achToRoot= */ false\n    )");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141429a.m229505a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383918e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141429a.m229505a(th, th);
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
            C141429a.m229505a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C141458c a2 = mo17754z();
            a.f123128b.findViewById(R.id.pronunciationlearning_top_transparent_image).setTag(R.id.tiktok_event_internal_trace, "onTopClick");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_top_transparent_image), new C141459d(a2));
            this.f54442o.mo24720k(bundle);
            C141458c a3 = mo17754z();
            C69664n.m101061g(view, "view");
            if (a3.f383964c.isPresent()) {
                if (C69664n.m101066l(a3.f383964c.get(), "fillinblank")) {
                    if (a3.f383963b) {
                        AccountId accountId = a3.f383965d;
                        C69664n.m101061g(accountId, "accountId");
                        C141431b bVar = new C141431b();
                        C68324h.m98669f(bVar);
                        C47247a.m84047b(bVar, accountId);
                        C0154a aVar = new C0154a(a3.f383966e.getChildFragmentManager());
                        aVar.mo689v(R.id.pronunciationlearning_half_coordinator_fragment, bVar, "com.google.android.apps.search.pronunciationlearning.ui.halfsheet.FILL_IN_BLANK_TAG");
                        aVar.mo509f();
                    } else {
                        a3.f383966e.requireActivity().finish();
                    }
                    C47831fm.m85019n();
                    return;
                }
            }
            AccountId accountId2 = a3.f383965d;
            Locale locale = a3.f383962a;
            C69664n.m101061g(accountId2, "accountId");
            C141443b bVar2 = new C141443b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId2);
            C47232a.m84026b(bVar2, locale);
            C0154a aVar2 = new C0154a(a3.f383966e.getChildFragmentManager());
            aVar2.mo689v(R.id.pronunciationlearning_half_coordinator_fragment, bVar2, "com.google.android.apps.search.pronunciationlearning.ui.halfsheet.SPEAKING_PRACTICE_TAG");
            aVar2.mo509f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141429a.m229505a(th, th);
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
        Locale locale;
        this.f122869b.mo51381i();
        try {
            if (!this.f383918e) {
                super.onAttach(context);
                if (this.f383915a == null) {
                    Object jN = mo116455d().mo17653jN();
                    String stringExtra = ((Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b()).getIntent().getStringExtra("EXTRA_LOCALE");
                    if (C58837ba.m90859h(stringExtra)) {
                        locale = Locale.getDefault();
                    } else {
                        locale = Locale.forLanguageTag(stringExtra);
                    }
                    Locale locale2 = locale;
                    C68225k.m98532d(locale2);
                    boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo67020gh().f185547a.mo17428b()).mo50901a("com.google.android.apps.search.pronunciationlearning 45359721").mo50907f();
                    Optional ofNullable = Optional.ofNullable(((Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b()).getIntent().getStringExtra("EXTRA_DAILY_ACTIVITY_TYPE"));
                    C68225k.m98532d(ofNullable);
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141441b) {
                        C141441b bVar = (C141441b) fragment;
                        C68225k.m98532d(bVar);
                        this.f383915a = new C141458c(locale2, f, ofNullable, accountId, bVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383917d));
                    } else {
                        String obj = C141458c.class.toString();
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
                C141429a.m229505a(th, th2);
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

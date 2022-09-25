package com.google.android.apps.search.assistant.surfaces.roti.home;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126760d;
import com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126761e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63042fg;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bz */
/* compiled from: PG */
public final class C126817bz extends C126842cv implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126824cf f349250a;

    /* renamed from: c */
    private Context f349251c;

    /* renamed from: d */
    private final C2393x f349252d = new C2393x(this);

    /* renamed from: e */
    private boolean f349253e;

    @Deprecated
    public C126817bz() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126824cf mo17754z() {
        C126824cf cfVar = this.f349250a;
        if (cfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349253e) {
            return cfVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107815b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349251c == null) {
            this.f349251c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349251c;
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
        return this.f349252d;
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
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C126824cf a = mo17754z();
            C37215b bVar = a.f349266g;
            C126797bh bhVar = a.f349268i;
            int i = bhVar.f349181c;
            C63042fg fgVar = bhVar.f349185g;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C126838cr.m207502a(bVar, i, fgVar, a.f349268i.f349182d);
            a.f349265f.mo50429i(a.f349272m);
            a.f349265f.mo50429i(a.f349271l);
            a.f349262c.mo50828h(R.id.assistant_assistant_state_subscription_id, a.f349261b.mo107780a(), a.f349273n);
            a.f349262c.mo50828h(R.id.assistant_audio_level_subscription_id, a.f349261b.mo107781b(), a.f349274o);
            a.f349262c.mo50828h(R.id.assistant_transcription_subscription_id, a.f349261b.mo107783d(), a.f349275p);
            a.f349262c.mo50828h(R.id.assistant_activity_connection_subscription_id, a.f349261b.mo107782c(), a.f349276q);
            a.f349263d.requireActivity().f2707h.mo3339b(a.f349263d, a.f349280u);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z().f349266g.mo19974a(C37176a.f96807E);
            View inflate = layoutInflater.inflate(R.layout.assistant_roti_intent_api_fragment, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349253e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
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
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C126824cf a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f349264e.mo107774d();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C126824cf a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.mo107819b();
            e.close();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C126824cf a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.mo107818a();
            if (a.f349281v == 1) {
                C126838cr.m207506e(a.f349266g, a.f349282w);
                a.f349270k.f349082a.mo107751a(R.raw.no_input);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_roti_retry_button), new C126830cj(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C126824cf a2 = mo17754z();
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C126821cc(a2, view));
            a2.f349277r = new C126833cm(view);
            Locale locale = a2.f349267h.getResources().getConfiguration().getLocales().get(0);
            ((TextView) view.findViewById(R.id.assistant_roti_intent_api_language)).setText(String.format("%s (%s)", new Object[]{locale.getDisplayLanguage(), locale.getDisplayCountry()}));
            TextView textView = (TextView) view.findViewById(R.id.assistant_roti_intent_api_text);
            a2.f349279t = new C126840ct(textView.getContext(), textView.getPaint());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126816by.m207467a(th, th);
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

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.roti.home.n] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f349253e) {
                super.onAttach(context);
                if (this.f349250a == null) {
                    Object jN = mo107830d().mo17653jN();
                    C126797bh r = ((C74176nj) jN).mo70008r();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126817bz) {
                        C126817bz bzVar = (C126817bz) fragment;
                        C68225k.m98532d(bzVar);
                        Executor executor = (Executor) ((C74176nj) jN).f206677a.n.mo17428b();
                        this.f349250a = new C126824cf(r, bzVar, (C126781as) ((C74176nj) jN).f207087n.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), ((C74176nj) jN).mo69851hi(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), new C126761e(new C126760d((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.q.mo17428b())));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349252d));
                    } else {
                        String obj = C126824cf.class.toString();
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
                C126816by.m207467a(th, th2);
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

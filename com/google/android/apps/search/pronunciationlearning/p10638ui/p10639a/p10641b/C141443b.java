package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

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
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141349a;
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.C141501e;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.b */
/* compiled from: PG */
public final class C141443b extends C141457j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141444c f383919a;

    /* renamed from: c */
    private Context f383920c;

    /* renamed from: d */
    private final C2393x f383921d = new C2393x(this);

    /* renamed from: e */
    private boolean f383922e;

    @Deprecated
    public C141443b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141444c mo17754z() {
        C141444c cVar = this.f383919a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383922e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116440b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383920c == null) {
            this.f383920c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383920c;
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
        return this.f383921d;
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
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C141444c a = mo17754z();
            a.f383927e.mo50429i(a.f383939q);
            a.f383927e.mo50429i(a.f383940r);
            a.f383927e.mo50429i(a.f383943u);
            a.f383927e.mo50429i(a.f383941s);
            a.f383927e.mo50429i(a.f383942t);
            a.f383928f.mo50707a(a.f383931i.mo116379a(), a.f383944v);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141444c a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_speaking_practice_fragment, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_expected_sentence)).setText(a.f383925c);
            C69664n.m101060f(inflate, "rootView");
            a.mo116444d(inflate);
            ((PhonemeView) inflate.findViewById(R.id.pronunciationlearning_expected_pron)).mo17754z().mo116519c(a.f383929g.getResources().getString(R.string.pronunciationlearning_expected_phoneme_title));
            ((PhonemeView) inflate.findViewById(R.id.pronunciationlearning_actual_pron)).mo17754z().mo116519c(a.f383929g.getResources().getString(R.string.pronunciationlearning_pronounced_phoneme_title));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383922e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
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
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C141444c a = mo17754z();
            a.f383926d.mo116411d();
            a.f383931i.mo116382d();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z().mo116441a();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C141444c a2 = mo17754z();
            a.f123128b.findViewById(R.id.pronunciationlearning_sentence_tts_button).setTag(R.id.tiktok_event_internal_trace, "onSentenceTtsClicked");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_sentence_tts_button), new C141451d(a2));
            a.f123128b.findViewById(R.id.pronunciationlearning_expected_pron).setTag(R.id.tiktok_event_internal_trace, "onExpectedPronClicked");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_expected_pron), new C141452e(a2));
            a.f123128b.findViewById(R.id.pronunciationlearning_actual_pron).setTag(R.id.tiktok_event_internal_trace, "onActualPronClicked");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_actual_pron), new C141453f(a2));
            a.f123128b.findViewById(R.id.pronunciationlearning_mic_icon).setTag(R.id.tiktok_event_internal_trace, "onMicButtonClicked");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_mic_icon), new C141454g(a2));
            a.f123128b.findViewById(R.id.pronunciationlearning_practice_again_button).setTag(R.id.tiktok_event_internal_trace, "onPracticeAgainButtonClick");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_again_button), new C141455h(a2));
            a.f123128b.findViewById(R.id.pronunciationlearning_practice_cancel_button).setTag(R.id.tiktok_event_internal_trace, "onCancelClick");
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_cancel_button), new C141456i(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141442a.m229535a(th, th);
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
            if (!this.f383922e) {
                super.onAttach(context);
                if (this.f383919a == null) {
                    Object jN = mo116452d().mo17653jN();
                    C141512e eVar = (C141512e) ((C74176nj) jN).f206677a.d.f201639cs.mo17428b();
                    String aq = ((C74176nj) jN).f206836d.mo69009aq();
                    C141399r rVar = (C141399r) ((C74176nj) jN).f206730b.f198027a.f199576hd.mo17428b();
                    C46439e eVar2 = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141443b) {
                        C141443b bVar = (C141443b) fragment;
                        C68225k.m98532d(bVar);
                        this.f383919a = new C141444c(eVar, aq, rVar, eVar2, dpVar, bVar, (C141501e) ((C74176nj) jN).f206836d.f205438t.mo17428b(), (C141349a) ((C74176nj) jN).f206730b.f198027a.f199575hc.mo17428b(), ((C74176nj) jN).mo69665eB(), (C141330c) ((C74176nj) jN).f206836d.f205436r.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383921d));
                    } else {
                        String obj = C141444c.class.toString();
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
                C141442a.m229535a(th, th2);
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

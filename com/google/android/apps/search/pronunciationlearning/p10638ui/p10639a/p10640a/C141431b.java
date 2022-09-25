package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

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
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141517g;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.WordChipsView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.b */
/* compiled from: PG */
public final class C141431b extends C141440j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141432c f383891a;

    /* renamed from: c */
    private Context f383892c;

    /* renamed from: d */
    private final C2393x f383893d = new C2393x(this);

    /* renamed from: e */
    private boolean f383894e;

    @Deprecated
    public C141431b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141432c mo17754z() {
        C141432c cVar = this.f383891a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383894e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116428b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383892c == null) {
            this.f383892c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383892c;
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
        return this.f383893d;
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
            C141430a.m229506a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C141432c a = mo17754z();
            a.f383898d.mo50429i(a.f383902h);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141430a.m229506a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141432c a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_fillinblank_translate_frame, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.pronunciationlearning_fillinblank_content);
            C69664n.m101059e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            layoutInflater.inflate(R.layout.pronunciationlearning_sentence_and_choices, (ViewGroup) findViewById, true);
            View findViewById2 = inflate.findViewById(R.id.pronunciationlearning_good_job_icon);
            C69664n.m101060f(findViewById2, "rootView.findViewById<Im…onlearning_good_job_icon)");
            findViewById2.setVisibility(8);
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_native_sentence)).setText(a.f383896b.getString(R.string.pronunciationlearning_native_sentence_sample_text));
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_learning_sentence)).setText(a.f383896b.getString(R.string.pronunciationlearning_learning_sentence_sample_text));
            View findViewById3 = inflate.findViewById(R.id.pronunciationlearning_word_options);
            C69664n.m101060f(findViewById3, "rootView.findViewById(R.…ionlearning_word_options)");
            C141513f d = ((WordChipsView) findViewById3).mo17754z();
            for (String text : d.f384133f) {
                View inflate2 = d.f384131d.inflate(R.layout.pronunciationlearning_word_chip, d.f384129b, false);
                C69664n.m101059e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate2;
                textView.setText(text);
                textView.setOnClickListener(new C47591co(d.f384130c, "Word Chip Clicked", new C141517g(d)));
                d.f384129b.addView(textView);
            }
            C69664n.m101060f(inflate, "rootView");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141430a.m229506a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383894e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141430a.m229506a(th, th);
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
            C141430a.m229506a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f383897c.mo116411d();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141430a.m229506a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C141432c a2 = mo17754z();
            C47393f.m84233d(this, C141513f.C141516c.class, new C141434d(a2));
            C47393f.m84233d(this, C141513f.C141515b.class, new C141435e(a2));
            C47393f.m84233d(this, C141513f.C141514a.class, new C141436f(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_next_button), new C141437g(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_cancel_button), new C141438h(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_sentence_tts_button), new C141439i(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141430a.m229506a(th, th);
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
            if (!this.f383894e) {
                super.onAttach(context);
                if (this.f383891a == null) {
                    Object jN = mo116435d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141431b) {
                        C141431b bVar = (C141431b) fragment;
                        C68225k.m98532d(bVar);
                        this.f383891a = new C141432c(bVar, (C141399r) ((C74176nj) jN).f206730b.f198027a.f199576hd.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383893d));
                    } else {
                        String obj = C141432c.class.toString();
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
                C141430a.m229506a(th, th2);
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

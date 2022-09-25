package com.google.android.apps.search.pronunciationlearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.pronunciationlearning.C141308aa;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141349a;
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10642b.C141462b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.C141497a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.z */
/* compiled from: PG */
public final class C141524z extends C141326al implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141308aa f384140a;

    /* renamed from: c */
    private Context f384141c;

    /* renamed from: d */
    private final C2393x f384142d = new C2393x(this);

    /* renamed from: e */
    private boolean f384143e;

    @Deprecated
    public C141524z() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C141524z m229712a(AccountId accountId, C141413h hVar) {
        C141524z zVar = new C141524z();
        C68324h.m98669f(zVar);
        C47247a.m84047b(zVar, accountId);
        C47243l.m84039a(zVar, hVar);
        return zVar;
    }

    /* renamed from: b */
    public final C141308aa mo17754z() {
        C141308aa aaVar = this.f384140a;
        if (aaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f384143e) {
            return aaVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo116357d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f384141c == null) {
            this.f384141c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f384141c;
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
        return this.f384142d;
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
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C141308aa b = mo17754z();
            b.f383633g.mo50429i(b.f383636j);
            b.f383633g.mo50429i(b.f383637k);
            b.f383633g.mo50429i(b.f383638l);
            b.f383633g.mo50429i(b.f383640n);
            b.f383633g.mo50429i(b.f383639m);
            b.f383633g.mo50429i(b.f383644r.f383977c);
            b.f383633g.mo50429i(b.f383648v);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141308aa b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_practicing_fragment, viewGroup, false);
            b.f383629c.mo50708b(b.f383630d.mo116379a(), C46788de.DONT_CARE, new C141308aa.C141310b());
            View findViewById = inflate.findViewById(R.id.pronunciationlearning_sentence_tts_button);
            String str = (String) b.f383642p.f384126d.get("TtsButtonDescription");
            str.getClass();
            findViewById.setContentDescription(str);
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_expected_text_title)).setText(b.f383642p.mo116540b());
            TextView textView = (TextView) inflate.findViewById(R.id.pronunciationlearning_more_phrases_text_button);
            String str2 = (String) b.f383642p.f384126d.get("MorePhrasesButtonText");
            str2.getClass();
            textView.setText(str2);
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_practice_cancel_button)).setText(b.f383642p.mo116539a());
            TextView textView2 = (TextView) inflate.findViewById(R.id.pronunciationlearning_practice_again_button);
            String str3 = (String) b.f383642p.f384126d.get("PracticeAgainButtonText");
            str3.getClass();
            textView2.setText(str3);
            TextView textView3 = (TextView) inflate.findViewById(R.id.pronunciationlearning_practice_edit_button);
            String str4 = (String) b.f383642p.f384126d.get("EditButtonText");
            str4.getClass();
            textView3.setText(str4);
            TextView textView4 = (TextView) inflate.findViewById(R.id.pronunciationlearning_feedback_title);
            String str5 = (String) b.f383642p.f384126d.get("FeedbackTextTitle");
            str5.getClass();
            textView4.setText(str5);
            C141497a a = ((PhonemeView) inflate.findViewById(R.id.pronunciationlearning_expected_pron)).mo17754z();
            String str6 = (String) b.f383642p.f384126d.get("ExpectedPhonemeTitle");
            str6.getClass();
            a.mo116519c(str6);
            C141497a a2 = ((PhonemeView) inflate.findViewById(R.id.pronunciationlearning_actual_pron)).mo17754z();
            String str7 = (String) b.f383642p.f384126d.get("PronouncedPhonemeTitle");
            str7.getClass();
            a2.mo116519c(str7);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f384143e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
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
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C141308aa b = mo17754z();
            b.f383634h.mo116411d();
            b.f383630d.mo116382d();
            b.mo116341f(false);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C141308aa b = mo17754z();
            C60870cx a = b.f383645s.mo116413a();
            C46439e eVar = b.f383633g;
            C46438d dVar = new C46438d(a);
            eVar.mo50428h(dVar.f121541a, (Object) null, b.f383648v);
            e.close();
            return;
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C141308aa b = mo17754z();
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_more_phrases_text_button), new C141316ab(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_cancel_button), new C141317ac(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_edit_button), new C141318ad(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_practice_again_button), new C141319ae(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_mic_icon), new C141320af(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_sentence_tts_button), new C141321ag(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_expected_pron), new C141322ah(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_actual_pron), new C141323ai(b));
            this.f54442o.mo24720k(bundle);
            C141308aa b2 = mo17754z();
            View view2 = b2.f383631e.getView();
            view2.getClass();
            TextView textView = (TextView) view2.findViewById(R.id.pronunciationlearning_expected_text);
            textView.setText(b2.f383643q.f383855b);
            textView.setMovementMethod(new ScrollingMovementMethod());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141523y.m229711a(th, th);
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

    /* JADX WARNING: type inference failed for: r18v0, types: [com.google.android.apps.search.pronunciationlearning.e.a.a, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f384143e) {
                super.onAttach(context);
                if (this.f384140a == null) {
                    Object jN = mo116358f().mo17653jN();
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C141349a aVar = (C141349a) ((C74176nj) jN).f206730b.f198027a.f199575hc.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141524z) {
                        C141524z zVar = (C141524z) fragment;
                        C68225k.m98532d(zVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C141413h hVar = (C141413h) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141413h.f383852e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(hVar);
                        this.f384140a = new C141308aa(dpVar, aVar, zVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C141399r) ((C74176nj) jN).f206730b.f198027a.f199576hd.mo17428b(), ((C74176nj) jN).mo69665eB(), (C141330c) ((C74176nj) jN).f206836d.f205436r.mo17428b(), (C141512e) ((C74176nj) jN).f206677a.d.f201639cs.mo17428b(), hVar, (C141462b) ((C74176nj) jN).f206836d.f205437s.mo17428b(), (C46128f) ((C74176nj) jN).f206730b.f198504j.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67003gQ(), ((C74176nj) jN).f206730b.f198027a.mo67020gh().mo61043a());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f384142d));
                    } else {
                        String obj = C141308aa.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C141523y.m229711a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
